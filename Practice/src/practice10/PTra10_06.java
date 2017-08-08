package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

import java.util.Arrays;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ★ carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * ★ 各carインスタンスのrunメソッドを実行して、200km先の目的地に到達した順位を出力してください
		 */

		final int distance = 200;
		
		int progress = 0;
		
		int n = 0;
		
		int count1 = 0;
		
		Car car1 = new Car();
		
		car1.color = "red";
		
		car1.gasoline = 100;
		
		while(distance>=progress) {

			n = car1.run();
 
			if(n==-1) {
				break;
			}
			
			progress+=n;

			count1++;
		}

		
        int progress2 = 0;
  		
		int l = 0;
		
		int count2 = 0;
		
		Car car2 = new Car();
		
		car2.color = "blue";
		
		car2.gasoline = 120;
		
		while(distance>=progress2) {

			l = car2.run();
 
			if(l==-1) {
				break;
			}
			
			progress2+=l;

			count2++;
		}
	
		
        int progress3 = 0;
		
		int m = 0;
		
		int count3 = 0;
		
		Car car3 = new Car();
		
		car3.color = "yellow";
		
		car3.gasoline = 110;
		
		while(distance>=progress3) {

			n = car3.run();
 
			if(n==-1) {
				break;
			}
			
			progress3+=l;

			count3++;
		}
		
		
		int[] array = new int[3];
		
		array[0] = count1;
		
		array[1] = count2;
		
		array[2] = count3;
		
		Arrays.sort (array);

		
		if(array[0]==count1) {
        	System.out.println("1位はred");
        }else if(array[0]==count2) {
        	System.out.println("1位はblue");
        }else {
        	System.out.println("1位はyellow");
        }
		
		
		if(array[1]==count1) {
        	System.out.println("2位はred");
        }else if(array[1]==count2) {
        	System.out.println("2位はblue");
        }else {
        	System.out.println("2位はyellow");
        }
		
		
		if(array[2]==count1) {
        	System.out.println("3位はred");
        }else if(array[2]==count2) {
        	System.out.println("3位はblue");
        }else {
        	System.out.println("3位はyellow");
        }
    }
	
}
