package homework3_1;

import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        String[] arr1 = {"Один","Два","Три","Четыре"};
        System.out.println("Массив строк " + Arrays.toString(arr1));
        changeElements(arr1, 1, 3);
        System.out.println("Массив строк " + Arrays.toString(arr1));

        Integer[] arr2 = {1,2,3,4};
        System.out.println("Массив строк " + Arrays.toString(arr2));
        changeElements(arr2, 1, 2);
        System.out.println("Массив строк " + Arrays.toString(arr2));
    }

    private static <T> void changeElements(T[] arr, int index1, int index2){
        if (index1==index2 ||
                index1 >= arr.length ||
                index2 >= arr.length ||
                index1<0||
                index2<0) return;

        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
