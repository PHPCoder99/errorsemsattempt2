import java.util.Objects;
import java.util.Scanner;

public class Seminar2hw {
    public static boolean isFloatable(String f){ // for task1
        try {
            Float.parseFloat(f);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static float inputFloatUntilRight(){ // task1. i just thought that naming functions correctly was, like, important.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        String f = scanner.nextLine();
        while (!isFloatable(f)) {
            System.out.println("Неверный ввод. Введите дробное число: ");
            f = scanner.nextLine();
        }
        return Float.parseFloat(f);
    }

    public static void divideArray8(){ // task2
        try {
            int d = 0;
            int[] intArray = {1, 2, 3, 4};
            int catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e);
        }
    }

    public static void printSum(Integer a, Integer b){ // also task3
        System.out.println(a + b);
    }

    public static void iveNoIdeaWhatToCallThisMess(){ // task3
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за приделы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void disallowEmptyStrings(){
        try {
            Scanner scanner = new Scanner(System.in);
            if (Objects.equals(scanner.nextLine(), "")){
                throw new Exception("Ввод пуст!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
