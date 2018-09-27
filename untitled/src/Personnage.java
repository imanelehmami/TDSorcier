public abstract class Personnage extends Victime{

protected int pv;

public Personnage(String nom, int pv ){
    super(nom);
    this.pv=pv;
}
public String toString(){
    if (pv >0)
        return "Je m'appelle "+ this.nom + "et j'ai " + this.pv + " points de vie";
    else
        return this.nom + " est mort";
}

public String getNom(){
     return this.nom;
}
public boolean mort(){
    if (pv <= 0)
        return true;
    else
        return false;
}

public int getVie(){
    return this.pv;

}
public void addVie(int num){
    this.pv += num;
}

public abstract void attaque(Personnage p);
public abstract int subitFrappe(int coup);
public abstract int subitCharme(int coup);



}
