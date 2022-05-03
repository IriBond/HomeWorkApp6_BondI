public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog(500,15);
        Cat cat = new Cat(200,0);

        AnimalsCan[] animals = {cat, dog};
        for (AnimalsCan animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(111));
            System.out.println(animal.run(222));
            System.out.println(animal.run(555));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(55));
        }
    }
}
