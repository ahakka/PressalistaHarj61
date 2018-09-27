package e.hakka.pressalistaharj61;

public class Presidentti {
    private String nimi;
    private int alkuVuosi;
    private int loppuVuosi;
    private String kuvaus;

    public Presidentti(String nimi, int alkuVuosi, int loppuVuosi, String kuvaus) {
        this.nimi = nimi;
        this.alkuVuosi = alkuVuosi;
        this.loppuVuosi = loppuVuosi;
        this.kuvaus = kuvaus;
    }

    public String getNimi() {
        return nimi;
    }

    public String getAlkuVuosi() {
        return Integer.toString(alkuVuosi);
    }

    public String getLoppuVuosi() {
        return Integer.toString(loppuVuosi);
    }

    public String getKuvaus() {
        return kuvaus;
    }

    @Override
    public String toString() {
        return nimi;
    }
}
