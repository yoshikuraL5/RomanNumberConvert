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
	public void testローマ数字Iを渡すと数字1が返ってくる() {
		int result = romaNumberChange.arabic("I");
		assertEquals(1, result);
	}

	@Test
	public void testローマ数字Vを渡すと数字5が返ってくる() {
		int result = romaNumberChange.arabic("V");
		assertEquals(5, result);
	}

	@Test
	public void testローマ数字Xを渡すと数字10が返ってくる() {
		int result = romaNumberChange.arabic("X");
		assertEquals(10, result);
	}

	@Test
	public void testローマ数字xxxを渡すと数字の３０が返る() {
		int result = romaNumberChange.arabic("xxx");
		assertEquals(30, result);
	}

	@Test
	public void testローマ数字lを渡すと数字の50が返る() {
		int result = romaNumberChange.arabic("l");
		assertEquals(50, result);
	}

	@Test
	public void testローマ数字IVを渡すと数字の4が返る() {
		int result = romaNumberChange.arabic("IV");
		assertEquals(4, result);
	}

	@Test
	public void testローマ数字IXを渡すと数字の9が返る() {
		int result = romaNumberChange.arabic("IX");
		assertEquals(9, result);
	}

	@Test
	public void testローマ数字IIIを渡すと数字の３が返る() {
		int result = romaNumberChange.arabic("iii");
		assertEquals(3, result);
	}

	@Test
	public void testローマ数字VIを渡すと6が返る() {
		int result = romaNumberChange.arabic("VI");
		assertEquals(6, result);
	}

	@Test
	public void testローマ数字VIIを渡すと7が返る() {
		int result = romaNumberChange.arabic("VII");
		assertEquals(7, result);
	}

	@Test
	public void testローマ数字XIを渡すと11が返る() {
		int result = romaNumberChange.arabic("xi");
		assertEquals(11, result);
	}

	@Test
	public void testローマ数字XXIを渡すと21が返る() {
		int result = romaNumberChange.arabic("xxi");
		assertEquals(21, result);
	}

	@Test
	public void testローマ数字ciを渡すと101が返る() {
		int result = romaNumberChange.arabic("ci");
		assertEquals(101, result);
	}

	@Test
	public void testローマ数字xxxiを渡すと31が返る() {
		int result = romaNumberChange.arabic("xxxi");
		assertEquals(31, result);
	}

	@Test
	public void testローマ数字xlを渡すと40が返る() {
		int result = romaNumberChange.arabic("xl");
		assertEquals(40, result);
	}

	@Test
	public void testローマ数字xcを渡すと90が返る() {
		int result = romaNumberChange.arabic("xc");
		assertEquals(90, result);
	}

	@Test
	public void testローマ数字cxiを渡すと111が返る() {
		int result = romaNumberChange.arabic("cxi");
		assertEquals(111, result);
	}

	@Test
	public void testローマ数字cccxlivを渡すと344が返る() {
		int result = romaNumberChange.arabic("cccxliv");
		assertEquals(344, result);
	}

	@Test
	public void testローマ数字miiiを渡すと1001が返る() {
		int result = romaNumberChange.arabic("miii");
		assertEquals(1003, result);
	}

	@Test
	public void testローマ数字xxを渡すと数字の２０が返る() {
		int result = romaNumberChange.arabic("xx");
		assertEquals(20, result);
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字IIIIを渡すと例外が発生する() {
		romaNumberChange.arabic("IIII");
	}

	@Test
	public void testローマ数字xlを渡すと数字の40が返る() {
		int result = romaNumberChange.arabic("xl");
		assertEquals(40, result);
	}

	@Test
	public void testローマ数字xcを渡すと数字の90が返る() {
		int result = romaNumberChange.arabic("xc");
		assertEquals(90, result);
	}
	@Test
	public void testローマ数字xcixを渡すと数字の99が返る() {
		int result = romaNumberChange.arabic("xcix");
		assertEquals(99, result);
	}

	@Test
	public void testローマ数字cdを渡すと数字の400が返る() {
		int result = romaNumberChange.arabic("cd");
		assertEquals(400, result);
	}

	@Test
	public void testローマ数字cmを渡すと数字の900が返る() {
		int result = romaNumberChange.arabic("cm");
		assertEquals(900, result);
	}

	@Test
	public void testローマ数字cmを渡すと数字の104が返る() {
		int result = romaNumberChange.arabic("civ");
		assertEquals(104, result);
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字llを渡すと例外が発生する() {
		romaNumberChange.arabic("ll");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字IVVを渡すと例外が発生する() {
		romaNumberChange.arabic("IVV");
	}
	@Test(expected = RuntimeException.class)
	public void testローマ数字ggを渡すと例外が発生する() {
		romaNumberChange.arabic("gg");
	}
		
	@Test(expected = RuntimeException.class)
	public void testローマ数字ilを渡すと例外が発生する() {
		romaNumberChange.arabic("il");
	}
	
	@Test(expected = RuntimeException.class)
	public void testローマ数字imを渡すと例外が発生する() {
		romaNumberChange.arabic("im");
	}
	@Test(expected = RuntimeException.class)
	public void testローマ数字icを渡すと例外が発生する() {
		romaNumberChange.arabic("ic");
	}
	
	@Test(expected = RuntimeException.class)
	public void testローマ数字cmmを渡すと例外が発生する() {
		romaNumberChange.arabic("cmm");
	}

	@Test
	public void test数字1を渡すとローマ数字IVが返る() {
		String result = romaNumberChange.replaceArabicRoman(1);
		assertEquals("I", result);
	}

	@Test
	public void test数字４を渡すとローマ数字IVが返る() {
		String result = romaNumberChange.replaceArabicRoman(4);
		assertEquals("IV", result);
	}

	@Test
	public void test数字99を渡すとローマ数字XCIXが返る() {
		String result = romaNumberChange.replaceArabicRoman(99);
		assertEquals("XCIX", result);
	}

	@Test
	public void test数字3を渡すとローマ数字IIIが返る() {
		String result = romaNumberChange.replaceArabicRoman(3);
		assertEquals("III", result);
	}

	@Test
	public void test数字3999を渡すとローマ数字MMMCMXCIXが返る() {
		String result = romaNumberChange.replaceArabicRoman(3999);
		assertEquals("MMMCMXCIX", result);
	}

	@Test
	public void test数字3954を渡すとローマ数字MMMCMLIVが返る() {
		String result = romaNumberChange.replaceArabicRoman(3954);
		assertEquals("MMMCMLIV", result);
	}

	@Test
	public void test数字3888を渡すとローマ数字が返る() {
		String result = romaNumberChange.replaceArabicRoman(3888);
		assertEquals("MMMDCCCLXXXVIII", result);
	}
	@Test
	public void test数字99を渡すとローマ数字が返る(){
		String result = romaNumberChange.replaceArabicRoman(99);
		assertEquals("XCIX", result);
	}

}
