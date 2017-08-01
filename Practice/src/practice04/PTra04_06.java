package practice04;
/*
 * PTra04_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra04_06 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ★ int型の変数inputを宣言して-1で初期化してください


		// ★ int型の変数totalを宣言して0で初期化してください


		// ★ 変数inputが0では無い場合に繰り返し処理を行う条件式を記述してください
		while () {
			// ①
			System.out.println("****************************************");
			System.out.println("　1:コーヒー　　　　　120円");
			System.out.println("　2:水　　　　　　　　 89円");
			System.out.println("　3:お菓子　　　　　　230円");
			System.out.println("　4:雑誌　　　　　　　420円");
			System.out.println("　5:洋服　　　　　　　980円");
			System.out.println("　6:サンダル　　　　　480円");
			System.out.println("****************************************");
			System.out.println("　0:会計");

			System.out.println();

			System.out.println("カゴに入れる商品を選んでください");

			// ★ 変数inputに、コマンドプロンプトで入力した数値が入るようにしてください
			// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はエラーで良いです


			// ★ 0が選択された、かつ変数totalの値が0だった場合は「カゴに何も入っていません」と出力し、①へ戻ってください


			// ★ 0が選択された、かつ変数totalの値が0よりも大きい場合は、会計に進んでください


			// ★ 0～6以外の数字が入力されていた場合は、「売ってる商品から選んでください」と出力し、①へ戻ってください


			// ★ 1～6が入力されている場合は、対象の金額を変数totalに加算してください


		}

		// ****会計処理****
		// ★ int型の変数payを宣言して、0で初期化してください


		// ★ 変数payがtotalを超えるまで繰り返し処理を行う条件式を記述してください
		while () {
			// ②
			System.out.println("****************************************");
			System.out.println("合計金額：" + total + "円");
			System.out.println("投入金額：" + pay + "円");
			System.out.println("****************************************");

			System.out.println();

			System.out.println("お金を入れてください");
			System.out.println("　1: 5000円");
			System.out.println("　2: 1000円");
			System.out.println("　3:  500円");
			System.out.println("　4:  100円");
			System.out.println("　5:   50円");
			System.out.println("　6:   10円");

			// ★ 変数inputに、コマンドプロンプトで入力した数値が入るようにしてください
			// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はエラーで良いです


			// ★ 1～6以外の数字が入力されていた場合は、「ちゃんとしたお金を入れてください」と出力して、②へ戻ってください


			// ★ 入力された値に対応した金額をpayに加算してください


		}

		// ★ int型の変数changeを宣言して、payからtotalを引いた数で初期化してください


		System.out.println(change + "円のお返しです。またのご利用お待ちしております。");
	}
}
