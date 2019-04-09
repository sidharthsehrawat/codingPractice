package com.StringProgrammes;

//code to reverse each word of a given string
public class Reverse_Each_Word_OF_String {
	public String ReverseMethod(String str) {
		char[] ch = str.toCharArray();
		int count = 0;
		int k = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				count++;
			} else {
				--i;
				k = count-1 ;
				reverse(ch, i - k, i);
				i++;
				count=0;

			}

		}

		return String.valueOf(ch);

	}

	public char[] reverse(char[] ch2, int i, int j) {
		char temp;
		
		if(j<2) {
			temp = ch2[i];
			ch2[i] = ch2[j];
			ch2[j] = temp;	
		}
		else {
			if(j/2==0) {
				while (i < j / 2) {
					temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
					i++;
					j--;
				}	
			}
			else {
				while (i <=j / 2) {
					temp = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = temp;
					i++;
					j--;
				}
			}
			
		
		}

		return ch2;

	}

	public static void main(String[] args) {
		Reverse_Each_Word_OF_String ob = new Reverse_Each_Word_OF_String();

		String str = "My Name Is Messi";
		String res = ob.ReverseMethod(str);
		System.out.println(res);
	}

}
