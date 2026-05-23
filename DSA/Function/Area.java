package Function;
public class Area {
    public static float calculateArea(float  radius) {
        return (float) Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        int radius = 5;
        float area = calculateArea(radius);
        System.out.println(area);
    }
}
