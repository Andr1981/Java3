package homework3_1;

import java.util.ArrayList;

public class TransformToArrayList {
    public static void main(String[] args) {
        String[] arr1 = {"aa","bb","cc"};
        System.out.println(toArrayList(arr1));

        Integer[] arr2 = {1,2,3};
        System.out.println(toArrayList(arr2));
    }

    private static <T> ArrayList<T> toArrayList(T[] arr){
        ArrayList<T> newAL = new ArrayList<>(arr.length);



        for (int i = 0; i < arr.length; i++) {
            newAL.add(arr[i]);
        }

        return newAL;
    }
}
