package homework13;

public class Car {
    public class Car {
        private int year;
        private double speed;
        private int weight;
        private String color;


        public Car() {
        }


        public Car(int year) {
            this(year, 0.0, 0, null);
        }


        public Car(int year, double speed) {
            this(year, speed, 0, null);
        }


        public Car(int year, double speed, int weight) {
            this(year, speed, weight, null);
        }


        public Car(int year, double speed, int weight, String color) {
            this.year = year;
            this.speed = speed;
            this.weight = weight;
            this.color = color;
        }
    }

}
