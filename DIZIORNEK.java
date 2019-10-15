package DIZILER;
import java.util.Scanner;
public class DIZIORNEK {

    public static void main(String[] args) {

        int n, toplam, max, min;
        min=max=toplam=0;
        Scanner oku = new Scanner(System.in);
        System.out.println("ELEMAN SAYISINI GIRINIZ:");

        n=oku.nextInt();
        int dizi[]=new int[n];
        for(int i=0;i<dizi.length;i++) //Dizi elemanları toplamı
        {
            System.out.println((i+1)+"....SAYISINI GIRINIZ:");
            dizi[i]=oku.nextInt();
            toplam+=dizi[i];
        }
        int ort=toplam/n;
        for (int s=0;s<dizi.length;s++)
        {
            if(dizi[s]>max)
            {
                max=dizi[s];
            }
        }
        min=dizi[0];
        for(int a=0;a<dizi.length;a++)
        {
            if(min>dizi[a])
            {
                min=dizi[a];
            }
        }
        int tut=0;
        for(int k=0;k<dizi.length-1;k++)
        {
            for(int y=0;y<dizi.length-1;y++)
            {
                if (dizi[y]>dizi[y+1])
                {
                    tut=dizi[y];
                    dizi[y]=dizi[y+1];
                    dizi[y+1]=tut;
                }
            }
        }

        System.out.println("DIZI ELEMANLARININ TOPLAMI="+toplam);
        System.out.println("DIZI ELEMANLARININ ORTALAMASI="+ort);
        System.out.println("DIZI ELEMANLARININ MAXIMUM DEGER="+max);
        System.out.println("DIZI ELEMANLARININ MINIMUM DEGER="+min);



    }}