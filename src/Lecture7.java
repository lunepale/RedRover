public class Lecture7 {
    public static double distance (Coord point1, Coord point2) {
        int deltaX = point2.x - point1.x;
        int deltaY = point2.y - point1.y;
        return Math.sqrt (deltaX * deltaX + deltaY * deltaX);
    }

    public static void main(String[] args) {
        Coord p1 = new Coord(4, 3);
        Coord p2 = new Coord(0, 0);
        Line Line1 = new Line();
        Line1.p1 = p1;
        Line1.p2 = p2;

        System.out.println (Line1.lenght ());
      System.out.println(distance(p1, p2));
    }
}
