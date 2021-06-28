package spring_introduction;

public class Person {

    private Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public void callMyPet() {

        System.out.println("Hi, my little friend!");
        pet.say();

    }
}