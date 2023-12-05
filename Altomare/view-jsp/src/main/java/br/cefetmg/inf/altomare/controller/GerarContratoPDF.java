package br.cefetmg.inf.altomare.controller;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GerarContratoPDF {

   

    public static byte[] gerarContratoCruzeiroPDF(String nomeContratante, String cpfContratante, String telefoneContratante, String destino, String dataPartida, String duracaoCruzeiro) {

        try {
           

Document document = new Document(PageSize.A4, 60, 60, 40, 40);
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
PdfWriter.getInstance(document, outputStream);

document.open();

Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18, BaseColor.BLACK);
Paragraph title = new Paragraph("CONTRATO DE PACOTE DE CRUZEIRO MARÍTIMO", titleFont);
title.setAlignment(Element.ALIGN_CENTER);
document.add(title);

document.add(Chunk.NEWLINE);

Font subtitleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14, BaseColor.BLACK);
document.add(new Paragraph("CONTRATANTE", subtitleFont));
document.add(new Paragraph("Nome: " + nomeContratante));
document.add(new Paragraph("Telefone: " + telefoneContratante + " " + " CPF:" + cpfContratante));
document.add(Chunk.NEWLINE);
document.add(Chunk.NEWLINE);

Font sectionFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
document.add(new Paragraph("1. DESCRIÇÃO DO PACOTE DE CRUZEIRO", sectionFont));

document.add(new Paragraph("1.1 Destino: " + destino));
document.add(new Paragraph("1.2 Data de Partida: " + dataPartida));
document.add(new Paragraph("1.3 Duração do Cruzeiro: " + duracaoCruzeiro + " dias"));

document.add(Chunk.NEWLINE);
document.add(Chunk.NEWLINE);

document.add(new Paragraph("2. RESPONSABILIDADES DAS PARTES", sectionFont));

document.add(new Paragraph("2.1 O CONTRATADO compromete-se a fornecer os serviços descritos neste contrato."));
document.add(new Paragraph("2.2 O CONTRATANTE concorda em seguir todas as regras e regulamentos do cruzeiro."));

document.add(Chunk.NEWLINE);


document.add(new Paragraph("3. ALTERAÇÕES NO PACOTE", sectionFont));
document.add(new Paragraph("3.1 O CONTRATADO reserva-se o direito de efetuar alterações no itinerário devido a circunstâncias imprevistas."));
document.add(new Paragraph("    O CONTRATANTE será notificado com antecedência sobre quaisquer modificações, buscando minimizar impactos em sua experiência. "));
document.add(new Paragraph("    3.1.1 Na ocorrência de alterações significativas, o CONTRATADO compromete-se a oferecer opções alternativas ou compensações adequadas, garantindo a satisfação do CONTRATANTE."));

document.add(Chunk.NEWLINE);

document.add(new Paragraph("4. CONDIÇÕES GERAIS", sectionFont));

document.add(new Paragraph("4.1 Este Contrato representa o acordo integral entre as partes, estabelecendo as bases para a prestação de serviços durante o cruzeiro."));
document.add(new Paragraph("4.2 Em caso de desacordo, as partes concordam em resolver qualquer disputa decorrente deste contrato por meio de arbitragem, seguindo as normas e procedimentos legais estabelecidos."));
document.add(Chunk.NEWLINE);
document.add(Chunk.NEWLINE);

document.add(new Paragraph("Assinaturas:", sectionFont));
document.add(new Paragraph("Contratante: ____________________________   Data: _______/_______/________"));
document.add(new Paragraph("Contratado: _____________________________   Data: _______/_______/________"));

document.close();


            return outputStream.toByteArray();
        } catch (DocumentException e) {
            System.out.println(e);
            return null;
        }
    }
}
