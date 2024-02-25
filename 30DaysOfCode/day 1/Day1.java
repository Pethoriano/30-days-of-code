import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scanner = new Scanner(System.in);
        
        int i2 = scanner.nextInt();
        double d2 = scanner.nextDouble();
        scanner.nextLine();
        String s2 = scanner.nextLine();
        
        scanner.close();
        
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s+s2);
    }
    
}
