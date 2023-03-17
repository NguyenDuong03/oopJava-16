import java.util.Scanner;

public class Bai12 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("nhap hang: ");
          int hang = sc.nextInt();
          System.out.print("nhap cot: ");
          int cot = sc.nextInt();
          int Arr2[][] = new int[hang][cot];
          System.out.println("Nhap cac phan tu cho ma tran: ");
          for (int i = 0; i < hang; i++) {
               for (int j = 0; j < cot; j++) {
                    System.out.printf("A[%d][%d] = ", i, j);
                    Arr2[i][j] = sc.nextInt();
               }
          }
          int max = Arr2[0][0];
          for (int i = 0; i < hang; i++) {
               for (int j = 0; j < cot; j++) {
                    if (Arr2[i][j] > max) {
                         max = Arr2[i][j];
                    }
               }
          }
          System.out.println("phan tu lon nhat trong ma tran la:" + max);
     }
}