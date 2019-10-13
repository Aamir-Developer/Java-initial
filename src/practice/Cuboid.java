package practice;

public class Cuboid {
	public int length,breadth,height;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	static int  area(int len, int bre) {
		
		return (len*bre);
//		return 2 * ((length * breadth) + (breadth * height) + (height * length));

	}

	int volume() {
		return length * breadth * height;

	}

	public static void main(String[] args) {
		Cuboid object = new Cuboid();
		object.setLength(6);
		object.setBreadth(5);
		object.setHeight(4);
//		int ar = object.area(4,5);
//		System.out.println("Area of cuboid is:" + ar);
//		int vo = object.volume();
//		System.out.println("Volume of cuboid is:" + vo);
		
		int area = Cuboid.area(10, 15);
		System.out.println("area of cuboid is:" + area);
	}
}
