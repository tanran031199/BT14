package BT.BT03;

import java.util.Arrays;

public class BaiTap03 {

    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertionSort();
    }

    public static void bubbleSort(){
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Sắp xếp nổi bọt:");
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort() {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println();
        System.out.println("Sắp xếp chọn:");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort() {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            String temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(temp) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        System.out.println();
        System.out.println("Sắp xếp chèn:");
        System.out.println(Arrays.toString(arr));
    }
}
