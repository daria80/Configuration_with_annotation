package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = context.getBean("dog", Dog.class);

        Person person = context.getBean("person", Person.class);
        person.callMyPet();

        context.close();

    }
}
