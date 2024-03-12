public class Rhobus{
    public static void hellow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int  j=1; j<=(n-i); j++){
                System.out.print (" ");
            }
            for(int j=1; j<=n ;j++){
                if(i == 1||i == n || j ==1 || j==n ){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }

            }
            System.out.println( " ");

        }
    } 
    public static void main(String[] args) {
        hellow_rhombus(5);
    }  
}
