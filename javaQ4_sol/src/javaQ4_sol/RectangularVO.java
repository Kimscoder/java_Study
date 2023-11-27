package javaQ4_sol;

public class RectangularVO {
	public int garo;
	public int sero;
	
	public RectangularVO() {}
	
	public RectangularVO(int garo,int sero) {
		super();
		this.garo = garo;
		this.sero = sero;
	}
	
	public int surface() {
		return garo*sero;
	}
}
