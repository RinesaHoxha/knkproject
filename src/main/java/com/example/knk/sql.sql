
-- Table structure for table `Item`
--

DROP TABLE IF EXISTS `Item`;

CREATE TABLE `Item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `brand` varchar(30) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `imgUrl` varchar(100) DEFAULT NULL,
  `stockAmount` int(10) DEFAULT NULL,
  `soldAmount` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;


--
--
-- Dumping data for table `Item`
--

LOCK TABLES `Item` WRITE;

INSERT INTO `Item` VALUES (1,'new','fj',1,'imgUrl',7,3),
(2,'kajdf','kfj',1,'imgUrl',10,0),
(3,'kajdf','kfj',1,'imgUrl',10,0),
(4,'kajdf','kfj',1,'imgUrl',10,0),
(5,'books','omega',10,'imgUrl',7,3),
(6,'pen','bic',3,'imgUrl',10,7),
(7,'bread','shewa',32,'imgUrl',10,0),
(8,'soap','GoodBrabd',20,'imgUrl',10,0),
(9,'jebena','ethio pots',90,'imgUrl',90,0),
(10,'card','post card brand',4,'imgUrl',4,0),
(11,'pc','toshiba',3453,'imgUrl',2447,1006);

UNLOCK TABLES;

--
-- Table structure for table `user_account`
--

DROP TABLE IF EXISTS `user_account`;

CREATE TABLE `user_account` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `account_id_UNIQUE` (`account_id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `user_account`
--

LOCK TABLES `user_account` WRITE;

INSERT INTO `user_account` VALUES (1,'abebe','kebede','abekebe','abekebe',NULL);

UNLOCK TABLES;

