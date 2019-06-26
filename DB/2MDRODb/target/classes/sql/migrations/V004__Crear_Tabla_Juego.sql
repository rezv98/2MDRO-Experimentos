USE `2mdrodb`;
CREATE TABLE `juego` (
  `id_juego` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `plataforma` varchar(255) DEFAULT NULL,
  `biblioteca_id_biblioteca` int(11) DEFAULT NULL,
  `categoria_id_categoria` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_juego`),
  KEY `FKnkpy5p1e24wxhh1bcld7x9iaq` (`biblioteca_id_biblioteca`),
  KEY `FKsn1mfdy23b6sikjn9865sq3f4` (`categoria_id_categoria`),
  CONSTRAINT `FKnkpy5p1e24wxhh1bcld7x9iaq` FOREIGN KEY (`biblioteca_id_biblioteca`) REFERENCES `biblioteca` (`id_biblioteca`),
  CONSTRAINT `FKsn1mfdy23b6sikjn9865sq3f4` FOREIGN KEY (`categoria_id_categoria`) REFERENCES `categoria` (`id_categoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;