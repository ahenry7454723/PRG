package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human{
	
	public Fighter(String name, String weapon) {
		// 引数にname, weaponの2つだけを持つコンストラクタを定義します。
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
		// ヒットポイントの値(240 ～ 300)は乱数を振って決定します。
		int diceHp = Dice.get(240, 300);
		System.out.println(diceHp);
		return hp;
	}

	public int getOffensive() {
		// 攻撃力の値(17～23)は乱数を振って決定します。
		int diceOffensive = Dice.get(17, 23);
		return diceOffensive;
	}
}
