package Cpu;

import java.util.ArrayList;

public class RandomNumber  {
	private ArrayList<Integer> list;
	
	private RandomNumber() {
		list = new ArrayList<Integer>();
		this.addNum();
		this.addNum();
		this.addNum();
	}
		
	public ArrayList<Integer> getList() {return this.list;}

	public static RandomNumber create() {
		return new RandomNumber();
	}
	
	private void addNum() {
		while(true) {
			int num = new java.util.Random().nextInt(6) + 1;
			if(!list.contains(num)) { //すでに登録されていないか確認
				this.list.add(num);
				break;
			}
		}			
	}
}
