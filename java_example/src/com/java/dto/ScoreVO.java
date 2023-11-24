package com.java.dto;
//package가 다르면 앞에 설정을 해줘야함
public class ScoreVO {
	
    public String name;
    public int math;
    public int kor;
    public int eng;
    public int scien;
    
    public int total() {
    	return kor+eng+math+scien;
    }
    public float evg() {
    	return ((int)(total()/4f*100+0.5))/100f;
    }
}
