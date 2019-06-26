Feature: Mantenimiento de Tienda
  Como administrador necesito realizar la gestion de Tiendas

  @tag1
  Scenario: Registrar Tiendas
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Tiendas
    And hago click en el boton nuevo de Tienda
    And en la nueva pantalla escribo en el campo Nombre el valor de "Activision" de Tienda
    And en la nueva pantalla escribo en el campo url el valor de "https://www.Activision.com/WOW" de Tienda
    And presiono el boton Guardar de Tienda
    Then el sistema me muestra el mensaje de: "Se guardo correctamente" la tienda

  @tag1
  Scenario: Actualizar Tienda
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Tiendas
    And busco la tienda "Activision" para seleccionarlo de la tabla de Tiendas
    And luego hago click en el boton Editar de Tienda
    And en la nueva pantalla escribo en el campo url el valor de "https://www.Activision.com/backyardigansgame" de Tienda
    And presiono el boton Actualizar de Tienda
    Then el sistema me muestra el mensaje de: "Se actualizo correctamente" la tienda	

  @tag2
  Scenario: Eliminar Tienda
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Tiendas
    And busco la tienda "Activision" para seleccionarlo de la tabla de Tiendas
    And presiono el boton Eliminar de Tienda
    Then el sistema me muestra el mensaje de: "Se elimino correctamente" la tienda