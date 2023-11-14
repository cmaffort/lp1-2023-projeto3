package br.cefetmg.inf.altomare.controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
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

            document.add(new Paragraph("CONTRATO DE PACOTE DE CRUZEIRO MARÍTIMO"));
            document.add(new Paragraph());

            document.add(new Paragraph("Partes:"));
            document.add(new Paragraph());
            document.add(new Paragraph("CONTRANTE"));
            document.add(new Paragraph("Nome: " + nomeContratante));
            document.add(new Paragraph("Telefone: " + telefoneContratante + " "+" CPF:"+ cpfContratante));
            document.add(new Paragraph("    "));
            document.add(new Paragraph("    "));

            document.add(new Paragraph("1. DESCRIÇÃO DO PACOTE DE CRUZEIRO"));

            document.add(new Paragraph("1.1 Destino: " + destino));
            document.add(new Paragraph("1.2 Data de Partida: " + dataPartida));
            document.add(new Paragraph("1.3 Duração do Cruzeiro: " + duracaoCruzeiro + " dias"));
            
            document.add(new Paragraph("    "));
            document.add(new Paragraph("    "));
            document.add(new Paragraph("4. RESPONSABILIDADES DAS PARTES"));

            document.add(new Paragraph("4.1 O CONTRATADO compromete-se a fornecer os serviços descritos neste contrato."));
            document.add(new Paragraph("4.2 O CONTRATANTE concorda em seguir todas as regras e regulamentos do cruzeiro."));
           
            document.add(new Paragraph("    "));
            document.add(new Paragraph("    "));
            document.add(new Paragraph("5. ALTERAÇÕES NO PACOTE"));

            document.add(new Paragraph("5.1 O CONTRATADO reserva-se o direito de fazer alterações no itinerário devido a circunstâncias imprevistas."));
            
            document.add(new Paragraph("    "));
            document.add(new Paragraph("    "));
            document.add(new Paragraph("6. CONDIÇÕES GERAIS"));

            document.add(new Paragraph("6.1 Este Contrato representa o acordo integral entre as partes."));
            document.add(new Paragraph("6.2 As partes concordam em resolver qualquer disputa decorrente deste contrato por meio de arbitragem."));
          
            document.add(new Paragraph("    "));
            document.add(new Paragraph("    "));
            document.add(new Paragraph("Assinaturas:"));
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
