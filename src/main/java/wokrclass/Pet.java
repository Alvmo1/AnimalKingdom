package wokrclass;

public interface Pet {
    //public abstract methods in them
    void greetOwner(); //abstract method
    default void printPetClassName(Pet pet){
        System.out.println(pet.getClass().getSimpleName());
    }
    //static methods
    //looping - enhanced for loop ..aka forEachLoop
    static void printPetGreeting(Pet[] pets){ //dont repeat yourself
        //array of pets
        for(Pet p : pets){
            p.greetOwner();
            //for each class that implements PET
        }
        //print dogs greeting
        //print cats greeting
        //print robodogs greeting
    }
}
