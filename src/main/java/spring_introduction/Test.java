package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("myCat", Cat.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callMyPet();

        context.close();
    }
}
