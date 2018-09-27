package e.hakka.pressalistaharj61;

import java.util.ArrayList;

public class PresidentitLista {
    private static final PresidentitLista singleton = new PresidentitLista();
    private ArrayList<Presidentti> presidentit;

    /* Käytä aina sitä yhtä ja ainoaa PresidenttiLista-oliota (singleton) */
    static PresidentitLista getInstance() {
        return singleton;
    }

    /* Kovakoodattu lista Presidentti-olioista */
    private PresidentitLista() {
        presidentit = new ArrayList<Presidentti>();
        presidentit.add(new Presidentti("Stahlberg, Kaarlo Juho", 1919, 1925, "Eka presidentti"));
        presidentit.add(new Presidentti("Relander, Lauri Kristian", 1925, 1931, "Reissaava maaseudun relaaja"));
        presidentit.add(new Presidentti("Svinhufvud, Pehr, Evind", 1931, 1937, "Kansan suussa Ukko-Pekka"));
        presidentit.add(new Presidentti("Kallio, Kyosti", 1937, 1940, "Neljas presidentti"));
        presidentit.add(new Presidentti("Ryti, Risto Heikki", 1940, 1944, "Viides presidentti"));
        presidentit.add(new Presidentti("Mannerheim, Carl Gustav Emil", 1944, 1946, "Kuudes presidentti"));
        presidentit.add(new Presidentti("Paasikivi, Juho Kusti", 1946, 1956, "Sodanjälkeinen takuumies"));
        presidentit.add(new Presidentti("Kekkonen, Urho Kaleva", 1956, 1982, "UKK, usein kysytty kaveri"));
        presidentit.add(new Presidentti("Koivisto, Mauno Henrik", 1982, 1994, "Koko kansan Manu"));
        presidentit.add(new Presidentti("Ahtisaari, Martti Oiva Kalevi", 1994, 2000, "Nobel palkittu rauhanmies"));
        presidentit.add(new Presidentti("Halonen, Tarja Kaarina", 2000, 2012, "Eka naispresidentti"));
        presidentit.add(new Presidentti("Niinistö, Sauli Väinämö", 2012, 2024, "Eka suoralla kansanvaalilla valittu presidentti"));
        presidentit.add(new Presidentti("Valittu, Ei Vielä", 2024, 2030, "Seuraavien vaalien voittaja"));
        presidentit.add(new Presidentti("Valittu, Ei Vieläkään", 2030, 2036, "Seuraavien vaalien voittaja"));
    }

    /* Palauttaa koko listan, jossa Presidentti-olioita */
    public ArrayList<Presidentti> getPresidentitLista() {
        return presidentit;
    }

    /* Plauttaa yhden presidentin listalta */
    public Presidentti getPresidentti(int i) {
        return presidentit.get(i);
    }
}
