package exeption.homeworks.homewok_1;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task_1 {
    private static void printDivisionZero() { // ArithmeticException
        System.out.println(1 / 0);
    } // ArithmeticException

    private static void fillArray() { // ArrayIndexOutOfBoundsException
        int[] number = new int[3];
        for (int i = 0; i < number.length + 1; i++) {
            number[i] = i;
        }
    }

    private static void convertStringToNumber() { // NumberFormatException
        String likeNumber = "o";
        int number = Integer.parseInt(likeNumber);
    }
}
