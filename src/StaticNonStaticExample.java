
public class StaticNonStaticExample {

	
	int i=10;
	
	public static void main(String[] args) {
	StaticNonStaticExample stat =  new StaticNonStaticExample();
	System.out.println(stat.i);
	stat.foo();//access non static method buy creating the object of the class where we need to use the non static method
	StaticNonStaticExample.myFoo();//Standard - use ClassName.static method name to access static method in non static method

	}

	public void foo() {
		System.out.println("This is Foo");
		//myFoo();
		StaticNonStaticExample.myFoo();// Standard - use ClassName.static method name to access static method in non static method
	}
	
	public static void myFoo() {
		System.out.println("This is  my Foo");
		StaticNonStaticExample stat1 =  new StaticNonStaticExample();
		System.out.println(stat1.i);
		//stat1.foo();
	}
	
}
