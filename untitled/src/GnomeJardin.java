import java.util.Random;

public class GnomeJardin extends NainJardin {

    private double superpv;
    public GnomeJardin(String nom, int solide, double superpv){
        super(nom,solide);
        this.superpv= superpv;
    }

    public int subitCharme(int coup)
    {
        int sort= new Random().nextInt((int) (this.solide + 1));
        if (sort> coup)
            return - coup;
        else
            return -1;
    }
}
