package practice08;
/*
 * PTra08_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_07 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("西暦を入力してください。");

		// ★ コマンドプロンプトで入力した数値が変数yearに代入されます
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int year = scanner.nextInt();

		System.out.print(year + "年は・・・");

		/*
		 * ★ 入力された西暦がうるう年かどうかを判定するメソッドを作成し、結果を出力してください
		 * ※ 戻り値、メソッド名、引数は自由に設定してください
		 */
	}
}
