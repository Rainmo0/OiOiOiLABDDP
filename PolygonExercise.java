package OiOiOiLABDDP;
// use scanner lib for input

public class PolygonExercise {
    public static void main(String[] args) {
        System.out.println(getShapeName(3));
    }

    public static String getShapeName(int n) {
        switch(n) {
            case 3 -> {return "Triangle";}
            default -> {return "sigma";}
        }
    }

    public static int getShapeDegrees(int n) {
        //TODO
    }
}
