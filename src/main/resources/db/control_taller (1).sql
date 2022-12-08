-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2022 a las 18:11:12
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `control_taller`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cars`
--

CREATE TABLE `cars` (
  `id` bigint(40) NOT NULL,
  `brand` varchar(50) COLLATE utf8_bin NOT NULL,
  `model` varchar(50) COLLATE utf8_bin NOT NULL,
  `color` varchar(50) COLLATE utf8_bin NOT NULL,
  `year` varchar(20) COLLATE utf8_bin NOT NULL,
  `id_client` bigint(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `cars`
--

INSERT INTO `cars` (`id`, `brand`, `model`, `color`, `year`, `id_client`) VALUES
(1, 'Mitsubishi', 'Lancer', 'Negro', '2010', 1),
(3, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 1),
(4, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 2),
(5, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 2),
(6, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 6),
(7, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 6),
(8, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 7),
(9, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 7),
(10, 'dfjbkfbuisfb', 'sfjbsfufbs', 'sfjbsfubsfo', '20xx', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clients`
--

CREATE TABLE `clients` (
  `id` bigint(40) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `lastname` varchar(50) COLLATE utf8_bin NOT NULL,
  `address` varchar(100) COLLATE utf8_bin NOT NULL,
  `dui` varchar(20) COLLATE utf8_bin NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  `phone` varchar(20) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `clients`
--

INSERT INTO `clients` (`id`, `name`, `lastname`, `address`, `dui`, `email`, `phone`) VALUES
(1, 'Manuel', 'Hurtado', 'San Salvador', '05457389-3', 'manuel@gmail.com', '2283-3829'),
(2, 'Alex', 'Mata', 'Apopa', '03438392-4', 'alex@gmail.com', '2292-4399'),
(6, 'dfjbfbf', 'Mdfnfisfn', 'sfjlfnsjsfnlsf', '04738393-2', 'dfjlnflsdfnk@gmail.com', '2123-3272'),
(7, 'dfjbfbf', 'Mdfnfisfn', 'sfjlfnsjsfnlsf', '04738393-2', 'dfjlnflsdfnk@gmail.com', '2123-3272');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `employees`
--

CREATE TABLE `employees` (
  `id` bigint(40) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `lastname` varchar(50) COLLATE utf8_bin NOT NULL,
  `type` varchar(50) COLLATE utf8_bin NOT NULL,
  `dui` varchar(20) COLLATE utf8_bin NOT NULL,
  `email` varchar(50) COLLATE utf8_bin NOT NULL,
  `cod_employ` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `employees`
--

INSERT INTO `employees` (`id`, `name`, `lastname`, `type`, `dui`, `email`, `cod_employ`) VALUES
(1, 'Frank', 'Calabria', 'Supervisor', '05879393-2', 'frank.calabria@gmail.com', 'cala.fran');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `records`
--

CREATE TABLE `records` (
  `id` bigint(40) NOT NULL,
  `id_employee` bigint(40) NOT NULL,
  `id_car` bigint(40) NOT NULL,
  `id_service` bigint(40) NOT NULL,
  `date` date NOT NULL,
  `note` varchar(255) COLLATE utf8_bin NOT NULL,
  `status` varchar(50) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `services`
--

CREATE TABLE `services` (
  `id` bigint(40) NOT NULL,
  `name` varchar(50) COLLATE utf8_bin NOT NULL,
  `type` varchar(50) COLLATE utf8_bin NOT NULL,
  `description` varchar(255) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `services`
--

INSERT INTO `services` (`id`, `name`, `type`, `description`) VALUES
(1, 'Cambio de Aceite', 'Preventivo', 'Cambio de aceite viejo por un aceite nuevo luego del tiempo establecido para realizar dicha acción'),
(2, 'Ajuste de Motor', 'Correctivo', 'dfjuofbvuosdbclsbvsvbslbsikvbspivvspsbpsvbnspbvspvbsispbsipsbvpsipsbvpis');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cars`
--
ALTER TABLE `cars`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_client` (`id_client`);

--
-- Indices de la tabla `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_employee` (`id_employee`),
  ADD KEY `id_car` (`id_car`),
  ADD KEY `id_service` (`id_service`);

--
-- Indices de la tabla `services`
--
ALTER TABLE `services`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cars`
--
ALTER TABLE `cars`
  MODIFY `id` bigint(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `clients`
--
ALTER TABLE `clients`
  MODIFY `id` bigint(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `employees`
--
ALTER TABLE `employees`
  MODIFY `id` bigint(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `records`
--
ALTER TABLE `records`
  MODIFY `id` bigint(40) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `services`
--
ALTER TABLE `services`
  MODIFY `id` bigint(40) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cars`
--
ALTER TABLE `cars`
  ADD CONSTRAINT `cars_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `records`
--
ALTER TABLE `records`
  ADD CONSTRAINT `records_ibfk_1` FOREIGN KEY (`id_car`) REFERENCES `cars` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `records_ibfk_2` FOREIGN KEY (`id_employee`) REFERENCES `employees` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `records_ibfk_3` FOREIGN KEY (`id_service`) REFERENCES `services` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
