package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author ChalkPE <chalk@chalk.pe>
 * @since 2017-06-12 11:35
 */
public class MelonGenreChart {
    public static void main(final String... args) {
        final Map<String, List<Music>> map = new HashMap<>();
        map.put("발라드", new ArrayList<>(Collections.singletonList(new Music("팔레트", "아이유"))));
        map.put("댄스", new ArrayList<>(Arrays.asList(new Music("I LUV IT", "PSY"), new Music("맞지?", "언니쓰"))));
        System.out.printf("-- << 멜론 장르별 차트 >> --%n"); printMap(map);

        map.get("댄스").set(1, new Music("SIGNAL", "트와이스"));
        System.out.printf("%n-- << 댄스 2위 곡 변경 >> --%n"); printMap(map);

        map.get("댄스").remove(0);
        System.out.printf("%n-- << 댄스 1위 곡 삭제 >> --%n"); printMap(map);

        map.clear();
        System.out.printf("%n-- << 전체 리스트 삭제 >> --%n"); printMap(map);
    }

    public static void printMap(Map<String, List<Music>> map) {
        map.entrySet().stream()
                .peek(entry -> System.out.printf("[%s]%n", entry.getKey()))
                .forEach(entry -> IntStream.range(0, entry.getValue().size())
                        .forEach(i -> System.out.printf("%d. %s%n", i + 1, entry.getValue().get(i))));
    }
}
