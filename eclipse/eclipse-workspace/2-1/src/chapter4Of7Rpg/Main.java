package chapter4Of7Rpg;

public class Main {
	// メイン処理
    public static void main(String[] args) {
        Yusha Yusha = new Yusha(); //勇者オブジェクトを生成
        Wizard wizard = new Wizard(); //魔法使いオブジェクトを生成
        Cleric crelic = new Cleric(); //僧侶オブジェクトを生成
        LastBoss lastBoss = new LastBoss(); //ラスボスオブジェクトを生成

        //敵があらわれた！
        System.out.println(lastBoss.getName() + " が 現れた！");

        //バトル開始
        Yusha.specialAttack(lastBoss); //勇者の攻撃
        wizard.magicAttack(lastBoss); //魔法使いの攻撃
        lastBoss.specialEvilAttack(Yusha); //ラスボスの攻撃
        crelic.healingMagic(Yusha); //僧侶が勇者を回復

        //回復アイテムを使用
        System.out.println(Yusha.getName() + " は 薬草　を使った");
        Yusha.eatFood("薬草");
        System.out.println(wizard.getName() + " は 魔法の水　を使った");
        wizard.eatFood("魔法の水");
        System.out.println("");

        //ステータス表示
        showStatus(Yusha);
        showStatus(wizard);
        showStatus(crelic);
        showStatus(lastBoss);

    }

    //ステータス表示メソッド
    private static void showStatus(Human target) {
        System.out.println("- " + target.getName() + " の ステータス---");
        if (target.getGender() == 1) {
            System.out.println("性別 ： 男");
        } else {
            System.out.println("性別 ： 女");
        }
        System.out.println("身長 ： " + target.getLength());
        System.out.println("体重 ： " + target.getWeight());
        System.out.println("体力 ： " + target.getVitality());
        System.out.println("魔力 ： " + target.getMagic());
        System.out.println("");

    }
}
