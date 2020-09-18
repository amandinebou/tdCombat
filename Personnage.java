package tdSorcier;

public abstract class Personnage extends Victim {
    protected String name;
    protected int pv;
    protected double attPouvoir;

    public Personnage(String name, int pv) {
        super(name, pv);
    }
}


