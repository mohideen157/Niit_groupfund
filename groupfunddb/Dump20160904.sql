-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: form
-- ------------------------------------------------------
-- Server version	5.7.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `adminbankdetail`
--

DROP TABLE IF EXISTS `adminbankdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminbankdetail` (
  `id` varchar(30) NOT NULL,
  `firstname` varchar(40) NOT NULL,
  `lname` varchar(30) NOT NULL,
  `dob` varchar(40) NOT NULL,
  `sex` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `phonenum` varchar(30) NOT NULL,
  `bcode` varchar(30) NOT NULL,
  `blocation` varchar(30) NOT NULL,
  `uname` varchar(40) NOT NULL,
  `pass` varchar(40) NOT NULL,
  `cpass` varchar(30) NOT NULL,
  PRIMARY KEY (`bcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminbankdetail`
--

LOCK TABLES `adminbankdetail` WRITE;
/*!40000 ALTER TABLE `adminbankdetail` DISABLE KEYS */;
INSERT INTO `adminbankdetail` VALUES ('BNK21060824008','LAKSHMI','RAJENDRAN','09-07-1994','female','santhanamlakshmi@gmail.com','9962654548','CANARA04','KANCHEEPURAM','santhanam','lakshmiyxtel','lakshmiyxtel');
/*!40000 ALTER TABLE `adminbankdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `adminlogin`
--

DROP TABLE IF EXISTS `adminlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `adminlogin` (
  `user` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `adminlogin`
--

LOCK TABLES `adminlogin` WRITE;
/*!40000 ALTER TABLE `adminlogin` DISABLE KEYS */;
INSERT INTO `adminlogin` VALUES ('admin','admin');
/*!40000 ALTER TABLE `adminlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bank` (
  `user` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
INSERT INTO `bank` VALUES ('bank','officer');
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `user` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('user1','password');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registern`
--

DROP TABLE IF EXISTS `registern`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registern` (
  `id` varchar(30) NOT NULL,
  `firstname` varchar(40) DEFAULT NULL,
  `fathersname` varchar(40) DEFAULT NULL,
  `age` varchar(40) DEFAULT NULL,
  `sex` varchar(40) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `phonenum` varchar(40) DEFAULT NULL,
  `account` varchar(40) DEFAULT NULL,
  `uname` varchar(40) DEFAULT NULL,
  `pass` varchar(40) DEFAULT NULL,
  `cpass` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registern`
--

LOCK TABLES `registern` WRITE;
/*!40000 ALTER TABLE `registern` DISABLE KEYS */;
INSERT INTO `registern` VALUES ('200','roshini','sekar','24','female','roshiniss@gmail.com','8190891544','CurrentAcc','roshiniss88@gmail.com','password','password'),('2016040901','rosheinee','sekar','21','female','roshiniss@gmail.com','8190891544','-1/','roshini','password','password'),('290536779','geetha','sekar','21','female','roshiniss@gmail.com','678990986','null','roshiniss88@gmail.com','password','password');
/*!40000 ALTER TABLE `registern` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticketn`
--

DROP TABLE IF EXISTS `ticketn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticketn` (
  `id` varchar(250) NOT NULL,
  `tno` varchar(250) NOT NULL,
  `cno` varchar(300) NOT NULL,
  PRIMARY KEY (`tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticketn`
--

LOCK TABLES `ticketn` WRITE;
/*!40000 ALTER TABLE `ticketn` DISABLE KEYS */;
INSERT INTO `ticketn` VALUES ('2016040901','tck2016040921','CTR03'),('200','tck20160821005','CTR04');
/*!40000 ALTER TABLE `ticketn` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-04 16:49:07
