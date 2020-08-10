# TestExperta
Proyecto de Automatización

## Resumen de la herramienta ##

* Infraestructura para QA automation Cucumber para Java
* Versión: 0.1.0


# Setup #

#### JDK 1.8 - MAVEN - Eclipse ####

### Al clonar repositorio ###

* Bajar el repositorio
* Abrir Eclipse
* Seleccionar Workspace
* Importar Proyecto Maven


# Estructura de archivos para ejecución de tests #

## ClaseEjecutora ##

Indicar el tag sobre el que se ejecutan los tests (@TEST_TAG):


## /features ##

Aquí se colocan las features, escritas en Gherkin.  
 Estas contienen los pasos y variables que usaran las pruebas.

## /stepDefinitions ##

Aquí se colocan las definiciones de los steps.  
 Estas contienen las funciones invocadas en cada paso de cada feature.

## /page ##

Aquí se colocan los Page Objects, usando PageFactory.  
 Estas contienen las funciones y selectores utilizadas para interactuar con el browser.
