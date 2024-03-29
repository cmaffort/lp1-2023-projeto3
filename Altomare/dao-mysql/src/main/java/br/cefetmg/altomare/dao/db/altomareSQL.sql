SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Banco de dados: `altomare`
--

-- --------------------------------------------------------
CREATE DATABASE IF NOT EXISTS altomare;
USE altomare;
--
-- Estrutura da tabela `atividade`
--

DROP TABLE IF EXISTS `atividade`;
CREATE TABLE IF NOT EXISTS `atividade` (
  `Nome` varchar(50),
  `Data` varchar(50),
  `HoraInicio` varchar(50),
  `HoraTermino` varchar(50),
  `Local` varchar(50),
  `Ocupacao` int(11) DEFAULT NULL,
  `FucionarioResponsavel` varchar(50),
  `Descricao` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionarios`;
CREATE TABLE IF NOT EXISTS `funcionarios` (
  `Nome` varchar(50),
  `DatNasc` varchar(50),
  `CPF` varchar(50),
  `RG` varchar(50),
  `Sexo` varchar(50),
  `Email` varchar(50),
  `EstadoCivil` varchar(50),
  `Turno` varchar(50),
  `Setor` varchar(50),
  `DataAdmissao` varchar(50),
  `Telefone` varchar(50),
  `Foto` varchar(50),
  `Senha` varchar(50)

) ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- --------------------------------------------------------


--
-- Estrutura da tabela `cardapio`
--

DROP TABLE IF EXISTS `cardapio`;
CREATE TABLE IF NOT EXISTS `cardapio`(
  `Id` int(11),
  `Nome` varchar(255) PRIMARY KEY,
  `Preco` double,
  `Descricao`varchar(250),
  `Foto` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;

CREATE TABLE IF NOT EXISTS `produto` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) NOT NULL,
  `Data`  varchar(255),
  `Quantidade` int (255),
  `QuantidadeTotal` int (255), 
  `Tipo` varchar(50),
  `Preco` double DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `pacote`;

CREATE TABLE IF NOT EXISTS `pacote` (
  `Nome` varchar(255) NOT NULL,
  `cpf` varchar(255) NOT NULL,
  `telefone` varchar(255),
  `destino` varchar(255),
  `datapart` varchar(50),
  `duracao` varchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

COMMIT;


-- /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
-- /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
-- /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_usuario`
--

DROP TABLE IF EXISTS `contausuario`;
CREATE TABLE IF NOT EXISTS `contausuario` (
  id_conta BIGINT, -- autoincrement
  esta_aberta BOOLEAN,
  total DOUBLE,
  PRIMARY KEY (id_conta)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estrutura da tabela `despesa`
--

DROP TABLE IF EXISTS `despesa`;
CREATE TABLE IF NOT EXISTS `despesa` (
  id_despesa BIGINT AUTO_INCREMENT,
  valor DOUBLE NOT NULL,
  foi_registrada BOOLEAN,
  tipo VARCHAR(20),
  descricao VARCHAR(200),
  data_ocorrencia VARCHAR(50),
  id_conta BIGINT(10),
  PRIMARY KEY (id_despesa)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `seguranca`


DROP TABLE IF EXISTS `seguranca`;
CREATE TABLE IF NOT EXISTS `seguranca` (
  `Nome` varchar(255) NOT NULL,
  `Especificacao` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

-- Estrutura da tabela `cartao`


DROP TABLE IF EXISTS `cartao`;
CREATE TABLE IF NOT EXISTS `cartao` (
  id_cartao BIGINT AUTO_INCREMENT,
  titular VARCHAR(50),
  vencimento VARCHAR(20),
  tipo VARCHAR(10),
  cvv INT(3),
  numero BIGINT(12),
  id_conta BIGINT(10),
  PRIMARY KEY (id_cartao)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO contausuario (esta_aberta, total, id_conta) VALUES (true, 1500.00, 1);

INSERT INTO cartao (titular, vencimento, tipo, cvv, numero, id_conta) VALUES("Cara Legal", "2023-10-10", "debito", 111, 1111111111111111, 1);
INSERT INTO cartao (titular, vencimento, tipo, cvv, numero, id_conta) VALUES("Cara Bacana", "2023-10-10", "credito", 222, 2222222222222222, 1);
INSERT INTO cartao (titular, vencimento, tipo, cvv, numero, id_conta) VALUES("Cara Gente Boa", "2023-10-10", "credito", 333, 3333333333333333, 1);
INSERT INTO cartao (titular, vencimento, tipo, cvv, numero, id_conta) VALUES("Cara Dahora", "2023-10-10", "debito", 444, 4444444444444444, 1);
INSERT INTO cartao (titular, vencimento, tipo, cvv, numero, id_conta) VALUES("Cara Bom", "2023-10-10", "debito", 555, 5555555555555555, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidounidade`
--

DROP TABLE IF EXISTS `pedidounidade`;
CREATE TABLE IF NOT EXISTS `pedidounidade` (
  id_pedido_unidade BIGINT AUTO_INCREMENT,
  valor DOUBLE NOT NULL,
  conteudo VARCHAR(250),
  id_conta BIGINT(10),
  PRIMARY KEY (id_pedido_unidade)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

--
-- Estrutura da tabela `pedidotodo`
--

DROP TABLE IF EXISTS `pedidotodo`;
CREATE TABLE IF NOT EXISTS `pedidotodo` (
  id_pedido_todo BIGINT,
  total DOUBLE NOT NULL,
  finalizado BOOLEAN,
  data_criacao VARCHAR(50),
  estado VARCHAR(50),
  tipo VARCHAR(50),
  PRIMARY KEY (id_pedido_todo)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(1, 10, false, "opa","em preparo", "restaurante");
INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(2, 10, false, "opa","finalizado", "restaurante");
INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(3, 2, false, "opa","requisitado", "restaurante");
INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(4, 100, false, "opa","requisitado", "restaurante");
INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(5, 95, false, "opa","requisitado", "restaurante");
INSERT INTO pedidotodo (id_pedido_todo, total, finalizado, data_criacao, estado, tipo) VALUES(6, 30, false, "opa","em preparo", "restaurante");

INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(6, "1x macarrão", 1);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(4, "1x suco de laranja", 1);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(10, "1x risoto", 2);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(2, "1x coxinha", 3);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(100, "1x lagosta", 4);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(50, "1x salmao", 5);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(15, "1x batata frita", 5);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(30, "1x vinho", 5);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(20, "1x hamburguer", 6);
INSERT INTO pedidounidade (valor, conteudo, id_conta) VALUES(10, "1x refrigerante", 6);
