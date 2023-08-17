package chapter4Of7Rpg;

public class Cleric extends Human {
    //コンストラクタ
    public Cleric() {
        super.setName("僧侶");
        super.setGender(2);
        super.setLength(160);
        super.setWeight(50);
        super.setVitality(20);
        super.setMagic(70);
    }

    //かいふくじゅもん
    public void healingMagic(Human target) {
        String name = super.getName();
        System.out.println(name + " は 回復呪文を唱えた！");

        target.setVitality(target.getVitality() + 20);
        System.out.println(target.getName() + " の 体力は " + target.getVitality() + "　になった");

        target.setMagic(super.getMagic() - 10);
        System.out.println(name + " の 魔力は " + super.getMagic() + "　になった");
        System.out.println("");
    }

}
