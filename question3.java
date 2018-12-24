package intro;

import java.util.Arrays;
import java.util.Random;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[500];

		int i=0;
		Random rand = new Random();
		for(i=0;i<500;i++){				
			//1000 is maximum, 1 is minimum
			int n = rand.nextInt(1000) + 1;
			//insert the random number to the next place in the array
			numbers[i] = n;	
		}
  // sorting the array
  Arrays.sort(numbers);  
 
	  int largest = Integer.MIN_VALUE;
	  int smallest = Integer.MAX_VALUE;
      for (int number : numbers) {
          if (number > largest) {
              largest = number;
          } else if (number < smallest) {
              smallest = number;
              System.out.println(number);

  }
  
  
	}

}

	



	}


