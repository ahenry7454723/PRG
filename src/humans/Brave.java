// humansパッケージ内に作成します。
package humans;

import bases.Human;
import utils.Dice;

// Humanクラスを継承します。
public class Brave extends Human {

	public Brave(String name, String weapon) {
		// 引数にname, weaponの2つだけを持つコンストラクタを定義します。
		super(name, weapon);
	}
	
	@Override
	public String getName() {
		String name = getName();
		return name;
	}

	public String getWeapon() {
		String weapon = getWeapon();
		return weapon;

	}

	public int getHp() {
		// ヒットポイントの値(170 ～ 230)は乱数を振って決定します。
		int diceHp = Dice.get(170, 230);
		System.out.println(diceHp);
		return hp;
	}

	public int getOffensive() {
		// 攻撃力の値(7～13)は乱数を振って決定します。
		int diceOffensive = Dice.get(7, 13);
		return diceOffensive;
	}

}
