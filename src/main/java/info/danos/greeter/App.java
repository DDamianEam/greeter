package info.danos.greeter;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        LocalDate currentDate = LocalDate.now();
        System.out.println("Today is: " + currentDate);
    }
}
