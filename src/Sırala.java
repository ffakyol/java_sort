import java.util.Arrays;

public class Sırala {
    public static int[] sırala(int[] liste, String sıra) {
        if (sıra.equals("artan")) {
            Arrays.sort(liste);
            return liste;
        }
        else if (sıra.equals("azalan")) {
            Arrays.sort(liste);
            int[] tersListe = new int[liste.length];
            for (int i = 0; i < liste.length; i++) {
                tersListe[i] = liste[liste.length - i - 1];
            }
            return tersListe;
        }
        else {
            System.out.println("Geçersiz sıralama yönü");
            return null;
        }
    }

    public static String[] alfabeSırala(String[] liste) {
        Arrays.sort(liste);
        return liste;
    }
}
