package extend.practice;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;
	
	abstract void attack(Living target);
	
	abstract String getName();
	
	abstract int getHp();
}

    