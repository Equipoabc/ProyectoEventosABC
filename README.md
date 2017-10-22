# Proyecto Eventos Empresa ABC
    - Usando metodologías ágiles desarrollamos un Software que gestiona eventos.
    
# Primer Commit

  - Se crea el archivo inicial con las carpetas y las clases que se van a usar.
 
# Como usar el repositorio

Descargan o clonan el repositorio cada vez que vayan a trabajar y guardan los cambios al terminar la sesion

git init

luego añadir las variables del correo y un nombre 
git config --global user.email "correo" 
git config --global user.name "nombre"

Para añadir archivos 
git add . (cuando se va a añadir todo el directorio) 
git add archivo.extension (cuando se añade un solo archivo)

Antes de hacer el commit es necesario indicar donde se añaden los archivos git remote add origin https://github.com/Equipoabc/ProyectoEventosABC.git

Luego se hace un commit 
git commit -m "Mensaje descriptivo acerca del cambio"

Luego se hace el push 
git push git push -u origin master (por primera vez)

Cuando queremos clonar un proyecto por primera vez 
git clone https://github.com/Equipoabc/ProyectoEventos.git

Cuando ya queremos ver los cambios que han hecho n es necesario clonar sino hace un pull 
git pull https://github.com/Equipoabc/ProyectoEventos.git

Cuando queremos revertir un cambio 
git revert <codigo del commit>

