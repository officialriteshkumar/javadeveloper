import java.util.*;
public class Factorial {
    public void printHelloWorld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }
    public int calculatesum(int num1 + int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static int multiply(int a ,int b){
        int product = a*b;
        return product;

    }
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int bincoeff(int n , int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bincoeff = fact_n / (fact_r* fact_nmr);
        return bincoeff;
    }

        
        public static void main (String args[]){
            System.out.println(bincoeff(5,2));
        }

    }
    
