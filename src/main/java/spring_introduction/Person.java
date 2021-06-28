package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//
@Component
public class Person {

    private Pet pet;
//
//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

//    public Pet getPet() {
//        return pet;
//    }

    @Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callMyPet() {

        System.out.println("Hi, my little friend!");
        pet.say();

    }
}
