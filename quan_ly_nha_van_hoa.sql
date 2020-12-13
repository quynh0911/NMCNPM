-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 06, 2020 at 04:24 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quan_ly_nha_van_hoa`
--

-- --------------------------------------------------------

--
-- Table structure for table `hopdong`
--

CREATE TABLE `hopdong` (
  `idhopdong` int(11) NOT NULL,
  `tenkhachhang` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sodienthoai` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diacchi` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `soCMT` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `batdau` datetime NOT NULL,
  `ketthuc` datetime NOT NULL,
  `chiphi` int(11) NOT NULL,
  `datcoc` int(11) NOT NULL,
  `idphong` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  `thanhtoan` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `hopdong`
--

INSERT INTO `hopdong` (`idhopdong`, `tenkhachhang`, `sodienthoai`, `diacchi`, `soCMT`, `batdau`, `ketthuc`, `chiphi`, `datcoc`, `idphong`, `trangthai`, `thanhtoan`) VALUES
(1, 'quyet', '0828234613', NULL, '063467145', '2020-12-11 15:32:45', '2020-12-12 15:32:45', 1000, 500, 1, 0, 0),
(2, 'thai', '0828222228', NULL, '063567145', '2020-11-11 15:32:45', '2020-11-12 15:32:45', 100, 100, 2, 0, 0),
(3, 'thang', '0828233333', NULL, '02467145', '2020-1-11 15:32:45', '2020-1-12 15:32:45', 1000, 500, 2, 0, 0),
(4, 'lam', '0828288553', NULL, '063367145', '2020-8-11 15:32:45', '2020-8-12 15:32:45', 1000, 60, 1, 0, 0),
(5, 'hieu', '0824865135', NULL, '067467145', '2020-7-11 15:32:45', '2020-7-12 15:32:45', 100, 500, 2, 0, 0),
(6, 'hung', '0828486513', NULL, '065467145', '2020-9-11 15:32:45', '2020-9-12 15:32:45', 1000, 500, 1, 0, 0),
(8, 'hung', '08248159553', NULL, '023467145', '2020-3-11 15:32:45', '2020-3-12 15:32:45', 1000, 500, 2, 0, 0),
(9, 'huong', '0828234613', NULL, '053467145', '2020-5-11 15:32:45', '2020-5-12 15:32:45', 100, 50, 1, 0, 0),
(7, 'huong', '0828234613', NULL, '263467145', '2020-2-11 15:32:45', '2020-2-12 15:32:45', 1000, 500, 1, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `phong`
--

CREATE TABLE `phong` (
  `idphong` int(11) NOT NULL,
  `ten` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `vitri` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dientich` int(11) NOT NULL,
  `trangthai` tinyint(1) NOT NULL,
  `mota` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `phong`
--

INSERT INTO `phong` (`idphong`, `ten`, `vitri`, `dientich`, `trangthai`, `mota`) VALUES
(1, 'hoi nghi', 'tang1', 300, 1, NULL),
(3, 'Kho', 'phía sau', 50, 1, NULL),
(2, 'hop', 'tang 2', 40, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `thietbi`
--

CREATE TABLE `thietbi` (
  `idthietbi` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tenthietbi` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `soluong` int(11) NOT NULL,
  `khadung` int(11) NOT NULL,
  `mota` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `thietbi`
--

INSERT INTO `thietbi` (`idthietbi`, `tenthietbi`, `soluong`, `khadung`, `mota`) VALUES
('BAN01', 'Bàn ĐỨng', 15, 10, ''),
('LOA01', 'loa đứng', 10, 10, NULL),
('Ghe01', 'ghế gấp', 60, 50, NULL),
('Den', 'bóng đèn', 10, 8, NULL),
('Quat01', 'quạt trần', 5, 5, NULL),
('Quat02', 'quạt cây', 8, 7, NULL),
('TRONG', 'trống', 3, 3, NULL),
('LOA02', 'loa treo tường', 10, 4, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hopdong`
--
ALTER TABLE `hopdong`
  ADD PRIMARY KEY (`idhopdong`),
  ADD KEY `idphong` (`idphong`);

--
-- Indexes for table `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`idphong`);

--
-- Indexes for table `thietbi`
--
ALTER TABLE `thietbi`
  ADD PRIMARY KEY (`idthietbi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hopdong`
--
ALTER TABLE `hopdong`
  MODIFY `idhopdong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `phong`
--
ALTER TABLE `phong`
  MODIFY `idphong` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hopdong`
--
ALTER TABLE `hopdong`
  ADD CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`idphong`) REFERENCES `phong` (`idphong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
