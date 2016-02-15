CREATE TABLE `user` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `name` varchar(25) NOT NULL,
  `age` int(3) NOT NULL,
  `isAdmin` bit(1) DEFAULT b'0',
  `createdDate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=94 DEFAULT CHARSET=utf8;

INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (72, 'a', 0, false, '2016-02-12 16:18:36');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (74, 'a', 0, false, '2016-02-12 16:18:41');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (75, 'a', 0, false, '2016-02-12 16:18:43');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (79, 'a', 0, false, '2016-02-12 16:18:50');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (81, 'a', 456, false, '2016-02-12 16:18:53');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (82, 'a', 1, true, '2016-02-12 16:18:54');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (83, 'a', 0, false, '2016-02-12 16:34:49');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (84, 'a', 4, true, '2016-02-15 08:18:55');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (85, 'b', 4, true, '2016-02-15 08:36:06');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (86, 'a', 7, false, '2016-02-15 08:44:44');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (91, 'b', 9, false, '2016-02-15 10:57:47');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (92, 'a', 55, true, '2016-02-15 14:46:13');
INSERT INTO user (id, name, age, isAdmin, createdDate) VALUES (93, 'a', 2, true, '2016-02-15 14:46:17');