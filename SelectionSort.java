public class SelectionSort {
    public static void main(String args[]){
        int[] liste = {1, 3, 5, 61, 1967, 1997, -10, -1,-201,1453};

        for (int i = 0; i < liste.length-1; i++) {
            int sayi = liste[i];
            int temp = i;
            for (int j = i+1; j < liste.length ; j++) {
                if(liste[j]<sayi){
                    sayi = liste[j];
                    temp = j;
                }
            }

            if(temp != i){
                liste[temp] = liste[i];
                liste[i] = sayi;
            }

        }

        for (int sayi:liste) {
            System.out.println(sayi);

        }
    }
}
