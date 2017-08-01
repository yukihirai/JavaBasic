package practice06;
/*
 * PTra06_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_09 {
	public static void main(String[] args) {

		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("数値を入力してください");

		// コマンドプロンプトで入力した値が変数lineに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int maxCount = scanner.nextInt();

		System.out.println("2～" + maxCount + "までの中で素数を出力するプログラム");
		System.out.println("=========< 開始 >=========");

		/*
		 * ★ 以下の仕様でfor文を記述してください
		 *
		 * 初期化：変数iを宣言し、2で初期化してください
		 * 条件式：変数iが、maxCount未満である限り繰り返しを行います
		 * 後処理：変数iに1を足した数で、変数iを上書きします
		 */
		//-----for① start

			/*
			 * 注）素数とは
			 *
			 * 1とその数自身以外で割り切れない数字のこと。ただし1は素数に含めない
			 */

			// ★ boolean型の変数flgを宣言し、falseで初期化してください


			/*
			 * ★ 以下の仕様でfor文を記述してください
			 *
			 *  初期化：変数jを宣言し、2で初期化してください
			 *  条件式：変数jが、変数i未満である限り繰り返しを行います
			 *  後処理：変数jに1を足した数で、変数jを上書きします
			 */
			//-----for② start


				// ★ 変数iをjで割ったときの余りが0であった場合（割り切れた場合）処理を行うif文を記述してください
				//-------if start
					// ★ 変数flgにtrueを代入してください


					// ★ for②の繰り返しをbreakする記述を入れてください


		        //-------if end


			//-----for② end

			// ★ 変数flgがfalseであった場合は、変数iを出力してください


		//-----for① end
	}
}
