import java.util.Scanner;

public class Bai6 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n;
          do{
               System.out.println("nhap vao 1 so nguyen duong bat ky :");
               n = sc.nextInt();
          }while(n < 0);
          long gt = 1;
          if(n == 0 || n == 1){
               System.out.println(n + "!" + "=" + gt);
          }else{
               for(int i = 2; i <= n; i++){
                    gt *= i;
               }
               System.out.println(n + "!" + " = " + gt);
          }
          
     }
    
}