import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Personnage tab[] = new Personnage[10];
        int i;

        for (i = 0; i < 10; i++) {
            if (i < 5) {
                int r = new Random().nextInt(101);
                tab[i] = new Monstre("Monstre" + i, r);

            } else {
                int a = new Random().nextInt(101);
                tab[i] = new Monstre("Sorcier" + i, a);
            }
        }
        for (i = 0; i < 10; i++) {
            int j = new Random().nextInt(10);

            int k = new Random().nextInt(10);
            while (k == j) {
                k = new Random().nextInt(10);
            }
            System.out.println(tab[j]);
            System.out.println(tab[k]);

            tab[j].attaque(tab[k]);

            System.out.println(tab[j]);
            System.out.println(tab[k]);

        }
    }
}
