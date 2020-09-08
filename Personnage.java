package JeuSorcier;

public abstract class Personnage {
    protected String name;
    protected int pv;
    protected double attPouvoir;

    public Personnage(String nom, int ptVie) {
        this.name = nom;
        this.pv = ptVie;
    }

    // Méthode état du personnage
    
    //retourne le nom du pers
    public String getNom() {
        return this.name;
    }
    //le pers est-il mort
    public boolean mort() {
        if (this.pv <= 0) {
            return true;
        } else {
            return false; }
    }
    //retourne nombre points de vie
    public int getVie() {
        return this.pv;
    }
    //ajoute des pv au pers
    public void addVie(int num) {
        this.pv += num;
    }

    //affiche l'état du joueur
    public String toString() {
        if (this.mort()) {
            return this.name + " est mort";
        } else {
            return this.name + " a " + this.pv + " points de vie";}
    }
    

    public abstract void attaque(Personnage p);

    //attaque par un monstre
    public abstract int subitFrappe(int coup);

    //attaque par un sorcier
    public abstract int subitCharme(int coup);
}


