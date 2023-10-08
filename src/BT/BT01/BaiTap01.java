package BT.BT01;

import java.util.Arrays;

public class BaiTap01 {
    public static void main(String[] args) {
        bubbleSort();
        selectionSort();
        insertionSort();
    }

    private static int[] getArr(){
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void bubbleSort() {
        int[] arr = getArr();

        // Sắp xếp nổi bọt
        for (int i = arr.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sắp xếp nổi bọt:");
        System.out.println(Arrays.toString(arr));
    }
    
    public static void selectionSort() {
        int[] arr = getArr();
        
        // Sắp xếp chọn
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sắp xếp chọn:");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort() {
        int[] arr = getArr();

        // Sắp xếp chèn
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Sắp xếp chèn:");
        System.out.println(Arrays.toString(arr));
    }
}
