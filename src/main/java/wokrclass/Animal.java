package wokrclass;

public abstract class Animal {

    protected String food;//change the access modifier
    private Size size;
    public int id;
    public static int uniqueID = 0; //0 static belong to the class and are shared by each instance of the class

    public Animal(String food, Size size){
        this.size = size;
        this.food = food;
        uniqueID++;
        id = uniqueID;
    }

    enum Size{
        SMALL,
        MEDIUM,
        LARGE
    }
    public Size getSize(){
        return size;
    }

    public static void printSizeDescription(Animal animal) {
        switch (animal.getSize()) {
            case SMALL:
                System.out.println("This animal is small.");
                break;
            case MEDIUM:
                System.out.println("This animal is medium-sized.");
                break;
            case LARGE:
                System.out.println("This animal is large.");
                break;
            default:
                System.out.println("Invalid size.");
                break;
        }
    }





    public static void printUniqueAnimalMethod(Animal animal){
        if(animal instanceof Dog){
            ((Dog) animal).fetch();
        }

        if(animal instanceof Cat){
            ((Cat) animal).scratch();
        }
    }


    public void makeSound(){
        System.out.println("unknown sounds");
    }
    public abstract void printAnimalFood(); // signature
}

