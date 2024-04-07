package wokrclass;

public class Main {
    public static void main(String[] args) {

      Dog dog = new Dog("bones", Animal.Size.LARGE);
      System.out.println(dog.id);
      Dog dog2 = new Dog("bones thugs N harmony", Animal.Size.LARGE);
      System.out.println(dog2.id);
      Dog dog3 = new Dog("bones thugs N harmony", Animal.Size.LARGE);
      System.out.println(dog3.id);
      dog.food = "cookies"; // protected fields due to inheritancedog.makeSound();
        System.out.println("I'm a size " + dog.getSize());
        Animal.printSizeDescription(dog);
        System.out.println("=========");
        Cat cat = new Cat("milk", Animal.Size.SMALL);
        System.out.println(cat.id);
        System.out.println("=========");
        System.out.println(dog.id);
        cat.makeSound();
        System.out.println("I'm a size " + cat.getSize());
        Animal.printSizeDescription(cat);

       // Polymorphism
        Animal dogToCat = new Dog("bones", Animal.Size.LARGE);
        ((Dog)dogToCat).fetch();
        dogToCat = new Cat("fish", Animal.Size.SMALL);
        ((Cat)dogToCat).scratch();

        System.out.println("===printUniqueAnimalMethod===");
        Animal.printUniqueAnimalMethod(dog);
        //Animal.printUniqueAnimalMethod(cat);
        //Classname.staticMethodName();

        System.out.println("====interface====");
        RoboDog roboDog = new RoboDog();
        //Pet[] pets = new Pet[3];
        //Pet[] anArrayOfPets = {cat, dog, roboDog};
       // Pet.printPetGreeting(anArrayOfPets);

        roboDog.printPetClassName(roboDog);

    }


}
