public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("*****VOUS JOUEZ A MONSTRES vs SORCIERS*****");
        System.out.println("");
        //creation 5 monstres and 5 sorciers
        System.out.println("Présentation des joueurs :\n");
        Victim[] tableJeu = new Victim[20];
        for (int i = 0; i < 15; i++) {
            if (i < 5) {
                tableJeu[i] = new Monster("Monstre_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 5 && i < 8) {
                tableJeu[i] = new Sorcier("Sorcier_" + (i+1), (int)(Math.random() * 100));  
            } 
            if (i >= 8 && i < 10) {
                tableJeu[i] = new Magicien("Magicien_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 10 && i < 13) {
                tableJeu[i] = new NainJardin("Nain_" + (i+1), (int)(Math.random() * 100));
            }
            if (i >= 13 && i < 15) {
                tableJeu[i] = new GnomeJardin("Gnome_" + (i+1), (int)(Math.random() *100));
            }
            System.out.println(tableJeu[i]);
        }
        System.out.println("");
        System.out.println("__________________________________________");

        while (joueursEnVie(tableJeu)) {

            //le joueur 1 attaque et le joueur 2 se fait attaquer
            //les nains et gnomes ne peuvent pas attaquer
            int joueur1 = (int)(Math.random()*10);
            int joueur2 = (int)(Math.random()*15);
            
            //affrontement des joueurs
            if (!(joueur1 == joueur2) && !(tableJeu[joueur1].mort()) && !(tableJeu[joueur2].mort())){
                System.out.println("");
                System.out.println(tableJeu[joueur1].name + " attaque " + tableJeu[joueur2].name + "\n");
                tableJeu[joueur1].attaque(tableJeu[joueur2]);
                System.out.println(tableJeu[joueur1]);
                System.out.println(tableJeu[joueur2]);
                System.out.println("__________________________________________");
            }
        }
        
        System.out.println("");
        System.out.println("Les vainqueurs sont :");
        for (int i = 0; i < 15; i++) {
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