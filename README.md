# Sistema de Gestión de Emergencias - Valle del Sol

Este repositorio contiene la arquitectura de microservicios para la Municipalidad de Valle del Sol, diseñada para la detección y gestión de incendios.

## Estructura del Proyecto

El sistema se divide en 5 microservicios independientes:

1.  **`reportes-service`**: Captura y clasifica incendios (Factory Method).
2.  **`usuarios-service`**: Gestión de acceso y roles municipales.
3.  **`monitoreo-service`**: Mapa de calor y visualización geográfica.
4.  **`alertas-service`**: Notificaciones automáticas (Observer Pattern).
5.  **`historial-service`**: Análisis de datos históricos.

## Instalación General
Para ejecutar el proyecto completo:
1. Clonar el repositorio.
2. Entrar en cada carpeta y ejecutar `./mvnw spring-boot:run`.
*(Próximamente: Configuración con Docker Compose)*.
