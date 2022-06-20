package extend.practice;

public class Oak extends Monster {
	
	public Oak() {
		this.name = "オーク";
		this.hp = 80;
		this.offensive = 4;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("モンスターのターン！");
		System.out.println("オークが槍で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
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
