package Main;

import Cpu.RandomNumber;
import Player.Player;

public class Main {

	public static void main(String[] args) {
		/*
		 * 数当てゲームオブジェクト指向
		 */
		
		System.out.println("----MasterMind----");
		System.out.println("""
				相手が考えてる異なる3つの数字を予想して当ててください!
				入力した数と場所があっていたらHIT!!
				数のみがあっていたらBLOW
				あっていなかった場合はMISSとなります
				数字は1～6の整数でチャンスは3回です!
				""");
		
		//判定用
		boolean result = false;
		
		//cpuの値設定
		RandomNumber cpu = RandomNumber.create();
		
		for(int count = 0;count < 3;count++) {
			System.out.printf("---%d回目---\n",count + 1);
			
			//プレイヤーの値入力
			Player player = Player.create();
			
			//判定
			result = judge.run(cpu.getList(), player.getList());
			if(result) 
				break;
			
		}
		if (result) {
			System.out.println("WIN!!");
		}else {
			System.out.println("LOSE");
		}
	}

}
