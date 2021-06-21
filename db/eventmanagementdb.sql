-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 21, 2021 at 12:40 PM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eventmanagementdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `username` varchar(20) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `password` varchar(25) DEFAULT NULL,
  `sec_q` varchar(25) DEFAULT NULL,
  `sec_ans` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`username`, `name`, `password`, `sec_q`, `sec_ans`) VALUES
('Shubh26', 'Shubhayu', 'Shubh26', 'Your NickName?', 'Shubh'),
('prathmeshSD', 'Prathmesh Dhatrak', '123456', 'Your Lucky Number?', '7'),
('Prathmesh83', 'Prathmesh Santosh', '123456', 'Your Lucky Number?', '7'),
('Walter_bad', 'Walter White', '123456', 'Your Lucky Number?', '17');

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `event_id` varchar(10) DEFAULT NULL,
  `title` varchar(40) DEFAULT NULL,
  `start_date` varchar(30) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL,
  `end_date` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`event_id`, `title`, `start_date`, `description`, `price`, `end_date`) VALUES
('921', 'CryptoThon', '2021-06-19', 'Blockchain technology is most simply defined ', '100', '2021-06-20'),
('676', 'Shaastra', '2021-06-21', 'DS & Alog event for all batch', '200', '2021-06-22'),
('902', 'Slate & Crystal Events.', '2021-06-19', 'ntermittent  losses Event for all', '2000', '2021-06-19'),
('517', 'VIT Camp for DS', '2021-06-19', 'In computer science, a data structure is a data organization, management', '100', '2021-06-19'),
('464', 'VIT Event', '2021-06-19', 'DSjfnf', '200', '2021-06-20');

-- --------------------------------------------------------

--
-- Table structure for table `payment_data`
--

CREATE TABLE `payment_data` (
  `event_id` varchar(10) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT NULL,
  `ename` varchar(40) DEFAULT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `event_price` varchar(20) DEFAULT NULL,
  `is_paid` varchar(10) DEFAULT NULL,
  `dateOfRegister` varchar(30) DEFAULT NULL,
  `dateOfPayment` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment_data`
--

INSERT INTO `payment_data` (`event_id`, `student_id`, `ename`, `sname`, `event_price`, `is_paid`, `dateOfRegister`, `dateOfPayment`) VALUES
('676', '2765', 'Shaastra', 'Radhe Nagy', '200', 'Yes', 'Jun 19, 2021', 'Jun 20, 2021'),
('517', '1000', 'VIT Camp for DS', 'Prathmesh Dhatrak', '100', 'Yes', 'Jun 20, 2021', 'Jun 20, 2021');

-- --------------------------------------------------------

--
-- Table structure for table `registerevent`
--

CREATE TABLE `registerevent` (
  `event_id` varchar(10) DEFAULT NULL,
  `student_id` varchar(10) DEFAULT NULL,
  `ename` varchar(40) DEFAULT NULL,
  `sname` varchar(40) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `price` varchar(50) NOT NULL,
  `dateOfRegister` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `registerevent`
--

INSERT INTO `registerevent` (`event_id`, `student_id`, `ename`, `sname`, `course`, `branch`, `price`, `dateOfRegister`) VALUES
('676', '2765', 'Shaastra', 'Radhe Nagy', 'B.E', 'CSE', '200', 'Jun 19, 2021'),
('921', '4054', 'CryptoThon', 'Govind Pradhan', 'B.E', 'CSE', '100', 'Jun 21, 2021'),
('921', '7308', 'CryptoThon', 'Yogesh Gera', 'B.E', 'CSE', '100', 'Jun 20, 2021'),
('517', '4054', 'VIT Camp for DS', 'Govind Pradhan', 'B.E', 'CSE', '100', 'Jun 19, 2021'),
('517', '1000', 'VIT Camp for DS', 'Prathmesh Dhatrak', 'B.E', 'CSE', '100', 'Jun 20, 2021');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `student_id` varchar(10) DEFAULT NULL,
  `name` varchar(25) DEFAULT NULL,
  `father` varchar(25) DEFAULT NULL,
  `course` varchar(10) DEFAULT NULL,
  `branch` varchar(10) DEFAULT NULL,
  `year` varchar(10) DEFAULT NULL,
  `semester` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`student_id`, `name`, `father`, `course`, `branch`, `year`, `semester`) VALUES
('1000', 'Prathmesh Dhatrak', 'Santosh Dhatrak', 'B.E', 'CSE', 'Second', '4th'),
('2765', 'Radhe Nagy', 'Ajinkya Nagy', 'B.E', 'CSE', 'Second', '2nd'),
('4054', 'Govind Pradhan', 'Parvez Pradhan', 'B.E', 'CSE', 'Second', '4th'),
('7308', 'Yogesh Gera', 'Ajinkya Gera', 'B.E', 'CSE', 'Second', '5th'),
('6251', 'Jesse Pinkman', 'Om Pinkman', 'B.E', 'CSE', 'Second', '4th');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
