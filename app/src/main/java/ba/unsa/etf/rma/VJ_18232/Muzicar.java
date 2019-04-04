package ba.unsa.etf.rma.VJ_18232;

import java.util.ArrayList;

public class Muzicar {

    private String ime = "";
    private String zanr = "";
    private String webStranica = "";
    private String biografija = "";
    private String slika = "";
    private ArrayList<String>  topLista;

    public ArrayList<String> getTopLista() {
        return topLista;
    }

    public void setTopLista(ArrayList<String> topLista) {
        this.topLista = topLista;
    }

    public Muzicar(String i, String zanr, String webStranica, String biografija, String slika) {
        this.ime = ime;
        this.zanr = zanr;
        this.webStranica = webStranica;
        this.biografija = biografija;
        this.slika = slika;
    }

    public String getBiografija() {
        return biografija;
    }

    public String getIme() {
        return ime;
    }

    public String getWebStranica() {
        return webStranica;
    }

    public String getZanr() {
        return zanr;
    }

    public String getSlika() {
        return slika;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setWebStranica(String webStranica) {
        this.webStranica = webStranica;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }
}
