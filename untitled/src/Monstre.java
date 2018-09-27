public class Monstre extends Personnage {
    public Monstre (String nom, int pv){
        super(nom,pv);
    }

    @Override
    public int subitFrappe(int coup) {
        if (getVie() <= 0){
            return 0;
        }
        else
           this.pv-=coup;
           return (this.pv/2);
    }

    @Override
    public int subitCharme(int coup) {
        this.pv -=coup;
        return (this.pv/2);
    }

    @Override
    public void attaque(Personnage p) {
        int force;
        if ( p.mort()==false){
            force=this.pv/2;
            this.pv -= p.subitFrappe(force);

        }
    }
}
