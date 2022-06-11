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
-- Table structure for table `hot_product_items`
--

DROP TABLE IF EXISTS `hot_product_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hot_product_items` (
  `id` int NOT NULL AUTO_INCREMENT,
  `list_id` int DEFAULT NULL,
  `title` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` double DEFAULT NULL,
  `desc` varchar(90) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(60) COLLATE utf8_unicode_ci DEFAULT NULL,
  `sort` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hot_product_items`
--

LOCK TABLES `hot_product_items` WRITE;
/*!40000 ALTER TABLE `hot_product_items` DISABLE KEYS */;
INSERT INTO `hot_product_items` VALUES (1,8,'玻璃瓶子密封罐带盖厨房家用透明大号茶叶罐食品杂粮收纳',37,'玻璃瓶子密封罐带盖厨房家用透明大号茶叶罐食品杂粮收纳','images/hot/hot1.jpg','9'),(2,8,'日本制职人手作 高桑金属白色珐琅系列搪瓷刀叉勺餐具套',38,'日本制职人手作 高桑金属白色珐琅系列搪瓷刀叉勺餐具套','images/hot/hot2.jpg','9'),(3,8,'调味瓶罐陶瓷中式仿古调料调味盐罐厨房猪油辣椒罐油罐家用耐高温',12.9,'调味瓶罐陶瓷中式仿古调料调味盐罐厨房猪油辣椒罐油罐家用耐高温','images/hot/hot3.jpg','9'),(4,8,'纯棉短袖t恤社会小伙夏季新款ins潮流港风精神痞帅打底衫体恤衫',58,'纯棉短袖t恤社会小伙夏季新款ins潮流港风精神痞帅打底衫体恤衫','images/hot/hot4.jpg','99'),(5,8,'出口欧美80支埃及长绒棉纯棉四件套贡缎全棉纯色简约床上用品1.8m',129,'出口欧美80支埃及长绒棉纯棉四件套贡缎全棉纯色简约床上用品1.8m','images/hot/hot5.jpg','9'),(6,8,'特大号粗管脏衣服收纳篮脏衣篓家用洗衣仿藤编篮子装放衣物筐神器',12.8,'特大号粗管脏衣服收纳篮脏衣篓家用洗衣仿藤编篮子装放衣物筐神器','images/hot/hot6.jpg','9'),(7,8,'居家家 日式盘子木盘木制碟子托盘 创意家用木托盘菜盘餐盘点心盘',21.9,'居家家 日式盘子木盘木制碟子托盘 创意家用木托盘菜盘餐盘点心盘','images/hot/hot7.jpg','9'),(8,8,'妙HOME 北欧 天然大理石 黄铜 玫瑰金西餐调料研磨器捣蒜器捣碎器',15.8,'妙HOME 北欧 天然大理石 黄铜 玫瑰金西餐调料研磨器捣蒜器捣碎器','images/hot/hot8.jpg','9'),(9,8,'12号21点上架 iam studio 美总私服定制深V棉麻长袖防晒连衣裙',69,'12号21点上架 iam studio 美总私服定制深V棉麻长袖防晒连衣裙','images/hot/hot9.jpg','9'),(10,8,'韩国进口米色普罗旺斯玫瑰花立体荷叶边公主婚庆轻奢风四件套床品',180,'韩国进口米色普罗旺斯玫瑰花立体荷叶边公主婚庆轻奢风四件套床品','images/hot/hot10.jpg','9'),(11,8,'纯白陶瓷鱼盘蒸鱼盘子 厚边椭圆形家用碟子大号 餐厅饭店酒店餐具',32,'纯白陶瓷鱼盘蒸鱼盘子 厚边椭圆形家用碟子大号 餐厅饭店酒店餐具','images/hot/hot11.jpg','9'),(12,8,'泡菜坛子家用陶瓷的腌咸鸭蛋四川土陶咸酸菜罐传统老式带盖10斤',12,'泡菜坛子家用陶瓷的腌咸鸭蛋四川土陶咸酸菜罐传统老式带盖10斤','images/hot/hot12.jpg','9'),(13,8,'藤编收纳篮 创意家居水果盘 零食盒糖果篮 茶点盒 茶几收纳筐手工',18,'藤编收纳篮 创意家居水果盘 零食盒糖果篮 茶点盒 茶几收纳筐手工','images/hot/hot13.jpg','9'),(14,8,'ANMANI恩曼琳22春夏新蝴蝶结系带双排扣蕾丝泡泡袖针织衫EANCBB36',58,'ANMANI恩曼琳22春夏新蝴蝶结系带双排扣蕾丝泡泡袖针织衫EANCBB36','images/hot/hot14.jpg','9'),(15,8,'竹篦子蒸片家用蒸馍热馒头圆形蒸锅蒸架蒸屉蒸笼蒸馒头蒸格',36,'竹篦子蒸片家用蒸馍热馒头圆形蒸锅蒸架蒸屉蒸笼蒸馒头蒸格','images/hot/hot15.jpg','9'),(16,8,'桌面置物架厨房下水槽储物塑料办公冰柜收纳分隔板多层整',26,'桌面置物架厨房下水槽储物塑料办公冰柜收纳分隔板多层整','images/hot/hot16.jpg','9'),(17,8,'简约现代棉麻亚麻纯色窗纱帘客厅卧室落地窗定制成品加厚白纱窗帘',80,'简约现代棉麻亚麻纯色窗纱帘客厅卧室落地窗定制成品加厚白纱窗帘','images/hot/hot17.jpg','9'),(18,8,'手动家用蒜泥捣蒜压蒜搅蒜器大蒜蒜蓉蒜头姜蒜搅碎机打蒜切蒜神器',12.8,'手动家用蒜泥捣蒜压蒜搅蒜器大蒜蒜蓉蒜头姜蒜搅碎机打蒜切蒜神器','images/hot/hot18.jpg','9'),(19,8,'法式复古金属扣小方头后空单鞋气质小跟鞋高跟包头凉鞋女夏2022年',388,'法式复古金属扣小方头后空单鞋气质小跟鞋高跟包头凉鞋女夏2022年','images/hot/hot19.jpg','9'),(20,8,'非凡家品收纳箱四件套儿童玩具整理箱家用中号带盖塑料书本收纳盒',26,'非凡家品收纳箱四件套儿童玩具整理箱家用中号带盖塑料书本收纳盒','images/hot/hot20.jpg','9'),(21,8,'日本进口濑户烧陶瓷古典杯烧酒清酒杯大茶杯茶具套装礼品',56,'日本进口濑户烧陶瓷古典杯烧酒清酒杯大茶杯茶具套装礼品','images/hot/hot21.jpg','9'),(22,8,'短袖设计感女小众小香风针织t恤女洋气夏季',60,'短袖设计感女小众小香风针织t恤女洋气夏季','images/hot/hot22.jpg','9'),(23,8,'无印水洗棉四件套简约良品纯色格子条纹纯棉全棉床单床笠床品套件',210,'无印水洗棉四件套简约良品纯色格子条纹纯棉全棉床单床笠床品套件','images/hot/hot23.jpg','9'),(24,8,'百丽复古阿甘鞋女2022春商场新款轻便休闲透气运动鞋',380,'百丽复古阿甘鞋女2022春商场新款轻便休闲透气运动鞋','images/hot/hot24.jpg','9'),(25,8,'家用创意可爱儿童不锈钢二齿水果叉子西餐点心蛋糕甜品果',16,'家用创意可爱儿童不锈钢二齿水果叉子西餐点心蛋糕甜品果','images/hot/hot25.jpg','9'),(26,8,'加厚火罐玻璃罐火罐家用拔罐器非气罐1号2号3号4号5号规格齐全',18,'加厚火罐玻璃罐火罐家用拔罐器非气罐1号2号3号4号5号规格齐全','images/hot/hot26.jpg','9'),(27,8,'塞维尔套装 | 重磅22姆米弹力重绉 冰感CE经典双口袋',598,'塞维尔套装 | 重磅22姆米弹力重绉 冰感CE经典双口袋','images/hot/hot27.jpg','9'),(28,8,'全棉出口薰衣草刺绣枕芯 纯棉绗绣蚕丝颈椎保健枕水洗棉一',38.9,'全棉出口薰衣草刺绣枕芯 纯棉绗绣蚕丝颈椎保健枕水洗棉一','images/hot/hot28.jpg','9'),(29,8,'非侈原创 设计感透明一字带花朵露趾凉鞋女夏串珠蝴蝶',29.9,'非侈原创 设计感透明一字带花朵露趾凉鞋女夏串珠蝴蝶','images/hot/hot29.jpg','9'),(30,8,'简约创意餐具黑白色水果叉陶瓷不锈钢点心甜品小叉子水果签套装',19.9,'简约创意餐具黑白色水果叉陶瓷不锈钢点心甜品小叉子水果签套装','images/hot/hot30.jpg','9');
/*!40000 ALTER TABLE `hot_product_items` ENABLE KEYS */;
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
