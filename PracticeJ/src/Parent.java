
class Parent {

	 void m1() {
		System.out.println("static method overriding m1() from Parent class");
	}

	 public static void main(String[] args) {
		 
		 Parent c= new Child();
		 c.m1();
	 }
}

class Child extends Parent {

	 void m1() {
		System.out.println("static method overriding m1() from child class");
	}
	
	

}

/*class Test {
	public static void main(String[] args) {

		
		
		Parent.m1();
	}
}*/