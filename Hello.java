package info.danos;

import java.time.LocalDate;

public class Hello{
    public static void main(String[] args){
      System.out.println("Hello World!");

      LocalDate currentDate = LocalDate.now();

      System.out.println("Today is: " + currentDate);
    }

}
