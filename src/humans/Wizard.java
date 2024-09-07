package humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		// 引数にname, weaponの2つだけを持つコンストラクタを定義します。
		super(name, weapon);
		// HPと攻撃力の乱数を設定
		this.hp = Dice.get(120, 180);
		this.offensive = Dice.get(12, 18);
	}
}
