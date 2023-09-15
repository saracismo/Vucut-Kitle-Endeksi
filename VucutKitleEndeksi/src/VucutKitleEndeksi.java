import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        //değişkenleri tanımlayalim.
        int kg;
        double boy ;

        // veri almak adına kodları yazalim.

        Scanner inp = new Scanner(System.in);

        System.out.print("Boy Ölçünüzü Giriniz  : ");

        boy = inp.nextDouble();


        System.out.print("Kilonuzu Giriniz  : ") ;

        kg = inp.nextInt();




        // verilen alan formülünü girelim.

        double body = kg / (boy * boy) ;


        System.out.println(" Vücut Kitle Endeksiniz : " + body );

    }
}