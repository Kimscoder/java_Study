package com.java.dto;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.java.comparator.ScoreComparator;

public class example_Se {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ScoreVO> set = new TreeSet<ScoreVO>();//순서 Tree(대신 Comparable을 사용해야함) 고정 Hash
		Set<ScoreVO> treesetByComparator
			= new TreeSet<ScoreVO>(new ScoreComparator());
		
		for(int i =0; i<3; i++) {
			ScoreVO score1 = new ScoreVO();
			score1.input();
			set.add(score1);
		}
		
		Iterator<ScoreVO> it = set.iterator();
		
		while(it.hasNext()) {
			it.next().printScore();
		}
		
		System.out.println("--------------------------");
		
		it = treesetByComparator.iterator();
		while(it.hasNext()) {
			it.next().printScore();
		}
	}
	

}
