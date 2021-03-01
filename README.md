# TestFwk
Proyecto de Automatización

## Resumen de la herramienta ##

* Infraestructura para QA Automation Cucumber para Java
* Versión: 0.1.0


#### Requerido: JDK 1.8 - MAVEN - Eclipse ####
* Descargar, Instalar y agregar variables de entorno para JDK 1.8.0_192
* Descagar e Instalar Maven
* Descagar y disponibilizar en directorio con permisos, ultima versión Eclipse
* Descargar e instalar GIT (puede usar además, un GUI como Sourcetree)


### Clonar repositorio ###
* Clonar el repositorio en directorio local con permisos de escritura
* Abrir Eclipse
* Seleccionar directorio de Workspace
* Luego Importar -> Proyecto Maven
* Si no actualiza o no baja las dependencias, hacer clic con el botón secundario del mouse sobre el proyecto y seleccionar Maven -> Update


# Estructura de archivos para ejecución de tests #

## /test/java/runners ##

Contiene la clase ejecutora. En el se usa la opción "tags"
 como filtro para las pruebas que se ejecutan, 
 por ejemplo "tags={@Regresion}". Para ejecutarlo, se corre como "JUnit Test". 


## /test/resources/features ##

Aquí se colocan los archivos .features, escritas en Gherkin.  
 Estos contienen los pasos y variables que usaran las pruebas.

## /test/java/stepsDefinitions ##

Aquí se colocan las definiciones de los steps del .feature.  
 Estas contienen las funciones invocadas en cada paso de cada feature.

## /main/java/pageObjects ##

Aquí se colocan los localizadores de los elementos con su clave:valor, usando PageFactory.  
 Estas contienen las funciones y selectores utilizadas para interactuar con el browser.

## /target/reportesCucumber ##

Aquí se guarda un reporte en html de la última ejecución.


# Casos de prueba seleccionados para la verificación del sitio #

### Contacto por Seguro de Automovil ###

Se selecciono este caso porque cuenta con un Captcha, y se realizaron los siguientes pasos:
* Acceso al sitio
* Seleccion de menú y opción
* Ingreso de datos en input
* Desbloqueo de botón y verificación

### Cotización de Seguro por Accidente Personal ###

Se selecciono este caso por los diferentes campos que contiene para interactuar, y se realizaron los siguiente pasos:
* Acceso al sitio
* Buscar la opción por Lupa
* Navegar a la opción seleccionada
* Completar campos dropdown, input, fecha y Cotizar
* Verificar precio recomendado

