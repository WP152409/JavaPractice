package org.dimigo.io;

import java.io.*;
import java.util.Objects;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-06-16 11:28
 */
public class ArakoMenu {
    public static void main(final String... args) {
        final String PATH = "menu.txt";

        try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String read;

            try (final Writer writer = new BufferedWriter(new FileWriter(PATH))) {
                while (Objects.nonNull(read = in.readLine())) writer.write(read.concat(System.lineSeparator()));
            }

            System.out.println("<< 메뉴 출력 >>");

            try (final BufferedReader reader = new BufferedReader(new FileReader(PATH))) {
                while (Objects.nonNull(read = reader.readLine())) System.out.println(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
