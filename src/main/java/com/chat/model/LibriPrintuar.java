package com.chat.model;

import java.time.LocalDate;

public class LibriPrintuar extends Libri implements Huazimi {


    public LibriPrintuar(String id, String titulli, int numriFaqeve, GjiniaLibrit gjinia) {
        super(id, titulli, numriFaqeve, gjinia);
    }


    @Override
    public void printoDetails() {
        System.out.println("Libri i printuar me id: " + getId() + " dhe me titull " + getTitulli() + " ka " + getNumriFaqeve() + " faqe.");
    }

    @Override
    public void merrHua() {

        kontrollHuazimi = true;
        setDataHuazimit(LocalDate.now());
    }

}
