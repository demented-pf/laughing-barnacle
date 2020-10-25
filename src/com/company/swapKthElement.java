package com.company;

public class swapKthElement {
    void swapKth(int arr[], int n, int k) {
        int a;
        a = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = a;
    }

    public static void main(String[] args) {

    }
}
