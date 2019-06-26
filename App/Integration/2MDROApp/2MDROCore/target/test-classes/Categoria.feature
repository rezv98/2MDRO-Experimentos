Feature: Mantenimiento de Categoría
  Como administrador necesito realizar la gestion de Categorias

  @tag1
  Scenario: Registrar Categoria
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Categoria
    And hago click en el boton nuevo de Categoria
    And en la nueva pantalla escribo en el campo Nombre el valor de "Multiplayer" de la categoria
    And en la nueva pantalla escribo en el campo Descripcion el valor de "Juegos de 2 a mas jugadores" de la categoria
    And presiono el boton de Guardar de Categoria
    Then el sistema me muestra el mensaje de: "Se guardo correctamente" la categoria

  @tag1
  Scenario: Actualizar Categoria
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Categoria
    And busco la categoria "Multiplayer" para seleccionarlo de la tabla de Categorias
    And luego hago click en el boton Editar de Categoria
    And en la nueva pantalla escribo en el campo Descripcion el valor de "Juego de muchos jugadores a la vez" de la categoria
    And presiono el boton de Actualizar de Categoria
    Then el sistema me muestra el mensaje de: "Se actualizo correctamente" la categoria	

  @tag2
  Scenario: Eliminar Categoria
    Given despues de iniciar sesion en la aplicacion
    When hago click en el enlace de Mantenimiento de Categoria
    And busco la categoria "Multiplayer" para seleccionarlo de la tabla de Categorias
    And presiono el boton de Eliminar de Categoria
    Then el sistema me muestra el mensaje de: "Se elimino correctamente" la categoria