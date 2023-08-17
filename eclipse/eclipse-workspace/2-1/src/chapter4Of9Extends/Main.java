package chapter4Of9Extends;

public class Main {
	// mainメソッドなどで、以下のように定義
	HogeEmployee be = new HogeEmployee(10192, "佐藤優輝");

	// ③挙動確認: thisを指定せずに格納する その1
	boolean isTrainee;
	if(empId!=10192)
	{
		isTrainee = true;
	}else
	{
		isTrainee = false;
	}System.out.println(this.isTrainee?"研修生です":"研修生ではありません");
}}
