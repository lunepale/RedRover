public class Line {
    Coord p1;
    Coord p2;



    public double lenght(){
        int deltaX = p2.x - p1.x;
        int deltaY = p2.y - p1.y;
        return Math.sqrt (deltaX * deltaX + deltaY * deltaX);
    }
}
