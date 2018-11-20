package com.jockey.java.runboo.basic;

import com.jockey.java.runboo.basic.FreshJuice.FreshJuiceSize;

public class EnumFreshJuice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreshJuice juicePlease = new FreshJuice();
		juicePlease.size = FreshJuiceSize.MEDIUM;
		
		System.out.println(juicePlease.size);
	}

}

class FreshJuice{
	enum FreshJuiceSize{SMALL,MEDIUM,LARGE};
	FreshJuiceSize size;
}