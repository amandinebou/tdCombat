package tdSorcier 

public abstract class Victim {
    protected String name;
    protected int pv;

    public Victim(String name, int pv) {
        this.name = name;
        this.pv = pv;
    }

    public String getNom() {
        return this.name;
    }
    //le joueur est-il mort
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

    //ajoute des pv du joueur
    public void addVie(int num) {
        this.pv += num;
    }

    //affiche l'état du joueur
    public String toString() {
        if (this.mort()) {
            return this.name + " est mort";
        } else {
            return this.name + " a " + this.pv + " points de vie";
        }
    }

    public abstract void attaque(Victim v);

    //attaque par un monstre
    public abstract int subitFrappe(int coup);

    //attaque par un sorcier
    public abstract int subitCharme(int coup);
}
