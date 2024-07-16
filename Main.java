import java.util.Scanner;

public class Main {
    public static void main( String [] args){
        System.out.println("Hello World!!");
        System.out.println("Hello \"World\"");
        System.out.println("Hello \nWorld");

        Scanner scanner = new Scanner(System.in);
        System.out.println("ax² + bx +c");
        System.out.println("Enter your Numbers a,b and c");
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();
        System.out.print("c= ");
        int c = scanner.nextInt();
        double delta = Math.pow(b,2)- 4*a*c;
        System.out.println("delta = b²-4*a*c = "+delta);

    }
}
