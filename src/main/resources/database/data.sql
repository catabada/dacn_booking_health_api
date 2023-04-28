



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `doctorcare`
--
CREATE DATABASE IF NOT EXISTS `doctorcare` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `doctorcare`;



DROP TABLE IF EXISTS `patients`;
CREATE TABLE IF NOT EXISTS `patients` (
    `id` varchar(11) NOT NULL ,
    `name` varchar(255) DEFAULT NULL,
    `phone` varchar(255) DEFAULT NULL,
    `email` varchar(255) DEFAULT NULL,
    `gender` varchar(255) DEFAULT NULL,
    `birth` varchar(255) DEFAULT NULL,
    `address` text DEFAULT NULL,
    `createdAt` datetime NOT NULL,
    `updatedAt` datetime DEFAULT NULL,
    `deletedAt` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients`
--

INSERT INTO `patients` (`id`, `name`, `phone`, `email`, `gender`, `birth`, `address`, `createdAt`, `updatedAt`, `deletedAt`) VALUES
    ('PA01',  'Alex', '0321456789', 'alex@gmail.com', 'male', '12/2/2021', 'usa', '2020-11-14 20:20:18', '2020-11-14 20:22:14', NULL);



-- Table structure for table `specializations`
--

DROP TABLE IF EXISTS `specializations`;
CREATE TABLE IF NOT EXISTS `specializations` (
    `id` varchar(11) NOT NULL ,
    `name` varchar(255) DEFAULT NULL,
    `description` text DEFAULT NULL,
    `createdAt` datetime NOT NULL,
    `updatedAt` datetime DEFAULT NULL,
    `deletedAt` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `specializations`
--

INSERT INTO `specializations` (`id`, `name`, `description`, `createdAt`, `updatedAt`, `deletedAt`) VALUES
                                                                                                       ('SP01', 'Khoa ngoại', NULL,  '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                                       ('SP02', 'Khoa nội', NULL, '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                                       ('SP03', 'Răng hàm mặt', NULL, '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL);

-- --------------------------------------------------------
DROP TABLE IF EXISTS `symptom`;
CREATE TABLE IF NOT EXISTS `symptom` (
    `id` varchar(11) NOT NULL ,
    `name` varchar(255) DEFAULT NULL,
    `description` text DEFAULT NULL,
    `createdAt` datetime NOT NULL,
    `updatedAt` datetime DEFAULT NULL,
    `deletedAt` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;


INSERT INTO `symptom` (`id`, `name`, `description`, `createdAt`, `updatedAt`, `deletedAt`) VALUES
                                                                                               ('SY01', 'ho', NULL,  '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                               ('SY02', 'sổ mũi', NULL, '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                               ('SY03', 'đau đầu', NULL, '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL);

-- --------------------------------------------------------
-- assosiation syptom and specialization
DROP TABLE IF EXISTS `assosiation`;
CREATE TABLE IF NOT EXISTS `assosiation` (
    `id` varchar(11) NOT NULL ,
    `idsymptom` varchar(11),
    `idspecialization` varchar(11),
    `createdAt` datetime NOT NULL,
    `updatedAt` datetime DEFAULT NULL,
    `deletedAt` datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

INSERT INTO `assosiation` (`id`, `idsymptom`, `idspecialization`, `createdAt`, `updatedAt`, `deletedAt`) VALUES
                                                                                                             ('AS01', 'SY01', 'SP01',  '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                                             ('AS02', 'SY02', 'SP01', '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL),
                                                                                                             ('AS03', 'SY03', 'SP01', '2020-11-13 19:44:36', '2020-11-13 19:44:36', NULL);











