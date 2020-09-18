package tdSorcier;

import tdSorcier.NainJardin;

public class GnomeJardin extends NainJardin {
    public GnomeJardin(String name, int pv, int solid) {
        super(nom, ptVie, solid);
    }

    public int subitCharme(int coup) {
        int sort = (int) ((Math.random()*this.solid));
        if (coup < sort) {
            return -coup;
        } else {
            return -1;
        }
    }
}
