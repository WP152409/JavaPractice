package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-10
 */
public class Person {
    private String name;

    public Person() {

    }

    public Person (final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBye() {
        System.out.println("Bye");
    }

    @Override
    public String toString() {
        return String.format("저는 %s입니다.", this.getName());
    }
}
