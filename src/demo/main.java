package demo;

import java.util.ArrayList;
import java.util.List;

import bases.Human;
import bases.Monster;
import humans.Brave;
import humans.Fighter;
import humans.Wizard;
import monsters.Dragon;
import monsters.Oak;
import monsters.Slime;
import utils.Dice;

public class main {
	public static void main(String[] args) {

		System.out.println("★★ ==== 戦いの開始だ！！ ==== ★★");

		// Brave（勇者）, Fighter（戦士）, Wizard（魔法使い）クラスの各インスタンスを生成
		Brave brave = new Brave("沖田総司", "剣");
		Fighter fighter = new Fighter("金太郎", "斧");
		Wizard wizard = new Wizard("安倍晴明", "魔法");

		// 人間グループのリストを生成し、各インスタンスを追加
		List<Human> humans = new ArrayList<>();
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizard);

		// Slime（スライム）, Oak（オーク）, Dragon（ドラゴン）クラスの各インスタンスを生成
		Slime slime = new Slime("キングスライム", "体当たり");
		Oak oak = new Oak("オークキング", "槍");
		Dragon dragon = new Dragon("紅龍", "炎");

		// モンスターグループのリストを生成し、各インスタンスを追加
		List<Monster> monsters = new ArrayList<>();
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);

		// 現在の各グループの状態を一覧表示
		showGroupInfos(humans, monsters);

		// 第何回戦かを示すカウンター変数
		int count = 1;

		// 勝敗がつくまでループ
		while (true) {
			System.out.printf("\n★ 第%d回戦 ==========\n", count);

			System.out.println("\n[人間のターン！]\n");

			// 人間グループからランダムに1人選択
			Human selectedHuman = choiceHuman(humans);

			// モンスターグループからランダムに1人選択
			Monster selectedMonster = choiceMonster(monsters);

			// 選ばれた人間が選ばれたモンスターを攻撃
			selectedHuman.attack(selectedMonster);

			// モンスターのHPが0以下になれば、モンスターグループから削除
			if (selectedMonster.getHp() <= 0) {
				System.out.println(selectedMonster.getName() + "は倒れた！");
				monsters.remove(selectedMonster);
			}

			// モンスターグループに誰もいなくなれば人間グループの勝利
			if (monsters.isEmpty()) {
				System.out.println("人間グループの勝利！");
				break;
			}

			System.out.println("\n[モンスターのターン！]\n");

			// モンスターグループからランダムに1人選択
			selectedMonster = choiceMonster(monsters);

			// 人間グループからランダムに1人選択
			selectedHuman = choiceHuman(humans);

			// 選ばれたモンスターが選ばれた人間を攻撃
			selectedMonster.attack(selectedHuman);

			// 人間のHPが0以下になれば、人間グループから削除
			if (selectedHuman.getHp() <= 0) {
				System.out.println(selectedHuman.getName() + "は倒れた！");
				humans.remove(selectedHuman);
			}

			// 人間グループに誰もいなくなれば人間グループの敗北
			if (humans.isEmpty()) {
				System.out.println("モンスターグループの勝利！");
				break;
			}

			// 現在の各グループの状態を一覧表示
			showGroupInfos(humans, monsters);

			// ループ変数を1増やす
			count++;
		}

		// 最後に各グループの状態を一覧表示してプログラム終了
		showGroupInfos(humans, monsters);
	}

	// 引数でもらった人間グループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Human choiceHuman(List<Human> humans) {
		Human human = humans.get(Dice.get(0, humans.size() - 1));
		System.out.printf("人間グループから 「%s」 のお出ましだ！\n", human.getName());
		return human;
	}

	// 引数でもらったモンスターグループリストからランダムに1人を選択し、その結果を戻り値とするメソッド
	public static Monster choiceMonster(List<Monster> monsters) {
		Monster monster = monsters.get(Dice.get(0, monsters.size() - 1));
		System.out.printf("モンスターグループから 「%s」 のお出ましだ！\n", monster.getName());
		return monster;
	}

	// 引数でもらった人間グループリストとモンスターグループリストのそれぞれの情報一覧を表示するメソッド
	public static void showGroupInfos(List<Human> humans, List<Monster> monsters) {
		System.out.println("\n## === グループ情報 === ##");
		System.out.printf("# [人間グループ]: %d人\n", humans.size());
		for (Human human : humans) {
			System.out.println(human);
		}

		System.out.printf("\n# [モンスターグループ]: %d人\n", monsters.size());
		for (Monster monster : monsters) {
			System.out.println(monster);
		}
	}
}

