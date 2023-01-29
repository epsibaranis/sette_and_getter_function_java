package Pof2nos;

class Pof2nos {
	private int x,y,p;
	public Pof2nos() {
		x=10;
		y=7;
	}
    public Pof2nos(int a) {
    	x=a;
    	y=7;
    }
    public Pof2nos(int a, int b) {
    	x=a;
    	y=b;
    }
    public Pof2nos(Pof2nos a) {
    	x=a.x;
    	y=a.y;
    }
    public void setx(int a) {
    	x=a;
    }
    public void sety(int a) {
    	y=a;
    }
    public void setxy(int a,int b) {
    	x=a;
    	y=b;
    }
    public void reset() {
    	x=5;
    	y=10;
    }
    public void setobj(Pof2nos a) {
    	x=a.x;
    	y=a.y;
    }
    public int getx() {
    	return x;
    }
    public int gety() {
    	return y;
    }
    public int getobj(Pof2nos a) {
    	return (a.x&a.y);
    }
    public void find() {
    	p=x*y;
    }
    public void display() {
    	System.out.println(p);
    }
}
