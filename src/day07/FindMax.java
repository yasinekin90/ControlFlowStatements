package day07;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");

        double sayi1=input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        double sayi2=input.nextDouble();

        if(sayi1>sayi2){
            System.out.println("Birinci sayı büyüktür.");
        }else if(sayi2>sayi1) {
            System.out.println("İkinci sayı büyüktür.");
        }else {
            System.out.println("İki sayı eşittir.");
        }
    }
}
