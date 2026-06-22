<p>
  <img src="https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png" width="300"/>
</p>



# LlanquihueTourApp


## Autor del Proyecto
- **Nombre completo:** Matias Fernando Calfual Pérez
- **Carerra:** Analista programador 
- **Sede:** Duoc UC online
  

## Descripción del Proyecto

LlanquihueTourApp es una aplicación desarrollada en Java que permite cargar, almacenar y consultar información de guías turísticos de la provincia de Llanquihue a partir de un archivo CSV. El sistema utiliza Programación Orientada a Objetos (POO), colecciones dinámicas mediante ArrayList y separación de responsabilidades a través de paquetes.

El objetivo principal es facilitar la búsqueda de guías turísticos por nombre y mostrar sus datos de manera organizada mediante una aplicación de consola.

---

## Paquetes Utilizados y Clases Implementadas

### Paquete `app`
Contiene la clase principal que inicia la ejecución del programa.

- `Main.java`

### Paquete `model`
Contiene la representación de los datos del sistema.

- `GuiaTuristico.java`

### Paquete `service`
Contiene la lógica de negocio y las operaciones de búsqueda.

- `PersonaService.java`

### Paquete `util`
Contiene utilidades para la lectura de archivos CSV.

- `ArchivoUtil.java`

### Paquete `resources`
Contiene los archivos de datos utilizados por la aplicación.

- `persona.csv`

---

## Funcionalidades

- Lectura de información desde un archivo CSV.
- Almacenamiento de datos utilizando ArrayList.
- Búsqueda de guías turísticos por nombre.
- Visualización de información de los guías encontrados.
- Manejo básico de errores durante la carga de datos.

---

---

## Instrucciones para Ejecutar el Programa

1. Abre el codigo
```bash
git clone https://github.com/MatiasCalfual/cl.duoc.llanquihuetour/new/master?filename=README.md
```
2. Verificar que el archivo `persona.csv` se encuentre dentro de la carpeta `resources`.
3. Compilar el proyecto.
4. Ejecutar la clase principal `Main.java`.
5. Ingresar el nombre del guía turístico cuando el sistema lo solicite.
6. El programa mostrará la información correspondiente si el guía existe en el archivo CSV.

---

## Estructura del Proyecto

cl.douc.LlanquihueTourApp

├── src

│ ├── app

│ │ └── Main.java

│ ├── model

│ │ └── GuiaTuristico.java

│ ├── service

│ │ └── PersonaService.java

│ ├── util

│ │ └── ArchivoUtil.java

│ └── resources

│ └── persona.csv
