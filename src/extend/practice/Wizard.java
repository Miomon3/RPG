package extend.practice;

public class Wizard extends Human {
	
	public Wizard() {
		this.name = "魔法使い";
		this.hp = 50;
		this.offensive = 3;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("人間のターン！");
		System.out.println("魔法使いが魔法で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage;
	}
	
	@Override
	String getName() {
		return this.name;
	}
	
	@Override
    int getHp() {
		return this.hp;
	}
	
}
