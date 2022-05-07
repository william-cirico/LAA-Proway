USE biblioteca;
SELECT * FROM vendas;

/*
A) Pesquise os itens que foram vendidos sem desconto. As colunas presentes no
resultado da consulta são: ID_NF, ID_ITEM, COD_PROD E VALOR_UNIT.
*/
DESCRIBE vendas;


UPDATE vendas SET desconto = NULL WHERE desconto = 0;

SELECT 
	id_nf,
	id_item,
	cod_produto,
	valor_unitario,
	desconto
FROM
	vendas
WHERE
	desconto IS NULL;
	
/*
b) Pesquise os itens que foram vendidos com desconto. As colunas presentes no
resultado da consulta são: ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT E O VALOR
VENDIDO. OBS: O valor vendido é igual ao VALOR_UNIT -
(VALOR_UNIT*(DESCONTO/100)).
*/
SELECT
	id_nf,
	id_item,
	cod_produto,
	valor_unitario,
	ROUND(valor_unitario - (valor_unitario * (desconto / 100)), 2) valor_vendido
FROM
	vendas
WHERE
	desconto IS NOT NULL;
	
/*
c) Altere o valor do desconto (para zero) de todos os registros onde este campo é nulo.
*/
UPDATE vendas SET desconto = 0 WHERE desconto IS NULL; 
SELECT desconto FROM vendas;

/*
d) Pesquise os itens que foram vendidos. As colunas presentes no resultado da consulta
são: ID_NF, ID_ITEM, COD_PROD, VALOR_UNIT, VALOR_TOTAL, DESCONTO,
VALOR_VENDIDO. OBS: O VALOR_TOTAL é obtido pela fórmula: QUANTIDADE *
VALOR_UNIT. O VALOR_VENDIDO é igual a VALOR_UNIT -
(VALOR_UNIT*(DESCONTO/100)).
*/
SELECT
	id_nf,
	id_item,
	cod_produto,
	valor_unitario,
	desconto,
	ROUND(valor_unitario - (valor_unitario * (desconto / 100)), 2) valor_vendido,
	(quantidade * valor_unitario) valor_total
FROM
	vendas
WHERE
	quantidade > 0;
	
/*
e) Pesquise o valor total das NF e ordene o resultado do maior valor para o menor. As
colunas presentes no resultado da consulta são: ID_NF, VALOR_TOTAL. OBS: O 
VALOR_TOTAL é obtido pela fórmula: ∑ QUANTIDADE * VALOR_UNIT. Agrupe o
resultado da consulta por ID_NF.
*/
SELECT * FROM vendas;

SELECT
	id_nf,
	SUM(quantidade * valor_unitario) valor_total
FROM
	vendas
GROUP BY
	id_nf
ORDER BY valor_total DESC;

/*
f) Pesquise o valor vendido das NF e ordene o resultado do maior valor para o menor. As
colunas presentes no resultado da consulta são: ID_NF, VALOR_VENDIDO. O 
VALOR_VENDIDO é igual a ∑ VALOR_UNIT - (VALOR_UNIT*(DESCONTO/100)). Agrupe
o resultado da consulta por ID_NF.
*/
SELECT
	id_nf,
	ROUND(SUM(valor_unitario - (valor_unitario * (desconto / 100))), 2) valor_vendido
FROM
	vendas
GROUP	BY
	id_nf
ORDER BY
	valor_vendido DESC;
	
	
/*
g) Consulte o produto que mais vendeu no geral. As colunas presentes no resultado da
consulta são: COD_PROD, QUANTIDADE. Agrupe o resultado da consulta por
COD_PROD.
*/
SELECT
	cod_produto,
	SUM(quantidade) quantidade
FROM
	vendas
GROUP BY
	cod_produto
ORDER BY 
	quantidade DESC
LIMIT 1;


/*
h) Consulte as NF que foram vendidas mais de 10 unidades de pelo menos um produto.
As colunas presentes no resultado da consulta são: ID_NF, COD_PROD, QUANTIDADE.
Agrupe o resultado da consulta por ID_NF, COD_PROD.
*/
SELECT
	id_nf,
	cod_produto,
	SUM(quantidade)
FROM
	vendas
GROUP BY
	id_nf, cod_produto
HAVING
	SUM(quantidade) > 10;
	
