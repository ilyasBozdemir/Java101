/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hesap.makinesi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        int Mat,Fizik,Turkce,Kimya,Muzik;
        double ort=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notu giriniz: ");
        Mat= input.nextInt();
         System.out.print("Fizik notu giriniz: ");
        Fizik= input.nextInt();
         System.out.print("Turkce notu giriniz: ");
        Turkce= input.nextInt();
         System.out.print("Kimya notu giriniz: ");
        Kimya= input.nextInt();
         System.out.print("Muzik notu giriniz: ");
        Muzik = input.nextInt();
        ort = (Mat + Fizik + Turkce + Kimya + Muzik) / 5;
        if (ort<55)
          System.out.print("Sınıfta Kaldınız");
        else  
          System.out.print("Sınıftı Geçtiniz.");
           
        System.out.print("ortalamanız : "+ ort);
    }
}
