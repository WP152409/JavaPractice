package org.dimigo.oop;

import java.util.*;
import java.util.stream.*;

/**
 * org.dimigo.oop
 *  \_ PiggyBankTest
 *
 * lorem ipsum
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 18, 2017
 */
public class PiggyBankTest {
	@SuppressWarnings("serial") public static void main(String[] args) {
		final HashMap<FamilyMember, List<Integer>> map = new HashMap<FamilyMember, List<Integer>>() {{
			put(new FamilyMember("아빠"), Arrays.asList(10000, 0)); put(new FamilyMember("엄마"), Arrays.asList(5000, 0));
			put(new FamilyMember("나"), Arrays.asList(2000, 1000)); put(new FamilyMember("남동생"), Arrays.asList(1000, 0)); }};
		
		FamilyMember.printMemberCnt();
		IntStream.range(0, 2).peek(i -> map.forEach((k, v) -> PiggyBank.putMoney(k, v.get(i)))).forEach(x -> PiggyBank.printBalance());
	}
}
