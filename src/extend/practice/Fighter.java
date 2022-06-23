package extend.practice;

public class Fighter extends Human {
	
	public Fighter() {
		this.name = "戦士";
		this.hp = 80;
		this.offensive = 4;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("人間のターン！");
		System.out.println("戦士が斧で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage;
	}
	
}
