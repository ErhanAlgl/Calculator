import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {
        int dizi[]={6,5,3,1,8,7,2,4,9,12,11,15,13,14};
        Arrays.sort(dizi);//dizi sıralandı
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

    }

}