-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 23-Out-2023 às 15:00
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `altomare`
--

-- --------------------------------------------------------
CREATE DATABASE altomare
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
  `Telefone` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
CREATE TABLE IF NOT EXISTS `passageiro` (
  `CPF` varchar(50),
  `RG` varchar(50),
  `Nome` varchar(50) DEFAULT NULL,
  `DataNasc` varchar(50),
  `Email` varchar(50),
  `Senha` varchar(50),
  `Telefone` varchar(50),
  `Sexo` varchar(50),
  `Civil` varchar(50),
  `DadosMedicos` varchar(50),
  `Pacote` varchar(50),
  `Despesa` varchar(50)

) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;

CREATE TABLE IF NOT EXISTS `produto` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) NOT NULL,
  `Data`  date,
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


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
