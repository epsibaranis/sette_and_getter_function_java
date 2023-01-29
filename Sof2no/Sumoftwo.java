package Sof2no;


public class Sumoftwo {
	
		private int x,y,s;
		public Sumoftwo() {
			x=10;
			y=7;
		}
	    public Sumoftwo(int a) {
	    	x=a;
	    	y=7;
	    }
	    public Sumoftwo(int a, int b) {
	    	x=a;
	    	y=b;
	    }
	    public Sumoftwo(Sumoftwo a) {
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
	    public void setobj(Sumoftwo a) {
	    	x=a.x;
	    	y=a.y;
	    	
	    }
	    public int getx() {
	    	return x;
	    }
	    public int gety() {
	    	return y;
	    }
	    public int getsum() {
	    	return s;
	    }
	    public int getobj(Sumoftwo a) {
	    	return (a.x&a.y);
	    }
	    public void reset() {
	    	x=5;
	    	y=10;
	    }
	    
	    public void find() {
	    	s=x+y;
	    }
	    public void display() {
	    	System.out.println(s);
	    }
	    

	
}
