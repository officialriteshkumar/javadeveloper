public class Pattern3 {
    public static void hellow_rectangle(int totRows,  int totCols){
        for( int i =1;i<=totRows; i++){
            for(int j =1; j<=totCols; j++){
                if(i==1 || i == totRows|| j==1 || j== totCols){
                    System.out.println("*");

               }else{
                System.out.println(" ");

               }

               }
               System.out.println();
            }


        }

    public static void zero_one_triangle(int n){
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                if((i=j) % 2 ==0){
                    System.out.print("1");

                }else{
                    System.out.print("0");
                }

            }
            System.out.println();

        }
    }


    
        public static void main(String ars[]){
           // hellow_rectangle(4,5);
           //floyds_triangle(6);
           zero_one_triangle(2);

        }
    }
    

