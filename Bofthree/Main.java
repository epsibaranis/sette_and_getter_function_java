package Bofthree;

public class Main {

	public static void main(String[] args) {
		BiggestOfThree m,m1,m2,m3,m4;
		m=new BiggestOfThree();
		m.find();
		m.display();
		m.setx(400);
		m.find();
		m.display();
		m1=new BiggestOfThree(100);
		m1.find();
		m1.display();
		m1.setxyz(123,45, 526);
		m1.find();
		m1.display();
		m2=new BiggestOfThree(100,25);
		m2.find();
		m2.display();
		m2.setxy(563,568);
		m2.find();
		m2.display();
		m3=new BiggestOfThree(100,25,2);
		m3.find();
		m3.display();
		m3.setyz(125,478);
		m3.find();
		m3.display();
		m4=new BiggestOfThree(m);
		m4.find();
		m4.display();
		m4.setzx(129,124);
		m4.find();
		m4.display();

	}
}
