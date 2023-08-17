package check;

import constants.Constants;


public class Main {

//	課題①
//	【Main.java】にてフィールド変数firstNameとlastNameを宣言し、
//	firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
//	なお、変数のアクセス修飾子は「private」とする。
	private String firstName = "Yarita";
	private String lastName = "Yuki";

	public static void main(String[] args) {

//		課題②
//		【Main.java】にてfirstNameとlastNameを引数で受け取って、
//		連結して表示させるメソッド「printName」を作成しなさい。
//		作成した関数のアクセス修飾子は「private」とする。
		Main main = new Main();
		main.printName(main.firstName, main.lastName);
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		rp.introduce();
		
	}

	private void printName(String firstName, String lastName) {
		
		System.out.println(firstName + lastName);

//		課題③
//		【Main.java】にてPetクラスとRobotPetクラスをインスタンス化して、下記の完成イメージを出力させなさい。	
	/*
	 * printNameメソッド→七海真弥 
	 * ■僕の名前はjava吉です 
	 * ■ご主人様はhogeです 
	 * ◇私はロボット。名前はR2D2。 
	 * ご主人様はルーク。
	 */
		
}
}
