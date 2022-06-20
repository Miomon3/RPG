package extend.practice;

public class Brave extends Human {
	
	public Brave() {
		this.name = "勇者";
		this.hp = 100;
		this.offensive = 5;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("人間のターン！");
		System.out.println("勇者が剣で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
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
