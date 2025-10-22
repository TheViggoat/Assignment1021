import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your name, twizzalicious? ");
        String name = scanner.nextLine();
        
        System.out.println("Your name is possibly " + name);
        
        scanner.close();
    }
}
