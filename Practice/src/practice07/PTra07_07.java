package practice07;
/*
 * PTra07_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_07 {
	public static void main(String[] args) {

		// ★ ※2次元配列を用いています
		int[][] array = {
				{500,40,6},
				{70,8,90,1000}
		};

		// ★ 配列arrayに格納されている全ての数字の平均を出力してください
        int sum=0;
        int count=0;


        for (int[] list : array) {
        	for (int i : list) {
        		sum+=i;
    		    count++;
        	}
        }

        System.out.println(sum/count);


//    	sum1=array[0][0]+array[0][1]+array[0][2];
//    	sum2=array[1][0]+array[1][1]+array[1][2]+array[1][3];
//        float k=(sum1+sum2)/array.length;
//
//        System.out.println(k);

	}
}
