package academy.belhard;

import academy.belhard.entity.Person;
import academy.belhard.entity.User;

public class Main {

    public static void main(String[] args) {
       Person man1 = new Person("Tom", "Hard");

       System.out.println(man1.getFullName());

       User man2 = new User("tom@mail.ru","njv", "Tom", "Hard");


        System.out.println(man2.getFullInfo());

    }
}
