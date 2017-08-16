/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

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



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(playerList);
        
        for (int i = 0; i < playerList.size(); i++) {
			if(playerList.get(i).getPosition().equals("gk"));{
				System.out.println(playerList.get(i).toString());
			
		}
//            System.out.println(playerList.toString());
	    }
	}
}
