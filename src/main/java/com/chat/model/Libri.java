package com.chat.model;

import java.time.LocalDate;

public abstract class Libri {

    private String id;
    private String titulli;
    private int numriFaqeve;
    public PunonjesiBibliotekes punonjesiBibliotekes;
    private GjiniaLibrit gjinia;
    protected LocalDate dataHuazimit;
    protected Boolean kontrollHuazimi = false;
    protected Boolean kontrollBlerje = false;
    protected String fusha;
    protected Integer sasia;


    public Libri(String id, String titulli, int numriFaqeve, GjiniaLibrit gjinia, Integer sasia){
        this.id=id;
        this.titulli = titulli;
        this.numriFaqeve = numriFaqeve;
        this.gjinia = gjinia;
        this.sasia = sasia;


    }

    public Libri(String id, String titulli, int numriFaqeve, GjiniaLibrit gjinia, String fusha, Integer sasia){
        this.id=id;
        this.titulli = titulli;
        this.numriFaqeve = numriFaqeve;
        //  this.punonjesiBibliotekes = punonjesiBibliotekes;
        this.gjinia = gjinia;
        this.fusha = fusha;
        this.sasia = sasia;


    }

    public Libri(String idLibri, String titulli) {
        this.id=idLibri;
        this.titulli=titulli;
    }


    public Integer getSasia() {
        return sasia;
    }

    public void setSasia(Integer sasia) {
        this.sasia = sasia;
    }

    public abstract void printoDetails();

    public PunonjesiBibliotekes getPunonjesiBibliotekes() {
        return punonjesiBibliotekes;
    }

    public void setPunonjesiBibliotekes(PunonjesiBibliotekes punonjesiBibliotekes) {
        this.punonjesiBibliotekes = punonjesiBibliotekes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getNumriFaqeve() {
        return numriFaqeve;
    }

    public void setNumriFaqeve(int numriFaqeve) {
        this.numriFaqeve = numriFaqeve;
    }

    public GjiniaLibrit getGjinia() {
        return gjinia;
    }

    public void setGjinia(GjiniaLibrit gjinia) {
        this.gjinia = gjinia;
    }

    public LocalDate getDataHuazimit() {
        return dataHuazimit;
    }

    public void setDataHuazimit(LocalDate data) {
        this.dataHuazimit = data;
        this.kontrollHuazimi = true;
    }
/*
    public Boolean eshteHuazuar() {
        return kontrollHuazimi;
    }

    public boolean eshteHuazuarNeDate(LocalDate data) {
        return kontrollHuazimi && dataHuazimit.equals(data);

    }
*/

    public String getFusha() {
        return fusha;
    }

    public void setFusha(String fusha) {
        this.fusha = fusha;
    }

    @Override
    public String toString() {
        return "Libri{" +
                "id='" + id + '\'' +
                ", titulli='" + titulli + '\'' +
                ", numriFaqeve=" + numriFaqeve +
                ", punonjesiBibliotekes=" + punonjesiBibliotekes +
                ", gjinia=" + gjinia +
                ", dataHuazimit=" + dataHuazimit +
                ", kontrollHuazimi=" + kontrollHuazimi +
                ", kontrollBlerje=" + kontrollBlerje +
                ", fusha='" + fusha + '\'' +
                ", sasia=" + sasia +
                '}';
    }
}


