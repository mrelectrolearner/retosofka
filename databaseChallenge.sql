CREATE DATABASE  IF NOT EXISTS `challengesofka` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `challengesofka`;
-- Dump created by MySQL pump utility, version: 5.7.36, Win64 (x86_64)
-- Dump start time: Fri Dec 24 00:59:23 2021
-- Server version: 5.7.36

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE;
SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET @@SESSION.SQL_LOG_BIN= 0;
SET @OLD_TIME_ZONE=@@TIME_ZONE;
SET TIME_ZONE='+00:00';
SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT;
SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS;
SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION;
SET NAMES utf8;
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `challengesofka` /*!40100 DEFAULT CHARACTER SET latin1 */;
CREATE TABLE `challengesofka`.`players` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(50) NOT NULL,
`level` int(11) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=latin1
;
CREATE TABLE `challengesofka`.`qyas` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`question` varchar(250) NOT NULL,
`answer1` varchar(250) NOT NULL,
`answer2` varchar(250) NOT NULL,
`answer3` varchar(250) NOT NULL,
`answer4` varchar(250) NOT NULL,
`rightAnswer` varchar(250) NOT NULL,
`level` int(11) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1
;
INSERT INTO `challengesofka`.`players` VALUES (41," l",5),(42,"L",5),(45," pro",4),(46," 1",4),(47,"Luku",4),(48,"lukaku",5),(49,"firuls",5),(50,"pepe ",2),(51," L",0),(52," L",0),(56,"F",1),(57,"sika",1),(58," peli",0);
INSERT INTO `challengesofka`.`qyas` VALUES (1,"¿Qué palabra se usa para referirse a los abdominales bien marcados? ","Lavadora","Lavalozo","Lavanda","Lavadero","Lavadero",1),(2,"¿Qué palabra aparece tradicionalmente en la pantalla al terminar un largometraje? ","Fin","Acabo","Conclusion","Final","Fin",1),(3,"¿Cuál de estos nombres no aparece en el título de una obra de Shakespeare?","Hamlet","Macbeth","Romeo","Darren","Darren",2),(4,"¿Cual es el lugar de origen del whisky escoces?","Irlanda","Gales","Estados Unidos","Escocia","Escocia",2),(5,"¿Qué nombre tiene tradicionalmente la fiesta que se hace a una mujer que espera un bebé? ","Baby drizzle","Baby shower","Baby downpour","Baby deluge","Baby shower",1),(6,"¿De que pais forma parte Hawaii?","De Canada","De Mexico","De Estados Unidos","De China","De Estados Unidos",2),(7,"¿Cuántos estados tiene integrados Estados Unidos?","2 estados","50 estados","49 estados","60 estados","50 estados",2),(8,"¿De qué año es la Constitución Española? ","De 1978","De 2003","De 1780","De 1995","De 1978",3),(9,"¿Cual es el río mas largo de España? ","El rio Cauca","El rio Congo","El río Ebro","El rio Amazonas","El río Ebro",3),(10,"¿Cuál es el océano más grande del mundo? ","El océano Pacífico","El oceano artico","EL océao baltico","El océano aclantico","El océano Pacífico",4),(11,"Cómo se llama la capital de Laos?","Fitji","Laos","Jensen","Vientián","Vientián",4),(12,"¿En qué fecha comenzó la primera República Española? ","el 11 de febrero de 1873","el 21 de mayo de 1730","el 15 de octubre de 1550","el 14 de diciembre de 1633","el 11 de febrero de 1873",5),(13,"¿Dónde se usó la primera bomba atómica en un conflicto armado?","En Nagasaki, Japón, durante la II Guerra Mundial","En Hiroshima, Japón, durante la II Guerra Mundial","En Texas, Estados Unidos, durante la II Guerra Mundial","En Berlin, Alemania, durante la I Guerra Mundial","En Hiroshima, Japón, durante la II Guerra Mundial",1),(14,"Cuándo acabó la II Guerra Mundial?","En 1944","En 1947","En 1946","En 1945","En 1945",1),(15,"¿Cómo murió Hitler? ","Se suicidó en su búnker","De colera en su casa","En argentina de viejo","En el oceano intentando escapar","Se suicidó en su búnker",2),(16,"¿Cuál es el país con mayor población del mundo?","China","India","Estados Unidos","Rusia","China",4),(17,"¿Cuál es el idioma más hablado del mundo? (","Frances","Ingles","Español","Mandarin","Mandarin",4),(18,"¿Dónde se encuentra el desierto de Gobi?","Asia","America","Medio oriente","Africa","Asia",4),(19,"¿En qué año se creó la Organización de las Naciones Unidas (ONU)?","1947","2001","1945","1953","1945",4),(20,"Cuáles potencias se enfrentaron en las guerras púnicas?","Roma y Cartago","Francia y Reino Unido","Japon y China","Congo y Malik","Roma y Cartago",3),(21,"¿Cuál es la isla más grande del mundo? ","Groenlandia","Baru","Japon","Australia","Groenlandia",3),(22,"¿En qué guerra participó Juana de Arco?","La guerra de los 100 años","La guerra de los 500 años","La guerra de los 1000 años","La guerra de los 10 años","La guerra de los 100 años",5),(23,"¿En qué año fue asesinado John F. Kennedy?","1961","1962","1963","1964","1963",4),(24,"¿El estrecho de Gibraltar separa España de qué país? ","Marruecos","Francia","Portugal","Reino Unido","Marruecos",4),(25,"¿Cómo murió Louis XVI de Francia? ","Decapitado","De tristeza","De una caida","De colera","Decapitado",4),(26,"Cuál era el nombre del dios del Sol en el Antiguo Egipto? ","Ra","Agamenon","Exodia","Osiris","Ra",4),(27,"¿Quién escribió \"La República\"? ","Socrares","Platón","Pompilo","Aristoteles","Platón",5),(28,"¿En qué año se disolvió la Unión Soviética?"," 1991"," 1992"," 1993"," 1994"," 1991",5),(29,"Cuántos años duró la guerra de los 100 años?","100","107","116","111","116",5),(30,"¿Cuál fue el segundo país americano en independizarse?","Haití","Gran colombia","Peru","Mexico","Haití",5),(31,"¿Qué conflicto finalizó tras la firma del Tratado de Versalles? ","La I Guerra Mundial","La guerra de los 100 años","La II Guerra Mundial","La guerra de los 1000 dias","La I Guerra Mundial",3),(32,"¿En qué año ocurrió el Genocidio de Ruanda? ","1991","1994","1997","1998","1994",3);
SET TIME_ZONE=@OLD_TIME_ZONE;
SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT;
SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS;
SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
SET SQL_MODE=@OLD_SQL_MODE;
-- Dump end time: Fri Dec 24 00:59:23 2021
