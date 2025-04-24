package Main;

import java.util.ArrayList;

public class judge {
	//勝敗チェック用
	private final static boolean WIN = true;
	private final static boolean LOSE = false;
	
	private judge() {
	}
	
	public static boolean run(ArrayList<Integer> cpu,ArrayList<Integer> player) {
		for(int i = 0;i < 3;i++) {
			System.out.print(player.get(i) + "：");
			if (cpu.get(i) == player.get(i)) {
				System.out.println("HIT!!");
			}else if (cpu.contains(player.get(i))) {
				System.out.println("BLOW");
			}else {
				System.out.println("MISS");
			}
		}
		if(cpu.equals(player)) {
			return WIN;
		}
		return LOSE;
	}
}
