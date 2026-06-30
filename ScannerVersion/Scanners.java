package ScannerVersion;
import java.util.*;
public class Scanners {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("\nEnter Name: ");
        String name = sc.nextLine();

        System.out.println("OUTPUT: " + name);

        sc.close();

    }
    
}
