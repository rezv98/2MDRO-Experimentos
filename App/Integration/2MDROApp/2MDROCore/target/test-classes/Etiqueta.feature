Feature: Mantenimiento de Etiqueta
  Como cliente necesito realizar la gestion de etiquetas de un juego

  @tag3
  Scenario: Añador Etiqueta de un juego
    Given despues de iniciar sesion en la aplicacion
    Given despues de haber escogido el primer juego de cualquier biblioteca
    And busco el juego "Mortal Kombat" para seleccionarlo de la tabla de Juegos
    And hago click en el boton de Ver mas del juego
    And hago click en el enlace de Mantenimiento de Etiquetas	
    And hago click en el boton nuevo.
    And en la nueva pantalla escribo en el campo Nombre el valor de "Entretenimiento"
    And escribo el campo Descripcion el valor de "Juegos de Entretenimiento"
    And presiono el boton de Guardar
    Then el sistema me muestra el mensaje de: "Se guardo correctamente la etiqueta"

  @tag3
  Scenario: Actualizar Etiqueta de un juego
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Biblioteca de Juegos
    And busco el juego "Mortal Kombat" para seleccionarlo de la tabla de Juegos
    And hago click en el boton de Ver mas del juego
    And hago click en el enlace de Mantenimiento de Etiquetas	
    And busco la etiqueta "Entretenimiento"
    And luego hago click en el boton Editar
    And en la nueva pantalla escribo en campo Descripcion el valor de "Juego de Diversion Infantil"
    And presiono el boton de Actualizar
    Then el sistema me muestra el mensaje de: "Se actualizo correctamente la etiqueta"	

  @tag3
  Scenario: Eliminar Etiqueta de un juego
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Biblioteca de Juegos
    And busco el juego "Mortal Kombat" para seleccionarlo de la tabla de Juegos
    And hago click en el boton de Ver mas del juego
    And hago click en el enlace de Mantenimiento de Etiquetas	
    And busco la etiqueta "Entretenimiento"
    And luego hago click en el boton de Eliminar
    Then el sistema me muestra el mensaje de: "Se elimino correctamente la etiqueta"

  