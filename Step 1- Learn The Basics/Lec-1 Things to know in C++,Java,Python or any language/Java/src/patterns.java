public class patterns {
    public static void main(String[] args) {
        System.out.println("Patters Program");
//        for(int i=1; i<5; i++){
//            for(int j = 1; j < 6; j++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

//        for(int i=1; i <=4; i++){
//            for(int j =1; j <=5; j++){
//                if( i==1 || j==1 || i==4 || j == 5){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
   int n = 4;
   for (int i = 1; i<=n ; i++){
       for (int j =1; j<=n-i; j++){
           System.out.print(" ");
       }
       for(int j=1; j<=i; j++){
           System.out.print("*");
       }
       System.out.println();
   }
    }

}
