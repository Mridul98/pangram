import java.util.Arrays;
import java.util.Scanner;

public class Pangram {

	static char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
			'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			'w', 'x', 'y', 'z' };
	static String test_sent = "turn up that motherfucking volume.";//this is the sentence to test if it is pangram or not
	static char[] sentence = new char[test_sent.length()];

	public static char[] toCharracterArray(String s) {
		for (int i = 0; i < s.length(); i++) {
			sentence[i] = s.charAt(i);

		}
		return sentence;
	}

	public static void main(String[] args) {
		char[] got = new char[26];
		char[] present = new char[got.length];
		int missing_letters = 0;
		int counter = 0;
		System.out.println(test_sent.length());
		

		toCharracterArray(test_sent);
		Arrays.sort(sentence);
		
		System.out.println(sentence.length);
		System.out.println(sentence);
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i] == 'a') {
				got[0] = 'a';
				continue;
			}
			if (sentence[i] == 'b') {
				got[1] = 'b';
				continue;

			}
			if (sentence[i] == 'c') {
				got[2] = 'c';
				continue;

			}
			if (sentence[i] == 'd') {
				got[3] = 'd';
				continue;

			}
			if (sentence[i] == 'e') {
				got[4] = 'e';
				continue;

			}
			if (sentence[i] == 'f') {
				got[5] = 'f';
				continue;

			}
			if (sentence[i] == 'g') {
				got[6] = 'g';
				continue;

			}
			if (sentence[i] == 'h') {
				got[7] = 'h';
				continue;

			}
			if (sentence[i] == 'i') {
				got[8] = 'i';
				continue;

			}
			if (sentence[i] == 'j') {
				got[9] = 'j';
				continue;

			}
			if (sentence[i] == 'k') {
				got[10] = 'k';
				continue;

			}
			if (sentence[i] == 'l') {
				got[11] = 'l';
				continue;

			}
			if (sentence[i] == 'm') {
				got[12] = 'm';
				continue;

			}
			if (sentence[i] == 'n') {
				got[13] = 'n';
				continue;

			}
			if (sentence[i] == 'o') {
				got[14] = 'o';
				continue;

			}
			if (sentence[i] == 'p') {
				got[15] = 'p';
				continue;

			}
			if (sentence[i] == 'q') {
				got[16] = 'q';
				continue;

			}
			if (sentence[i] == 'r') {
				got[17] = 'r';
				continue;

			}
			if (sentence[i] == 's') {
				got[18] = 's';
				continue;

			}
			if (sentence[i] == 't') {
				got[19] = 't';
				continue;

			}
			if (sentence[i] == 'u') {
				got[20] = 'u';
				continue;

			}
			if (sentence[i] == 'v') {
				got[21] = 'v';
				continue;

			}
			if (sentence[i] == 'w') {
				got[22] = 'w';
				continue;

			}
			if (sentence[i] == 'x') {
				got[23] = 'x';
				continue;

			}
			if (sentence[i] == 'y') {
				got[24] = 'y';
				continue;

			}
			if (sentence[i] == 'z') {
				got[25] = 'z';
				continue;

			}

		}
		for (int i = 0; i < got.length; i++) {
			System.out.print(got[i]);
		}
		System.out.println();
		for (int i = 0; i < got.length; i++) {
			if (got[i] == 0) {
				missing_letters++;
			}
		}
		System.out.println();
		System.out.println(missing_letters);
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i]);
		}
  System.out.println();
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (got[j] == 0) {
					present[j] = alphabet[j];
				}
				if (got[j] == alphabet[i]) {

					counter++;

					continue;
				}

			}
		}
		if (counter == 26) {
			System.out.println("yes");   //if the final array has exactly 26 letters to proof the sentence as pangram
		} else
			System.out.println("no");
		for (int i = 0; i < present.length; i++) {
			System.out.print(present[i]);
		}
		System.out.println(missing_letters);

	}
	

}
