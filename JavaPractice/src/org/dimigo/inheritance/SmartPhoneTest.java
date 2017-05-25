package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-15
 */
public class SmartPhoneTest {
    public static void main(String... args) {
        SmartPhone[] phones = {
                new IPhone("iPhone 7", "애플", 900000),
                new Galaxy("갤럭시 S8", "삼성", 800000)
        };

        for (SmartPhone phone: phones) {
            System.out.println(phone);

            phone.turnOn();
            phone.pay();
            phone.useSpecialFunction(phone);
            phone.turnOff();
        }
    }
}
