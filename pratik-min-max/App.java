/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pratik.min.max;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        
        int min = 0,max = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Girin : " );
        int sayi = scan.nextInt();
        
        System.out.print("Dizi : {" );
        String sayilar="";
        
        for (int i = 0; i < list.length; i++) {
            sayilar+=list[i]+",";
        }
        
        for (int i=0; i< list.length; i++) {
            if (sayi> list[i]) {
                min = list[i];
            }
            if (sayi < list[i]) {
                max = list[i];
                break;
            }
        }
        
        System.out.println(sayilar.substring(0, sayilar.length() - 1)+"}" );
        System.out.println("Girilen Sayı : " + sayi );
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min );
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max );
      
    }
}
