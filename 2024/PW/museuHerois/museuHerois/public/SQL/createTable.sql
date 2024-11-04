CREATE DATABASE bdMuseuHerois

USE bdMuseuHerois
GO

------------------------CREATE_TABLE------------------------------
CREATE TABLE tbCliente(
	idCliente INT PRIMARY KEY IDENTITY(1,1)
	,nomeCliente VARCHAR(100) NOT NULL
	,emailCliente VARCHAR(100) NOT NULL
	,senhaCliente VARCHAR(10) NOT NULL
)

------------------------------------------------------
CREATE TABLE tbConta(
	idConta INT PRIMARY KEY IDENTITY(1,1)
	,statusConta VARCHAR(100) NOT NULL
)

------------------------------------------------------
CREATE TABLE tbCompra(
	idCompra INT PRIMARY KEY IDENTITY(1,1)
	,dataCompra DATE NOT NULL
	,valorTotal FLOAT NOT NULL
)

------------------------------------------------------
CREATE TABLE tbEvento(
	idEvento INT PRIMARY KEY IDENTITY(1,1)
	,nomeEvento VARCHAR(100) NOT NULL
	,dataEvento DATE NOT NULL
	,localEvento VARCHAR(100) NOT NULL
)

------------------------------------------------------
CREATE TABLE tbIngresso(
	idIngresso INT PRIMARY KEY IDENTITY(1,1)
	,tipoIngresso VARCHAR(50) NOT NULL
	,preco FLOAT NOT NULL
	,lote INT
)

------------------------------------------------------
CREATE TABLE tbExposicao(
	idExposicao INT PRIMARY KEY IDENTITY(1,1)
	,nomeExposicao VARCHAR(100) NOT NULL
	,descricao VARCHAR(100) NOT NULL
)

------------------------DROP------------------------------
DROP TABLE tbExposicao
DROP TABLE tbIngresso
DROP TABLE tbEvento
DROP TABLE tbCompra
DROP TABLE tbConta
DROP TABLE tbCliente