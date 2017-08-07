package practice10;

/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
        User us;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
        us = new User();

		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
        String scanner = new java.util.Scanner(System.in).nextLine();

		// ★ 入力された値を、String型の変数lineに格納してください
        String line = scanner;

		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
        String[] stringList = line.split(",", 0);

		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
        int num = Integer.parseInt(stringList[0]); 
        
        us.userId   = num;
        
        us.userNm   = stringList[1];
        
        us.mail     = stringList[2];
        
        us.passward = stringList[3];

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
        System.out.println(us.userId);
        
        System.out.println(us.userNm);
        
        System.out.println(us.mail);
        
        System.out.println(us.passward);

	}
}
