package Chapter4Of6Constructor;

public class Businessman {
	//パラメーター
	private String name; //名前
	private int gender; //性別（１：男　２：女）
	private int length; //身長
	private int weight; //体重
	private String skill; //特技
	private String hobby; //趣味
	
	//コンストラクタ
	public Businessman() {
		this.name = "サラリーマン金太郎";
		this.gender = 1;
		this.length = 180;
		this.weight = 80;
		this.skill = "商談";
		this.hobby = "編み物";
	}
	
	//操作
	//営業メソッド
	public void sales() {
		System.out.println(this.name + "は外回りに行ってきます！");
	}
	
	//休憩メソッド
	public void rest() {
		System.out.println(this.name + "は" + this.hobby + "をして休憩しています。");
	}
		//特技getterメソッド
	public String skill() {
		return this.skill;
	}
}
