package jp.leve_five.careerup.Roma;

public class ReplaceArabicToRoman {
	// ”š‚Ì•¶š—ñ‚ğƒ[ƒ}”š‚É•ÏŠ·
	public String convertNumberToRoman(int inputNumber) {
		// “ü—Í’l‚ª4000–¢–‚à‚µ‚­‚Í‚PˆÈã‚Å‚ ‚é‚©”»’è
		isNumberWithinNormalLimits(inputNumber);
		
		String numberString = String.valueOf(inputNumber);
		byte stringBytes[] = numberString.getBytes();
		StringBuffer resultRoman = new StringBuffer();
		int numberDigit = stringBytes.length;
		int byteDigit = 0;
		// ƒ[ƒ}”š‚Ì2ŸŒ³”z—ñ@”z—ñ‚ÌƒCƒ“ƒfƒbƒNƒX‚É‡‚í‚¹‚ÄA‚P`‚XA‚P‚O`‚X‚OA‚P‚O‚O`‚X‚O‚OC‚P‚O‚O‚O`‚S‚O‚O‚O‚Ü‚Å
		String romanTable[][] = {
				{ "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", },
				{ "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", },
				{ "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm", },
				{ "", "m", "mm", "mmm", "mmmm", "", "", "", "", "", } };

		addRoman(stringBytes, resultRoman, numberDigit, byteDigit, romanTable);
		return resultRoman.toString().toUpperCase();
	}

	private void isNumberWithinNormalLimits(int numberInt) {
		if (numberInt >= 4000 || 0 >= numberInt) {
			throw new RuntimeException("•ÏŠ·”ÍˆÍŠO‚Å‚·");
		}
	}

	// StringBuffer roman‚É“ü—Í’l‚ÌŒ…‚É•¶š—ñ‚ğ’Ç‰Á‚·‚éswitch•¶
	private void addRoman(byte[] stringBytes, StringBuffer roman,
			int numberDigit, int byteDigit, String[][] romanTable) {
		switch (numberDigit) {
		default:
			throw new RuntimeException("–³Œø‚È”’l‚Å‚·");
		case 4:
			roman.append(romanTable[3][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 3:
			roman.append(romanTable[2][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 2:
			roman.append(romanTable[1][(stringBytes[byteDigit] - '0')]);
			byteDigit++;
		case 1:
			roman.append(romanTable[0][(stringBytes[byteDigit] - '0')]);
		}
	}

}
