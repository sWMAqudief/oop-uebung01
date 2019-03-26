package ueb01;

import java.util.Arrays;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		if(s.length() == 1)
		{
			return true;
		}
		CharStackImpl stack = new CharStackImpl();
		s = s.replaceAll(" ", "");
		s = s.toLowerCase();
		char[] array = s.toCharArray();
		for(int k = 0; k < array.length; k++)
		{
			stack.push(array[k]);
		}
		int laenge = stack.size();
		char[] vonhinten = new char[laenge];
		for(int j = 0; j < vonhinten.length; j++)
		{
			vonhinten[j] = stack.pop();
		}
		return Arrays.equals(array, vonhinten);
	}
}
