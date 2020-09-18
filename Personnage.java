public abstract class Personnage extends Victim {
    protected int pv;
    protected double attPouvoir;

    public Personnage(String name, int pv) {
        super(name, pv);
    }

    public abstract void attaque(Victim v);
}


