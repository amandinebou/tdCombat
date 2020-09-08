package JeuSorcier;

public class Main {
    public static void main(String[] args) {
        System.out.println("SORCIERS VS MONSTRES");
        System.out.println("");
        //creation 5 monstres and 5 sorciers
        System.out.println("Présentation des joueurs :");
        Personnage[] tableJeu = new Personnage[10];
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
            tableJeu[i] = new Monster("Monstre_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 5) {
            tableJeu[i] = new Sorcier("Sorcier_" + (i+1), (int)(Math.random() * 100));
            }
            System.out.println(tableJeu[i]);
        }
        System.out.println("");

        while (joueursEnVie(tableJeu)) {
            int joueur1 = (int)(Math.random()*10);
            int joueur2 = (int)(Math.random()*10);

            //affrontement des joueurs
            if (!(joueur1 == joueur2)){
                System.out.println(tableJeu[joueur1].name + " attaque " + tableJeu[joueur2].name);
                tableJeu[joueur1].attaque(tableJeu[joueur2]);
                System.out.println(tableJeu[joueur1]);
                System.out.println(tableJeu[joueur2]);
                System.out.println("");
            }
        }

        System.out.println("Les vainqueurs sont :");
        for (int i = 0; i < 10; i++) {
            if (!(tableJeu[i].mort())) {
                System.out.println(tableJeu[i].name);
            }
        }

    }

    public static boolean joueursEnVie(Personnage[] tableau) {
        int compteur = 0;
        for(int i = 0; i < 10; i++) {
            if (tableau[i] instanceof Monster && tableau[i].mort()) {
                compteur += 1;
            }
        }
        if (compteur < 5) {
            return true;
        } else {
            return false;
        }
    } 
}