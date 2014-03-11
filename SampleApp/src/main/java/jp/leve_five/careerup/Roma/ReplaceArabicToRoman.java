package jp.leve_five.careerup.Roma;

public class ReplaceArabicToRoman {
	// ”š‚Ì•¶š—ñ‚ğƒ[ƒ}”š‚É•ÏŠ·
	public String convertNumberToRoman(int inputNumber) {
		// “ü—Í’l‚ª4000–¢–‚à‚µ‚­‚Í‚PˆÈã‚Å‚ ‚é‚©”»’è
		isNumberWithinNormalLimits(inputNumber);

		String numberString = String.valueOf(inputNumber);
		byte stringBytes[] = numberString.getBytes();
		StringBuffer resultRoman = new StringBuffer();

		// ƒ[ƒ}”š‚Ì2ŸŒ³”z—ñ@”z—ñ‚ÌƒCƒ“ƒfƒbƒNƒX‚É‡‚í‚¹‚ÄA‚P`‚XA‚P‚O`‚X‚OA‚P‚O‚O`‚X‚O‚OC‚P‚O‚O‚O`‚S‚O‚O‚O‚Ü‚Å
		String romanTable[][] = {
				{ "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", },
				{ "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", },
				{ "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm", },
				{ "", "m", "mm", "mmm", "", "", "", "", "", "", } };

		addRoman(stringBytes, resultRoman, romanTable);
		System.out.println(stringBytes);
		return resultRoman.toString().toUpperCase();
	}

	private void isNumberWithinNormalLimits(int inputNumber) {
		if (inputNumber >= 4000 || 0 >= inputNumber) {
			throw new RuntimeException("•ÏŠ·”ÍˆÍŠO‚Å‚·," + "1~3999‚Ü‚Å‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		}
	}

	// StringBuffer roman‚É“ü—Í’l‚ÌŒ…‚É•¶š—ñ‚ğ’Ç‰Á‚·‚éswitch•¶
	private void addRoman(byte[] stringBytes, StringBuffer resultRoman,
			String[][] romanTable) {
		int numberDigit = stringBytes.length;
		int byteDigit = 0;
		
		switch (numberDigit) {
		default:
			throw new RuntimeException("–³Œø‚È”’l‚Å‚·");
		case 4:
			resultRoman.append(romanTable[3][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 3:
			resultRoman.append(romanTable[2][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 2:
			resultRoman.append(romanTable[1][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 1:
			resultRoman.append(romanTable[0][(stringBytes[byteDigit] - '0')]);
		}
	}

}
