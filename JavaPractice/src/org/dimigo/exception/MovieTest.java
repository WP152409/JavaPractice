package org.dimigo.exception;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-05-31 10:33
 */
public class MovieTest {
    public static void main(String... args) {
        final int age = 13;

        final Movie[] movies = {
            new Movie("에이리언:커버넌트", 15),
            new Movie("가디언즈 오브 갤럭시", 12)
        };

        for (Movie movie: movies) {
            try {
                movie.buyTicket(age);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
