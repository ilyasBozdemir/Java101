/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package dik.ucgende.hipotenus;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("a kenarını giriniz : ");
        a = input.nextInt();
        System.out.print("b kenarını giriniz : ");
        b = input.nextInt();
        
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.print(c);

                
    }
}
