public class NainJardin extends Victime {

    protected int solide;

    public NainJardin(String nom, int solide) {
        super(nom);
        this.solide = solide;
    }

    public int subitFrappe(int coup) {
        int force = this.solide;
        if (coup > this.solide) {
            this.solide = 0;
            return force;
        } else {
            return coup;
        }

    }

    public int subitCharme(int coup){
        return -1;
    }

}
