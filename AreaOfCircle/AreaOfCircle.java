package AreaOfCircle;

public class AreaOfCircle {
	private double r,a;
	public AreaOfCircle() {
		r=10;
	}
	public  AreaOfCircle(double a) {
		r=a;
	}
	public  AreaOfCircle( AreaOfCircle a) {
		r=a.r;
	}
	public void setr(double a) {
		r=a;
	}
	public void reset() {
		r=154.0;
	}
	public void setobj(AreaOfCircle a) {
		r=a.r;		
	}
	public double getr() {
		return r;
	}
	public double getarea() {
	  return a;	
	}
	public double getobj(AreaOfCircle b) {
		return b.r;
	}
	public void find() {
		a=3.14*r*r;
	}
    public void display() {
    	System.out.println(a);
    }
    
}