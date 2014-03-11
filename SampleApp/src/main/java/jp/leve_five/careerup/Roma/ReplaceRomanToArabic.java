package jp.leve_five.careerup.Roma;

public class ReplaceRomanToArabic {
	private boolean romaTrue = false;
	private int resultAdd = 0;
	public int convertRomanToNumber(String inputRoman) {
		char[] inputChar = inputRoman.toLowerCase().toCharArray();
		int previousNumber = 0;
		int currentNumber = 0;
		int result = 0;		
		int countRoman = 0;
		
		for (int i = inputChar.length - 1; i >= 0; i--) {
			// ���Ă͂܂郍�[�}����������΁A�l������B
			currentNumber = changeNumber(inputChar, i);
			countRoman++;
			// ���@��̌�肪�Ȃ����m�F�B
			checkGrammaticalError(inputChar, previousNumber, currentNumber, countRoman, i);
			// ���[�}�����̈ꕶ���Ƃ��Ĕ��肳����true���Aresult�ɉ��Z����
			addResultAndDistinctionRoman(inputChar, previousNumber,
					currentNumber, countRoman, i);
			// �ꕶ���Ƃ��ĔF���ł����result�ɉ��Z�B���Z�b�g������B
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
				|| previousNumber == 10 // iv,ix,xl,xc�Ȃǂ̏���
				&& currentNumber == 1 || previousNumber == 50
				&& currentNumber == 10 || previousNumber == 100
				&& currentNumber == 10 || previousNumber == 500
				&& currentNumber == 100 || previousNumber == 1000
				&& currentNumber == 100) {
			romaTrue = true;
			resultAdd += currentNumber * -1;
			if (i > 0) { // ���̗v�f������ꍇ�́A���̗v�f�ƍ��A�O�̒l���r�B
				if (currentNumber > changeNumber(inputChar, i - 1)
						|| previousNumber >= changeNumber(inputChar, i - 1)) {
					throw new RuntimeException("���[�}���L�@�̕��@�ł͂���܂���B*3");
				}
			}
		} else if (countRoman == 3) {//�������񂪂R���񂾏ꍇ�̃P�[�Xiii,xxx,ccc�Ȃ�
			romaTrue = true;
			resultAdd += currentNumber;
			// iiii,xxxx,cccc�Ȃǂ̗�O����
			if (i > 0) {
				if (currentNumber == changeNumber(inputChar, i - 1)) {
					throw new RuntimeException("�����������S�ȏ�g���Ă͂����܂���B");
				}
			}
		  //���̒l���O�̒l�ɂ������āi�T�{�������͂P�O�{�j�ł͂Ȃ��P�[�X
		} else if ((previousNumber * 5 != currentNumber || previousNumber * 10 != currentNumber)
				&& currentNumber > previousNumber && i < inputChar.length - 1) {
			romaTrue = true;
			resultAdd += currentNumber;
		} else {
			resultAdd += currentNumber;
			if (i == 0) {//���̗v�f���Ȃ���΁Atrue�ɂ���
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
			throw new RuntimeException("���[�}���L�@�̕��@�ł͂���܂���B*1");
		}
		if (count > 4) {
			throw new RuntimeException("���[�}���L�@�̕��@�ł͂���܂���B*2");
		}

		if (i != 0
				&& (currentNumber == 5 || currentNumber == 50 || currentNumber == 500)) {
			for (int j = i - 1; j >= 0; j--) {
				if (currentNumber == changeNumber(inputChar, j)) {
					throw new RuntimeException("�d�����Ă͂����Ȃ������񂪂���܂��B");
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
			throw new RuntimeException("���[�}�����ȊO�̕���������܂��B");
		}
	}

}
