import java.util.*;
public class Loop5 {
    public static void main(String[] args) {
        int n = 10899;
        while(n > 0){
            int LastDigit = n % 10;
            System.out.print(LastDigit);
            n = n / 10;
        }
        System.out.println();
    }
    
}
