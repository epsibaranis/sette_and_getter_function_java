package Sof2no;
public class MAin {
	public static void main(String[] args) {
		Sumoftwo a,a1,a2,a3;
		a=new Sumoftwo();
		a1=new Sumoftwo(10);
		a2=new Sumoftwo(100,200);
		a3=new Sumoftwo(a);
		a.sety(45);;
		a.setx(10);;
		a.find();
		a.display();
		a1.setx(55);
		a1.sety(20);
		a1.find();
		a1.display();
		a2.setx(100);
		a2.sety(200);
		a2.find();
		a2.display();
		a3.find();
		a3.display();
	}
}
