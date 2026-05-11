# Reportes Service

Este microservicio es el encargado de recibir, clasificar y almacenar los reportes de incendios (forestales o urbanos) de la comuna.

## Logica Principal
Utiliza el patrón de diseño **Factory Method** para asignar automáticamente la prioridad y el estado de un reporte dependiendo de su origen:
* **Brigadista/Bomberos:** Prioridad ALTA, estado VERIFICADO.
* **Vecino:** Prioridad MEDIA, estado PENDIENTE_VALIDACION.
* **Sensor Automático:** Prioridad CRITICA, estado VERIFICADO_AUTOMATICO.

## Tecnologias usadas
* Java 21
* Spring Boot 3.x
* Spring Data JPA
* Base de datos H2



Pendiente: Integración con usuarios-service para vincular al brigadista que reporta el incendio.