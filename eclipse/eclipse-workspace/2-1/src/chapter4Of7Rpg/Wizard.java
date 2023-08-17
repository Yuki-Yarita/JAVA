package chapter4Of7Rpg;

public class Wizard extends Human {

    //コンストラクタ
    public Wizard() {
        super.setName("魔法使い");
        super.setGender(1);
        super.setLength(170);
        super.setWeight(60);
        super.setVitality(20);
        super.setMagic(50);
    }

    public void magicAttack(Human target) {
        String name = super.getName();
        System.out.println(name + " の 攻撃");
        System.out.println(name + " は 攻撃呪文 を 唱えた！");

        target.setVitality(target.getVitality() - 20);
        System.out.println(target.getName() + " に 20 のダメージを 与えた");

        super.setMagic(super.getMagic() - 10);
        System.out.println(name + " の 魔力は " + super.getMagic() + " になった");
        System.out.println("");
    }

}
