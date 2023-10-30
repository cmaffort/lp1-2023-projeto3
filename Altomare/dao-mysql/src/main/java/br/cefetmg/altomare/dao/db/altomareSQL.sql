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
  `Nome` text,
  `Data` text,
  `HoraInicio` text,
  `HoraTermino` text,
  `Local` text,
  `Ocupacao` int(11) DEFAULT NULL,
  `FucionarioResponsavel` text,
  `Descricao` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `Nome` varchar(50),
  `DatNasc` date,
  `CPF` varchar(50),
  `RG` varchar(50),
  `Sexo` ENUM('feminino', 'masculino'),
  `Email` varchar(50),
  `EstadoCivil` varchar(50),
  `Turno` ENUM('manha', 'tarde', 'noite'),
  `Setor` varchar(50),
  `DataAdmissao` date),
  `Telefone` varchar(50),
  `Passaporte` varchar(50),
  `CEP` varchar(50),
   `Senha` varchar(50)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
CREATE TABLE IF NOT EXISTS `passageiro` (
  `Nome` text,
  `DataNasc` text,
  `Sexo` char(10) DEFAULT NULL,
  `CEP` text,
  `RG` text,
  `EstadoCivil` text,
  `Email` text,
  `Telefone` text,
  `DadosMedicos` text,
  `EmbarqueDesembarque` text,
  `Datas` text,
  `Classe` text,
  `TipoSuite` text,
  `TamanhoSuite` text,
  `CapacidadeSuite` text,
  `Endereco` text,
  `Passaporte` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

DROP TABLE IF EXISTS `produto`;
CREATE TABLE IF NOT EXISTS `produto` (
  `Tipo` varchar(50) DEFAULT NULL,
  `Preco` double DEFAULT NULL,
  `Estado` varchar(20) DEFAULT NULL,
  `Nome` text NOT NULL,
  `Id` int(11) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
