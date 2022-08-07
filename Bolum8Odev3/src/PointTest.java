
public class PointTest {

	public static void main(String[] args) {

		Point point1 = new Point(3, 4);

		Point point2 = new Point(1, 2);

		point1.distanceOrigin(point1.getX(), point1.getY());
		point2.distanceOrigin(point2.getX(), point2.getY());

		point1.distanceBetween(point1.getX(), point1.getY(), point2.getX(), point2.getY());

		Point point1Clone = point1.clone(point1.getX(), point1.getY());

		point1.move(point1.getX(), point1.getY(), 1, 1);

	}

}
