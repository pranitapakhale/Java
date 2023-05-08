
public class LocalAndGlobalVariable {
	
	int j =11;//global
	int i=33;//global
	
	public static void main(String[] args){
	String str="java";//local
	
}
	
	public static void anyMethod()
	{
		double d=8.90;//local
	}
	
	public  void foo() {
		System.out.println(j);//11
		System.out.println(i);//33
		int i= 99;
		System.out.println(i);//pp -as priority is always given to local variable
		
		//purposefully print global 
		System.out.println(this.i);
	}

}
