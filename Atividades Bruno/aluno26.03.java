DROP DATABASE IF EXISTS DBALUNO;
CREATE DATABASE DBALUNO;
USE DBALUNO;

CREATE TABLE ALUNO (
	IDALUNO INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NOME VARCHAR(20) NOT NULL,
	SEXO ENUM ('M', 'F'),
	IDADE int,
	CIDADE VARCHAR(20)
);

INSERT INTO ALUNO(IDALUNO, NOME, SEXO, IDADE, CIDADE)
VALUES (1, "EMANUELLI", "F", 17, "FLORIANOPOLIS");

INSERT INTO ALUNO(IDALUNO, NOME, SEXO, IDADE, CIDADE)
VALUES (2, "SOFIA", "F", 16, "BALNEARIO CAMBURIU");

INSERT INTO ALUNO(IDALUNO, NOME, SEXO, IDADE, CIDADE)
VALUES (3, "MATHEUS", "M", 18, "FLORIANÓPOLIS");