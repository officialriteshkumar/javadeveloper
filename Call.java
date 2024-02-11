import java.util.*;
public class Call {
    public void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello wolrd");
    }
    public static int calculatesum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
         
    }
    public static int multiply(int a,int b){
        int product = a*b;
        return product;

    }
    public static void main(String[] args) {
        //swap - value exchange
        int a = 5;
        int b = 10;
        int prod = multiply(a , b);
        System.out.println("a*b  = "+ prod);
        prod = multiply(10,20);
        System.out.println("a*b ="+prod);
        
    }
    
}
