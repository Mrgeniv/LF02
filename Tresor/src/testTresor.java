public class testTresor {



    public static void main(String[] args) {

        schmuck rolex = new schmuck(1,15000,"Uhr (Rolex)");
        aktie aktie1 = new aktie(2,4000,"Mustermannn GmbH",2);

        Tresor tresor = new Tresor();
        tresor.addGegenstand(rolex);
        tresor.addGegenstand(aktie1);

        System.out.println(tresor);
        tresor.removeGegenstand(rolex);

        System.out.println(tresor);
    }
}
