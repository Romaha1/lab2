public class Main {
    public static void main(String[] args) {
        // task 1
        int a = 10;
        int b = 3;

        double quotient =(double) a / b; // результат ділення
        int remainder = a % b; // залишок від ділення

        System.out.println("Результат ділення: " + quotient);
        System.out.println("Залишок від ділення: " + remainder);

        // task 2
        int number = 98; // двозначне число

        int sum = 0;
        sum += (number % 10) + (number / 10); // додаємо одиниці та десятки до суми

        System.out.println("Сума цифр числа " + number + " = " + sum);

        // task 3

        double number2 = 3.14159; // число, яке потрібно округлити

        int rounded = (int) Math.round(number2); // округлення до найближчого цілого

        System.out.println("Округлене число: " + rounded);
    }
}