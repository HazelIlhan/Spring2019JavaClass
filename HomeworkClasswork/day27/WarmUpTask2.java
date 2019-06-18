package day27;

import java.util.Arrays;

public class WarmUpTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Task 2 :
//		given : 

//
//		use the method your learned to get each words and store it into String array: 
//
//		loop through each items -- 
//		  in each iteration loop : 
//		  	 turn each word into char array 
//		  	 print each char out with seperated by -
//		output : 
//			C-y-b-e-r-t-e-k-
//			B-a-t-c-h-
//			S-p-a-r-t-a-n-
//			i-s-
//			m-o-s-t-
//			h-a-r-d-w-o-r-k-i-n-g-
//			b-a-t-c-h-
//			e-v-e-r-
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		// cybertek ten word[i] yaptik tek yerine whole
		// 2.simdi butun wordlere gecmek icin burayi ekledik
		for (int  i = 0;  i < words.length;  i++) {
			
			System.out.println(words[ i]);
			String one = words[i];
			char[] cyberChars = one.toCharArray(); 
			for ( int  j = 0;  j < cyberChars.length;  j++) {
				System.out.print(cyberChars[j] + "-"); 
				// bu sadece cybertek icin simdi butun hepsini yapmamiz lazim

			}
System.out.println();
// alttaki for loop disindaydi ama bunu repeat etmek icin iceriye aldik 
			// Char helps getting each character from array
			// method to character away out of a string bunu char arrya cevirmezsem [i]
			// kullanarak her bir
			// karakteri alamam
			//System.out.println(cyberChars);
			
			// only thing change is word how can we replace this word with next one o zaman
			// en uste yeni bir loop ekle
// once charden basladik sinra word e ciktik yeni bir loop ekleyip char i icine aldik yeni word e gecmek icin 
// eger deseydikki sentencelar biren fazla o zaman yenir loop acicaz sentence array loop 
//bu sefer hepsini iceri alacagiz String str1=sentence[k] gibi
		}
	}

}
