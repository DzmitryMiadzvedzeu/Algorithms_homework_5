package com.telran.algorithms.hw.hw_5;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {9, -3, 5, 2, 8, -6, 1, 3};
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив:");

        for (int num : arr) {
        System.out.print(num + " ");
        }
}
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low + (high - low) / 2];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);

            if (i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
