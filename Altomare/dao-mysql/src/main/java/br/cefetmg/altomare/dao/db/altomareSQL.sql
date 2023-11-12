SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Banco de dados: `altomare`
--

-- --------------------------------------------------------
CREATE DATABASE IF NOT EXISTS altomare
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

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
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
  `Passaporte` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
CREATE TABLE IF NOT EXISTS `passageiro` (
  `Nome` varchar(50),
  `DataNasc` varchar(50),
  `Sexo` char(10) DEFAULT NULL,
  `CEP` varchar(50),
  `RG` varchar(50),
  `EstadoCivil` varchar(50),
  `Email` varchar(50),
  `Telefone` varchar(50),
  `DadosMedicos` varchar(50),
  `EmbarqueDesembarque` varchar(50),
  `Datas` varchar(50),
  `Classe` varchar(50),
  `TipoSuite` varchar(50),
  `TamanhoSuite` varchar(50),
  `CapacidadeSuite` varchar(50),
  `Endereco` varchar(50),
  `Passaporte` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `Tipo` varchar(50)(50) DEFAULT NULL,
  `Preco` double DEFAULT NULL,
  `Estado` varchar(50)(20) DEFAULT NULL,
  `Nome` text NOT NULL,
  `Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;


-- --------------------------------------------------------

--
-- Estrutura da tabela `conta_usuario`
--

DROP TABLE IF EXISTS `contausuario`;
CREATE TABLE IF NOT EXISTS `contausuario` (
  id_conta BIGINT AUTO_INCREMENT,
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
  data_ocorrencia VARCHAR(20),
  id_conta BIGINT(10),
  PRIMARY KEY (id_despesa)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cartao`
--

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
