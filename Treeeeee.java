

//calling one constructor to another constructor
//we are using this()
class B
{
B()
{
	System.out.println("BBB");
}
B(int i)
{
	this("String");
	System.out.println("int");
}
B(String s)
{
	this();
	System.out.println("String");
}
}
 public class Treeeeee
 {
	public static void main(String[] args) {
		B b=new B("balu");
	}
}
