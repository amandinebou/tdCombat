public class GnomeJardin extends NainJardin {
    public GnomeJardin(String name, int pv) {
        //ici les pv sont la solidité du nain
        super(name, pv);
    }

    public int subitCharme(int coup) {
        int sort = (int) ((Math.random()*this.pv));
        if (coup < sort) {
            return -coup;
        } else {
            return -1;
        }
    }
}
