package chapter4Of7Rpg;

public class LastBoss extends Human {
    //コンストラクタ
    public LastBoss() {
        super.setName("らすぼす");
        super.setGender(1);
        super.setLength(210);
        super.setWeight(120);
        super.setVitality(500);
        super.setMagic(40);
    }

    public void specialEvilAttack(Human target) {
        String name = super.getName();
        System.out.println(name + " の 攻撃");
        System.out.println(name + " の 邪悪な 必殺技が 炸裂した！");

        target.setVitality(target.getVitality() - 30);
        System.out.println(target.getName() + " は 30 のダメージをうけた");

        super.setVitality(super.getVitality() - 10);
        System.out.println(name + " の 体力は" + super.getVitality() + "になった");
        System.out.println("");
    }

}
