public class Animals {
    private int age;

    public Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " instance with age " + age;
    }

    public static void main(String[] args) {

        Animals animalInstance = new Animals(5);
        System.out.println(animalInstance);
    }
}