/*
i) Pesquise o valor total das NF, onde esse valor seja maior que 500, e ordene o
resultado do maior valor para o menor. As colunas presentes no resultado da consulta
são: ID_NF, VALOR_TOT. OBS: O VALOR_TOTAL é obtido pela fórmula: ∑ QUANTIDADE
VALOR_UNIT. Agrupe o resultado da consulta por ID_NF.
*/
SELECT
	id_nf,
	SUM(quantidade * valor_unitario) valor_total
FROM
	vendas
GROUP BY
	id_nf
HAVING
	valor_total > 500
ORDER BY
	valor_total DESC;
	
/*
j) Qual o valor médio dos descontos dados por produto. As colunas presentes no
resultado da consulta são: COD_PROD, MEDIA. Agrupe o resultado da consulta por
COD_PROD.
*/
SELECT * FROM vendas;

SELECT
	cod_produto,
	ROUND(AVG(desconto), 2) media_desconto
FROM
	vendas
GROUP BY	
	cod_produto;
	
/*
k - Qual o menor, maior e o valor médio dos descontos dados por produto. As colunas
presentes no resultado da consulta são: COD_PROD, MENOR, MAIOR, MEDIA. Agrupe
o resultado da consulta por COD_PROD.
*/
SELECT
	cod_produto,
	MIN(desconto) menor,
	MAX(desconto) maior,
	ROUND(AVG(desconto), 2) media
FROM
	vendas
GROUP BY
	cod_produto;

/*
l - Quais as NF que possuem mais de 3 itens vendidos. As colunas presentes no resultado
da consulta são: ID_NF, QTD_ITENS. OBS:: NÃO ESTÁ RELACIONADO A QUANTIDADE
VENDIDA DO ITEM E SIM A QUANTIDADE DE ITENS POR NOTA FISCAL. Agrupe o
resultado da consulta por ID_NF.
*/
SELECT * FROM vendas;

SELECT
	id_nf,
	COUNT(id_item) qtd_itens
FROM
	vendas
GROUP BY
	id_nf
HAVING
	qtd_itens > 3;
	
/*
2 )
Funcionarios (id, nome, sobrenome, data_nascimento, cpf, rg, logradouro, cep, cidade, telefone, funcao, salario, id_departamento)
Departamento (id, nome, localizacao, id_gerente)
*/

CREATE DATABASE empresa;
USE empresa;

CREATE TABLE funcionarios (
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100) NOT NULL,
	sobrenome VARCHAR(100) NOT NULL,
	data_nascimento DATE NOT NULL,
	cpf VARCHAR(20) NOT NULL UNIQUE,
	rg VARCHAR(20) NOT NULL UNIQUE,
	logradouro VARCHAR(255) NOT NULL,
	cep VARCHAR(12) NOT NULL,
	cidade VARCHAR(255) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
	funcao VARCHAR(100) NOT NULL,
	salario FLOAT(10, 2) NOT NULL,
	id_departamento INT UNSIGNED NOT NULL
);

CREATE TABLE departamentos (
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
	localizacao VARCHAR(100),
	id_gerente INT UNSIGNED 
);

ALTER TABLE	
	funcionarios 
ADD CONSTRAINT 
	fk_id_departamento 
FOREIGN KEY 
	(id_departamento) 
REFERENCES 
	departamentos (id);
	
ALTER TABLE
	departamentos
ADD CONSTRAINT
	fk_id_gerente
FOREIGN KEY
	(id_gerente)
REFERENCES
	funcionarios(id);
	
INSERT INTO departamentos (nome, localizacao) VALUES
("Dep. A", "Sala 01"),
("Dep. B", "Sala 02"),
("Dep. C", "Sala 03"),
("Dep. D", "Sala 04"),
("Dep. E", "Sala 05");

