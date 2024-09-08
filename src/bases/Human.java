package bases;

import utils.Dice;

// 人間を表現する抽象クラス
public abstract class Human extends Living {

    // コンストラクタ
    public Human(String name, String weapon) {
        // Livingクラスで定義したコンストラクタを利用する
        super(name, weapon);
    }

    // attackメソッドのオーバーライド
    @Override
    public void attack(Living target) {
        // 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
        int diceRoll = Dice.get(1, 10);
        // サイコロの結果に攻撃力を乗算してダメージを計算
        int damage = this.offensive * diceRoll;
        // 相手のHPをダメージ値だけ減らす
        target.setHp(target.getHp() - damage); 

        // 自分の攻撃力を1だけ減らす
        this.offensive -= 1; // 攻撃後、攻撃力を1だけ減らす

        // コンソールにステータスを表示
        System.out.println(getName() + "が" + getWeapon() + "で攻撃！");
        System.out.println(target.getName() + "に" + damage + "のダメージを与えた！");
    }
}
