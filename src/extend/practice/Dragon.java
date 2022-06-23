package extend.practice;

public class Dragon extends Monster {
	
	public Dragon() {
		this.name = "ドラゴン";
		this.hp = 100;
		this.offensive = 5;
	}
	
	Rand r = new Rand();
	
	@Override
	void attack(Living target) {
		int damage = this.offensive * r.get(10);
		System.out.println("モンスターのターン！");
		System.out.println("ドラゴンが炎で攻撃！" + target.name + "に" + damage + "のダメージを与えた。");
		target.hp -= damage;
	}
	
}
