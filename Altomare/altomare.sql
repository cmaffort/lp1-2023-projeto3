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
  `Nome` varchar,
  `Data` varchar,
  `HoraInicio` varchar,
  `HoraTermino` varchar,
  `Local` varchar,
  `Ocupacao` int(11) DEFAULT NULL,
  `FucionarioResponsavel` varchar,
  `Descricao` varchar
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
CREATE TABLE IF NOT EXISTS `funcionario` (
  `Nome` varchar,
  `DatNasc` varchar,
  `CPF` varchar,
  `RG` varchar,
  `Sexo` varchar,
  `Email` varchar,
  `EstadoCivil` varchar,
  `Turno` varchar,
  `Setor` varchar,
  `DataAdmissao` varchar,
  `Telefone` varchar,
  `Passaporte` varchar
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `passageiro`
--

DROP TABLE IF EXISTS `passageiro`;
CREATE TABLE IF NOT EXISTS `passageiro` (
  `Nome` varchar,
  `DataNasc` varchar,
  `Sexo` char(10) DEFAULT NULL,
  `CEP` varchar,
  `RG` varchar,
  `EstadoCivil` varchar,
  `Email` varchar,
  `Telefone` varchar,
  `DadosMedicos` varchar,
  `EmbarqueDesembarque` varchar,
  `Datas` varchar,
  `Classe` varchar,
  `TipoSuite` varchar,
  `TamanhoSuite` varchar,
  `CapacidadeSuite` varchar,
  `Endereco` varchar,
  `Passaporte` varchar
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
