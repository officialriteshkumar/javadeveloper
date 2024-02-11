import java.util.*;
public class Product {
    public void printHelloWorld(){
        System.out.println("Hello wprld");
        System.out.println("Hello wprld");
        System.out.println("Hello wprld");
    }
    public static int calculatesum(int num1,int num2){
        int sum = num1+num2;
        return sum;
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
         int prod =multiply(a,b);
         System.out.println("a*b="+prod);
    }
}
