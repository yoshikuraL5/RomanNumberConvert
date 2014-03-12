package jp.leve_five.careerup.Roma;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import jp.leve_five.careerup.Roma.RomaNumberChange;

public class RomaNumberChangeTest {

	RomaNumberChange romaNumberChange = null;

	@Before
	public void before() {
		romaNumberChange = new RomaNumberChange();
	}

	
	@Test
	public void testローマ数字Vを渡すと数字5が返ってくる() {
		int result = romaNumberChange.convertRomanNumber("V");
		assertEquals(5, result);
	}

	@Test
	public void testローマ数字Xを渡すと数字10が返ってくる() {
		int result = romaNumberChange.convertRomanNumber("X");
		assertEquals(10, result);
	}

	@Test
	public void testローマ数字xxxを渡すと数字の３０が返る() {
		int result = romaNumberChange.convertRomanNumber("xxx");
		assertEquals(30, result);
	}

	@Test
	public void testローマ数字lを渡すと数字の50が返る() {
		int result = romaNumberChange.convertRomanNumber("l");
		assertEquals(50, result);
	}

	@Test
	public void testローマ数字IVを渡すと数字の4が返る() {
		int result = romaNumberChange.convertRomanNumber("IV");
		assertEquals(4, result);
	}

	@Test
	public void testローマ数字IXを渡すと数字の9が返る() {
		int result = romaNumberChange.convertRomanNumber("IX");
		assertEquals(9, result);
	}

	@Test
	public void testローマ数字IIIを渡すと数字の３が返る() {
		int result = romaNumberChange.convertRomanNumber("iii");
		assertEquals(3, result);
	}

	@Test
	public void testローマ数字VIを渡すと6が返る() {
		int result = romaNumberChange.convertRomanNumber("VI");
		assertEquals(6, result);
	}

	@Test
	public void testローマ数字VIIを渡すと7が返る() {
		int result = romaNumberChange.convertRomanNumber("VII");
		assertEquals(7, result);
	}

	@Test
	public void testローマ数字XIを渡すと11が返る() {
		int result = romaNumberChange.convertRomanNumber("xi");
		assertEquals(11, result);
	}

	@Test
	public void testローマ数字XXIを渡すと21が返る() {
		int result = romaNumberChange.convertRomanNumber("xxi");
		assertEquals(21, result);
	}

	@Test
	public void testローマ数字ciを渡すと101が返る() {
		int result = romaNumberChange.convertRomanNumber("ci");
		assertEquals(101, result);
	}

	@Test
	public void testローマ数字xxxiを渡すと31が返る() {
		int result = romaNumberChange.convertRomanNumber("xxxi");
		assertEquals(31, result);
	}

	@Test
	public void testローマ数字xlを渡すと40が返る() {
		int result = romaNumberChange.convertRomanNumber("xl");
		assertEquals(40, result);
	}

	@Test
	public void testローマ数字xcを渡すと90が返る() {
		int result = romaNumberChange.convertRomanNumber("xc");
		assertEquals(90, result);
	}

	@Test
	public void testローマ数字cxiを渡すと111が返る() {
		int result = romaNumberChange.convertRomanNumber("cxi");
		assertEquals(111, result);
	}

	@Test
	public void testローマ数字cccxlivを渡すと344が返る() {
		int result = romaNumberChange.convertRomanNumber("cccxliv");
		assertEquals(344, result);
	}

	@Test
	public void testローマ数字miiiを渡すと1001が返る() {
		int result = romaNumberChange.convertRomanNumber("miii");
		assertEquals(1003, result);
	}

	@Test
	public void testローマ数字xxを渡すと数字の２０が返る() {
		int result = romaNumberChange.convertRomanNumber("xx");
		assertEquals(20, result);
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字IIIIを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("IIII");
	}

	@Test
	public void testローマ数字xlを渡すと数字の40が返る() {
		int result = romaNumberChange.convertRomanNumber("xl");
		assertEquals(40, result);
	}

	@Test
	
	public void testローマ数字xcを渡すと数字の90が返る() {
		int result = romaNumberChange.convertRomanNumber("xc");
		assertEquals(90, result);
	}
	@Test
	public void testローマ数字xcixを渡すと数字の99が返る() {
		int result = romaNumberChange.convertRomanNumber("xcix");
		assertEquals(99, result);
	}

	@Test
	public void testローマ数字cdを渡すと数字の400が返る() {
		int result = romaNumberChange.convertRomanNumber("cd");
		assertEquals(400, result);
	}

	@Test
	public void testローマ数字cmを渡すと数字の900が返る() {
		int result = romaNumberChange.convertRomanNumber("cm");
		assertEquals(900, result);
	}

	@Test
	public void testローマ数字cmを渡すと数字の104が返る() {
		int result = romaNumberChange.convertRomanNumber("civ");
		assertEquals(104, result);
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字llを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("ll");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字IVVを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("IVV");
	}
	@Test(expected = RuntimeException.class)
	public void testローマ数字ggを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("gg");
	}
		
	@Test(expected = RuntimeException.class)
	public void testローマ数字ilを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("il");
	}
	
	@Test(expected = RuntimeException.class)
	public void testローマ数字imを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("im");
	}
	@Test(expected = RuntimeException.class)
	public void testローマ数字icを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("ic");
	}
	
	@Test(expected = RuntimeException.class)
	public void testローマ数字cmmを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cmm");
	}

	@Test
	public void test数字1を渡すとローマ数字IVが返る() {
		String result = romaNumberChange.convertRomanNumber(1);
		assertEquals("I", result);
	}

	@Test
	public void test数字４を渡すとローマ数字IVが返る() {
		String result = romaNumberChange.convertRomanNumber(4);
		assertEquals("IV", result);
	}

	@Test
	public void test数字99を渡すとローマ数字XCIXが返る() {
		String result = romaNumberChange.convertRomanNumber(99);
		assertEquals("XCIX", result);
	}

	@Test
	public void test数字3を渡すとローマ数字IIIが返る() {
		String result = romaNumberChange.convertRomanNumber(3);
		assertEquals("III", result);
	}

	@Test
	public void test数字3999を渡すとローマ数字MMMCMXCIXが返る() {
		String result = romaNumberChange.convertRomanNumber(3999);
		assertEquals("MMMCMXCIX", result);
	}

	@Test
	public void test数字3954を渡すとローマ数字MMMCMLIVが返る() {
		String result = romaNumberChange.convertRomanNumber(3954);
		assertEquals("MMMCMLIV", result);
	}

	@Test
	public void test数字3888を渡すとローマ数字が返る() {
		String result = romaNumberChange.convertRomanNumber(3888);
		assertEquals("MMMDCCCLXXXVIII", result);
	}
	@Test
	public void test数字99を渡すとローマ数字が返る(){
		String result = romaNumberChange.convertRomanNumber(99);
		assertEquals("XCIX", result);
	}

}
