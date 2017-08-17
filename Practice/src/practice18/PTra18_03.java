/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_03 {



	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> playerList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                String[] stringList = line.split(",", 0);

                Player player = new Player();

                player.position = stringList[0];
                player.name = stringList[1];
                player.country = stringList[2];
                player.team = stringList[3];

                playerList.add(player);


            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }


		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

        
        for (int i = playerList.size()-1; i >=0 ; i--) {
        	if(playerList.get(i).getTeam().equals("レアル・マドリード") || playerList.get(i).getTeam().equals("バルセロナ")) {
        		System.out.println(playerList.get(i).getTeam());
        		playerList.remove(i);
        	}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player player : playerList) {
            System.out.println(player.toString());
	    }


	}
}
