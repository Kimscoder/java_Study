package com.java.colletion;

import java.util.ArrayList;
import java.util.List;//list마다의 특징이 다르기 때문에 기본적으로 import됨
//instance는 구체적, reference 비구체적
public class ExampleCollection {
	
	public static void main(String[] args) {
		
		List list =new ArrayList();
		list.add(1);
		list.add(2);
		list.add('a');
		list.add("a");
		list.add(false);
		list.add(1.0f);
		list.add(1.0);
		list.add(1l);
		
		System.out.println("리스트 크기 : "+list.size());
		
		for(int i =0; i<list.size();i++) {
			System.out.println(i+"번지 값 : "+list.get(i));
		}
	}
}	
