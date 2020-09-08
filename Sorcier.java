package JeuSorcier;

public class Sorcier extends Personnage {
    protected double attPouvoir;

    public Sorcier(String nom, int ptVie) {
        super(nom, ptVie);
        this.attPouvoir = Math.random();
    }

    public int subitCharme(int coup) {
        System.out.println("Cela n'a aucun effet");
        return 0;
    }

    public double getPouvoir() {
        return this.attPouvoir;
    }

    public int subitFrappe(int coup) {
        this.addVie(coup);
        if (this.pv > 0) {
            int coupRetour = -(int)((this.pv) * (this.attPouvoir));
            return coupRetour;
        } else {
            return 0;
        }
    }

    public void attaque(Personnage p) {
        System.out.println(p.name + " subit Charme ");
        if (!(p.mort()) && !(this.mort())) {
            int ptVie = this.getVie();
            int coup = -(int)(ptVie * this.attPouvoir);
            int coupRetour = p.subitCharme(coup);
            this.addVie(coupRetour);            
        }
    }
}

