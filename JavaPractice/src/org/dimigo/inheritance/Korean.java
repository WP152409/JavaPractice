package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-10
 */
public class Korean extends Person {
    public Korean(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요");
    }

    @Override
    public void sayBye() {
        System.out.println("안녕히 계세요");
    }

    @Override
    public String toString() {
        return String.format("저는 한국사람 %s입니다.", this.getName());
    }
}
