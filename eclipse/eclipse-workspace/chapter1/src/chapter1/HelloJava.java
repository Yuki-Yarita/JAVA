package chapter1;

public class HelloJava {
	// インスタンス変数（フィールド）の定義
	private String message;

	// コンストラクタ（クラスのインスタンスを作成する時に呼ばれるメソッド）
	public void HelloJava() {
		message = "Hello, Java!"; // messageをHello, Java!で初期化
	}

	// messageをコンソールに表示するメソッド
	public void print() {
		System.out.println(message);
	}

	// メインメソッド（プログラムの実行がここから始まる）
	public static void main(String[] args) {
		HelloJava helloJava = new HelloJava(); // HelloJavaクラスのインスタンスを作成
		helloJava.HelloJava();
		helloJava.print(); // messageを表示するメソッドを呼び出す
	}

}
