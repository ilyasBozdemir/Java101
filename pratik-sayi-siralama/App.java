/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hesap.makinesi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        int sayi1,sayi2,sayi3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        sayi1=input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2=input.nextInt();
        System.out.print("3. sayıyı giriniz: ");
        sayi3=input.nextInt();
        
        if (sayi1>sayi2 &&sayi1>sayi3) 
        {
            if (sayi2>sayi3) 
                 System.out.print("a > b > c");
            else 
                System.out.print("a > c > b");
            
        }
        else if (sayi2>sayi1&&sayi2>sayi3)
        {
         if (sayi1>sayi3) 
                 System.out.print("b > a > c");
            else 
                System.out.print("b > c > a");
        }
        else{
            if (sayi1>sayi2) 
                 System.out.print("c > a > b");
            else 
                System.out.print("c > b > c");
        }
        
    }
}
