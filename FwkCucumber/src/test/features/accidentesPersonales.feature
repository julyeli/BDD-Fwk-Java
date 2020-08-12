Feature: Se accede a la pagina principal y se verifica contacto por seguro de auto

	@AccidentePersonales @Regresion
	Scenario: Completar datos validos para cotizar seguro por accidente personal
		Given accedo a la página Experta Seguros
		And hago clic en el botón Lupa, en la pantalla Experta
		And ingreso en el campo "Buscar" el valor "Accidentes Personales", en la pantalla Experta
		And selecciono la opción "COTIZAR ONLINE SEGURO DE ACCIDENTES PERSONALES", en la pantalla Experta
		When selecciono en el dropdwon "Actividad" la opción "ABOGADO", en la pantalla Accidentes Personales
		And selecciono en el dropdwon "Cantidad de Personas" la opción "3", en la pantalla Accidentes Personales
		And selecciono en el dropdwon "Período" la opción "anual", en la pantalla Accidentes Personales
		And ingreso en el campo "Nombre" el valor "Giuliana", en la pantalla Accidentes Personales
		And ingreso en el campo "Apellido" el valor "Prueba", en la pantalla Accidentes Personales
		And ingreso en el campo "Email" el valor "GiulianaPrueba@Gmail.com", en la pantalla Accidentes Personales
		And ingreso en el campo "Prefijo" el valor "11", en la pantalla Accidentes Personales
		And ingreso en el campo "Telefono" el valor "12345678", en la pantalla Accidentes Personales
		And ingreso en el campo "Fecha Desde" el valor "15/08/2020", en la pantalla Accidentes Personales
		When hago clic en el botón Cotiza, en la pantalla Accidentes Personales
		Then se visualiza el precio Recomendado, en la pantalla Accidentes Personales
		