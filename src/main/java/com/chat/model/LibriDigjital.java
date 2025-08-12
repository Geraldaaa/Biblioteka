package com.chat.model;

import java.time.LocalDate;

public class LibriDigjital extends Libri implements Huazimi{




    public LibriDigjital(String id, String titulli, int numriFaqeve, GjiniaLibrit gjinia, String fusha){

        super(id, titulli, numriFaqeve,gjinia,fusha);

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

}
