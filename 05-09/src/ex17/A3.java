package ex17;

public class A3 extends A1{

	public static void main(String[] args) {
		A3 o = new A3();
		System.out.println(o.a); // 접근가능
		System.out.println(o.b); // 접근가능
		System.out.println(o.c); // 접근가능
		//System.out.println(o.d); // 접근불가능
  
		o.am(); // 접근가능
		o.bm(); // 접근가능
		o.cm(); // 접근가능
		//o.dm(); // 접근불가능
	}
}
