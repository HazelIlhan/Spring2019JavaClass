package day26;

import java.util.Arrays;

public class ReverseanArrayReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numbers= {11,2,39,7,4,15};
        //0  1  2 3 4 5

int count=numbers.length; 
int lastIndex=count-1;
for(int i=0; i<count/2;i++) {
	int temp=numbers[i];
	numbers[i]=numbers[lastIndex-i];
	numbers[lastIndex-i]=temp;
	
	//11 2 39 18 7 4 15 
	
	// 11 15 yerine /// 2  4 yerine//3 7 yerine /7 39 yerine 4 2 yerine gibi 
	
	
}
System.out.println(Arrays.toString(numbers));

	}

}
