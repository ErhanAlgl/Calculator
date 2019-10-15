import java.util.Scanner;

public class modAlma {
    public static void main (String [] args){
        Scanner oku= new Scanner(System.in);
        double a, b, sonuc, islem;
        System.out.println("Mod alma islemi icin '1'e basınız ");
        islem=oku.nextInt();
        System.out.println("Birinci sayiyi giriniz:");
        a=oku.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        b=oku.nextInt();
        if(islem==1){
            sonuc=a % b;
            System.out.println("Mod isleminin sonucu :" +sonuc);
        }

    }
}

