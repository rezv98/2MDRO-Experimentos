Feature: Mantenimiento de Juego
  Como administrador necesito realizar la gestion de Juegos

  @tag1
  Scenario: Registrar Juego
    Given despues de iniciar sesion en la aplicacion
    Given despues de ir al modulo de biblioteca
    When selecciono la primera biblioteca
    And hago click en el boton nuevo de Juego 
    And selecciono la primera categoria
    And en la nueva pantalla escribo en el campo Nombre el valor de "Mortal Kombat" del Juego
    And en la nueva pantalla escribo en el campo Descripcion el valor de "Salva el mundo intentado vencer en este combate mortal" del Juego
    And en la nueva pantalla escribo en el campo Plataforma el valor de "PC/XBOX/PS4" del Juego
    And presiono el boton Guardar de Juego
    Then el sistema me muestra el mensaje de: "Se guardo correctamente" el juego

  @tag1
  Scenario: Actualizar Juego
    Given despues de iniciar sesion en la aplicacion
    Given despues de ir al modulo de biblioteca
    When selecciono la primera biblioteca
    And busco el juego "Mortal Kombat" para seleccionarlo de la tabla de Juegos
    And luego hago click en el boton Editar de Juego
    And en la nueva pantalla escribo en el campo Plataforma el valor de "Nintendo/Gameboy/XBOXONE" del Juego
    And presiono el boton Actualizar de Juego
    Then el sistema me muestra el mensaje de: "Se actualizo correctamente" el juego	

  @tag2
  Scenario: Eliminar Juego
    Given despues de iniciar sesion en la aplicacion
    Given despues de ir al modulo de biblioteca
    When selecciono la primera biblioteca
    And busco el juego "Mortal Kombat" para seleccionarlo de la tabla de Juegos
    And presiono el boton Eliminar de Juego
    Then el sistema me muestra el mensaje de: "Se elimino correctamente" el juego