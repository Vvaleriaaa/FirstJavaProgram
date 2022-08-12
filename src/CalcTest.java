public class CalcTest {
    static void calc(double number1, double number2, char operation) {
        switch (operation) {
            case '+':
                System.out.println(number1 + number2);
                break;
            case '-':
                System.out.println(number1 - number2);
                break;
            case '*':
                System.out.println(number1 * number2);
                break;
            case '/':
                System.out.println(number1 / number2);
                break;
        }
    }
    public static void main(String[] args) {
        calc(7, 10, '*');
    }
}
