package practice11;
/*
 * PTra11_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_01 {
	public static void main(String[] args) {

		/*
		 * 以下のプログラムではコンパイルエラーが起きてしまいます
		 * ★ コンパイルが通るように修正してください
		 */
		Book book = new Book();
		book.tilte = "スッキリわかるJava入門";
		book.author = "中山清喬／国本大悟";
		book.price = 2600;
		book.pageSize = 657;
		book.publication = "インプレス";

		// 本の情報を出力します
		System.out.println(book.dispBookInfo());
	}
}
