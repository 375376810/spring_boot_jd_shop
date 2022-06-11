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
-- Table structure for table `guess_you_like_items`
--

DROP TABLE IF EXISTS `guess_you_like_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guess_you_like_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `gs_id` int DEFAULT NULL,
  `title` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` double DEFAULT NULL,
  `desc` varchar(90) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sort` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guess_you_like_items`
--

LOCK TABLES `guess_you_like_items` WRITE;
/*!40000 ALTER TABLE `guess_you_like_items` DISABLE KEYS */;
INSERT INTO `guess_you_like_items` VALUES (1,1,'北欧简约床品件套 美式加大印花被套纯棉60支纱贡缎印花四件套',279.5,'北欧简约床品件套 美式加大印花被套纯棉60支纱贡缎印花四件套','images/likes/likes1.jpg','1'),(2,1,'日本进口伊陶日式家用盘陶瓷餐具汤菜盘子水果沙拉碗菜鱼盘小吃碟',29.9,'日本进口伊陶日式家用盘陶瓷餐具汤菜盘子水果沙拉碗菜鱼盘小吃碟','images/likes/likes2.jpg','1'),(3,1,'加厚不锈钢方形煎蛋模具心形圆形煎蛋器吐司三明治花式厨',11.9,'加厚不锈钢方形煎蛋模具心形圆形煎蛋器吐司三明治花式厨','images/likes/likes3.jpg','1'),(4,1,'北欧全身镜落地轻奢入户玄关镜复古门口穿衣镜简约立式挂墙试衣镜',437,'北欧全身镜落地轻奢入户玄关镜复古门口穿衣镜简约立式挂墙试衣镜','images/likes/likes4.jpg','1'),(5,1,'陶瓷水果盘欧式三层点心盘蛋糕盘下午茶甜品盘客厅家用糖',15,'陶瓷水果盘欧式三层点心盘蛋糕盘下午茶甜品盘客厅家用糖','images/likes/likes5.jpg','1'),(6,1,'欧式轻奢餐垫pvc圆形防水桌布隔热垫 餐桌垫花盆垫茶杯垫',14.9,'欧式轻奢餐垫pvc圆形防水桌布隔热垫 餐桌垫花盆垫茶杯垫','images/likes/likes6.jpg','1'),(7,1,'外贸冬暖夏凉 中国麻水洗汉麻单只枕头套枕套48x74麻枕套',39.9,'外贸冬暖夏凉 中国麻水洗汉麻单只枕头套枕套48x74麻枕套','images/likes/likes7.jpg','1'),(8,1,'塑料盖子干果零食干货玻璃存储罐补品防潮存储食品玻璃瓶',8.8,'塑料盖子干果零食干货玻璃存储罐补品防潮存储食品玻璃瓶','images/likes/likes8.jpg','1'),(9,1,'美式高街休闲裤男夏季薄款宽松直筒冰丝运动裤阔腿垂',79.8,'美式高街休闲裤男夏季薄款宽松直筒冰丝运动裤阔腿垂','images/likes/likes9.jpg','1'),(10,1,'调味瓶罐陶瓷中式仿古调料调味盐罐厨房猪油辣椒罐油罐家',12.9,'调味瓶罐陶瓷中式仿古调料调味盐罐厨房猪油辣椒罐油罐家','images/likes/likes10.jpg','1'),(11,1,'马桶垫家用两件套冬季带盖套装坐便器盖套罩四季通用坐垫',15.9,'马桶垫家用两件套冬季带盖套装坐便器盖套罩四季通用坐垫','images/likes/likes11.jpg','1'),(12,1,'土耳其进口复古浮雕玻璃收纳罐子坚果杂粮饼干零食糖储物泡菜瓶子',21,'土耳其进口复古浮雕玻璃收纳罐子坚果杂粮饼干零食糖储物泡菜瓶子','images/likes/likes12.jpg','1'),(13,1,'senseyo 藤编茶杯垫茶道垫子防烫耐高温餐桌垫盘子碗垫隔热垫餐垫',12,'senseyo 藤编茶杯垫茶道垫子防烫耐高温餐桌垫盘子碗垫隔热垫餐垫','images/likes/likes13.jpg','1'),(14,1,'香港代购包包2022新款潮真皮女包小众设计法棍包腋下',168,'香港代购包包2022新款潮真皮女包小众设计法棍包腋下','images/likes/likes14.jpg','1'),(15,1,'实木捣蒜罐 木捣药罐药盅 中药研磨器蒜臼木臼擂钵蒜泥 压',17,'实木捣蒜罐 木捣药罐药盅 中药研磨器蒜臼木臼擂钵蒜泥 压','images/likes/likes15.jpg','1');
/*!40000 ALTER TABLE `guess_you_like_items` ENABLE KEYS */;
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
