import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сложить два числа (+)");
        System.out.println("Вычесть первое из второго (-)");
        System.out.println("Перемножить два числа (*)");
        System.out.println("Разделить первое на второе (/)");
        System.out.println("Возвести в степень N первое число (^)");


        while (true){
            int a;
            int  b;
            int res = 0;
            char op;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два числа: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Выберите операцию: ");
            op = scanner.next().charAt(0);
            switch (op){
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
                case '^':
                    res = (int) Math.pow(a, b);
                    break;

            }
            System.out.println("Результат: "+  a + op + b + "=" + res);


        }
    }
}