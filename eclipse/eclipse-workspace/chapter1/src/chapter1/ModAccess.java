package chapter1;

public class ModAccess {

	// public変数 (どこからでもアクセス可能)
	public String pub_var = "publicだよ";

	// protected変数 (同一パッケージまたはサブクラスからアクセス可能)
	protected String prot_var = "protectedだよ";

	// パッケージプライベート変数 (同一パッケージからのみアクセス可能)
	String pack_var = "package privateだよ";

	// private変数 (同一クラス内からのみアクセス可能)
	private String pri_var = "privateだよ";

	// テストメソッド (クラス内部から全てのレベルのメンバーにアクセス)
	public void test() {
		// クラス内部では全てのレベルのメンバーにアクセス可
		System.out.println(this.pub_var);// public変数にアクセス
		System.out.println(this.prot_var);// protected変数にアクセス
		System.out.println(this.pack_var);// パッケージプライベート変数にアクセス
		System.out.println(this.pri_var);// private変数にアクセス
	}

	// メインメソッド (プログラムの実行がここから始まる)
	public static void main(String[] args) {
		ModAccess m = new ModAccess();// ModAccessクラスのインスタンスを作成
		m.test();// インスタンスのtestメソッドを呼び出す
	}

}
