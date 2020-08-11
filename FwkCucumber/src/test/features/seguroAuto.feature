Feature: Se accede a la pagina principal y se verifica contacto por seguro de auto

	@SeguroAuto
	Scenario: Completar datos validos para contacto para seguro auto
		Given accedo a la página Experta Seguros
		And hago clic en el menú Seguros, en la pantalla Experta
		And hago clic en la opcion Autos, en la pantalla Experta
		When ingreso en el campo "Nombre" el valor "Giuliana Pruebas", en la pantalla Seguro Auto
		And ingreso en el campo "Celular" el valor "01112345678", en la pantalla Seguro Auto
		And ingreso en el campo "Codigo Postal" el valor "1440", en la pantalla Seguro Auto
		And ingreso en el campo "Email" el valor "GiulianaPrueba@gmail.com", en la pantalla Seguro Auto
		When hago clic en el botón Quiero Ser contactado, en la pantalla Seguro Auto
		Then veo en el botón el mensaje "ENVÍO EXITOSO", en la pantalla Seguro Auto
		