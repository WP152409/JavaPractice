package org.dimigo.exception;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-31 10:19
 */
public class Movie {
    private String title;
    private int limitAge;

    public Movie(String title, int limitAge) {
        this.title = title;
        this.limitAge = limitAge;
    }

    public String getTitle() {
        return title;
    }

    public int getLimitAge() {
        return limitAge;
    }

    public void buyTicket(int age) throws Exception {
        if (age < limitAge) {
            final int last = getTitle().charAt(getTitle().length() - 1);
            final String pp = ((last - "가".charAt(0)) % 28) > 0 ? "은" : "는";

            throw new Exception(String.format("%s%s %d세 이상 관람가입니다.", getTitle(), pp, getLimitAge()));
        }

        System.out.printf("%s 즐감하세요.%n", getTitle());
    }
}
