package com.java.comparator;

import java.util.Comparator;

import com.java.dto.ScoreVO;

public class ScoreComparator implements Comparator<ScoreVO> {

	@Override
	public int compare(ScoreVO score1, ScoreVO score2) {
		
		return score2.total()-score1.total();
	}

}
