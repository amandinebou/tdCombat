package tdSorcier;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("*****VOUS JOUEZ A *****");
        System.out.println("");
        //creation 5 monstres and 5 sorciers
        System.out.println("Présentation des joueurs :\n");
        Victim[] tableJeu = new Victim[20];
        for (int i = 0; i < 20; i++) {
            if (i < 5) {
                tableJeu[i] = new Monster("Monstre_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 5 && i < 8) {
                tableJeu[i] = new Sorcier("Sorcier_" + (i+1), (int)(Math.random() * 100));  
            } 
            if (i >= 8 && i < 10) {
                tableJeu[i] = new Magicien("Magicien_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 10 && i < 15) {
                tableJeu[i] = new NainJardin("Nain_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 15 && i < 20) {
                tableJeu[i] = new GnomeJardin("Gnome_" + (i+1), (int)(Math.random() *100));
            }
            System.out.println(tableJeu[i]);
        }
        System.out.println("");
        System.out.println("__________________________________________");

        /*while (joueursEnVie(tableJeu)) {
            int joueur1 = (int)(Math.random()*20);
            int joueur2 = (int)(Math.random()*20);

            //affrontement des joueurs
            if (!(joueur1 == joueur2)){
                System.out.println("");
                if (joueur1 < 10) {
                    Personnage j1 = tableJeu[joueur1];
                } else {
                    NainJardin j1 = autresPers[joueur1 - 10];
                }
                if (joueur2 < 10) {
                    Personnage j2 = tableJeu[joueur1];
                } else {
                    NainJardin j2 = autresPers[joueur1 - 10];
                }
                System.out.println(j1.name + " attaque " + j2.name + "\n");
                j1.attaque(j2);
                System.out.println(j1);
                System.out.println(j2);
                System.out.println("__________________________________________");
            }
        }*/
        
        System.out.println("");
        System.out.println("Les vainqueurs sont :");
        for (int i = 0; i < 10; i++) {
            if (!(tableJeu[i].mort())) {
                System.out.println(tableJeu[i].name);
            }
        }
        System.out.println("");
    }

    public static boolean joueursEnVie(Victim[] tableau) {
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