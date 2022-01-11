-- MySQL dump 10.13  Distrib 8.0.13, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: project
-- ------------------------------------------------------
-- Server version	8.0.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `applicant_tracking`
--

DROP TABLE IF EXISTS `applicant_tracking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `applicant_tracking` (
  `Temp_ID` int(11) NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(40) NOT NULL,
  `Last_Name` varchar(40) NOT NULL,
  `Application_Status` varchar(50) DEFAULT NULL,
  `Interviewers` varchar(150) DEFAULT NULL,
  `Interview_Date` datetime DEFAULT NULL,
  `Reviewer_Notes` varchar(500) DEFAULT NULL,
  `Resume_Link` varchar(300) DEFAULT NULL,
  `Position` varchar(50) DEFAULT NULL,
  `Positionav_Avalibility` int(11) DEFAULT NULL,
  `Employment_Type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Temp_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `applicant_tracking`
--

LOCK TABLES `applicant_tracking` WRITE;
/*!40000 ALTER TABLE `applicant_tracking` DISABLE KEYS */;
INSERT INTO `applicant_tracking` VALUES (1,'Little','Wayne III',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'Jaseh','Onfroy',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'Carl','Bob IV',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'Chett','Chuggy',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'Drake','Smith',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'Da','Baby',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'Candice','Caroll',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `applicant_tracking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-09  8:58:29
