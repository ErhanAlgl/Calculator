import java.util.*;
public class calculator{
    public static void main (String [] args){
        Scanner oku= new Scanner(System.in);
        double a, b, sonuc, islem;
        System.out.println("Toplama islemi icin 1'e, cikarma islemi icin 2'ye, carpma islemi icin 3'e ve bolme islemi icin 4'e basınız:");
        islem=oku.nextInt();
        System.out.println("Birinci sayiyi giriniz:");
        a=oku.nextInt();
        System.out.println("İkinci sayiyi giriniz:");
        b=oku.nextInt();
        if(islem==1){
            sonuc=a + b;
            System.out.println("Toplama isleminin sonucu :" +sonuc);
        }
        if(islem==2){
            sonuc=a - b;
            System.out.println("Cikarma isleminin sonucu :" +sonuc);
        }
        if(islem==3){
            sonuc=a*b;
            System.out.println("Carpma isleminin sonucu :" +sonuc);
        }
        if(islem==4){
            sonuc=a/b;
            System.out.println("Bölme isleminin sonucu :" +sonuc);
        }
    }
}