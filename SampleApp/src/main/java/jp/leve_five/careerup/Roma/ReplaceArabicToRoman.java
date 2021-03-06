package jp.leve_five.careerup.Roma;

public class ReplaceArabicToRoman {
	// 数字の文字列をローマ数字に変換
	public String convertNumberToRoman(int inputNumber) {
		// 入力値が4000未満もしくは１以上であるか判定
		isNumberWithinNormalLimits(inputNumber);

		String numberString = String.valueOf(inputNumber);
		byte stringBytes[] = numberString.getBytes();
		StringBuilder resultRoman = new StringBuilder();

		// ローマ数字の2次元配列　配列のインデックスに合わせて、１〜９、１０〜９０、１００〜９００，１０００〜４０００まで
		String romanTable[][] = {
				{ "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "ix", },
				{ "", "x", "xx", "xxx", "xl", "l", "lx", "lxx", "lxxx", "xc", },
				{ "", "c", "cc", "ccc", "cd", "d", "dc", "dcc", "dccc", "cm", },
				{ "", "m", "mm", "mmm", "", "", "", "", "", "", } };

		addRoman(stringBytes, resultRoman, romanTable);
		return resultRoman.toString().toUpperCase();
	}

	private void isNumberWithinNormalLimits(int inputNumber) {
		if (inputNumber >= 4000 || 0 >= inputNumber) {
			throw new RuntimeException("変換範囲外です," + "1~3999までを入力してください");
		}
	}

	// StringBuffer romanに入力値の桁に文字列を追加するswitch文
	private void addRoman(byte[] stringBytes, StringBuilder resultRoman,
			String[][] romanTable) {
		int numberDigit = stringBytes.length;
		int byteDigit = 0;
		
		switch (numberDigit) {
		default:
			throw new RuntimeException("無効な数値です");
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
