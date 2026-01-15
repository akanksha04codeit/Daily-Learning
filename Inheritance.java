/*1)class Parent{
	int a=30;
	int b=50;
	int add() {
		return (a+b);
	}	
}

class SubClass extends Parent{
	void add(int x) {
		int sum=super.add();
		int res=sum+x;
		System.out.println("Result: "+res);
	}
}

2) class SubSubClass extends SubClass{
	//@Override
	void add(int x) {
		super.add(20);
		System.out.println("Addition is: "+(10+20+30));
	}
}*/

/*3)class MathOperation{
	int a = 10;
	int b = 20;
	int c = 30;
	int d = 40;
}

class SubClass2 extends MathOperation{
	void add() {
		int sum=super.a+b;
		System.out.println("Addition is: "+sum);
	}
}*/

//4)
class Shape{
	double PI = 3.14;
	int r = 4;
	int x = 2;
	int y = 10;
	int a = 4;
	int b = 20;
	int h = 40;
}

class Circle extends Shape{
	void area() {
		double res = PI*r*r;
		System.out.println("Area of Circle is: "+res);
	}
}

class Ellips extends Circle{
	void Earea() {
		double result=(PI*a*b);
		System.out.println("Area of the Ellips is: "+result);
	}
}

class Cone extends Ellips{
	void Carea() {
		double res=(PI*r*(r+h));
		System.out.println("Cone Surface area is: "+res);
	}
}


public class Inheritance {
	
	public static void main(String[] args) {
	//1)//SubClass subObj = new SubClass();
		//subObj.add(10);
		
	//2)//SubSubClass lObj=new SubSubClass();
		//lObj.add(10);
		
	//3)SubClass2 sub2 = new SubClass2();
		//sub2.add();
		
		//4)
		Cone c1 = new Cone();
		c1.area();
		c1.Earea();
		c1.Carea();
		
     
	}
}
