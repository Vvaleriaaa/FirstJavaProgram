public class Calc2Test {
    static void calc2(double number1, double number2, char operation) {
        if (operation == '+') {
            System.out.println(number1 + number2);
        } else if (operation == '-') {
            System.out.println(number1 - number2);
        } else if (operation == '*') {
            System.out.println(number1 * number2);
        } else if (operation == '/') {
            System.out.println(number1 / number2);
        }
    }
    public static void main (String[] args) {
        calc2(8, 11, '+');
    }
}