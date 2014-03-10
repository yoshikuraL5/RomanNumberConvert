package jp.leve_five.careerup.Roma;

public class RomaNumberChange {
	//引数が数字であれば、ローマ数字を返す。
	public String convertRomanNumber(int inputNumber) {
		ReplaceArabicToRoman replaceArabicRoman = new ReplaceArabicToRoman();
		return replaceArabicRoman.convertNumberToRoman(inputNumber);
	}
	//引数が文字であれば、アラビア数字を返す。
	public int convertRomanNumber(String inputRoman) {
		ReplaceRomanToArabic replaceRomanArabic = new ReplaceRomanToArabic();
		return replaceRomanArabic.convertRomanToNumber(inputRoman);
	}


}
