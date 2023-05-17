import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int mesafe,yas,yoltipi;
        double mesafeBasiUcret = 0.10,total;


        System.out.println("Gidilecek mesafeyi km cinsinden yazınız:");
        mesafe = input.nextInt();

        System.out.println("Yaşınız: ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini seçiniz:");
        System.out.println("Tek Yön için:1\nGidiş Dönüş için:2");

        yoltipi = input.nextInt();
        total = mesafeBasiUcret*mesafe;

        if ((mesafe>0)&&(yas>0)&& (yoltipi==1 || yoltipi==2)) {
            if (yas<12){
                total -= total*0.5;
            }
            if ((12<=yas)&&(yas<=24)){
                total -= total*0.1;
            }
            if ((yas>65)){
                total -= total*0.3;
            }
            if (yoltipi ==2){
               total -= total*0.2;
               total*=2;
            }
            System.out.println("Toplam tutar :"+total);
        }
        else {
            System.out.println("Hatalı veri girdiniz");
        }
    }
}