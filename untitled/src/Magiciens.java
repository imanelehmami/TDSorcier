import java.util.Random;

public class Magiciens extends Sorcier  implements SuperPouvoir{
    private double superpouvoir;
    public Magiciens(String nom, int pv,double pouvoir, double extra){
        super(nom,pv,pouvoir);
        this.superpouvoir=(extra*pouvoir);

    }

    public int subitCharme(int coup){
        return (int)(coup*this.sort());
    }
    public double sort(){
        return new Random().nextInt((int) (this.superpouvoir + 1));
    }

}
