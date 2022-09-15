package com.example.features.sorting;

public class QuickSortDemo {

    public static void main(String[] args) {
        int[] a = {2,5,1,7,3};
        quickSortfp(a, 0, a.length-1);
        for (int i: a) {
            System.out.println(i);
        }
    }

    /*taking 1st element as pivot. take left, right pointer, i&j pointer to traverse
    * swap i& j if they stop compare with pivot
    * swap pivot if i&j crosses- pivot element gets sorted by this time
    * repeat the process*/
    private static void quickSortfp(int[] a, int l, int r) {

        if (l<r) {
            int i = l;
            int j = r;
            int pivot = a[l];

            while (i < j) {
                i +=1;
                while (i <= r &&  a[i] < pivot) {
                    i++;
                }
                while (j >= l && a[j] > pivot) {
                    j--;
                }

                if (i < j && i <= r) {
                    swap(a, i, j);
                }
            }
            swap(a, l, j);
            quickSortfp(a, l, j - 1);
            quickSortfp(a, j + 1, r);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
