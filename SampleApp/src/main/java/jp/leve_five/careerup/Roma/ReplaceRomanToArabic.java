package jp.leve_five.careerup.Roma;

public class ReplaceRomanToArabic {
	private boolean romaTrue = false;
	private int resultAdd = 0;
	public int convertRomanToNumber(String romaString) {
		char[] inputChar = romaString.toLowerCase().toCharArray();
		int previousNumber = 0;
		int currentNumber = 0;
		int result = 0;		
		int countRoman = 0;
		
		for (int i = inputChar.length - 1; i >= 0; i--) {
			// 当てはまるローマ数字があれば、値を入れる。
			currentNumber = changeNumber(inputChar, i);
			countRoman++;
			// 文法上の誤りがないか確認。
			checkGrammaticalError(inputChar, previousNumber, currentNumber, countRoman, i);
			// ローマ数字の一文字として判定されればtrueし、resultに加算する
			addResultAndDistinctionRoman(inputChar, previousNumber,
					currentNumber, countRoman, i);
			// 一文字として認識できればresultに加算。リセットをする。
			if (romaTrue) {
				result += resultAdd;
				countRoman = 0;
				resultAdd = 0;
				romaTrue = false;
			}			
			previousNumber = currentNumber;
		}
		return result;
	}


	private void addResultAndDistinctionRoman(char[] inputChar,
			int previousNumber, int currentNumber, int countRoman, int i) {
		if (previousNumber == 5
				&& currentNumber == 1
				|| previousNumber == 10 // iv,ix,xl,xcなどの処理
				&& currentNumber == 1 || previousNumber == 50
				&& currentNumber == 10 || previousNumber == 100
				&& currentNumber == 10 || previousNumber == 500
				&& currentNumber == 100 || previousNumber == 1000
				&& currentNumber == 100) {
			romaTrue = true;
			resultAdd += currentNumber * -1;
			if (i > 0) { // 次の要素がある場合は、次の要素と今、前の値を比較。
				if (currentNumber > changeNumber(inputChar, i - 1)
						|| previousNumber >= changeNumber(inputChar, i - 1)) {
					throw new RuntimeException("ローマ字記法の文法ではありません。*3");
				}
			}
		} else if (countRoman == 3) {//同文字列が３つ並んだ場合のケースiii,xxx,cccなど
			romaTrue = true;
			resultAdd += currentNumber;
			// iiii,xxxx,ccccなどの例外処理
			if (i > 0) {
				if (currentNumber == changeNumber(inputChar, i - 1)) {
					throw new RuntimeException("同じ文字を４つ以上使ってはいけません。");
				}
			}
		  //今の値が前の値にたいして（５倍もしくは１０倍）ではないケース
		} else if ((previousNumber * 5 != currentNumber || previousNumber * 10 != currentNumber)
				&& currentNumber > previousNumber && i < inputChar.length - 1) {
			romaTrue = true;
			resultAdd += currentNumber;
		} else {
			resultAdd += currentNumber;
			if (i == 0) {//次の要素がなければ、trueにする
				romaTrue = true;
			}
		}
	}


	private void checkGrammaticalError(char[] inputChar, int minNumber,
			int currentNumber, int count, int i) {
		if (i != inputChar.length - 1
				&& minNumber > currentNumber
				&& !(currentNumber == minNumber
						|| currentNumber * 5 == minNumber || currentNumber * 10 == minNumber)
				|| (minNumber > currentNumber && count >= 3)) {
			throw new RuntimeException("ローマ字記法の文法ではありません。*1");
		}
		if (count > 4) {
			throw new RuntimeException("ローマ字記法の文法ではありません。*2");
		}

		if (i != 0
				&& (currentNumber == 5 || currentNumber == 50 || currentNumber == 500)) {
			for (int j = i - 1; j >= 0; j--) {
				if (currentNumber == changeNumber(inputChar, j)) {
					throw new RuntimeException("重複してはいけない文字列があります。");
				}
			}
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
