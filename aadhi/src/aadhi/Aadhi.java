/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aadhi;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Cell;

/**
 *
 * @author aadhitya98
 */
public class Aadhi {

    /**
     *
     */
    public static final String ipl = "C:\\pdf\\iplteams.pdf";
  
    public static void main(String[] args) throws DocumentException {
        

    File file = new File(ipl);
        file.getParentFile().mkdirs();
        new Aadhi().create(ipl);
     //create(ipl);
    }
    private void create(String ipl) throws DocumentException {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream(ipl));
            doc.open();
            PdfPTable table = new PdfPTable(2);
             table.addCell("S.No");
            table.addCell("Team Name");
             table.addCell("1");
              table.addCell("Chennai Super Kings");
               table.addCell("2");
                table.addCell("Kings XI Punjab");
                 table.addCell("3");
                  table.addCell("Kolkata Knight Riders");
                   table.addCell("4");
                    table.addCell("Sunrisers Hyderabad");
                     table.addCell("5");
                      table.addCell("Rajasthan Royals");
                       table.addCell("6");
                        table.addCell("Royal Challengers Bangalore");
                         table.addCell("7");
                          table.addCell("Mumbai Indians");
                           table.addCell("8");
                            table.addCell("Delhi Daredevils");
                            doc.add(table);
        doc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Aadhi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    }
}
    
    

