package jp.leve_five.careerup.Roma;

import static org.junit.Assert.*;

import java.util.regex.PatternSyntaxException;

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
		int result = romaNumberChange.convertRomanNumber("I");
		assertEquals(1, result);
	}

	@Test
	public void testローマ数字大文字Iを渡すと数字１が返る() {
		int result = romaNumberChange.convertRomanNumber("I");
		assertEquals(1, result);
	}

	@Test
	public void testローマ数字小文字ｖを渡すと数字5が返ってくる() {
		int result = romaNumberChange.convertRomanNumber("v");
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

	@Test(expected = RuntimeException.class)
	public void testローマ数字IXXを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("ixx");

	}

	@Test
	public void testローマ数字cxcを渡すと190が返る() {
		int result = romaNumberChange.convertRomanNumber("cxc");
		assertEquals(190, result);
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
	public void testローマ数字cmxcixを渡すと999が返る() {
		int result = romaNumberChange.convertRomanNumber("cmxcix");
		assertEquals(999, result);
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

	@Test(expected = RuntimeException.class)
	public void testローマ数字viiiiを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("Viiii");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字iiiixを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("iiiix");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字XXXXを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("XXXX");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vvを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("vv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vivを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("viv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vivivを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("viviv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字ixiを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("ixi");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字xixiを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("xixi");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字lxlを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("lxl");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cxlを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("lxc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字xlxを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("xlx");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字xcxを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("xcx");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cmcを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cmc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cdcを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cdc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cdcviを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cdcvi");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字dmcを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("dmc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vmivivを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("vmiv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cmccを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cmcc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字dmを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("dm");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字cdccを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cdcc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字dmdccを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("dmdcc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vcを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("vc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字iccを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("icc");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字icを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("ic");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字ddを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("dd");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字dcdを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("dcd");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字iixを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("iix");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字iivを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("iiv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字iilを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("iil");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字ilを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("il");
	}

	@Test
	public void testローマ数字xixを渡すと19が返る() {
		int result = romaNumberChange.convertRomanNumber("xix");
		assertEquals(19, result);
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
	public void testローマ数字imを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("im");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字icicを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("icic");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字ivivを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("iviv");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字xcmを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("xcm");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字vmを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("vm");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字MCMCMを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("mcmcm");
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字CMMを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("cMM");
	}

	@Test
	public void testローマ数字mmmdccclxxxviiiを渡すと3888が返る() {
		int result = romaNumberChange.convertRomanNumber("mmmdccclxxxviii");
		assertEquals(3888, result);
	}

	@Test
	public void testローマ数字xiを渡すと11が返る() {
		int result = romaNumberChange.convertRomanNumber("xi");
		assertEquals(11, result);
	}

	@Test(expected = RuntimeException.class)
	public void testローマ数字mmmmを渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber("mmmm");
	}

	@Test
	public void test数字1を渡すとローマ数字Iが返る() {
		String result = romaNumberChange.convertRomanNumber(1);
		assertEquals("I", result);
	}

	@Test
	public void test数字3を渡すとローマ数字IIIが返る() {
		String result = romaNumberChange.convertRomanNumber(3);
		assertEquals("III", result);
	}

	@Test
	public void test数字４を渡すとローマ数字IVが返る() {
		String result = romaNumberChange.convertRomanNumber(4);
		assertEquals("IV", result);
	}

	@Test
	public void test数字10を渡すとローマ数字Xが返る() {
		String result = romaNumberChange.convertRomanNumber(10);
		assertEquals("X", result);
	}

	@Test
	public void test数字14を渡すとローマ数字XIVが返る() {
		String result = romaNumberChange.convertRomanNumber(14);
		assertEquals("XIV", result);
	}

	@Test
	public void test数字19を渡すとローマ数字XIXが返る() {
		String result = romaNumberChange.convertRomanNumber(19);
		assertEquals("XIX", result);
	}

	@Test
	public void test数字20を渡すとローマ数字XXが返る() {
		String result = romaNumberChange.convertRomanNumber(20);
		assertEquals("XX", result);
	}

	@Test
	public void test数字30を渡すとローマ数字XXXが返る() {
		String result = romaNumberChange.convertRomanNumber(30);
		assertEquals("XXX", result);
	}

	@Test
	public void test数字40を渡すとローマ数字XLが返る() {
		String result = romaNumberChange.convertRomanNumber(40);
		assertEquals("XL", result);
	}

	@Test
	public void test数字70を渡すとローマ数字LXXが返る() {
		String result = romaNumberChange.convertRomanNumber(70);
		assertEquals("LXX", result);
	}

	@Test
	public void test数字100を渡すとローマ数字Cが返る() {
		String result = romaNumberChange.convertRomanNumber(100);
		assertEquals("C", result);
	}

	@Test
	public void test数字400を渡すとローマ数字CDが返る() {
		String result = romaNumberChange.convertRomanNumber(400);
		assertEquals("CD", result);
	}

	@Test
	public void test数字900を渡すとローマ数字CMが返る() {
		String result = romaNumberChange.convertRomanNumber(900);
		assertEquals("CM", result);
	}

	@Test
	public void test数字999を渡すとローマ数字CMXCIXが返る() {
		String result = romaNumberChange.convertRomanNumber(999);
		assertEquals("CMXCIX", result);
	}

	@Test
	public void test数字99を渡すとローマ数字XCIXが返る() {
		String result = romaNumberChange.convertRomanNumber(99);
		assertEquals("XCIX", result);
	}

	@Test
	public void test数字１２００を渡すとローマ数字MCCが返る() {
		String result = romaNumberChange.convertRomanNumber(1200);
		assertEquals("MCC", result);
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
	public void test数字99を渡すとローマ数字が返る() {
		String result = romaNumberChange.convertRomanNumber(99);
		assertEquals("XCIX", result);
	}

	@Test(expected = RuntimeException.class)
	public void test数字4000を渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber(4000);

	}

	@Test(expected = RuntimeException.class)
	public void test数字4001を渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber(4001);

	}

	@Test(expected = RuntimeException.class)
	public void test数字0を渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber(0);

	}

	@Test(expected = RuntimeException.class)
	public void test数字マイナス1を渡すと例外が発生する() {
		romaNumberChange.convertRomanNumber(-1);

	}

}
