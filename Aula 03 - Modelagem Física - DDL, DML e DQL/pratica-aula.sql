

# Criação do banco de dados
CREATE DATABASE biblioteca;
USE biblioteca;

# Removendo as tabelas
DROP TABLE livros;
DROP TABLE editoras;

/*
Comentário de bloco
Várias linhas
*/

# Comentário de linha


# Criação da tabela editora
CREATE TABLE IF NOT EXISTS editoras (
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    telefone VARCHAR(30) NOT NULL,
    nome_gerente VARCHAR(100) NOT NULL
);

# Criação da tabela livros
CREATE TABLE IF NOT EXISTS livros (
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    preco FLOAT(10, 2) NOT NULL CHECK (preco > 0),
    editora_id INT UNSIGNED NOT NULL 
);

# Alterando as tabelas adicionando uma FK e uma nova coluna.
ALTER TABLE livros ADD CONSTRAINT fk_editora_id FOREIGN KEY (editora_id) REFERENCES editoras(id);
ALTER TABLE livros ADD COLUMN autor VARCHAR(100) NOT NULL;

# Inserindo valores na tabela de editoras.
INSERT INTO editoras (nome, telefone, nome_gerente) VALUES 
("Abril", "(11) 9 2872-1231", "Luan"),
("Sextante", "(11) 9 1232-1231", "Matheus"),
("Editora Rocco", "(11) 9 1283-1231", "Fernando"),
("Vale das Letras", "(11) 9 1276-8712", "Reginaldo");
INSERT INTO editoras (nome, telefone, nome_gerente) VALUES ("Podeditora", "(11) 9 1237-1231", "William");

# Selecionando todas as colunas da tabela de editoras.
SELECT * FROM editoras;

# Inserindo valores na tabela de livros.
INSERT INTO livros (nome, preco, editora_id) VALUES 
("Pai rico, pai pobre.", 29.99, 1),
("Um livro qualquer.", 99.99, 5);

INSERT INTO livros (nome, preco, editora_id) VALUES
("Do mil ao milhão.", 17.60, 2),
("Extraordinário", 22, 3),
("Nascido para correr", 20, 3);

SELECT * FROM livros;

# Desabilitando SAFE MODE
SET SQL_SAFE_UPDATES = 0;

# Executar queries como essa, só são possíveis com o SAFE MODE desabilitado.
UPDATE livros SET nome = "Outro livro 2.";

# Removendo valores
TRUNCATE TABLE livros;
DELETE FROM livros;

# Removendo um valor específico
DELETE FROM livros WHERE id = 4;

SELECT * FROM livros;

# Consultando os dados da tabela
SELECT nome, preco FROM livros WHERE preco < 30;
SELECT nome, preco FROM livros WHERE preco BETWEEN 20 AND 30;
SELECT nome, preco FROM livros WHERE nome IN ("Pai rico, pai pobre.", "Do mil ao milhão.");
SELECT nome, preco FROM livros WHERE nome LIKE "%r___";
SELECT github FROM inscritos WHERE github LIKE "https://github.com/%/desafio-warren";

SELECT COUNT(id) FROM livros;
INSERT INTO livros (nome, preco, editora_id) VALUES 
("Nascido para correr", 21.90, 3),
("Nascido para correr", 18.90, 3);


# Quando eu preciso utilizar uma função MAX/MIN para descobrir o maior elemento em conjunto com outras colunas.
SELECT nome, preco FROM livros ORDER BY preco DESC LIMIT 1;

# Para saber o maior e o menor valor de uma coluna na tabela.
SELECT MAX(preco) FROM livros;
SELECT MIN(preco) FROM livros;

# Para calcular a média aritmética de uma coluna.
SELECT AVG(preco) FROM livros;

# Para calcular a soma das colunas de uma tabela.
SELECT SUM(preco) FROM livros;

SELECT 
	l.nome "nome do livro",
    e.nome "nome da editora",
    e.telefone
FROM 
	livros l
INNER JOIN
	editoras e
ON
	l.editora_id = e.id;
    
SELECT
	l.nome "nome do livro",
    e.nome "nome da editora"
FROM
	livros l, 
    editoras e
WHERE
	l.editora_id = e.id;
    
CREATE TABLE IF NOT EXISTS vendas (
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    nome_vendedor VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    produto VARCHAR(255) NOT NULL,
    cidade VARCHAR(255) NOT NULL
);

INSERT INTO vendas (nome_vendedor, quantidade, produto, cidade) VALUES 
("Jorge", 10, "Mouse", "São Paulo"),
("Ana", 06, "Teclado", "Rio de Janeiro"),
("Mario", 23, "Mouse", "Blumenau"),
("Felipe", 26, "Webcam", "Blumenau"),
("João", 2, "Teclado", "Recife"),
("Pedro", 3, "Monitor", "São Paulo"),
("João", 5, "Monitor", "Rio de Janeiro");

SELECT cidade, COUNT(quantidade) FROM vendas GROUP BY cidade ORDER BY quantidade DESC;
SELECT 
	nome_vendedor, 
    SUM(quantidade) 
FROM 
	vendas 
GROUP BY 
	nome_vendedor 
ORDER BY 
	quantidade DESC 
LIMIT 1;

SELECT 
	nome_vendedor,
    SUM(quantidade)
FROM
	vendas
GROUP BY
	nome_vendedor
HAVING SUM(quantidade > 20);

SELECT
	nome_vendedor,
    SUM(quantidade)
FROM
	vendas
GROUP BY
	nome_vendedor;











