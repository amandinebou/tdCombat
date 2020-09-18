public class Monster extends Personnage {
    public Monster(String name, int pv) {
        super(name, pv);
    }

    public void attaque(Victim v) {
        System.out.println(v.name + " subit Frappe");
        if (!(v.mort()) && !(this.mort())) {
            int ptVie = this.getVie();
            int coup = -ptVie / 2;
            int coupRetour = v.subitFrappe(coup);
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