package day02;

class Lec02<V,T>{
	V su1;
	T su2;
	
	V getSu1(){return su1;}
	T getSu2() {return su2;}
	void setSu1(V su1) {this.su1=su1;}
	void setSu2(T su2) {this.su2=su2;}
}

public class Ex02 {

	public static void main(String[] args) {
		Lec02<String,Integer> you;
		you=new Lec02<String,Integer>();
		you.setSu1("aaaaa");
		you.setSu2(1234);
		String su1=you.getSu1();
		int su2=you.getSu2();

	}

}
