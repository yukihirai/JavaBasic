package practice11;
/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
    static int number;
	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
    PTra11_03(){
    	number +=1;

    }


	public static void main(String[] args) {

		// ★ sumメソッドを呼び出してください

		PTra11_03 pTra11_03 = new PTra11_03();
	
	pTra11_03.sum(3, 5);
	}

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber："+ number /* + ★ クラスフィールドnumberの出力をしてください */);
	}
}
