package jp.leve_five.careerup.Roma;

import java.util.regex.Pattern;

public class ReplaceRomanToArabic {
	private int result = 0;

	public int convertRomanToNumber(String inputRoman) {
		char[] inputChar = inputRoman.toLowerCase().toCharArray();
		int previousNumber = 0;
		int currentNumber = 0;
		int countRoman = 0;

		for (int i = inputChar.length - 1; i >= 0; i--) {
			// 当てはまるローマ数字があれば、値を入れる。
			currentNumber = changeNumber(inputChar, i);
			countRoman++;

			// 文法上の誤りがないか確認。
			checkGrammaticalErrors(inputRoman.toLowerCase());

			// addResultAndDistinctionRomanメソッドにて返り値のresultの加算、一文字区切りができているかの判定
			if (addResultAndDistinctionRoman(inputChar, previousNumber,
					currentNumber, countRoman, i)) {
				countRoman = 0;
			}
			previousNumber = currentNumber;
		}
		return result;
	}

	private boolean addResultAndDistinctionRoman(char[] inputChar,
			int previousNumber, int currentNumber, int countRoman, int i) {
		if (previousNumber == 5
				&& currentNumber == 1
				|| previousNumber == 10 // iv,ix,xl,xcなどの処理
				&& currentNumber == 1 || previousNumber == 50
				&& currentNumber == 10 || previousNumber == 100
				&& currentNumber == 10 || previousNumber == 500
				&& currentNumber == 100 || previousNumber == 1000
				&& currentNumber == 100) {
			result -= currentNumber;
			return true;
			// 同文字列が３つ並んだ場合のケースiii,xxx,cccなど OR 今の値が前の値にたいして（５倍もしくは１０倍）ではないケース
		} else if ((countRoman == 3)
				|| ((previousNumber * 5 != currentNumber || previousNumber * 10 != currentNumber)
						&& currentNumber > previousNumber && i < inputChar.length - 1)) {
			result += currentNumber;
			return true;
		} else {
			result += currentNumber;
			if (i == 0) {// 次の要素がなければ、trueにする
				return true;
			}
			return false;
		}
	}

	private void checkGrammaticalErrors(String inputRoman) {
		if (Pattern.matches(".*i{4,}.*", inputRoman)
				|| Pattern.matches(".*x{4,}.*", inputRoman)
				|| Pattern.matches(".*c{4,}.*", inputRoman)
				|| Pattern.matches(".*m{4,}.*", inputRoman)
				|| Pattern.matches(".*v{2,}.*", inputRoman)
				|| Pattern.matches(".*l{2,}.*", inputRoman)
				|| Pattern.matches(".*d{2,}.*", inputRoman)
				|| Pattern.matches(".*[iv]+.*(i[vx])+.*", inputRoman)
				|| Pattern.matches(".*i+.*([vx]i)+.*", inputRoman)
				|| Pattern.matches(".*[iv]+.*x+[vi]+.*", inputRoman)
				|| Pattern.matches(".*[xl]+.*(x[lc])+.*", inputRoman)
				|| Pattern.matches(".*x+.*([lc]x)+.*", inputRoman)
				|| Pattern.matches(".*[xcd]+.*(c[dm])+.*", inputRoman)
				|| Pattern.matches(".*c+.*([dm]c)+.*", inputRoman)
				|| Pattern.matches(".*[ivxld]+m+c*.*", inputRoman)
				|| Pattern.matches(".*[ivxld]+d+c*.*", inputRoman)
				|| Pattern.matches(".*[ivxcld]+m+d+.*", inputRoman)
				|| Pattern.matches(".*[iv]+c+.*", inputRoman)
				|| Pattern.matches(".*[iv]+l+.*", inputRoman)
				|| Pattern.matches(".*v+x+.*", inputRoman)
				|| Pattern.matches(".*c+m{2,}.*", inputRoman)
				|| Pattern.matches(".*x+c{2,}.*", inputRoman)
				|| Pattern.matches(".*i+x{2,}.*", inputRoman)) {
			throw new RuntimeException("ローマ字記法の文法ではありません。*999");
		}
	}

	private int changeNumber(char[] inputChar, int i) {
		switch (inputChar[i]) {
		case 'i':
			return 1;
		case 'v':
			return 5;
		case 'x':
			return 10;
		case 'l':
			return 50;
		case 'c':
			return 100;
		case 'd':
			return 500;
		case 'm':
			return 1000;
		default:
			throw new RuntimeException("ローマ数字以外の文字があります。");
		}
	}

}
