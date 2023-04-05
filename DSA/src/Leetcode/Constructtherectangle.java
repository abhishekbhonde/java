package Leetcode;

public class Constructtherectangle {
    public static void main(String[] args) {
        int area = 4;
        constructRectangle(area);

    }
    public static int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);

        while (area % width > 0)
            width--;

        return new int[] {area / width, width};
    }
}
