package Player;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Player {
	private ArrayList<Integer> list;
	
	private Player() {
		list = new ArrayList<Integer>();
		this.scanNum(1);
		this.scanNum(2);
		this.scanNum(3);
	}
	
	public ArrayList<Integer> getList() {return this.list;}

	public static Player create() {
		return new Player();
	}
	
	private void scanNum(int i) {
		System.out.printf("%sつ目の値を入力してください\n",i);
		while(true) {
			try {
				int scan = new java.util.Scanner(System.in).nextInt();
				if (scan < 1 || 6 < scan) {
					throw new InputMismatchException("1～6の整数を入力してください");
				}
				if (list.contains(scan)) {
					throw new InputMismatchException("異なる値を入力してください");
				}
				list.add(scan);
				break;					
			} catch (NullPointerException e) {
				System.err.println("値を入力してください");
			} catch (InputMismatchException e) {
				if (e.getMessage() == null) {
					System.err.println("1～6の整数を入力してください");
				}else {
					System.err.println(e.getMessage());												
				}
			}
		}
	}
	
}
