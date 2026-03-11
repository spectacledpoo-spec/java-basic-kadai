package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		//入力できるようにする
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = "";

		//正しい入力まで繰り返す
		while(true) {
			input = scanner.next();
			
	        if(( input.equals("r") ) || ( input.equals("s") ) || ( input.equals("p") )) {
	        	break; // 正しければループを抜ける
	        }
	        
	        System.out.println("エラーです。r, s, pのいずれかを入力してください。");
		    	        
		}

		return input;
        
	}

	public String getRandom() {
		String[] hands = {"r", "s", "p"};
		int i = (int)Math.floor(Math.random() * 3);
		return hands[i];
				
	}

	public void playGame(String me, String you) {
		HashMap<String, String> handMap = new HashMap<>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		System.out.println("自分の手は" + handMap.get(me) + ",対戦相手の手は" + handMap.get(you));
		
		//勝敗の判定ロジック
		if (me.equals(you)) {
		    System.out.println("あいこです");
		} else if ((me.equals("r") && you.equals("s")) || ((me.equals("s") && you.equals("p"))) || ((me.equals("p") && you.equals("r")))) {
		    System.out.println("自分の勝ちです");
		} else {
		    System.out.println("自分の負けです");
		}
	}
	
}
