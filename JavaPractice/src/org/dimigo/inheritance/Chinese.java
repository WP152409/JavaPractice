package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-10
 */
public class Chinese extends Person {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("你好");
    }

    @Override
    public void sayBye() {
        System.out.println("再见");
    }

    @Override
    public String toString() {
        return String.format("저는 중국사람 %s입니다.", this.getName());
    }
}
