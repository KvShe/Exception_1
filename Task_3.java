package exeption.homeworks.homewok_1;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */
public class Task_3 {
    private static int[] division(int[] array1, int[] array2) {
        if (array1 == null || array2 == null) {
            throw new RuntimeException("one or somewhat arrays equals null");
        }

        if (array1.length != array2.length) {
            throw new RuntimeException("lengths arrays not equals");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("division by zero");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }
}
