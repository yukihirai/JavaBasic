package practice04;
/*
 * PTra04_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_04 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ★ int型の変数mapを宣言して、100で初期化してください
        int map=100;

		// ★ int型の変数progressを宣言して、0で初期化してください
        int progress=0;

		System.out.println("このスゴロクは、" + map + "マスです。");
		System.out.println("=========< START >==========");

		// ★ 変数progressが変数mapの数より少ない限り繰り返しを行う条件式を記述してください
		while (map>progress) {

			System.out.println("サイコロを振ります。Enterを押してください");

			// プレイヤーがEnterを押すのを待つ
			scanner.nextLine();

			// サイコロを振ります。0～6未満の数がランダムで変数diceに代入されます
			int dice = new java.util.Random().nextInt(6);
			// 0～5にしかならないのでサイコロっぽくするには、+1を行います
			dice = dice + 1;

			// ★ サイコロを振って出た目を、変数progressに加算してください
            progress+=dice;

			// ★ 「残り##マス」と出力してください（##には、残りマスの数を入れてください）
            System.out.println("残り"+(map-progress)+"マス");
		}

		System.out.println("=========< GOAL >==========");
		System.out.println("おつかれさまでした。");
	}
}
