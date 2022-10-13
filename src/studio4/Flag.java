package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0, 33.34);
		StdDraw.clear();
		StdDraw.setPenColor(0, 0, 153);
		StdDraw.filledRectangle(16.67, 16.67, 16.67, 16.67-4.1674);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(83.33, 16.67, 16.67, 16.67-4.1675);
		
		
	}
}