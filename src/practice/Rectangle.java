package practice;
class Rectangle{
	int length;
	int breadth;
	Rectangle(int length, int bre){
		this.length = length;
		breadth = bre;
	}
	Rectangle(){}
//	public void welcome() {
//		System.out.println("welcome to area program");
//	}
//	public int getLength() {
//		return length;
//	}
//	public void setLength(int length) {
//		this.length = length;
//	}
//	public int getBreadth() {
//		return breadth;
//	}
//	public void setBreadth(int breadth) {
//		this.breadth = breadth;
//	}
	int area(){
		return length * breadth;
	}
	public static void main(String[]args){
		Rectangle rect1 = new Rectangle(8,9);
//		rect1.welcome();
//		rect1.setLength(5);
//		rect1.setBreadth(3);
		int ar = rect1.area();
		System.out.println("Area of rectangle is: " + ar);
//		rect1.setLength(15);
//		rect1.setBreadth(3);
//		 ar = rect1.area();
//		System.out.println("Area of rectangle is: " + ar);
//		rect1.setLength(5);
//		rect1.setBreadth(13);
//		 ar = rect1.area();
//		System.out.println("Area of rectangle is: " + ar);
//		rect1.setLength(25);
//		rect1.setBreadth(3);
//		 ar = rect1.area();
//		System.out.println("Area of rectangle is: " + ar);
	}
}