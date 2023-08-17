package chapter4Of10Sample;

import java.util.Objects;

public class InstanceOfSato {
	private String firstName;

	public InstanceOfSato(String firstName) {
		this.firstName = firstName;
	}
	
	//変数（フィールド変数）
	private int id = 0;
	
	//static変数（クラス変数）
	private static int staticVarId = 0;
	
	//IDをインクリメント
	public void incrementId() {
		this.id++;
		System.out.println("id: var          = " + this.id);
		InstanceOfSato.staticVarId++;
		System.out.println("id: static var   = " + InstanceOfSato.staticVarId);
	}
	

	/* ----- 自動生成部分 ----- */
	@Override
	public int hashCode() { //hashCode()にて対象の値のハッシュコードを取得する
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) { //equals()メソッドにてインスタンスが等価であるかのチェックを実施
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof InstanceOfSato)) {
			return false;
		}
		InstanceOfSato other = (InstanceOfSato) obj;
		return Objects.equals(firstName, other.firstName);
	}
	/* ----- 自動生成部分 ----- */
}
