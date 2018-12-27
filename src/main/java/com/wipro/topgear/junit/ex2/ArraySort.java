package com.wipro.topgear.junit.ex2;

public class ArraySort {
    public int[] sortNumbers(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int n = arr[i];
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        return arr;
    }
}
