
public class Class1 {

	public Class1() {
		
	}
	
	public void method1() {
		System.out.println("It works.");
	}

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2(class1);
		class2.method2();
	}

}

class Class2 {
	
	public Class1 class1;
	
	public Class2(Class1 class1) {
		this.class1 = class1;
	}
	
	public void method2() {
		class1.method1();
	}
}
