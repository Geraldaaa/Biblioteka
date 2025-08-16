package com.chat.model;

import java.time.LocalDate;

public class LibriDigjital extends Libri implements Huazimi{




    public LibriDigjital(String id, String titulli, int numriFaqeve, GjiniaLibrit gjinia, String fusha, Integer sasia){

        super(id, titulli, numriFaqeve,gjinia,fusha, sasia);

    }

    public LibriDigjital(String idLibri, String titulli) {
        super(idLibri,titulli);
    }


    @Override
    public void printoDetails(){
        System.out.println("Libri digjital me id: " + getId() + " dhe me titull " + getTitulli() + " ka si fushe formati "+ fusha +" dhe ka " + getNumriFaqeve() + " faqe.");
    }

    @Override
    public void merrHua(){

        kontrollHuazimi = true;
        setDataHuazimit(LocalDate.now());

    }

    @Override
    public String toString() {
        return "LibriDigjital{" +
                "punonjesiBibliotekes=" + punonjesiBibliotekes +
                ", dataHuazimit=" + dataHuazimit +
                ", kontrollHuazimi=" + kontrollHuazimi +
                ", kontrollBlerje=" + kontrollBlerje +
                ", fusha='" + fusha + '\'' +
                ", sasia=" + sasia +
                '}';
    }
}
