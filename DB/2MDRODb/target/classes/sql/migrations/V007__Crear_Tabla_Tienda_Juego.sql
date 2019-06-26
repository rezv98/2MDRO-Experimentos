USE `2mdrodb`;
CREATE TABLE `tienda_juego` (
  `id_tienda_juego` int(11) NOT NULL AUTO_INCREMENT,
  `precio` decimal(19,2) DEFAULT NULL,
  `juego_id_juego` int(11) DEFAULT NULL,
  `tienda_id_tienda` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_tienda_juego`),
  KEY `FK53oupi88vsnffefsipswc06b4` (`juego_id_juego`),
  KEY `FK6pu2jwssreeh6rnkdme4wqxuv` (`tienda_id_tienda`),
  CONSTRAINT `FK53oupi88vsnffefsipswc06b4` FOREIGN KEY (`juego_id_juego`) REFERENCES `juego` (`id_juego`),
  CONSTRAINT `FK6pu2jwssreeh6rnkdme4wqxuv` FOREIGN KEY (`tienda_id_tienda`) REFERENCES `tienda` (`id_tienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;