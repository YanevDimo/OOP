package encapsulation.box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          double length =  Double.parseDouble(scanner.nextLine());
          double width =  Double.parseDouble(scanner.nextLine());
          double height =  Double.parseDouble(scanner.nextLine());

          try{
              Box box = new Box(length,height,width);
              System.out.printf("Surface Area - %.2f%n",box.calculateSurfaceAria());
              System.out.printf("Lateral Surface Area - %.2f%n",box.calculateLateralSurfaceAria());
              System.out.printf("Volume - %.2f",box.calculateVolume());
          }catch (IllegalArgumentException e){
              System.out.println(e.getMessage());
          }
    }
}
