

package bases;

import utils.Dice;

// 人間を表現する抽象クラス
	public abstract class Human extends Living {

		// コンストラクタ
		public Human(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int random = Dice.get(1,10);
			int attackPower = getOffensive() * random;
			// 相手のHPをダメージ値だけ減らす
			int HumResidualhp = getHp() - attackPower;
			// 自分の攻撃力を1だけ減らす
			int HumResidualOffensive = getOffensive() - 1;
			// コンソールにステータスを表示
			System.out.println();

		}
	}