package extend.practice;

public class Slime extends Monster{
	
	public Slime() {
		this.name = "スライム";
		this.hp = 50;
		this.offensive = 3;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("モンスターのターン！");
		System.out.println("スライムが体当たりで攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
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
