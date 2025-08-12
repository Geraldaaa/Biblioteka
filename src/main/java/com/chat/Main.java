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
        // Scanner scanner = new Scanner(System.in);
        try {

            Connection conn = DatabaseConnection.getConnection();


            LibriPrintuar l1 = new LibriPrintuar("15", "Libri13", 700, GjiniaLibrit.BIOGRAFI);
            LibriDigjital l2 = new LibriDigjital("14", "LD14",100,GjiniaLibrit.HISTORIK,"PDF");
            PunonjesiBibliotekes p1 = new PunonjesiBibliotekes("8","Mirela");


            Puntori_respository pnt = new Puntori_respository();
            Huazimet_respository hr = new Huazimet_respository();
            Liber_respository lr = new Liber_respository();


             // l1.setTitulli("libri15UPDATE");
             //  hr.shtoHuazim(conn,l1,p1, Date.valueOf("2025-07-01"), Date.valueOf("2025-07-16"));
            //lr.shtoLiber(conn, l1); //printuar
           //  pnt.shtoPunonjes(conn,p1);
           // lr.shtoLiber(conn,l2); //digjital

          //  lr.updateLiber(conn,l1);
         //  lr.fshiLiber(conn,"7");


            hr.updateHuazim(conn,l1,p1, Date.valueOf("2025-08-01"), Date.valueOf("2025-08-16"));
        } catch (SQLException e) {
        e.printStackTrace();
        System.out.println("Gabim gjatë lidhjes ose shtimit të punonjësit.");
    }








/*




//        LibriPrintuar l1 = new LibriPrintuar("1", "Java", 300, p1, GjiniaLibrit.FANTASHKENCE);
//        LibriDigjital l2 = new LibriDigjital("2", "c", 150, p2, "PDF", GjiniaLibrit.ROMAN);
//        LibriPrintuar l3 = new LibriPrintuar("3", "Py", 200, p2, GjiniaLibrit.FANTASHKENCE);
//        LibriDigjital l4 = new LibriDigjital("4", "js", 450, p2, "PDF", GjiniaLibrit.ROMAN);
//        LibriDigjital l5 = new LibriDigjital("5", "s", 450, p2, "PDF", GjiniaLibrit.ROMAN);
//        LibriDigjital l6 = new LibriDigjital("8", "s", 450, p2, "PDF", GjiniaLibrit.ROMAN);
//        LibriDigjital l7 = new LibriDigjital("9", "s", 450, p2, "PDF", GjiniaLibrit.ROMAN);
        boolean running = true;

        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Shfaq te gjithe librat");
            System.out.println("2. Filtro libra sipas gjinise");
            System.out.println("3. Kerkim per liber me titull");
            System.out.println("4. Regjistro huazim");
            System.out.println("5. Shfaq huazimet sipas punonjeseve");
            System.out.println("6. Filtrim i huazimeve sipas dates");
            System.out.println("7. Bli nje liber");
            System.out.println("8. Shfaq librat e blere");
            System.out.println("9. Ndrysho liber (titull & faqe)");
            System.out.println("10. Raporti i bibliotekes");
            System.out.println("0. Dil");

            System.out.print("Zgjidhni nje opsion: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    biblioteka.shfaqGjitheLibrat();
                    break;
                case 2:
                    System.out.print("Jepni gjinine (FANTASHKENCE, ROMAN): ");
                    String gjiniaStr = scanner.nextLine().toUpperCase();
                    GjiniaLibrit gjinia = GjiniaLibrit.valueOf(gjiniaStr);
                    biblioteka.filtroGjininLibri(gjinia);
                    break;
                case 3:
                    System.out.print("Jepni titullin e librit: ");
                    String titull = scanner.nextLine();
                    Libri gjetur = biblioteka.gjejLiberSipasTitullit(titull);
                    if (gjetur != null)
                        System.out.println("U gjet: " + gjetur);
                    else
                        System.out.println("Libri nuk u gjet.");
                    break;
                case 4:
                    System.out.print("Jepni titullin e librit per huazim: ");
                    String titullH = scanner.nextLine();
                    Libri liberH = biblioteka.gjejLiberSipasTitullit(titullH);
                    if (liberH != null) {
                       liberH.eshteHuazuar();
                        menaxhim.regjistroHuazim(p1, liberH);
                        System.out.println("Huazimi u regjistrua.");
                    } else {
                        System.out.println("Libri nuk u gjet.");
                    }
                    break;
                case 5:
                    menaxhim.shfaqHuazimetPerPunonjes();
                    break;
                case 6:
                    System.out.print("Jepni daten (yyyy-MM-dd): ");
                    String dateStr = scanner.nextLine();
                    LocalDate data = LocalDate.parse(dateStr);
                    menaxhim.filtrimHuazimeshDitore(data);
                    break;
                case 7:
                    System.out.print("Jepni titullin e librit per te blere: ");
                    String titullB = scanner.nextLine();
                    biblioteka.bliLibrin(titullB);
                    break;
                case 8:
                    biblioteka.shfaqLibratBler();
                    break;
                case 9:
                    System.out.print("Titulli aktual: ");
                    String oldTitle = scanner.nextLine();
                    System.out.print("Titulli i ri: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Numri i faqeve: ");
                    int faqe = scanner.nextInt();
                    scanner.nextLine();
                    biblioteka.updateLiber(oldTitle, newTitle, faqe);
                    break;
                case 10:
                    biblioteka.raporti();
                    break;
                case 0:
                    running = false;
                    System.out.println("Dalje nga sistemi...");
                    break;
                default:
                    System.out.println("Opsion i pavlefshem. Provoni perseri.");
            }
        }

        scanner.close();
    }

*/

    }

}

