import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adad Aval Khod Ra Vared Konid: ");
        double num1 = scanner.nextDouble();

        System.out.print("Amaliat Khod Ra Vared Konid (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Adad Dovom Khod Ra Vared Konid: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Adad Dovom Namitavanad 0 Bashad!");
                    return;
                }
                break;
            default:
                System.out.println("Error! Operator Ra Be Dorosti Vared Konid.");
                return;
        }

        System.out.println("Natije: " + result);
    }
}
