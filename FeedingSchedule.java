package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification SE8 Programmer 1 by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
/*
A. 4
B. 5
C. 6
D. 7
E. 13
F. The code will not compile because of line 7.
/*C. The code compiles and runs without issue; therefore, option F is incorrect. This type
of problem is best examined one loop iteration at a time:
■ The loop continues as count loop expression evaluates to 0 < 3, which is true,
with y taking a new value of 1. The value of y is set to:
y = (1 + 2 * 1) % 3
= (1 + 2) % 3
= 3 % 3
= 0
■ The first case block is called and the value of x is then set to:
x = 3 - 1 = 2
 The loop continues as count loop expression evaluates to 1 < 3, which is true,
with y taking a new value of 2. The value of y is set to:
y = (1 + 2 * 2) % 3
= (1 + 4) % 3
= 4 % 3
= 2
The default block is called and the value of x is set to:
x = 2 - 1 = 1
■ The loop continues as the count loop expression evaluates to 2 < 3, which is true,
with y taking a new value of 3. The value of y is set to:
y = (1 + 2 * 3) % 3
= (1 + 6) % 3
= 7 % 3
= 1
■ The second case block is called and the value of x is then set to:
x = 1 + 5 = 6
■ The loop ends as the count loop expression evaluates to 3 < 3, with y also taking a
new value of 4. The most recent value of x, 6, is output, so the answer is option C.
For more information, see Chapter 2.
*/

public class FeedingSchedule{
	
	public static void main(String[] args){
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while(count++ < 3){
		int	y = (1 + 2 * count)% 3;
			switch(y){
				default: System.out.println("value of x :"+x);
				case 0 : x -=1; 
						 System.out.println("value of count :"+ count);
						System.out.println("value of x :"+x);
						break;
				case 1 : x +=5;			
			}
		}
		System.out.println("The value of X is :" + x);
	}
}