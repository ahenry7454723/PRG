package monsters;

import bases.Monster;
import utils.Dice;
public class Dragon extends Monster {
	
	public Dragon(String name, String weapon) {
		super(name,weapon);
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
		// ヒットポイントの値(270 ～ 330)は乱数を振って決定します。
		int diceHp = Dice.get(270, 330);
		System.out.println(diceHp);
		return hp;
	}

	public int getOffensive() {
		// 攻撃力の値(12～18)は乱数を振って決定します。
		int diceOffensive = Dice.get(12, 18);
		return diceOffensive;
	}
}
