package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-06-05 09:30
 */
public class MelonChart {
    public static void main(final String... args){
        final List<Music> list = new ArrayList<>();

        list.add(new Music("I LUV IT", "PSY"));
        list.add(new Music("맞지?", "언니쓰"));
        System.out.printf("-- << 멜론 차트 >> --%n"); printList(list);

        list.add(1, new Music("SIGNAL", "트와이스"));
        System.out.printf("%n-- << 2위 곡 추가 >> --%n"); printList(list);

        list.set(list.size() - 1, new Music("팔레트", "아이유"));
        System.out.printf("%n-- << 3위 곡 변경 >> --%n"); printList(list);

        list.remove(1);
        System.out.printf("%n-- << 2위 곡 삭제 >> --%n"); printList(list);

        list.clear();
        System.out.printf("%n-- << 전체 리스트 삭제 >> --%n"); printList(list);
    }

    public static void printList(List<Music> list){
        IntStream.range(0, list.size()).forEach(i -> System.out.printf("%d. %s%n", ++i, list.get(--i)));
    }
}
