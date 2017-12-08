package Logica;
 
//Librerias para exportar en PDF
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

//Librerias para exportar en Excel
import  org.apache.poi.hssf.usermodel.*;

import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.BorderStyle;

public class Reportes{
    
    //Nombre se usuario para crear carpetas
    static final String  usuario = System.getProperty("user.name");
    static final String rutaRaiz = "C:\\Users\\"+usuario+"\\Documents\\ABC Eventos";
    
    public static void crearCarpetas(){
        
        //Se crean carpetas en Mis Documentos
        File carpetaRaiz = new File(rutaRaiz);
        File reportes = new File(rutaRaiz+"\\Reportes");
        File certificados = new File(rutaRaiz+"\\Certificados");
        File escarapelas = new File(rutaRaiz+"\\Escarapelas");
        File recibos = new File(rutaRaiz+"\\Recibos");
        
        carpetaRaiz.mkdir();
        reportes.mkdir();
        certificados.mkdir();
        escarapelas.mkdir();
        recibos.mkdir();
    }
    /**
     *
     * @param cabecera Son los datos epecificos del reporte, ejemplo: nombre, cedula, telefono
     * @param datos  Es un arreglo de arreglos con los datos especificos del reporte
     * @param nombre Nombre del archivo excel que e genera
     */
    public static void generarReporte(String[] cabecera, String[][] datos, String nombre){
        try{
            //Se crea el archivo
            String archivo = rutaRaiz+"\\Reportes\\"+nombre+".xls" ;
            HSSFWorkbook libro = new HSSFWorkbook();
            HSSFSheet hoja = libro.createSheet("Reporte Usuarios");
            
            //Se crean fuentes para las cabeceras
            HSSFCellStyle estilo = libro.createCellStyle();
            HSSFFont fuente = libro.createFont();
            fuente.setBold(true);
            estilo.setFont(fuente);
            estilo.setBorderLeft(BorderStyle.MEDIUM);
            estilo.setBorderRight(BorderStyle.MEDIUM);            
            estilo.setBorderTop(BorderStyle.MEDIUM);              
            estilo.setBorderBottom(BorderStyle.MEDIUM);
            
            //Se crean las cabeceras
            HSSFRow rowhead = hoja.createRow((short)0);
            for (int i = 0; i < cabecera.length; i++) {
                
                //Se inserta el valor en una celda de esa fila
                rowhead.createCell(i).setCellValue(cabecera[i]);
                
                //Se le cambia el formato de texto a la celda
                rowhead.getCell(i).setCellStyle(estilo);
                
            }
            
            //Se insertan datos
            for(int i = 1; i < datos.length; i++){
                
                //Se crea una fila
                HSSFRow row = hoja.createRow((short)i);
                for(int j = 0; j < datos[i].length; j++){
                    
                    //Se insertan los datos en la fila
                    HSSFCell celdaAux = row.createCell(j);
                    celdaAux.setCellValue(datos[i][j]);
                    
                }
                hoja.autoSizeColumn(i-1);
            }
            //Se cierra el archivo y se termina de crear
            try (FileOutputStream salida = new FileOutputStream(archivo)) {
                libro.write(salida);
            }
            System.out.println("Archivo generado");
            
        } catch ( IOException ex ) {
            System.out.println(ex);
        }
        
    }
    
    /**
     *
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param nomEvento Nombre del evento
     * @param fecha Fecha del evento
     * @throws FileNotFoundException
     * @throws IOException
     * @throws DocumentException
     */
    public void imprimirCertificado(String nombre,String cedula, String nomEvento, String fecha) throws FileNotFoundException, IOException, DocumentException{
        
        //base.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/base.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Certificados\\"+cedula+"-"+nomEvento+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f1 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 50);
        Font f2 = FontFactory.getFont(FontFactory.TIMES_ROMAN, 22);
        FontSelector selector = new FontSelector();
        FontSelector selector2 = new FontSelector();
        selector.addFont(f1);
        selector2.addFont(f2);
        
        //Se agrega el nombre del participante
        Phrase n = selector.process(nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, n, 650, 310, 0);
        
        //Se agrega el nombre del evento
        Phrase e = selector2.process(nomEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, e, 755, 210, 0);
        
        //Se agrega la fecha del evento
        Phrase nFecha = selector2.process(fecha);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nFecha, 1100, 210, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();
        
    }
    
