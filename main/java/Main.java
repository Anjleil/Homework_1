import java.util.Enumeration;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        int searching, answer, iter = 1;
        long number, left = 0, right = 2147483647;
        boolean isFound = false;
        Scanner str = new Scanner(System.in);
        System.out.println("Введите число от 0 до 2 147 483 647");
        searching = str.nextInt();
        while(!isFound){
            number = (left+right)/2;
            System.out.print("Предполагаемое число = " + number);
            System.out.println(" (итерация номер " + iter + ")");
            iter++;
            System.out.println("Ваше число (введите цифру) \n1. Больше\n2. Меньше\n3. Равно");
            answer = str.nextInt();
            switch (answer){
                case 1: left = number + 1;
                    break;
                case 2: right = number - 1;
                    break;
                case 3: isFound = true;
                    break;
                default: System.out.println("Введите корректное значение");
                    break;
            }
        }
        if (isFound) System.out.println("Искомое число = " + searching);
    }
}
