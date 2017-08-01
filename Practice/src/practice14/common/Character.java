/*
 * Character.java
 *   作成	IT-College	2016
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice14.common;

import java.util.Random;

/**
 *登場するキャラクターの情報とデフォルトの行動を設定した抽象クラスです
 * @author rhizome
 *
 */
public abstract class Character {

	/** 名前 */
	private String name = "モンスター";

	/** 体力 */
	private int hp;

	/** 力 */
	private int power;

	/** 防御力 */
	private int endurance;

	/**
	 * 体力、攻撃力、防御力の初期値を設定しつつ、Characterインスタンスを生成します
	 * @param hp
	 * @param attack
	 * @param defence
	 */
	public Character(int hp, int power, int endurance) {
		this.name = this.setCharacterName();
		this.hp = hp;
		this.power = power;
		this.endurance = endurance;
	}

	/**
	 * 名前を取得します
	 * @return 名前
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 力を取得します
	 * @return	力の値
	 */
	public int getPower() {
		return this.power;
	}

	/**
	 * 耐久を取得します
	 * @return	耐久の値
	 */
	public int getEndurance() {
		return this.endurance;
	}

	/**
	 * キャラクター情報を表示します
	 * @return
	 */
	public String showParameter() {
		StringBuilder str = new StringBuilder();

		str.append("名　前：" + this.name);
		str.append("\n");
		str.append("体　力：" + this.hp);
		str.append("\n");
		str.append("　力　：" + this.power);
		str.append("\n");
		str.append("耐　久：" + this.endurance);

		return str.toString();
	}

	/**
	 * 戦闘を行います。負の数が返ってきた場合、逃げるを選択したことになります
	 * @param defence	攻撃を受ける側の耐久
	 * @return	最終的に計算されたダメージ量
	 */
	public int battle(int defence) {
		Random random = new Random();
		int num = random.nextInt(100);
		int rate = this.getEscapeRate();

		// 設定された確率で逃げる
		if (num < rate) {
			return -1;
		} else {

			// ダメージの算出（0ダメージにはならないようにする）
			int dam = this.damage(defence);
			if (dam <= 0) {
				dam = 1;
			}
			return dam;
		}
	}

	/**
	 * 受けたダメージ分、HPを減らす。
	 * HPが0以下になった場合は、倒されたと判断し、falseを返す
	 * @param damage	受けるダメージ
	 * @return	true -> 生き残っている場合、false -> 倒された場合
	 */
	public boolean dealsDamage(int damage) {
		this.hp -= damage;
		if (this.hp <= 0) {
			return false;
		}
		return true;
	}

	/**
	 * このモンスターの名前を取得します
	 * @return 設定する名前
	 */
	protected abstract String setCharacterName();

	/**
	 * このモンスターが逃げる確率を設定します。
	 * 例えば、10%で逃げる場合は、10を設定します
	 * @return	逃げる確率
	 */
	protected abstract int getEscapeRate();

	/**
	 * モンスター毎に攻撃判定を行います。
	 * 例えば、通常攻撃・スキル・魔法などモンスターごとに行動割合を決定し、最終的に計算されたダメージ量を判定します
	 * @param defence 攻撃を受ける側の耐久
	 * @return	最終的に計算されたダメージ量
	 */
	protected abstract int damage(int defence);
}
