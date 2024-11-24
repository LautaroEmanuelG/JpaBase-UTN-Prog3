# 📘 Proyecto Base con JPA y Hibernate

Este proyecto es una introducción al uso de JPA (Java Persistence API) y su implementación con Hibernate. Utiliza una base de datos H2 en memoria para simplificar el desarrollo y las pruebas.

## 🚀 Instrucciones de Instalación

1. **Descargar el proyecto**: Clona el repositorio en tu máquina local.
2. **Abrir en IntelliJ IDEA Community**: Importa el proyecto en IntelliJ IDEA Community Edition.
3. **Configurar Gradle**: Asegúrate de que Gradle esté configurado correctamente en tu entorno de desarrollo.
4. **Ejecutar el proyecto**: Ejecuta el proyecto para iniciar la base de datos H2 en memoria y probar las funcionalidades.

## 🗂️ Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `org.example.Entidades`: Contiene las clases de entidad JPA.
    - `Articulo.java`: Representa un artículo con atributos como cantidad, denominación, id y precio.
    - `Categoria.java`: Representa una categoría con atributos como denominación e id.
    - `DetalleFactura.java`: Representa el detalle de una factura con atributos como cantidad, id y subtotal.

## 🛠️ Tecnologías Utilizadas

- **Java**: Lenguaje de programación principal.
- **Gradle**: Herramienta de automatización de compilación.
- **JPA**: Java Persistence API para la gestión de datos.
- **Hibernate**: Implementación de JPA.
- **H2 Database**: Base de datos en memoria para simplificar el desarrollo.

## 📚 Recursos Adicionales

- [Documentación de JPA](https://jakarta.ee/specifications/persistence/)
- [Documentación de Hibernate](https://hibernate.org/orm/documentation/)
- [Documentación de H2 Database](http://www.h2database.com/html/main.html)

## 📝 Notas

Este proyecto es una base para comenzar a estudiar JPA y Hibernate. Puedes expandirlo y modificarlo según tus necesidades.
