package cz.czechitas.lekce5.model;

public abstract class Adresa {

    private String ulice;
    private String castObce;
    private String obec;
    private String psc;


    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        if (ulice == null || "".equals(ulice)) {
            System.err.println("Není vyplněno, prosím vyplňte platný údaj");
        } else {
            this.ulice = ulice;
        }
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        if (obec == null || obec.isBlank()) {
            System.err.println("Není vyplněno, prosím vyplňte platný údaj");
            return;
        }
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        if (psc == null || "".equals(psc)) {
            System.err.println("Není vyplněno, prosím vyplňte platný údaj");
            return;
        }
        if (psc.length() != 5 || !psc.matches("\\d+")) {
            System.err.println("Není vyplněno, prosím vyplňte platný údaj");
            return;
        }
        this.psc = psc;
    }

    public Adresa(String ulice, String castObce, String obec, String psc) {
        this.ulice = ulice;
        this.castObce = castObce;
        this.obec = obec;
        this.psc = psc;
    }
}
