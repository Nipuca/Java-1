public class Distance {
    private double distance;

    public Distance(double distance) {
        this.distance = distance;
    }

    public void print() {
        System.out.println("Distance: " + distance + " meters");
    }

    public static class Converter {
        public static double metersToKilometers(double meters) {
            return meters / 1000.0;
        }

        public static double kilometersToMiles(double kilometers) {
            return kilometers * 0.621371;
        }



        public static void main(String[] args) {

            double distanceInMeters = 5000.0;

            System.out.println("Original distance:");
            Distance originalDistance = new Distance(distanceInMeters);
            originalDistance.print();

            System.out.println("\nConverted distances:");
            System.out.println("Kilometers: " + Converter.metersToKilometers(distanceInMeters) + " km");
            System.out.println("Miles: " + Converter.kilometersToMiles(Converter.metersToKilometers(distanceInMeters)) + " mi");
        }
    }
}
