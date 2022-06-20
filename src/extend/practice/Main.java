package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Living> listHuman = new ArrayList<>();
		listHuman.add(new Brave());
		listHuman.add(new Fighter());
		listHuman.add(new Wizard());
		
		List<Living> listMonster = new ArrayList<>();
		listMonster.add(new Slime());
		listMonster.add(new Oak());
		listMonster.add(new Dragon());
		
		for (int i = 0; ; i++) {
			
			int x = Rand.get(listHuman.size());
			int y = Rand.get(listMonster.size());
				
			if (i % 2 == 0) {
				listHuman.get(x).attack(listMonster.get(y));
			} else {
				listMonster.get(y).attack(listHuman.get(x));
			}
			
			for(int j = listHuman.size() - 1; j >= 0; j--) {
				if (listHuman.get(j).getHp() <= 0) {
					System.out.println(listHuman.get(j).getName() + "は倒れた。");
					listHuman.remove(j);
				}
			}
			
			for(int p = listMonster.size() - 1; p >= 0; p--) {
				if (listMonster.get(p).getHp() <= 0) {
					System.out.println(listMonster.get(p).getName() + "は倒れた。");
					listMonster.remove(p);
				}
			}
			
			if (listHuman.size() == 0) {
				System.out.println("モンスター達は勝利した！");
				break;
			} 
			
			if (listMonster.size() == 0) {
		    	System.out.println("勇者達は勝利した！");
		    	break;
		    }
		    
		}
	}

}
