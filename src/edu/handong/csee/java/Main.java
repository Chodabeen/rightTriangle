package src.edu.handong.csee.java;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main stepE = new Main();
    stepE.e02();
  }
  void e02(){
    Scanner s = new Scanner(System.in);
    int height;
    int blank;
    int i = 0,j = 0;

    System.out.print("Enter a height of right triangle and black > ");
    height = s.nextInt();
    blank = s.nextInt();

    for(i = 0; i < height; i++){
      for(j = 0; j < height + blank -(i+1); j++)
        System.out.print(" ");
      for(j = 0; j <= i; j++)
        System.out.print("*");

      System.out.println();
    }


  }
}
    

