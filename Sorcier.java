package tdSorcier;

public class Sorcier extends Personnage {
    protected double attPouvoir;

    public Sorcier(String name, int pv) {
        super(name, pv);
        this.attPouvoir = Math.random();
    }

    public double getPouvoir() {
        return this.attPouvoir;
    }

    public int subitCharme(int coup) {
        System.out.println("Cela n'a aucun effet");
        return 0;
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

    public void attaque(Vicitm v) {
        System.out.println(v.name + " subit Charme ");
        if (!(v.mort()) && !(this.mort())) {
            int ptVie = this.getVie();
            int coup = -(int)(ptVie * this.attPouvoir);
            int coupRetour = v.subitCharme(coup);
            this.addVie(coupRetour);            
        }
    }
}

