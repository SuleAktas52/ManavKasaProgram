package deneme;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input= new Scanner(System.in);

        System.out.print("Armut kac kilo? ");
        armutKg=input.nextDouble();
        double armutFiyat=armutKg*2.14;

        System.out.print("Elma kac kilo? ");
        elmaKg=input.nextDouble();
        double elmaFiyat=elmaKg*3.67;

        System.out.print("Domate kac kilo? ");
        domatesKg=input.nextDouble();
        double domatesFiyat=domatesKg*1.11;

        System.out.print("Muz kac kilo? ");
        muzKg=input.nextDouble();
        double muzFiyat=muzKg*0.95;

        System.out.print("Patlican kac kilo? ");
        patlicanKg=input.nextDouble();
        double patlicanFiyat=patlicanKg*5;

        double toplamTutar= armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
