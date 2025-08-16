package com.chat;

import com.chat.model.*;
import com.chat.db.DatabaseConnection;
import com.chat.repository.Huazimet_respository;
import com.chat.repository.Liber_respository;
import com.chat.repository.Puntori_respository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {

            Connection conn = DatabaseConnection.getConnection();


            LibriPrintuar l1 = new LibriPrintuar("10", "Libri i kursit", 300, GjiniaLibrit.HISTORIK, 40);
            LibriDigjital l2 = new LibriDigjital("14", "LD14", 100, GjiniaLibrit.HISTORIK, "PDF",30);
            PunonjesiBibliotekes p1 = new PunonjesiBibliotekes("1", "Sara");


            Puntori_respository pnt = new Puntori_respository();
            Huazimet_respository hr = new Huazimet_respository();
            Liber_respository lr = new Liber_respository();



          //  lr.shtoLiber(conn, l1); //printuar
            // lr.shtoLiber(conn,l2); //digjital
            // l1.setTitulli("l1Updated");
            // l1.setNumriFaqeve(500);
             //lr.updateLiber(conn,l1);
            //  lr.fshiLiber(conn,"7");
            //  lr.readLiber(conn);


            //  pnt.shtoPunonjes(conn,p1);
            // pnt.updatePunonjesi(conn,p1);
            //pnt.fshiPunonjesi(conn,"7");
           //pnt.lexoPuntoret(conn);


           // hr.shtoHuazim(conn,l1,p1, Date.valueOf("2025-05-01"), Date.valueOf("2025-05-15"));
           // hr.kthimHuazimi(conn,l1);
            // hr.kthimHuazimi(conn,l1);
            // hr.updateHuazim(conn, l1, p1, Date.valueOf("2025-08-01"), Date.valueOf("2025-08-16"));
           // hr.deleteHuazim(conn,"5");



    }
}