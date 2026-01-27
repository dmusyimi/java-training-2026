package io.github.talentdevelopment004.statickeyword;

public class MathUtility {

    static class Adder {
        String nameOfMethod = "";

        public static double add(double... numbers) {
            double result = 0.0;
            for (var num : numbers) {
                result += num;
            }
            return result;
        }

    }

    static class AreaCalculator {
        public static double circleArea(double radius) {
            return Math.PI * Math.pow(radius, 2);
        }

    }

    static class volumeCalculator {
        public static double calculateCubeVolume(double l, double w, double h) {
            return l * w * h;
        }

    }

    class NonStaticClass {

    }

}
