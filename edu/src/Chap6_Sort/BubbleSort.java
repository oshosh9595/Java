package Chap6_Sort;

import java.util.Scanner;

class BubbleSort {
    //--- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    //--- 버블 정렬 ---//
    static void bubbleSort(int[] a, int n) {
    	//int exchg = 0; //밑에 for 루프가 두개라서 두번돌기때문에 0
    	int count = 0;
    	for (int i = 0; i < n - 1; i++) {
        	int exchg = 0; 
        	for (int j = n - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                	swap(a, j - 1, j);
        			exchg++;
                }
        		count++;
        		//count += exchg;
        	}
        	if(exchg == 0) break;
    		System.out.print("break : " + exchg);
    		System.out.println(" count ="+ count);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("버블 정렬(버전 1)");
        System.out.print("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
        	//Double d = Math.random();
        	//x[i] = (int) (d*20);
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }
        
        for (int num : x )
        	System.out.print(" " + num);
        System.out.println();

        bubbleSort(x, nx);                // 배열 x를 단순교환정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.print(" " + x[i]);
    }
}