package exeption.homeworks.homewok_1;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
public class Task_2 {
    private static int[] dif(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            System.err.println("one or somewhat arrays equals null");
            return null;
        }

        if (array1.length != array2.length) {
            System.err.println("lengths arrays not equals");
            return null;
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] - array2[i];
        }

        return result;
    }
}
