Feature: Mantenimiento de Biblioteca
  Como administrador necesito realizar la gestion de Biblioteca

  @tag1
  Scenario: Registrar Biblioteca
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Biblioteca
    And hago click en el boton nuevo
    And en la nueva pantalla escribo en el campo Nombre el valor de "Pedrito"
    And presiono el boton de Guardar
    Then el sistema me muestra el mensaje de: "Se guardo correctamente la Biblioteca"

  @tag1
  Scenario: Actualizar Biblioteca
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Biblioteca
    And busco la Biblioteca "Pedrito" para seleccionarlo de la tabla de Biblioteca
    And luego hago click en el boton Editar
    And en la nueva pantalla escribo en el campo Nombre el valor de "Pepito"
    And presiono el boton de Actualizar
    Then el sistema me muestra el mensaje de: "Se actualizo correctamente la Biblioteca"
 @tag2
  Scenario: Eliminar Biblioteca
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Biblioteca
    And busco la Biblioteca "Pepito" para seleccionarlo de la tabla de Biblioteca
    And presiono el boton de Eliminar
    Then el sistema me muestra el mensaje de: "Se elimino correctamente la Biblioteca"

 