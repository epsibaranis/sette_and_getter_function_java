package Bofthree;
class BiggestOfThree {
    private int x,y,z,b;
    public BiggestOfThree() {
    	x=5;
    	y=6;
    	z=3;
    }
    public BiggestOfThree(int a) {
    	x=a;
    	y=6;
    	z=3;
    } 
    public BiggestOfThree(int a,int b) {
    	x=a;
    	y=b;
    	z=3;
    }
    public BiggestOfThree(int a,int b,int c) {
    	x=a;
    	y=b;
    	z=c;
    }
    public BiggestOfThree(BiggestOfThree a) {
    	x=a.x;
    	y=a.y;
    	z=a.z;
    }
    public void setx(int a) {
    	x=a;
    }
    public void sety(int a) {
    	y=a;
    }
    public void setz(int a) {
    	z=a;
    }
    public void setxy(int a,int b) {
    	x=a;
    	y=b;
    }
    public void setyz(int a,int b) {
    	y=a;
    	z=b;
    }
    public void setzx(int a,int b) {
    	z=a;
    	x=b;
    }
    public void setxyz(int a,int b,int c) {
    	x=a;
    	y=b;
    	z=c;
    }
    public void setobj(BiggestOfThree a) {
    	x=a.x;
    	y=a.y;
    	z=a.z;
    }
    public void reset() {
    	x=15;
    	y=25;
    	z=46;
    }
    public int getx() {
    	return x;
    }
    public int gety() {
    	return y;
    }
    public int getz() {
    	return z;
    }
    public int getobj(BiggestOfThree a) {
    	return (a.x&a.y&a.z);
    }
    public void find() {
    	b=z>(x>y?x:y)?z:(x>y?x:y);
    }
    public void display() {
    	System.out.println(b);
    }
}
