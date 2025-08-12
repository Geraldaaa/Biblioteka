package com.chat.model;

import java.util.ArrayList;


public class Biblioteka {


    ArrayList<Libri> listLibrash = new ArrayList<>();
    ArrayList<Libri> listLibrashCopy = new ArrayList<>();
    ArrayList<Libri> listaMeLibratBler = new ArrayList<>();

    public MenaxhimiHuazimeve menaxhimiHuazimeve;

    public Biblioteka(MenaxhimiHuazimeve menaxhimiHuazimeve) {
        this.menaxhimiHuazimeve = menaxhimiHuazimeve;
    }

    public void shtoLiber(Libri libri) {
        listLibrash.add(libri);
    }

    public void hiqLiber(Libri l){
        listLibrash.remove(l);
    }


    public void shfaqGjitheLibrat() {

            for (Libri libri : listLibrash) {
                System.out.println(" Libri: " + libri.getTitulli() + " ka " + libri.getNumriFaqeve() + " faqe. ");;
            }
    }


    public void copyListenKryesore(){
        listLibrashCopy.addAll(listLibrash);
    }

    //metodat e listave gjendje,, blerje, huazim

    public ArrayList<Libri> merrLibratNeGjendje() {
        ArrayList<Libri> gjendje = new ArrayList<>();
        for (Libri l : listLibrash) {
            if (!l.eshteHuazuar()) {
                gjendje.add(l);
            }
        }
        return gjendje;
    }

    public ArrayList<Libri> merrLibratEBlere() {
        return new ArrayList<>(listaMeLibratBler);
    }


    public ArrayList<Libri> ktheLibratHuazuar(){
        return new ArrayList<>(menaxhimiHuazimeve.merrTeGjitheLibratEHuazuar());
    }



    public Libri gjejLiberSipasTitullit(String titulli) {
        for (Libri libri : listLibrash) {
            if (libri.getTitulli().equals(titulli)) {
                return libri;
            }
        }
        return null;
    }


    public void bliLibrin(String titulli){
        Libri libri = gjejLiberSipasTitullit(titulli);

        if(libri != null ) {

            if(libri.eshteHuazuar()) {
                System.out.println("Libri nuk mund te blihet sepse eshte i huazuar.");
                return;
            }
                listaMeLibratBler.add(libri);
                hiqLiber(libri);
                System.out.println("Libri me titull " + libri.getTitulli() + " u ble.");

        } else {
            System.out.println("Libri nuk u gjet.");
        }

    }


    public void shfaqLibratBler() {

        System.out.println("Lista e librave te blere... ");
        for (Libri libri : listaMeLibratBler) {
            System.out.println(" Libri: " + libri.getTitulli());
        }
    }


    public void filtroGjininLibri(GjiniaLibrit gjinia){

        boolean kontroll = false;

        ArrayList<Libri>libraSipasGjinise = new ArrayList<>();

        for(Libri lb: listLibrash){
            if(gjinia.equals(lb.getGjinia())){

                libraSipasGjinise.add(lb);
                kontroll = true;

            }

        }


        for(Libri libriGj: libraSipasGjinise){
            System.out.println(libriGj.getTitulli());
        }


        if(!kontroll){
            System.out.println("Nuk u gjet asnje liber i ketij zhanri.");
        }

    }



    public void updateLiber(String oldName, String newName, Integer nriRiFaqeve){

        boolean libriuGjet = false;

        for(Libri lbr : listLibrash){

           if(lbr.getTitulli().equals(oldName)){
                lbr.setTitulli(newName);
                lbr.setNumriFaqeve(nriRiFaqeve);
                libriuGjet = true;
            }

        }

        if(!libriuGjet){
            System.out.println("Libri me titull: " + oldName + " nuk u gjet. ");
        }


        for (Libri lb: listLibrash){
            System.out.println("Libri: " + lb.getTitulli() + " ka " + lb.getNumriFaqeve() + " faqe. ");
        }


    }



    public void raporti() {

        System.out.println("Jane huazuar: " + ktheLibratHuazuar().size() + " libra.");
        System.out.println("Jane blere: " + merrLibratEBlere().size() + " libra.");
        System.out.println("Librat ne gjendje: " + merrLibratNeGjendje().size());
    }




}

