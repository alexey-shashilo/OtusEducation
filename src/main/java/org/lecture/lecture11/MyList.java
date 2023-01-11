package org.lecture.lecture11;

import java.util.*;

public class MyList {
    private int[] noSortInt;

    MyList(int[] array) {
        this.noSortInt = array;
    }

    public void bubbleSortAscending() {
        int sizeNoSortInt = noSortInt.length;
        for (int i = 0; i < sizeNoSortInt; i++) {
            for (int j = 1; j < sizeNoSortInt; j++) {
                if (noSortInt[j] < noSortInt[j - 1]) {
                    int a = noSortInt[j - 1];
                    noSortInt[j - 1] = noSortInt[j];
                    noSortInt[j] = a;
                }
            }
        }
    }

    public void insertionSortAscending() {
        int sizeNoSortInt = noSortInt.length;
        for (int i = 0; i < sizeNoSortInt; i++) {
            int value = noSortInt[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < noSortInt[j]) {
                    noSortInt[j + 1] = noSortInt[j];
                } else {
                    break;
                }
            }
            noSortInt[j + 1] = value;
        }
    }

    public void showMyList() {
        int sizeNoSortInt = noSortInt.length;
        for (int i = 0; i < sizeNoSortInt; i++) {
            if (i == sizeNoSortInt - 1) {
                System.out.print(noSortInt[i]);
            } else {
                System.out.print(noSortInt[i] + ", ");
            }
        }
        System.out.println();
    }
}

class Array {
    public static void main(String[] args) {
        int[] intArr = new int[]{6, 1, 6, 8, 0, 1, 5, 7, 8, 4, 2, 5, 7, 4, 2, 6, 2, 6, 8, 9, 0, 11, 2, 3, 4, 5, 6, 7, 8};
        Date date = new Date();
        long dataStart;
        long dataFinish;
        MyList myList1 = new MyList(intArr.clone());
        myList1.showMyList();
        dataStart = date.getTime();
        myList1.bubbleSortAscending();
        dataFinish = date.getTime();
        myList1.showMyList();
        System.out.println("Delta time " + (dataFinish - dataStart) + " ms");

        MyList myList2 = new MyList(intArr);
        myList2.showMyList();
        dataStart = date.getTime();
        myList2.insertionSortAscending();
        dataFinish = date.getTime();
        myList2.showMyList();
        System.out.println("Delta time " + (dataFinish - dataStart) + " ms");

        List myList3 = new ArrayList(Arrays.asList(6, 1, 6, 8, 0, 1, 5, 7, 8, 4, 2, 5, 7, 4, 2, 6, 2, 6, 8, 9, 0, 11, 2, 3, 4, 5, 6, 7, 8));
        dataStart = date.getTime();
        System.out.println(myList3);
        Collections.sort(myList3);
        dataFinish = date.getTime();
        System.out.println(myList3);
        System.out.println("Delta time " + (dataFinish - dataStart) + " ms");
    }
}
