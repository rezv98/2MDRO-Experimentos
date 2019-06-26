$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Biblioteca.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Biblioteca",
  "description": "Como administrador necesito realizar la gestion de Biblioteca",
  "id": "mantenimiento-de-biblioteca",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Registrar Biblioteca",
  "description": "",
  "id": "mantenimiento-de-biblioteca;registrar-biblioteca",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "hago click en el enlace de Mantenimiento de Biblioteca",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "hago click en el boton nuevo",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Pedrito\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "presiono el boton de Guardar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "el sistema me muestra el mensaje de: \"Se guardo correctamente la Biblioteca\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 3156467478,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Biblioteca()"
});
formatter.result({
  "duration": 71884,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.hago_click_en_el_boton_nuevo()"
});
formatter.result({
  "duration": 64464,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pedrito",
      "offset": 61
    }
  ],
  "location": "BibliotecaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 1528580,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 33312000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente la Biblioteca",
      "offset": 38
    }
  ],
  "location": "BibliotecaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 56116,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Actualizar Biblioteca",
  "description": "",
  "id": "mantenimiento-de-biblioteca;actualizar-biblioteca",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "hago click en el enlace de Mantenimiento de Biblioteca",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "busco la Biblioteca \"Pedrito\" para seleccionarlo de la tabla de Biblioteca",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "luego hago click en el boton Editar",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Pepito\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "presiono el boton de Actualizar",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "el sistema me muestra el mensaje de: \"Se actualizo correctamente la Biblioteca\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 300985,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Biblioteca()"
});
formatter.result({
  "duration": 97855,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pedrito",
      "offset": 21
    }
  ],
  "location": "BibliotecaIntegration.busco_el_Biblioteca_para_seleccionarlo_de_la_tabla_de_Biblioteca(String)"
});
formatter.result({
  "duration": 82068406,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.luego_hago_click_en_el_boton_Editar()"
});
formatter.result({
  "duration": 60753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pepito",
      "offset": 61
    }
  ],
  "location": "BibliotecaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 32927,
  "status": "passed"
});
formatter.match({
  "location": "BibliotecaIntegration.presiono_el_boton_de_Actualizar()"
});
formatter.result({
  "duration": 12936348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente la Biblioteca",
      "offset": 38
    }
  ],
  "location": "BibliotecaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 35710,
  "status": "passed"
});
formatter.uri("Categoria.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Categor�a",
  "description": "Como administrador necesito realizar la gestion de Categorias",
  "id": "mantenimiento-de-categor�a",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Registrar Categoria",
  "description": "",
  "id": "mantenimiento-de-categor�a;registrar-categoria",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "hago click en el enlace de Mantenimiento de Categoria",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "hago click en el boton nuevo de Categoria",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Multiplayer\" de la categoria",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "en la nueva pantalla escribo en el campo Descripcion el valor de \"Juegos de 2 a mas jugadores\" de la categoria",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "presiono el boton de Guardar de Categoria",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "el sistema me muestra el mensaje de: \"Se guardo correctamente\" la categoria",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 287536,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Categoria()"
});
formatter.result({
  "duration": 1394087,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.hago_click_en_el_boton_nuevo_de_Categoria()"
});
formatter.result({
  "duration": 73739,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Multiplayer",
      "offset": 61
    }
  ],
  "location": "CategoriaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de_la_categoria(String)"
});
formatter.result({
  "duration": 51015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Juegos de 2 a mas jugadores",
      "offset": 66
    }
  ],
  "location": "CategoriaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_el_valor_de_la_categoria(String)"
});
formatter.result({
  "duration": 70029,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.presiono_el_boton_de_Guarda_de_Categoriar()"
});
formatter.result({
  "duration": 5917217,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente",
      "offset": 38
    }
  ],
  "location": "CategoriaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 47768,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Actualizar Categoria",
  "description": "",
  "id": "mantenimiento-de-categor�a;actualizar-categoria",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "hago click en el enlace de Mantenimiento de Categoria",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "busco la categoria \"Multiplayer\" para seleccionarlo de la tabla de Categorias",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "luego hago click en el boton Editar de Categoria",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "en la nueva pantalla escribo en el campo Descripcion el valor de \"Juego de muchos jugadores a la vez\" de la categoria",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "presiono el boton de Actualizar de Categoria",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "el sistema me muestra el mensaje de: \"Se actualizo correctamente\" la categoria",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 224000,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Categoria()"
});
formatter.result({
  "duration": 198957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Multiplayer",
      "offset": 20
    }
  ],
  "location": "CategoriaIntegration.busco_la_categoria_para_seleccionarlo_de_la_tabla_de_Categoria(String)"
});
formatter.result({
  "duration": 3813566,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.luego_hago_click_en_el_boton_Editar_de_Categoria()"
});
formatter.result({
  "duration": 70493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Juego de muchos jugadores a la vez",
      "offset": 66
    }
  ],
  "location": "CategoriaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_el_valor_de_la_categoria(String)"
});
formatter.result({
  "duration": 43595,
  "status": "passed"
});
formatter.match({
  "location": "CategoriaIntegration.presiono_el_boton_de_Actualizar_de_Categoria()"
});
formatter.result({
  "duration": 7395710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente",
      "offset": 38
    }
  ],
  "location": "CategoriaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 39420,
  "status": "passed"
});
formatter.uri("Juego.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Juego",
  "description": "Como administrador necesito realizar la gestion de Juegos",
  "id": "mantenimiento-de-juego",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Registrar Juego",
  "description": "",
  "id": "mantenimiento-de-juego;registrar-juego",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "despues de ir al modulo de biblioteca",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "selecciono la primera biblioteca",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "hago click en el boton nuevo de Juego",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "selecciono la primera categoria",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Mortal Kombat\" del Juego",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "en la nueva pantalla escribo en el campo Descripcion el valor de \"Salva el mundo intentado vencer en este combate mortal\" del Juego",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "en la nueva pantalla escribo en el campo Plataforma el valor de \"PC/XBOX/PS4\" del Juego",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "presiono el boton Guardar de Juego",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "el sistema me muestra el mensaje de: \"Se guardo correctamente\" el juego",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 261566,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.despues_de_haber_seleccionado_una_biblioteca()"
});
formatter.result({
  "duration": 1743304,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.selecciono_la_primera_biblioteca()"
});
formatter.result({
  "duration": 4111304,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.hago_click_en_el_boton_nuevo_de_Juego()"
});
formatter.result({
  "duration": 102029,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.selecciono_la_primera_categoria()"
});
formatter.result({
  "duration": 3663768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mortal Kombat",
      "offset": 61
    }
  ],
  "location": "JuegoIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de(String)"
});
formatter.result({
  "duration": 65391,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salva el mundo intentado vencer en este combate mortal",
      "offset": 66
    }
  ],
  "location": "JuegoIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Descripcion_el_valor_de(String)"
});
formatter.result({
  "duration": 41276,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "PC/XBOX/PS4",
      "offset": 65
    }
  ],
  "location": "JuegoIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Plataforma_el_valor_de(String)"
});
formatter.result({
  "duration": 38956,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.presiono_el_boton_Guardar_de_Juego()"
});
formatter.result({
  "duration": 6415768,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente",
      "offset": 38
    }
  ],
  "location": "JuegoIntegration.el_sistema_me_muestra_el_mensaje_de_el_juego(String)"
});
formatter.result({
  "duration": 51942,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Actualizar Juego",
  "description": "",
  "id": "mantenimiento-de-juego;actualizar-juego",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "despues de ir al modulo de biblioteca",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "selecciono la primera biblioteca",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "busco el juego \"Mortal Kombat\" para seleccionarlo de la tabla de Juegos",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "luego hago click en el boton Editar de Juego",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "en la nueva pantalla escribo en el campo Plataforma el valor de \"Nintendo/Gameboy/XBOXONE\" del Juego",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "presiono el boton Actualizar de Juego",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "el sistema me muestra el mensaje de: \"Se actualizo correctamente\" el juego",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 260638,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.despues_de_haber_seleccionado_una_biblioteca()"
});
formatter.result({
  "duration": 189217,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.selecciono_la_primera_biblioteca()"
});
formatter.result({
  "duration": 1873623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mortal Kombat",
      "offset": 16
    }
  ],
  "location": "JuegoIntegration.busco_el_juego_para_seleccionarlo_de_la_tabla_de_Juegos(String)"
});
formatter.result({
  "duration": 3176812,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.luego_hago_click_en_el_boton_Editar_de_Juego()"
});
formatter.result({
  "duration": 69566,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nintendo/Gameboy/XBOXONE",
      "offset": 65
    }
  ],
  "location": "JuegoIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Plataforma_el_valor_de(String)"
});
formatter.result({
  "duration": 49623,
  "status": "passed"
});
formatter.match({
  "location": "JuegoIntegration.presiono_el_boton_Actualizar_de_Juego()"
});
formatter.result({
  "duration": 6929160,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente",
      "offset": 38
    }
  ],
  "location": "JuegoIntegration.el_sistema_me_muestra_el_mensaje_de_el_juego(String)"
});
formatter.result({
  "duration": 36638,
  "status": "passed"
});
formatter.uri("Tienda.feature");
formatter.feature({
  "line": 1,
  "name": "Mantenimiento de Tienda",
  "description": "Como administrador necesito realizar la gestion de Tiendas",
  "id": "mantenimiento-de-tienda",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Registrar Tiendas",
  "description": "",
  "id": "mantenimiento-de-tienda;registrar-tiendas",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "hago click en el enlace de Mantenimiento de Tiendas",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "hago click en el boton nuevo de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "en la nueva pantalla escribo en el campo Nombre el valor de \"Activision\" de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "en la nueva pantalla escribo en el campo url el valor de \"https://www.Activision.com/WOW\" de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "presiono el boton Guardar de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "el sistema me muestra el mensaje de: \"Se guardo correctamente\" la tienda",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 358957,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Tiendas()"
});
formatter.result({
  "duration": 1817508,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.hago_click_en_el_boton_nuevo_de_Tienda()"
});
formatter.result({
  "duration": 69101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Activision",
      "offset": 61
    }
  ],
  "location": "TiendaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_Nombre_el_valor_de_Tienda(String)"
});
formatter.result({
  "duration": 63073,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.Activision.com/WOW",
      "offset": 58
    }
  ],
  "location": "TiendaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_url_el_valor_de_Tienda(String)"
});
formatter.result({
  "duration": 43594,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.presiono_el_boton_de_Guardar()"
});
formatter.result({
  "duration": 6512695,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se guardo correctamente",
      "offset": 38
    }
  ],
  "location": "TiendaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 54261,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Actualizar Tienda",
  "description": "",
  "id": "mantenimiento-de-tienda;actualizar-tienda",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "despues de iniciar sesion en la aplicacion",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "hago click en el enlace de Mantenimiento de Tiendas",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "busco la tienda \"Activision\" para seleccionarlo de la tabla de Tiendas",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "luego hago click en el boton Editar de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "en la nueva pantalla escribo en el campo url el valor de \"https://www.Activision.com/backyardigansgame\" de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "presiono el boton Actualizar de Tienda",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "el sistema me muestra el mensaje de: \"Se actualizo correctamente\" la tienda",
  "keyword": "Then "
});
formatter.match({
  "location": "BibliotecaIntegration.despues_de_iniciar_sesion_en_la_aplicacion()"
});
formatter.result({
  "duration": 240696,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.hago_click_en_el_enlace_de_Mantenimiento_de_Tiendas()"
});
formatter.result({
  "duration": 226782,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Activision",
      "offset": 17
    }
  ],
  "location": "TiendaIntegration.busco_la_tienda_para_seleccionarlo_de_la_tabla_de_Tiendas(String)"
});
formatter.result({
  "duration": 4244406,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.luego_hago_click_en_el_boton_Editar_de_Tienda()"
});
formatter.result({
  "duration": 151653,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.Activision.com/backyardigansgame",
      "offset": 58
    }
  ],
  "location": "TiendaIntegration.en_la_nueva_pantalla_escribo_en_el_campo_url_el_valor_de_Tienda(String)"
});
formatter.result({
  "duration": 36638,
  "status": "passed"
});
formatter.match({
  "location": "TiendaIntegration.presiono_el_boton_de_Actualizar_Tienda()"
});
formatter.result({
  "duration": 6861913,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Se actualizo correctamente",
      "offset": 38
    }
  ],
  "location": "TiendaIntegration.el_sistema_me_muestra_el_mensaje_de_(String)"
});
formatter.result({
  "duration": 38029,
  "status": "passed"
});
});