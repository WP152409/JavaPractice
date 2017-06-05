package org.dimigo.collection;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-06-05 09:29
 */
public class Music {
    private String title, singer;

    public Music(String title, String singer) {
        this.title = title;
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", getTitle(), getSinger());
    }
}
