package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//クラスをインスタンス化
		Jyanken_Chapter28 game = new Jyanken_Chapter28();

		//getMyChoice() を呼び出して自分の手を取得
		String myHand = game.getMyChoice();
		
		//getRandom() を呼び出して相手の手を取得
		String opponentHand = game.getRandom();

		//playGame(自分の手, 相手の手) を呼び出す
		game.playGame(myHand, opponentHand);
	}

}
