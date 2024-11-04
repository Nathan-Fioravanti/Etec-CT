USE bdMuseuHerois
GO

--------------------------------PROCEDURE---------------------------------
--------------------------------P�g_login------------------------------
CREATE PROCEDURE spEntrar
		@emailCliente VARCHAR(100)
		,@senhaCliente VARCHAR(10)

	AS
		BEGIN 

			IF NOT EXISTS(SELECT emailCliente FROM tbCliente WHERE emailCliente LIKE @emailCliente)
			BEGIN 
				PRINT('Este e-mail n�o existe ou foi digitado de forma incorreta!');
				RETURN
			END

			ELSE IF NOT EXISTS(SELECT senhaCliente FROM tbCliente WHERE senhaCliente LIKE @senhaCliente)
			BEGIN
				PRINT('Esta senha n�o existe ou foi digitada de forma incorreta!');
				RETURN 
			END

			ELSE 
			BEGIN
				PRINT('Entrada liberada. Login realizado com sucesso!');
				RETURN
			END
		END

----------------EXECUTANDO------------------
EXEC spEntrar 'gustavoQuintanilia@gmail.com', '12345';
EXEC spEntrar 'gustavoQuintanilia@gmail.c', '1234';


--------------------------------P�g_cadastro-----------------------------
CREATE PROCEDURE spFazerCadastro
		@nomeCliente VARCHAR(100)
		,@emailCliente VARCHAR(100)
		,@senhaCliente VARCHAR(10)

	AS
		BEGIN

			IF EXISTS(SELECT emailCliente FROM tbCliente WHERE emailCliente LIKE @emailCliente)
			BEGIN 
				PRINT('Este e-mail j� est� cadastrado no sistema!');
				RETURN
			END

			ELSE IF EXISTS(SELECT senhaCliente FROM tbCliente WHERE senhaCliente LIKE @senhaCliente)
			BEGIN
				PRINT('Esta senha j� est� cadastrada no sistema!');
				RETURN 
			END

			ELSE
			INSERT INTO tbCliente (nomeCliente, emailCliente, senhaCliente)
					VALUES (@nomeCliente, @emailCliente ,@senhaCliente)
		
			PRINT('Cadastro realizado com sucesso!');
			RETURN
		END

----------------EXECUTANDO------------------
EXEC spFazerCadastro 'Gustavo Quintanilia Mauricio Franco', 'gustavoQuintanilia@gmail.com', '12345';
EXEC spFazerCadastro 'Gustavo Quintanilia Mauricio Franco', 'gustavoQ', '12345';

SELECT * FROM tbCliente