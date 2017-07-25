class Circle {

	void  paint(float size) {
		System.out.println("Brush size : " +size);
	}
	void paint(String name) {
		System.out.println("pencil name : " +name);
	}
	void  paint(int fingers) {
		System.out.println("fingers are : " +fingers);
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.paint(4);
		c.paint(22.0F);
		c.paint("xyz");
	}
}
