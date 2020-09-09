import java.util.ArrayList;

public class Main {
    //2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
    // Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
    // идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку,
    // иначе в методе необходимо выбросить RuntimeException.
    // Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].

    //3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
    // то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
    public static void main(String[] args) {
       // toNewArr(1, 2, 4, 4, 2, 3, 1, 7);
        checkArrContent(1, 3, 0);

    }
    public static int[] toNewArr(int... arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                k = i;
            }
        }
        k++;
        int [] newArr = new int[arr.length - k ];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[k + i];
        }
        prnitNewArr(newArr);
        if (k == 0) {
            throw new RuntimeException("Нет 4-ок в массиве");
        }
        return newArr;
    }
    public static void prnitNewArr(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean checkArrContent(int... arr) {
        int k = 0;
        boolean main = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 | arr[i] == 4) {
                k++;
            }
        }
        if (k == 0) {
           return false;
        }
        return true;
    }



}
