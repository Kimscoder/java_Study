package java_example;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[10];//int 뒤에 바로 [] 
		
		System.out.println(a[4]);// 0

		a[4]=100;
		
		System.out.println(a[4]);// 100
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		System.out.println(a[9]);
	}

}
