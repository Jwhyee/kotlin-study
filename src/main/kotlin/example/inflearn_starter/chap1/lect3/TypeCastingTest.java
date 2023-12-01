package example.inflearn_starter.chap1.lect3;

import example.inflearn_starter.chap1.lect2.Person;

public class TypeCastingTest {
    public static void main(String[] args) {

    }

    public static void printNameIfPerson(Object object) {
        if (object instanceof Person) {
            Person person = (Person) object;
            System.out.println(person.getName());
        }
    }
}
