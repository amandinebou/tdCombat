package JeuSorcier;

public class Monster extends Personnage {
    public Monster(String nom, int ptVie) {
        super(nom, ptVie);
    }

    public void attaque(Personnage p) {
        System.out.println(p.name + " subit Frappe");
        if (!(p.mort()) && !(this.mort())) {
            int ptVie = this.getVie();
            int coup = -ptVie / 2;
            int coupRetour = p.subitFrappe(coup);
            this.addVie(coupRetour);
        }
    }

    public int subitFrappe(int coup) {
        this.addVie(coup);
        if (this.pv > 0) {  
            int coupRetour = -(int)((this.pv / 2));
            return coupRetour;
        } else {
            return 0;
        }
    }
    
    public int subitCharme(int coup) {
        this.addVie(coup);
        if (this.pv > 0) {
            int coupRetour = (int)((this.pv / 2));
            return coupRetour;
        } else {
            return 0;
        }
    }
}