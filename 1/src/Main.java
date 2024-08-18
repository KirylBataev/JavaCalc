import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String calc() throws Exception {
        int res=0;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите математический пример с числами от 1 до 10\nпример ввода: 5 + 5");
        String operation = scan1.nextLine();

        String[] words = operation.split(" ");
        int len = words.length;
        if (len !=3 ){
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n");
        }//проверка на количество операндов
        try {
            Integer.parseInt(words[0]);
            Integer.parseInt(words[2]);

        } catch (NumberFormatException e) {
            throw new Exception("т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)\n");
        }//проверка на ввод именно чисел

    int num1 = Integer.parseInt(words[0]);
    int num2 = Integer.parseInt(words[2]);

        if ((num1 >= 1 && num1 <=10) && (num2 >= 1 && num2 <=10) ){
            res = switch (words[1]) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> num1 / num2;
                default -> res;
            };
        }else if((num1 <= 1 || num1 >=10) && (num2 <= 1 || num2 >=10)) {

            throw new Exception("так как необходимо указать числа от 1 до 10");
        }//проверка на числа от 1 до 10
        return Integer.toString(res);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(calc());
    }
}