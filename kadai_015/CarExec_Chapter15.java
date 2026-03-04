package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 1. 車クラスのインスタンス（実体）を生成
        Car_Chapter15 myCar = new Car_Chapter15();

        // 2. ギアを3に切り替える（メソッドの呼び出し）
        int gearToChange = 3;
        myCar.changeGear(gearToChange);

        // 3. 走行した結果（速度）を表示する
        myCar.run();
    }
}
