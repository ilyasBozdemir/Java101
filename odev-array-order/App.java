/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package odev.array.order;

import java.util.*; 

public class App {
   
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n =inp.nextInt();
        int[] list = new int[n];
        for (int i =0;i<list.length;i++)
        {
            System.out.print(i+1 +". Eleman : ");
            list[i]=inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
    }
}
