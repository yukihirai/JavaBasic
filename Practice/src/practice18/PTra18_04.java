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

        int gkCount = 0;
        int dfCount = 0;
        int mfCount = 0;
        int fwCount = 0;

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(playerList);
        
        for (int a = 0; a < playerList.size(); a++) {
			if(playerList.get(a).getPosition().equals("GK")){
				
				System.out.println(playerList.get(a));
				gkCount++;
			if(gkCount == 1){
				break;
			}
			}
		}
        Collections.shuffle(playerList);
			
		for (int b = 0; b < playerList.size(); b++) {
			if(playerList.get(b).getPosition().equals("DF")){
						
				System.out.println(playerList.get(b));
		        dfCount++;
			if(dfCount == 4) {
		    	break;
		    }
			}
		}
		Collections.shuffle(playerList);
			
		for (int c = 0; c < playerList.size(); c++) {
			if(playerList.get(c).getPosition().equals("MF")){
								
				System.out.println(playerList.get(c));
				mfCount++;
			if(mfCount == 4) {
				break;
			}
			}
		}
		Collections.shuffle(playerList);
			
		for (int d = 0; d < playerList.size(); d++) {
			if(playerList.get(d).getPosition().equals("FW")){
										
				System.out.println(playerList.get(d));
				fwCount++;
			if(fwCount == 2) {
				break;
			}
			}
		}
//		Collections.shuffle(playerList);
//										
//		for (int e = 0; e < playerList.size(); e++) {
//	        if(playerList.get(e).getPosition().equals("DF")){
//												
//				System.out.println(playerList.get(e));
//				break;
//	        }
//		}
//		Collections.shuffle(playerList);
//	        
//		for (int f = 0; f < playerList.size(); f++) {
//			if(playerList.get(f).getPosition().equals("MF")){
//														
//				System.out.println(playerList.get(f));
//				break;
//			}
//		}
//		Collections.shuffle(playerList);
//			
//		for (int g = 0; g < playerList.size(); g++) {
//			if(playerList.get(g).getPosition().equals("MF")){
//																
//				System.out.println(playerList.get(g));
//				break;
//			}
//		}
//		Collections.shuffle(playerList);
//			
//		for (int h = 0; h < playerList.size(); h++) {
//			if(playerList.get(h).getPosition().equals("MF")){
//																		
//				System.out.println(playerList.get(h));
//				break;
//			}
//		}
//		Collections.shuffle(playerList);
//			
//		for (int i = 0; i < playerList.size(); i++) {
//			if(playerList.get(i).getPosition().equals("MF")){
//																				
//				System.out.println(playerList.get(i));
//				break;
//			}
//		}
//		Collections.shuffle(playerList);
//			
//		for (int j = 0; j < playerList.size(); j++) {
//			if(playerList.get(j).getPosition().equals("FW")){
//																						
//				System.out.println(playerList.get(j));
//				break;
//			}
//		}
//		Collections.shuffle(playerList);
//			
//		for (int k = 0; k < playerList.size(); k++) {
//			if(playerList.get(k).getPosition().equals("FW")){
//																								
//				System.out.println(playerList.get(k));
//			    break;
//			}
//		
//		}
//            System.out.println(playerList.toString());
	 }
}
