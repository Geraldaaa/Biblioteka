package com.chat.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MenaxhimiHuazimeve {


    //  LocalDate dataHuazimit = LocalDate.now();


    //private Map<String, List<Libri>> huazimet = new HashMap<>();

/*
    public void regjistroHuazim(PunonjesiBibliotekes punonjesi, Libri libri) {
        String id = punonjesi.getId();

        ArrayList<Libri>listLibrashHuazuar = new ArrayList();

        if (!huazimet.containsKey(id)) {
            huazimet.put(id, listLibrashHuazuar);

        }
        huazimet.get(id).add(libri);

    }
*/

/*
//shtimi i te gjithe librave te huazuar ne nje liste. Kjo metode kthen listen e librave te huazuar.
    public ArrayList<Libri> merrTeGjitheLibratEHuazuar() {

        ArrayList<Libri> listaMeLibraHuazuar = new ArrayList<>();

        for (Map.Entry<String, List<Libri>> entryHuazim : huazimet.entrySet()) {

            List<Libri> libraHuazuar = entryHuazim.getValue();

            for (Libri libri : libraHuazuar) {
                if (libri.eshteHuazuar()) {
                    listaMeLibraHuazuar.add(libri);
                }
            }
        }

        return listaMeLibraHuazuar;
    }

 */



/*
    public void shfaqHuazimetPerPunonjes() {

        for (Map.Entry<String, List<Libri>> entryHuazim : huazimet.entrySet()) {
            System.out.println("Punonjësi me ID: " + entryHuazim.getKey());
            System.out.println("------------------------------------");

            List<Libri> libraHuazuar = entryHuazim.getValue();

            LocalDate returnDate = dataHuazimit.plusDays(15);

            for (Libri libri : libraHuazuar) {
                System.out.println("Libri - " + libri.getTitulli());
                System.out.println("Data e huazimit: " + dataHuazimit );
                System.out.println("Data e kthimit: " + returnDate);
            }

        }
    }

*/

/*
    public void filtrimHuazimeshDitore(LocalDate data) {

        boolean kontroll = false;

        System.out.println(" Librat e huazuar në datën: " + data);

        for (Map.Entry<String, List<Libri>> libDateHua : huazimet.entrySet()) {

            List<Libri> ls = libDateHua.getValue();

            for (Libri libri : ls) {
                if (libri.eshteHuazuarNeDate(data)) {
                    System.out.println(libri.getTitulli());
                    kontroll = true;
                }
            }
        }

        if (!kontroll) {
            System.out.println(" Nuk ka huazime në këtë datë.");
        }
    }
 }

*/

}
