package tdSorcier;

interface SuperPouvoir {
    int extra = 2;
    double sort();
}
public class Magicien extends Sorcier implements SuperPouvoir {
    public Magicien(String nom, int ptVie) {
        super(nom, ptVie);
        this.attPouvoir *= extra;
    }
    
    public double getPouvoir() {
        return this.attPouvoir;
    }
    public double sort() {
        return Math.random() * this.getPouvoir();
    }

    //le magicien renvoie le coup multiplié par la puissance du sort
    public int subitCharme(int coup) {
        if (this.pv > 0) {
            int coupRetour = -(int)((coup * this.sort()));
            return coupRetour;
        } else {
            return 0;
        }
    }
}
