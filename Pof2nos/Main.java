package Pof2nos;

public class Main {

	public static void main(String[] args) {
		
        Pof2nos a,a1,a2,a3;
		a=new Pof2nos();
		a1=new Pof2nos(10);
		a2=new Pof2nos(100,200);
		a3=new Pof2nos(a);
		a.setx(45);
		a.sety(85);
		a.find();
		a.display();
		a1.setxy(400,500);
		int m1=a1.getx();
		System.out.println(m1);
		int m2=a1.gety();
		System.out.println(m2);
		a1.find();
		a1.display();
		a2.find();
		a2.display();
		int m=a3.gety();
		System.out.println(m);
		a3.find();
		a3.display();
		}
}
