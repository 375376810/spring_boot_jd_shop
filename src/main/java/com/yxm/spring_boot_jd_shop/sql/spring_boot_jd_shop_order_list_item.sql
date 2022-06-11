-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: spring_boot_jd_shop
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `order_list_item`
--

DROP TABLE IF EXISTS `order_list_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_list_item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_id` int DEFAULT NULL,
  `title` varchar(90) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(90) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `color` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `size` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `user_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nick_name` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_list_item`
--

LOCK TABLES `order_list_item` WRITE;
/*!40000 ALTER TABLE `order_list_item` DISABLE KEYS */;
INSERT INTO `order_list_item` VALUES (54,1,'手机数码','U-Magic/优畅享 20 Plus 5G 40W超级快充 90Hz高刷真全屏 6GB+128GB翡冷翠全网通5G手机【华为智选】',1499,1,'青色','L','images/category_items/phone/phone4.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(55,1,'手机数码','U-Magic/优畅享 20 Plus 5G 40W超级快充 90Hz高刷真全屏 6GB+128GB翡冷翠全网通5G手机【华为智选】',1499,1,'紫色','XL','images/category_items/phone/phone4.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(56,1,'手机数码','【vivo】Y32 新品手机 8GB+4GB超大运存，高通骁龙6nm芯片，5000mAh大电池 雾夜黑 4GB 128GB',8399,2,'青色','L','images/category_items/phone/phone1.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(57,1,'运动户外','【美国原装进口/家用商用赛艇测功仪】Concept2风阻划船机D+PM5 简易安装快速收纳顺丰物流 黑色',7850,1,'青色','XL','images/category_items/sports/sports7.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(58,1,'运动户外','Bestway气垫床单人家用 双人充气床垫加大气垫加厚户外便携充气床折叠床 【新品 耐磨升级款】送电泵两个颈枕送防潮垫收纳袋 2',209,1,'紫色','3XL','images/category_items/sports/sports1.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(59,1,'运动户外','迈康（MIKING）单杠家用引体向上器室内单双杠 多功能儿童女士增高健身器材体育用品 4001F黑色【外八底座防侧翻，限时特惠领',196,1,'紫色','XL','images/category_items/sports/sports6.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(60,1,'运动户外','双鱼乒乓球桌家用带轮折叠228可折叠式乒乓球台室内标准25mm案子25毫米厚度球桌',3140,1,'红色','L','images/category_items/sports/sports9.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(61,1,'运动户外','斯伯丁Spalding篮球76-095室内外PU皮儿童成人比赛训练7号蓝球',155,1,'紫色','XXL','images/category_items/sports/sports10.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(62,1,'运动户外','北极绒户外冲锋衣男女三合一保暖透气抓绒内胆两件套防风防水登山服冲锋衣裤 男黑色 2XL',359,1,'蓝色','XL','images/category_items/sports/sports4.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(63,1,'手机数码','U-Magic/优畅享 20 Plus 5G 40W超级快充 90Hz高刷真全屏 6GB+128GB翡冷翠全网通5G手机【华为智选】',1499,1,'青色','L','images/category_items/phone/phone4.jpg',43,'11111111111','大明','河北省/邢台市/桥东区碧桂园小区8栋2单元1号705'),(64,1,'母婴','babycare恒温水壶调奶器婴儿冲奶粉保温恒温水壶温奶暖奶热奶器1.2L-晨雾绿',259,1,'蓝色','5XL','images/category_items/perinatal/perinatal7.jpg',43,'11111111111','大明','上海市/上海城区/静安区碧桂园小区8栋2单元1号705'),(65,1,'母婴','爱他美（Aptamil） 卓萃幼儿配方奶粉（12—36月龄，3段） 900g*6罐 整箱装',2034,1,'蓝色','L','images/category_items/perinatal/perinatal4.jpg',43,'11111111111','大明','上海市/上海城区/静安区碧桂园小区8栋2单元1号705');
/*!40000 ALTER TABLE `order_list_item` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 10:10:25
