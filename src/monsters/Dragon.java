package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	public Dragon(String name, String weapon) {
		super(name, weapon);

		// HPと攻撃力を乱数で設定
		this.hp = Dice.get(270, 330);
		this.offensive = Dice.get(12, 18);
	}
}
