package com.chat.model;

public class PunonjesiBibliotekes {

    private String emri;
    private String id;

    public PunonjesiBibliotekes(String id, String emri){
        this.emri = emri;
        this.id=id;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }
}
