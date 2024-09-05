package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
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
		// ヒットポイントの値(70 ～ 130)は乱数を振って決定します。
		int diceHp = Dice.get(70, 130);
		System.out.println(diceHp);
		return hp;
	}

	public int getOffensive() {
		// 攻撃力の値(5～11)は乱数を振って決定します。
		int diceOffensive = Dice.get(5, 11);
		return diceOffensive;
	}
}
