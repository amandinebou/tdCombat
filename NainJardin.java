package tdSorcier;

public class NainJardin extends Victim {
    protected int solid;

    public NainJardin(String name, int pv, int solid) {
        super(name, pv);
        this.solid = solid;
    }

    public int subitFrappe(int coup) {
        if (coup > this.solid) {
            //le nain perd sa solidité et renvoie un coup d'une intensité de sa solidité initiale
            int coupRetour = -this.solid;
            this.solid = 0;
            return coupRetour;
        } else {
            //le nain reste intact et renvoie le coup
            return -coup;
        }
    }

    public int subitCharme(int coup) {
        //le sorcier perd 1 pv et le nain reste intacte
        return -1;
    }

    public void attaque(Personnage p) {
        System.out.println("Un nain ou gnome de jardin ne peut pas attaquer");
    }
}