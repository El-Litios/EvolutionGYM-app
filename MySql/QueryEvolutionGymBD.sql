/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.4.14-MariaDB : Database - db_evolutiongym
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_evolutiongym` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `db_evolutiongym`;

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `cod_client` int(4) NOT NULL AUTO_INCREMENT,
  `rut_client` varchar(15) NOT NULL,
  `nom_client` varchar(50) NOT NULL,
  `ap_client` varchar(50) NOT NULL,
  `am_client` varchar(50) NOT NULL,
  PRIMARY KEY (`cod_client`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

/*Data for the table `client` */

insert  into `client`(`cod_client`,`rut_client`,`nom_client`,`ap_client`,`am_client`) values (1,'25.142.231-5','Alejandro','Morales','Carmona'),(2,'14.201.258-5','Javier','Ibañez','Salvador'),(4,'20.258.236-5','Alexis ','Valderrama','Gonzalez'),(5,'10.205.148-2','Elijah','Wood','Smith'),(6,'14.258.963-0','Augusto','Lastarria','Ramirez');

/*Table structure for table `membership` */

DROP TABLE IF EXISTS `membership`;

CREATE TABLE `membership` (
  `cod_mem` int(4) NOT NULL AUTO_INCREMENT,
  `cod_user` int(3) NOT NULL,
  `cod_client` int(4) NOT NULL,
  `cod_method` int(1) NOT NULL,
  `cod_var` int(1) NOT NULL,
  `date_ini` date NOT NULL,
  `date_end` date NOT NULL,
  PRIMARY KEY (`cod_mem`),
  KEY `cod_user` (`cod_user`),
  KEY `cod_client` (`cod_client`),
  KEY `cod_method` (`cod_method`),
  KEY `cod_var` (`cod_var`),
  CONSTRAINT `membership_ibfk_1` FOREIGN KEY (`cod_user`) REFERENCES `user` (`cod_user`),
  CONSTRAINT `membership_ibfk_2` FOREIGN KEY (`cod_client`) REFERENCES `client` (`cod_client`),
  CONSTRAINT `membership_ibfk_3` FOREIGN KEY (`cod_method`) REFERENCES `paymethod` (`cod_payM`),
  CONSTRAINT `membership_ibfk_4` FOREIGN KEY (`cod_var`) REFERENCES `variant` (`cod_var`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4;

/*Data for the table `membership` */

insert  into `membership`(`cod_mem`,`cod_user`,`cod_client`,`cod_method`,`cod_var`,`date_ini`,`date_end`) values (2,1,1,1,1,'2020-03-12','2020-04-12'),(5,1,2,2,2,'2021-02-11','2021-05-11'),(6,1,4,2,2,'2020-12-14','2021-03-14');

/*Table structure for table `paymethod` */

DROP TABLE IF EXISTS `paymethod`;

CREATE TABLE `paymethod` (
  `cod_payM` int(1) NOT NULL AUTO_INCREMENT,
  `desc_payM` varchar(15) NOT NULL,
  PRIMARY KEY (`cod_payM`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `paymethod` */

insert  into `paymethod`(`cod_payM`,`desc_payM`) values (1,'Transferencia'),(2,'Efectivo');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `cod_role` int(1) NOT NULL AUTO_INCREMENT,
  `desc_role` varchar(30) NOT NULL,
  PRIMARY KEY (`cod_role`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `role` */

insert  into `role`(`cod_role`,`desc_role`) values (1,'Administrador'),(2,'Entrenador');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `cod_user` int(3) NOT NULL AUTO_INCREMENT,
  `nom_user` varchar(30) NOT NULL,
  `pass_user` varchar(15) NOT NULL,
  `nom_pers` varchar(50) NOT NULL,
  `ap_user` varchar(50) NOT NULL,
  `am_user` varchar(50) NOT NULL,
  `cod_role` int(1) NOT NULL,
  PRIMARY KEY (`cod_user`),
  KEY `cod_role` (`cod_role`),
  CONSTRAINT `user_ibfk_1` FOREIGN KEY (`cod_role`) REFERENCES `role` (`cod_role`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `user` */

insert  into `user`(`cod_user`,`nom_user`,`pass_user`,`nom_pers`,`ap_user`,`am_user`,`cod_role`) values (1,'carlos1','123','Carlos','Guzman','Rojas',1),(2,'carlos2','123','Alonso','Rojas','Guzman',2);

/*Table structure for table `variant` */

DROP TABLE IF EXISTS `variant`;

CREATE TABLE `variant` (
  `cod_var` int(1) NOT NULL AUTO_INCREMENT,
  `desc_var` varchar(20) NOT NULL,
  PRIMARY KEY (`cod_var`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

/*Data for the table `variant` */

insert  into `variant`(`cod_var`,`desc_var`) values (1,'1 MES (25000)'),(2,'3 MESES (32000)'),(3,'12 MESES (50000)');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
