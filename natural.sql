-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-03-2021 a las 12:59:06
-- Versión del servidor: 10.4.13-MariaDB
-- Versión de PHP: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `natural`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `cat_id` int(5) NOT NULL,
  `cat_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`cat_id`, `cat_nombre`) VALUES
(1, 'Higado Graso'),
(2, 'SIstema Digestivo'),
(3, 'Sistema Renal'),
(4, 'Sistema Inmunológico'),
(5, 'Multivitamínico'),
(6, 'Sistema Reproductor'),
(7, 'Adelgazante'),
(8, 'Enfermedades de la Mujer'),
(9, 'Menopausia'),
(10, 'Colesterol'),
(11, 'Diabetes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cli_ced` varchar(13) NOT NULL,
  `cli_nom` varchar(100) NOT NULL,
  `cli_ape` varchar(100) NOT NULL,
  `cli_dir` varchar(100) NOT NULL,
  `cli_tel` char(10) DEFAULT NULL,
  `cli_mail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cli_ced`, `cli_nom`, `cli_ape`, `cli_dir`, `cli_tel`, `cli_mail`) VALUES
('1004345102', 'ANDRES ', 'FLORES', 'QUITO', '0980453235', 'andyifc2000@hotmail.com  '),
('1004606545', 'SANTIAGO', 'PUMA', 'IBARRA', '0980627681', 'dicisdeleo@gmail.com'),
('1727237263', 'EDWIN', 'DIAZ', 'CAYAMBE', '0962618083', 'edwin.ed948@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `emp_ced` varchar(10) NOT NULL,
  `emp_nom` varchar(50) NOT NULL,
  `emp_ape` varchar(50) NOT NULL,
  `emp_dir` varchar(50) NOT NULL,
  `emp_tel` char(10) NOT NULL,
  `emp_mail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`emp_ced`, `emp_nom`, `emp_ape`, `emp_dir`, `emp_tel`, `emp_mail`) VALUES
('1002176061', 'LAURA', 'MONTE', 'IBARRA', '0939561818', 'ligiaemonte@hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `fac_num` int(5) NOT NULL,
  `fac_ced` varchar(13) NOT NULL,
  `fac_fec` datetime NOT NULL,
  `fac_total` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`fac_num`, `fac_ced`, `fac_fec`, `fac_total`) VALUES
(47, '1004345102', '2021-03-16 00:00:00', '80.00'),
(48, '1004606545', '2021-03-16 00:00:00', '160.00'),
(49, '1727237263', '2021-03-16 00:00:00', '240.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fila`
--

CREATE TABLE `fila` (
  `fil_num` int(3) NOT NULL,
  `fil_nfac` int(5) NOT NULL,
  `fil_cpro` int(5) NOT NULL,
  `fil_can` int(5) NOT NULL,
  `fil_tot` decimal(8,2) NOT NULL,
  `fil_fecha` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fila`
--

INSERT INTO `fila` (`fil_num`, `fil_nfac`, `fil_cpro`, `fil_can`, `fil_tot`, `fil_fecha`) VALUES
(36, 47, 32, 10, '80.00', '2021-03-16 00:00:00'),
(37, 48, 33, 10, '80.00', '2021-03-16 00:00:00'),
(38, 49, 34, 10, '80.00', '2021-03-16 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingreso`
--

CREATE TABLE `ingreso` (
  `ing_cod` int(5) NOT NULL,
  `ing_cpro` int(5) NOT NULL,
  `ing_can` int(5) NOT NULL,
  `ing_fecha` datetime NOT NULL,
  `ing_prov` varchar(100) NOT NULL,
  `ing_proveedor` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ingreso`
--

INSERT INTO `ingreso` (`ing_cod`, `ing_cpro`, `ing_can`, `ing_fecha`, `ing_prov`, `ing_proveedor`) VALUES
(18, 32, 50, '2021-03-16 00:00:00', 'Compra', '1'),
(19, 33, 60, '2021-03-16 00:00:00', 'Compra', '1'),
(20, 34, 100, '2021-03-16 00:00:00', 'Compra', '1'),
(21, 54, 30, '2021-03-16 00:00:00', 'Compra', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `kardex`
--

CREATE TABLE `kardex` (
  `kar_id` int(5) NOT NULL,
  `kar_detalle` varchar(50) NOT NULL,
  `kar_fecha` datetime NOT NULL,
  `kar_codigo_producto` int(5) DEFAULT NULL,
  `kar_cantidad_entradas` int(5) DEFAULT 0,
  `kar_total_entradas` decimal(9,2) DEFAULT 0.00,
  `kar_cantidad_salidas` int(5) DEFAULT 0,
  `kar_total_salidas` decimal(9,2) NOT NULL DEFAULT 0.00,
  `kar_cantidad_saldo` int(5) NOT NULL,
  `kar_total_saldo` decimal(9,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `kardex`
--

INSERT INTO `kardex` (`kar_id`, `kar_detalle`, `kar_fecha`, `kar_codigo_producto`, `kar_cantidad_entradas`, `kar_total_entradas`, `kar_cantidad_salidas`, `kar_total_salidas`, `kar_cantidad_saldo`, `kar_total_saldo`) VALUES
(61, 'Compra', '2021-03-16 00:00:00', 32, 50, '225.00', 0, '0.00', 50, '225.00'),
(62, 'Compra', '2021-03-16 00:00:00', 33, 60, '270.00', 0, '0.00', 60, '-270.00'),
(63, 'Compra', '2021-03-16 00:00:00', 34, 100, '450.00', 0, '0.00', 100, '-450.00'),
(64, 'Venta', '2021-03-16 00:00:00', 32, 0, '0.00', 10, '80.00', 40, '305.00'),
(65, 'Venta', '2021-03-16 00:00:00', 33, 0, '0.00', 10, '80.00', 50, '-190.00'),
(66, 'Venta', '2021-03-16 00:00:00', 34, 0, '0.00', 10, '80.00', 90, '-370.00'),
(67, 'Compra', '2021-03-16 00:00:00', 54, 30, '135.00', 0, '0.00', 30, '-135.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `pro_cod` int(5) NOT NULL,
  `pro_des` varchar(100) NOT NULL,
  `pro_cos` decimal(8,2) NOT NULL,
  `pro_pre` decimal(8,2) NOT NULL,
  `pro_can` int(5) DEFAULT NULL,
  `pro_ent` int(5) DEFAULT NULL,
  `pro_salidas` int(5) DEFAULT NULL,
  `pro_prov` int(5) DEFAULT NULL,
  `pro_cat` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`pro_cod`, `pro_des`, `pro_cos`, `pro_pre`, `pro_can`, `pro_ent`, `pro_salidas`, `pro_prov`, `pro_cat`) VALUES
(32, 'ALOE VERA', '4.50', '8.00', 40, 50, 10, NULL, 1),
(33, 'BOLDO + TE VERDE', '4.50', '8.00', 50, 60, 10, NULL, 2),
(34, 'FÓRMULA I-ZHAN', '4.50', '8.00', 90, 100, 10, NULL, 2),
(42, 'KOLOM-HEM', '4.50', '8.00', NULL, NULL, NULL, NULL, 1),
(52, 'DAB-ZHAN', '4.50', '8.00', NULL, NULL, NULL, NULL, 2),
(53, 'MERBE-BO', '4.50', '8.00', NULL, NULL, NULL, NULL, 2),
(54, 'FITI-ZHAN', '4.50', '8.00', 30, 30, NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `prov_ruc` varchar(15) NOT NULL,
  `prov_nombre` varchar(50) NOT NULL,
  `prov_direccion` varchar(50) NOT NULL,
  `prov_geren` varchar(20) NOT NULL,
  `prov_telef` char(12) DEFAULT NULL,
  `prov_email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`prov_ruc`, `prov_nombre`, `prov_direccion`, `prov_geren`, `prov_telef`, `prov_email`) VALUES
('1002176061', 'PLANTAS MEDIEC', 'QUITO', 'NARCISA AYALA', '0967049461', 'plants.ec@gmail.com'),
('1002257697', 'MEGA ECUAFARMA NATURAL', 'LATACUNGA', 'VICTOR LEMA', '0968603761', 'ecua.farma@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipousuario`
--

CREATE TABLE `tipousuario` (
  `tipo_id` int(1) NOT NULL,
  `tipo_nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tipousuario`
--

INSERT INTO `tipousuario` (`tipo_id`, `tipo_nombre`) VALUES
(1, 'Administrador'),
(2, 'Empleado'),
(3, 'Contador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `usu_num` int(5) NOT NULL,
  `usu_nom` varchar(50) DEFAULT NULL,
  `usu_contra` varchar(42) DEFAULT NULL,
  `usu_tipo` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`usu_num`, `usu_nom`, `usu_contra`, `usu_tipo`) VALUES
(9, 'admin1', 'admin1', 1),
(10, 'bryan', 'puma', 2),
(11, 'Puma', '1234', 2),
(12, 'EDWIN', '123456789', 1),
(13, 'Bryan Puma', '1004606545', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cli_ced`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`emp_ced`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`fac_num`),
  ADD KEY `fac_ced` (`fac_ced`);

--
-- Indices de la tabla `fila`
--
ALTER TABLE `fila`
  ADD PRIMARY KEY (`fil_num`,`fil_nfac`),
  ADD KEY `fil_nfac` (`fil_nfac`),
  ADD KEY `fil_cpro` (`fil_cpro`);

--
-- Indices de la tabla `ingreso`
--
ALTER TABLE `ingreso`
  ADD PRIMARY KEY (`ing_cod`),
  ADD KEY `ing_cpro` (`ing_cpro`);

--
-- Indices de la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD PRIMARY KEY (`kar_id`),
  ADD KEY `kar_codigo_producto` (`kar_codigo_producto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`pro_cod`),
  ADD KEY `pro_cat` (`pro_cat`) USING BTREE;

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`prov_ruc`);

--
-- Indices de la tabla `tipousuario`
--
ALTER TABLE `tipousuario`
  ADD PRIMARY KEY (`tipo_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`usu_num`),
  ADD KEY `usu_tipo` (`usu_tipo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `fac_num` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT de la tabla `fila`
--
ALTER TABLE `fila`
  MODIFY `fil_num` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;

--
-- AUTO_INCREMENT de la tabla `ingreso`
--
ALTER TABLE `ingreso`
  MODIFY `ing_cod` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `kardex`
--
ALTER TABLE `kardex`
  MODIFY `kar_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `pro_cod` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `usu_num` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `factura_ibfk_1` FOREIGN KEY (`fac_ced`) REFERENCES `cliente` (`cli_ced`);

--
-- Filtros para la tabla `fila`
--
ALTER TABLE `fila`
  ADD CONSTRAINT `fila_ibfk_1` FOREIGN KEY (`fil_nfac`) REFERENCES `factura` (`fac_num`),
  ADD CONSTRAINT `fila_ibfk_2` FOREIGN KEY (`fil_cpro`) REFERENCES `producto` (`pro_cod`);

--
-- Filtros para la tabla `ingreso`
--
ALTER TABLE `ingreso`
  ADD CONSTRAINT `ingreso_ibfk_1` FOREIGN KEY (`ing_cpro`) REFERENCES `producto` (`pro_cod`);

--
-- Filtros para la tabla `kardex`
--
ALTER TABLE `kardex`
  ADD CONSTRAINT `kardex_ibfk_1` FOREIGN KEY (`kar_codigo_producto`) REFERENCES `producto` (`pro_cod`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `categoria` FOREIGN KEY (`pro_cat`) REFERENCES `categoria` (`cat_id`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`usu_tipo`) REFERENCES `tipousuario` (`tipo_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
