package chapter4Of7Rpg;

public class Yusha extends Human {
	//コンストラクタ
    public Yusha() {
        super.setName("勇者");
        super.setGender(1);
        super.setLength(180);
        super.setWeight(70);
        super.setVitality(100);
        super.setMagic(5);
    }

    public void specialAttack(Human target) {
        String name = super.getName();
        super.setVitality(super.getVitality() - 20);
        System.out.println(name + " の 攻撃");
        System.out.println(name + " の 必殺技が 炸裂した！");

        target.setVitality(target.getVitality() - 50);
        System.out.println(target.getName() + " に 50 のダメージを 与えた");

        super.setVitality(super.getVitality() - 10);
        System.out.println(name + " の 体力は" + super.getVitality() + "になった");
        System.out.println("");
    }

}
