package org.dimigo.abstractclass;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-15
 */
public class IPhone extends SmartPhone {
    public IPhone() {
    }

    public IPhone(String model, String company, int price) {
        super(model, company, price);
    }

    @Override
    public void pay() {
        System.out.println("애플 페이로 결제합니다.");
    }

    public void useAirDrop() {
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
