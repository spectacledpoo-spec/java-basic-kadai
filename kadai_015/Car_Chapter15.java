package kadai_015;

public class Car_Chapter15 {
	
	    // フィールド（内部データ）
	    private int gear = 1;  // 1速から5速のギア（初期値1）
	    private int speed = 10; // ギアチェンジ後の速度（初期値10）

	    // ギアの値により速度を変えるメソッド
	    public void changeGear(int afterGear) {
	        this.gear = afterGear;

	        // ギアに応じた速度を設定
	        switch (this.gear) {
	            case 1 -> this.speed = 10;
	            case 2 -> this.speed = 20;
	            case 3 -> this.speed = 30;
	            case 4 -> this.speed = 40;
	            case 5 -> this.speed = 50;
	            default -> this.speed = 10; // 上記以外のギアの場合
	        }
	    }

	    // ギアチェンジ後の速度を表示するメソッド
	    public void run() {
	        System.out.println("ギア1から" + this.gear + "に切り替えました");
	        System.out.println("速度は時速" + this.speed + "kmです");
	    }



}
