package day02;

class Arr {
	private Object[] arr=new Object[0];
	
	void removeItem(Object item) {
		int idx=-1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				idx=i;
				break;
			}
		}
		if(idx!=-1) {
			remove(idx);
		}
	}
	
	void remove(int idx) {
		Object[] arr2=new Object[arr.length-1];
		for(int i=0; i<idx; i++) {
			arr2[i]=arr[i];
		}
		for(int i=idx+1; i<arr.length; i++) {
			arr2[i-1]=arr[i];
		}
		arr=arr2;
	}
	int size() {
		return arr.length;
	}
	Object get(int idx) {
		return arr[idx];
	}
	void add(Object su) {
		Object[] arr2=new Object[arr.length+1];
		for(int i=0; i<arr.length; i++) {
			arr2[i]=arr[i];
		}
		arr2[arr2.length-1]=su;
		arr=arr2;
	}
}

public class Ex11 implements Cloneable {
	static Arr module;

	public static void main(String[] args) throws CloneNotSupportedException {
		Arr arr=new Arr();
		arr.add(1111);
		arr.add(2222);
		arr.add(3333);
		arr.add(4444);
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
