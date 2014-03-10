package jp.leve_five.careerup.Roma;

public class ReplaceArabicToRoman {
	// ”š‚Ì•¶š—ñ‚ğƒ[ƒ}”š‚É•ÏŠ·
	public String changeNumberToRoman(int numberInt)
			throws RuntimeException {
		// “ü—Í’l‚ª4000–¢–‚à‚µ‚­‚Í‚PˆÈã‚Å‚ ‚é‚©”»’è
		if (numberInt >= 4000 || 0 >= numberInt) {
			throw new RuntimeException("•ÏŠ·”ÍˆÍŠO‚Å‚·");
		}
		String numberString = String.valueOf(numberInt);

		byte stringBytes[] = numberString.getBytes();
		StringBuffer roman = new StringBuffer();
		int numberDigit = stringBytes.length;
		int byteDigit = 0;
		// ƒ[ƒ}”š‚Ì2ŸŒ³”z—ñ@”z—ñ‚ÌƒCƒ“ƒfƒbƒNƒX‚É‡‚í‚¹‚ÄA‚P`‚XA‚P‚O`‚X‚OA‚P‚O‚O`‚X‚O‚OC‚P‚O‚O‚O`‚S‚O‚O‚O‚Ü‚Å
		String romanTable[][] = {
				{ "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", },
				{ "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", },
				{ "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm", },
				{ "", "m", "mm", "mmm", "mmmm", "", "", "", "", "", } };

		// StringBuffer roman‚É“ü—Í’l‚ÌŒ…‚É•¶š—ñ‚ğ’Ç‰Á‚·‚éswitch•¶
		addRoman(stringBytes, roman, numberDigit, byteDigit, romanTable);
		return roman.toString().toUpperCase();
	}

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
