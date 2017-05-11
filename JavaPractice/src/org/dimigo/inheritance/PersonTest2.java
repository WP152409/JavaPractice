package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-10
 */
public class PersonTest2 {
    public static void main(final String... args) {
        Person[] list = {
            new Person("Tom"),
            new Korean("홍길동"),
            new Japanese("田中"),
            new Chinese("王明")
        };

        for(Person person: list) greeting(person);
    }

    private static void greeting(final Person p) {
        System.out.println(p);
        p.sayHello(); p.sayBye();
        System.out.println();
    }
}
