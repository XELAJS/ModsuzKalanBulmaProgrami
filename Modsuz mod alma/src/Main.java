import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner girdi=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int sayi1= girdi.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int sayi2= girdi.nextInt();
        int bolum=sayi1/sayi2;
        int kalan=sayi1-(bolum*sayi2);
        System.out.println("kalan="+kalan);
    }
}