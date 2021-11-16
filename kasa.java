import java.util.Scanner;

/**
 * @author fatih-git
 */

public class kasa {

    public static void main(String[] args) {

        double elma=3.67, armut=2.14, domates=1.11, muz=0.95, patlıcan=5;
        double kilo, tutar=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen elmanın kilosunu giriniz: ");
        kilo=input.nextDouble();
        tutar+=elma*kilo;

        System.out.print("Lütfen armut kilosunu giriniz: ");
        kilo=input.nextDouble();
        tutar+=armut*kilo;

        System.out.print("Lütfen domates kilosunu giriniz: ");
        kilo=input.nextDouble();
        tutar+=domates*kilo;

        System.out.print("Lütfen muz kilosunu giriniz: ");
        kilo=input.nextDouble();
        tutar+=muz*kilo;

        System.out.print("Lütfen patlıcan kilosunu giriniz: ");
        kilo=input.nextDouble();
        tutar+=patlıcan*kilo;

        System.out.println("Toplam tutar= "+tutar);

    }

}
