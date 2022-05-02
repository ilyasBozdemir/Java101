package pratik.palindrom.string;
public class App {
    
 static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        String state =isPalindrome("abba")
                ?"palindrom string"
                :"palindrom not string";
        System.out.println(state);
    }
}