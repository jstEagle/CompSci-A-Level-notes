### Bubble sort 1D array
```java
import java.util.Random;

public class BubbleSort1D {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] nums = new int[100];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(0, 101);
		}
		
		//Bubble sort
		boolean swapped = true;
		
		do {
			swapped = false;
			
			for(int i = 0; i < nums.length; i++) {
				for(int j = 1; j < nums.length; j++) {
					int placeHolder = nums[j - 1]; //could also be nums[j]
					
					if(nums[j-1] > nums[j]) {
						nums[j-1] = nums[j];
						nums[j] = placeHolder;
						swapped = true;
					}
				}
			}
		} while(swapped);
	}
}
```

### Bubble sort 2D
```java
import java.util.Random;

public class Bubblesort2D {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int[][] nums = new int[10][10];
		
		for(int i = 0; i < nums.length; i ++) {
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = rand.nextInt(0, 101);
			}
		}
		
		//Bubble sort
		
	}
}
```

### Pseudocode

```Pseudocode
FUNCTION BubbleSort(Byval numbers : ARRAY) RETURNS ARRAY
	DECLARE Swapped : BOOLEAN
	DECLARE j : INTEGER
	DECLARE placeHolder : INTEGER

	Swapped <- TRUE

	WHILE Swapped = TRUE
		Swapped <- FALSE
		FOR j <- 1 TO LENGTH(numbers)
			placeHolder <- numbers[j]
			
			IF numbers[j] >= numbers[j+1]
				THEN
					numbers[j] <- numbers[j+1]
					numbers[j+1] <- placeHolder
					Swapped <- TRUE
			ENDIF
		NEXT j

	ENDWHILE
	
	RETURN numbers
ENDFUNCTION
```