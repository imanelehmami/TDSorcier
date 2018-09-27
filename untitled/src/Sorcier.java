public class Sorcier extends Personnage {
    protected double pouvoir;
    public Sorcier(String nom, int pv, double pouvoir){
        super(nom,pv);
        this.pouvoir= Math.random();
    }

    @Override
    public void attaque(Personnage p) {
        int force;
        if (p.mort()== false){
            force = (int)(this.pv *this.pouvoir);
            this.pv+= p.subitCharme(force);

        }
    }

    @Override
    public int subitFrappe(int coup) {
        this.pv-= coup;
        return (int)(this.pv *this.pouvoir);

    }

    @Override
    public int subitCharme(int coup) {
        return 0;
    }

    public double getPouvoir(){
        return this.pouvoir;
    }
}
