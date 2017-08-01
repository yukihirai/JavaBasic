/*
 * Util.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice09.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 様々なメソッドを集めたJavaプログラムです。
 * util.Utilをインポートして使用してください。
 * 各メソッドの使い方に関しては、メソッドの説明を参照してください。
 *
 * @author Rhizome
 *
 */
public class Util {
	private Util() {
		/* インスタンス化を禁止するため、private化 */
	}

	/**
	 * 文字列を、1文字ずつ指定された秒数間隔をあけて表示します。
	 * @param message	表示する文字列
	 * @param millisecond	間隔をあけるミリ秒（1000で1秒）
	 */
	public static void dispMessageSlowly(String message, long millisecond) {
		char[] array = message.toCharArray();
		for (int i = 0; i < message.length(); i++) {
			System.out.print(array[i]);
			try {
				Thread.sleep(millisecond);
			} catch (InterruptedException e) {
				/* エラーが発生した場合はここにくる */
			}
		}
	}

	/**
	 * 配列の中身をシャッフルした結果を取得します。
	 * @param array	シャッフルしたい配列
	 * @return		シャッフルした結果の配列
	 */
	public static String[] shuffleArray(String[] array) {
		List<String> list = Arrays.asList(array);
		Collections.shuffle(list);
		return (String[]) list.toArray();
	}

	/**
	 * 数字を文字列に変換します。
	 * 変換できなかった場合は、""《空文字》にします
	 * @param number	文字列へ変換する数字
	 * @return 文字列への変換結果
	 */
	public static String intToString(int number) {
		String value = "";
		try {
			value = String.valueOf(number);
		} catch(Exception e) {
			// エラーだった場合は、デフォルト値のまま
		}
		return value;
	}

	/**
	 * 渡された数字から、トランプの札を取得します
	 * @param number カードに変換する数字
	 * @return トランプカードへの変換結果
	 */
	public static String intToTrumpCard(int number) {
		String[] card = new String[2];

		String suit = "ジョーカー";
		switch(number / 13) {
		case 0:
			suit = "スペード";
			break;
		case 1:
			suit = "ハート";
			break;
		case 2:
			suit = "ダイヤ";
			break;
		case 3:
			suit = "クラブ";
			break;
		default:
			// 上記以外は、全てジョーカーとして扱う
		}
		card[0] = suit;
		card[1] = String.valueOf(number % 13 + 1);

		return card[0] + "-" + card[1];
	}
}
