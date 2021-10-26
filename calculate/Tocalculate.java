package com.calculate;

import com.calculatearea.*;

public class Tocalculate {
	

	public static void main(String[] args) {
		Addition a = new Addition();
		Subtraction b=new Subtraction();
		Multiplication c=new Multiplication();
		System.out.println(a.addNos(2,3));
		System.out.println(b.subtractNos(3,1));
		System.out.println(c.mulNos(2,2));
		Rectangle r=new Rectangle();
		Square s=new Square();
		SquarePerimeter sp=new SquarePerimeter();
		RectanglePerimeter rp=new RectanglePerimeter();
		
		System.out.println(s.areaSq(4));
		System.out.println(r.rArea(4, 4));
		System.out.println(sp.sPeri(4));
		System.out.println(rp.rPeri(4, 4));
		
		
	}

}
