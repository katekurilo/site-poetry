# -- Table: users
# CREATE TABLE users (
#   id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
#   username VARCHAR(255) NOT NULL,
#   password VARCHAR(255) NOT NULL
# )
#   ENGINE = InnoDB;
#
# -- Table: roles
# CREATE TABLE roles (
#   id   INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
#   name VARCHAR(100) NOT NULL
# )
#   ENGINE = InnoDB;
#
# -- Table for mapping user and roles: user_roles
# CREATE TABLE user_roles (
#   user_id INT NOT NULL,
#   role_id INT NOT NULL,
#
#   FOREIGN KEY (user_id) REFERENCES users (id),
#   FOREIGN KEY (role_id) REFERENCES roles (id),
#
#   UNIQUE (user_id, role_id)
# )
#   ENGINE = InnoDB;
#
# -- Insert data
#
# INSERT INTO users VALUES (1, 'proselyte', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG');
#
# INSERT INTO roles VALUES (1, 'ROLE_USER');
# INSERT INTO roles VALUES (2, 'ROLE_ADMIN');
#
# INSERT INTO user_roles VALUES (1, 2);
#
# -- Table: Poems
# CREATE TABLE poems (
#   id     INT           NOT NULL AUTO_INCREMENT PRIMARY KEY,
#   name   VARCHAR(60)   NOT NULL,
#   poem   VARCHAR(1000) NOT NULL,
#   author VARCHAR(255)  NOT NULL
# )
#   ENGINE = InnoDB;
#
#  INSERT INTO poems VALUES (1, '����',
# 'C���� �� ������ � ���?
# � �������� ������:
# ��� ����� ������� ����,
# ����� ����� �� ����
# ��� �����������,
# ��� ���������� � ����?
# �������� ����
# ���������� �� �����.
#
# ����� ��� ��� �����
# �� ������ ��� ������?
# ����� �������� ����
# � ������ ��� �� ����,
# �� ������� ��� �Merci�,
# �� ���������� ����,
# �� �������� �����,
# �������
# �� ������?
#
# ����� ����� ��������,
# �� � ��� � �� ����
# ��� ������� ����
# � ������� �� ����..
# � ����� �� �����,
# � ������� �� �����
# ���������� �����,
# � ���������� ������...',
#  '������ �������')

CREATE TABLE `poems` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) NOT NULL,
  `poem` TEXT(10000000) NOT NULL,
  `author` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB