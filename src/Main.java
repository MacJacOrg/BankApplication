public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Opel", "Czerwony", 1999);
        Car car2 = new Car("bmw", "czarny", 2000);
        Car car3 = new Car("skoda", "biały", 2020);

        System.out.println(car1.toString());
        System.out.println(car1.getKolor());
        car1.setKolor("czarny");
        System.out.println(car1.toString());
    }
}