    /**
     *
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param codEvento Codifo del evento
     * @param nomEvento Nombre del evento
     * @param precio Precio del evento
     * @param fecha Fecha del ecento
     * @param dinero Dinero que entrega el parcipante para pagar
     * @param cambio Dinero que se debe devolver al participante
     * @throws IOException
     * @throws DocumentException
     */
    public void imprimirRecibo(String nombre, String cedula, String codEvento, String nomEvento,
            String precio, String fecha, String dinero, String cambio) throws IOException, DocumentException{
        
        //baseRecibo.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/baseRecibo.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Recibos\\"+cedula+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f2 = FontFactory.getFont(FontFactory.COURIER, 14);
        FontSelector selector2 = new FontSelector();
        selector2.addFont(f2);
        
        //Se agrega el titulo "Recibo de Pago"
        Phrase recibo = selector2.process("Recibo de pago #"+cedula+"-"+codEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, recibo, 200, 465, 0);
        
        //Se agrega un separador para los datos
        Phrase separador = selector2.process("-----------------------------");
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 430, 0);
        
        //Se agregan las etiquetas del nombre y la cedula
        Phrase nNombre = selector2.process("Nombre :    "+nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nNombre, 200, 400, 0);
        
        Phrase nCedula = selector2.process("Cedula :    "+cedula);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCedula, 200, 370, 0);
        
        //Se agrega linea separadora
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 340, 0);
        
        //Se agrega la informacion relacionada con el evento
        Phrase nCodigo = selector2.process("Código :    "+ codEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCodigo, 200, 310, 0);
        
        Phrase nNombreEvento = selector2.process("Nombre Evento : "+nomEvento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nNombreEvento, 200, 280, 0);
        
        Phrase nPrecio = selector2.process("Total a pagar :    "+precio);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nPrecio, 200, 250, 0);
        
        //Se agrega linea separadora
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, separador, 200, 220, 0);
        
        //Se agrela la informacion correspondiente a el pago del evento
        Phrase nDinero = selector2.process("Dinero :    "+ dinero);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nDinero, 200, 190, 0);
        
        Phrase nCambio = selector2.process("Cambio : "+cambio);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCambio, 200, 160, 0);
        
        Phrase nFecha = selector2.process("Fecha :    "+fecha);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nFecha, 200, 130, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();
    }
    
    /**
     *
     * @param nombre Nombre del participante
     * @param cedula Cedula del participante
     * @param evento Nombre del evento
     * @throws IOException
     * @throws DocumentException
     */
    public static void imprimirEscarapela(String nombre, String cedula, String evento) throws IOException, DocumentException{
        //baseEscarapela.pdf es el archivo PDF que se usa como plantilla
        PdfReader reader = new PdfReader("src/plantillas/baseEscarapela.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(rutaRaiz+"\\Escarapelas\\"+cedula+".pdf"));
        PdfContentByte over = stamper.getOverContent(1);
        
        //Crea los diferentes tamanos de la fuente
        Font f1 = FontFactory.getFont(FontFactory.COURIER, 20);
        Font f2 = FontFactory.getFont(FontFactory.COURIER, 16);
        FontSelector selector = new FontSelector();
        FontSelector selector2 = new FontSelector();
        selector.addFont(f1);
        selector2.addFont(f2);
        
        //Se agrega el nombre del participante
        Phrase n = selector.process("Nombre:  "+nombre);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, n, 200, 200, 0);
        
        //Se agrega la cedula del participante
        Phrase nCedula = selector.process("Cédula:  "+cedula);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nCedula, 200, 130, 0);
        
        //Se agrega el nombre del evento
        Phrase nEvento = selector.process("Evento:  "+evento);
        ColumnText.showTextAligned(over, Element.ALIGN_CENTER, nEvento, 200, 60, 0);
        
        //Se cierra el archivo base y se cierra el archivo nuevo
        stamper.close();
        reader.close();
        
    }
}