
public class Point {

	private int x;
	private int y;

	public void distanceOrigin(int x, int y) {
		double a = Math.sqrt((x * x + y * y));
		System.out.println("Distance between Point(" + x + "," + y + ") and origin is " + a);

	}

	public static void distanceBetween(int x1, int y1, int x2, int y2) {
		double b = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance between Point(" + x1 + "," + y1 + ") and Point(" + x2 + "," + y2 + ") is " + b);

	}

	public static Point clone(int x, int y) {
		Point pointClone = new Point(x, y);
		return pointClone;
	}

	public static void move(int x, int y, int xMove, int yMove) {

		System.out.print("Point(" + x + "," + y + ") moved (" + xMove + "," + yMove + ") new Point is (");
		x = x + xMove;
		y = y + yMove;
		System.out.println(x + "," + y + ")");

	}

	public Point(int x, int y) {
		super();
		this.x = x; //
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
