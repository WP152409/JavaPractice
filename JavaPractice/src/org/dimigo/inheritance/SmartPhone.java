package org.dimigo.inheritance;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-15
 */
public class SmartPhone {
    private String model, company;
    private int price;

    public SmartPhone() {

    }

    public SmartPhone(String model, String company, int price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void turnOn() {
        System.out.printf("%s의 전원을 켭니다.%n", this.model);
    }

    public void turnOff() {
        System.out.printf("%s의 전원을 끕니다.%n%n", this.model);
    }

    public void pay() {

    }

    public void useSpecialFunction(SmartPhone phone) {
        if (phone instanceof IPhone) ((IPhone) phone).useAirDrop();
        else if (phone instanceof Galaxy) ((Galaxy) phone).useWirelessCharging();
    }

    @Override
    public String toString() {
        return String.format("모델명 : %s, 제조사 : %s, 가격 : %,d원", this.model, this.company, this.price);
    }
}
