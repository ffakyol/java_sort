import java.util.Arrays;

public class Main {
    public static void main(String[] args){
    int[] liste1 = {5, 3, 1, 4, 2};
    String[] liste2 = {"elma", "armut", "çilek", "muz", "portakal"};

    int[] artanListe = Sırala.sırala(liste1, "artan");
    int[] azalanListe = Sırala.sırala(liste1, "azalan");
    String[] alfabeListe = Sırala.alfabeSırala(liste2);

        System.out.println("Artan sıralama: " + Arrays.toString(artanListe));
        System.out.println("Azalan sıralama: " + Arrays.toString(azalanListe));
        System.out.println("Alfabe sıralama: " + Arrays.toString(alfabeListe));
}
}