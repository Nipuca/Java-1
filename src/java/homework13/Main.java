package homework13;

public class Main {
    public static void main(String[] args) {
        // Створення екземплярів класу Машина
        Car car1 = new Car(); // Конструктор за замовчуванням
        Car car2 = new Car(2020); // Конструктор із 1 параметром
        Car car3 = new Car(2018, 150.0); // Конструктор із 2 параметрами
        Car car4 = new Car(2015, 120.0, 2000); // Конструктор із 3 параметрами
        Car car5 = new Car(2012, 100.0, 1800, "Blue"); // Конструктор із 4 параметрами
    }
}



