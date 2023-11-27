package javaQ4_sol;

import java.util.Scanner;

public class PolyMain {
	
	
	public static void main(String[] args) {
		SurfaceSolution main =new SurfaceSolution();
		do {
			main.input();
			
			main.process();
			
			main.output();
		}while(true);
	}
	
}
