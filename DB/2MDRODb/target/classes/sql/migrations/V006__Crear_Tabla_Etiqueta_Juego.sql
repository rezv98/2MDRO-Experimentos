USE `2mdrodb`;
CREATE TABLE `etiqueta_juego` (
  `idjuego_etiqueta` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `etiqueta_id_etiqueta` int(11) DEFAULT NULL,
  `juego_id_juego` int(11) DEFAULT NULL,
  PRIMARY KEY (`idjuego_etiqueta`),
  KEY `FK36g28e59ytassb1i0ywf6iwwc` (`etiqueta_id_etiqueta`),
  KEY `FKb1rmejngb65uh9hjdf44dnt1` (`juego_id_juego`),
  CONSTRAINT `FK36g28e59ytassb1i0ywf6iwwc` FOREIGN KEY (`etiqueta_id_etiqueta`) REFERENCES `etiqueta` (`id_etiqueta`),
  CONSTRAINT `FKb1rmejngb65uh9hjdf44dnt1` FOREIGN KEY (`juego_id_juego`) REFERENCES `juego` (`id_juego`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;