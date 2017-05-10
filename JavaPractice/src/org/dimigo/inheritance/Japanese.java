package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-10
 */
public class Japanese extends Person {
    public Japanese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("お早う");
    }

    @Override
    public void sayBye() {
        System.out.println("さようなら");
    }

    @Override
    public String toString() {
        return String.format("저는 일본사람 %s입니다.", this.getName());
    }
}
