public abstract class Victime {
    protected String nom;
    public Victime(String nom){
        this.nom=nom;
    }
    public abstract int subitFrappe(int coup);
    public abstract int subitCharme(int coup);



}
