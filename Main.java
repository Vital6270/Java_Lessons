/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось 
   (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */

public class Main {
    public static int sumArrayValues(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (IllegalArgumentException e) {
                    throw new MyArrayDataException("Неверные данные в массиве, ячейка [" + i + "][" + j + "]: " + arr[i][j]);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arrValid = {
                {"1", "1", "1", "1"},
                {"0", "0", "0", "0"},
                {"3", "3", "3", "3"},
                {"2", "2", "2", "2"}
        };

        String[][] arrInvalidLength = {
                {"1", "1", "1", "1"},
                {"0", "0", "0", "0"},
                {"3", "3", "3", "3"},
                {"2", "2", "2", "2"},
                {"4", "4", "4", "4"}
        };

        String[][] arrInvalidSymbol = {
                {"a", "1", "1", "1"},
                {"3", "3", "3", "3"},
                {"2", "2", "2", "2"},
                {"4", "4", "4", "4"}
        };

        // теперь проверяем на валидных и невалидных массивах
        System.out.println("Результат расчета: " + sumArrayValues(arrValid));
        System.out.println("Результат расчета: " + sumArrayValues(arrInvalidLength));
        //System.out.println("Результат расчета: " + sumArrayValues(arrInvalidSymbol));
    }
}
