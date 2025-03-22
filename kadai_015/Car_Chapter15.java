package kadai_015;

public class Car_Chapter15 {
	//フィールド作成
	private int gear;//ギアデータ
	private int speed;//スピード
	
	//コンストラクタ（初期化処理）
	public Car_Chapter15() {
		this.gear = 1;//初期値1
		this.speed = 10;//初期値10
	}
	
	//メソッド記入
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		switch(gear) {
		case 1 : speed = 10;break;
		case 2 : speed = 20;break;
		case 3 : speed = 30;break;
		case 4 : speed = 40;break;
		case 5 : speed = 50;break;
		default: speed = 10;break;
	
		}
		System.out.println("ギア" + gear + "に切り替わりました");
		
	}
	public void run() {
		System.out.println("時速：" + speed + "kmです");
	}

}
