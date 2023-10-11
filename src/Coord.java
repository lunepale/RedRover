public class Coord {

    int x;
    int y;
    public Coord(int a, int b){
        x=a;
        y=b;
    }
    public boolean isValid(){
        return x > 0 && y > 0;
    }
}
