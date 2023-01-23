package zweid.kyu_8.five;

public class Polygon {
    int sides;
    int sideLength;

    public Polygon(int sides, int sideLength) {
        this.sides = sides;
        this.sideLength = sideLength;
    }

    public double circleDiameter() {
        return sideLength / Math.tan(Math.PI / sides);
    }

}
