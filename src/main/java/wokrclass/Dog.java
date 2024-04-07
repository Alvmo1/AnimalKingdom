package wokrclass;

public class Dog extends Canine implements Pet{
    public Dog(String food, Size size) {
        super(food, size);
    }


    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }

    @Override
    public void printAnimalFood() {
        System.out.println(this.food);
    }

    public void fetch(){
        System.out.println("I can fetch cuz i am a dog");
    }

    @Override
    public void greetOwner() {
        System.out.println("lick feet");
    }
}