INSERT INTO funcionarios (
	nome, 
	sobrenome, 
	data_nascimento, 
	cpf, 
	rg, 
	logradouro, 
	cidade, 
	cep, 
	telefone, 
	funcao, 
	salario,
	id_departamento
) VALUES
("Matheus", "Pitsch", "2002-05-13", "111.123.123-11", "1.123.512", "Rua tal 1", "Cidade tal 1", "89010-100", "(47) 9 9999-9999", "Desenvolvedor I", 2800, 1),
("Luan", "Fortunato", "2004-03-23", "111.124.123-11", "1.121.512", "Rua tal 2", "Cidade tal 2", "89010-101", "(47) 9 9999-9998", "Gerente", 18000, 2),
("Fernando", "Fischer", "1992-01-15", "111.124.123-12", "1.221.512", "Rua tal 3", "Cidade tal 3", "89010-121", "(47) 9 9999-9298", "Suporte III", 4000, 3),
("Reginaldo", "Pláscido", "2007-04-24", "111.024.123-11", "1.621.512", "Rua tal 4", "Cidade tal 4", "89010-101", "(47) 9 9929-9998", "Estagiário", 1200, 4),
("Felipe", "Girardi", "2002-07-12", "121.124.123-11", "1.021.512", "Rua tal 5", "Cidade tal 5", "89110-101", "(47) 9 9229-9998", "Suporte II", 3000, 5);

UPDATE departamentos SET id_gerente = 2;

SELECT * FROM departamentos;

/*
Liste os funcionários que tem salário superior a R$ 1.000 ordenados 
pelo nome completo.
*/
SELECT
	nome,
	salario
FROM
	funcionarios
WHERE
	salario > 1000;
	
/*
B) Liste o nome, sobrenome e a data de nascimento de todos os 
funcionários ordenado do mais novo para o mais velho.
*/
SELECT
	nome,
	sobrenome,
	DATE_FORMAT(data_nascimento, "%d/%m/%Y") "data de nascimento"
FROM
	funcionarios
ORDER BY
	data_nascimento DESC; 
	
/*
C) Liste o total gasto pela empresa no pagamento dos funcionários.
*/
SELECT
	SUM(salario)
FROM
	funcionarios;
	
/*
D) Liste o nome do funcionário, o nome do departamento que ele trabalha e a 
função de cada funcionário.
*/
SELECT
	f.nome nome_funcionario,
	d.nome nome_departamento,
	f.funcao
FROM
	funcionarios f, departamentos d
WHERE
	f.id_departamento = d.id;

SELECT
	f.nome nome_funcionario,
	d.nome nome_departamento,
	f.funcao
FROM
	funcionarios f
INNER JOIN
	departamentos d
ON
	f.id_departamento = d.id;

/*
E) Liste o nome do departamento e o nome do gerente de cada departamento.
*/
SELECT
	d.nome nome_departamento,
	f.nome nome_gerente
FROM
	departamentos d
INNER JOIN
	funcionarios f
ON
	d.id_gerente = f.id;
	
/*
F) Liste o total de salário pago para os funcionários de cada cada departamento.
*/
INSERT INTO funcionarios (
	nome, 
	sobrenome, 
	data_nascimento, 
	cpf, 
	rg, 
	logradouro, 
	cidade, 
	cep, 
	telefone, 
	funcao, 
	salario,
	id_departamento
) VALUES
("Fernando", "Marinho", "1979-11-10", "117.124.123-11", "1.023.412", "Rua tal 6", "Cidade tal 6", "88110-101", "(47) 9 9200-9998", "Jurídico", 15000, 1);

SELECT
	d.nome nome_departamento,
	SUM(f.salario) total_salario
FROM
	departamentos d
INNER JOIN
	funcionarios f
ON
	f.id_departamento = d.id
GROUP BY
	d.nome;
	
/*
G) Liste a quantidade de funcionários da empresa.
*/
SELECT
	COUNT(id) quantidade_funcionarios
FROM
	funcionarios;
	
/*
H) Liste o salário médio pago pela empresa.
*/
SELECT
	ROUND(AVG(salario), 2) media_salario
FROM
	funcionarios;
	
/*
I) Liste o salário médio pago por cada departamento.
*/
SELECT
	d.nome nome_departamento,
	ROUND(AVG(f.salario), 2) media_salario
FROM
	departamentos d
INNER JOIN
	funcionarios f
ON
	f.id_departamento = d.id
GROUP BY d.nome;

/*
J) Liste o maior salário de cada departamento.
*/
SELECT	
	d.nome nome_departamento,
	MAX(f.salario) maior_salario
FROM
	departamentos d
INNER JOIN	
	funcionarios f
ON
	f.id_departamento = d.id
GROUP BY
	d.nome;


	

	



	

	

