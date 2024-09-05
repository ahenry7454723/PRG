package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);
	}

	@Override
	public String getName() {
		String name = super.getName();
		return name;
	}

	public String getWeapon() {
		String weapon = super.getWeapon();
		return weapon;

	}

	public int getHp() {
		// ヒットポイントの値(170 ～ 230)は乱数を振って決定します。
		int diceHp = Dice.get(170, 230);
		System.out.println(diceHp);
		return hp;
	}

	public int getOffensive() {
		// 攻撃力の値(9～15)は乱数を振って決定します。
		int diceOffensive = Dice.get(9, 15);
		return diceOffensive;
	}
}
