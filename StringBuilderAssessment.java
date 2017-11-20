package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. true is printed out exactly once.
B. true is printed out exactly twice.
C. true is printed out exactly three times.
D. true is printed out exactly four times.
E. The code does not compile.
*/
/*
2. C. String literals are used from the string pool. This means that s1 and s2 refer to the
same object and are equal. Therefore, the first two print statements print true. The
third print statement prints false because toString() uses a method to compute the
value and it is not from the string pool. The final print statement again prints true
because equals() looks at the values of String objects.
*/
import java.util.*;
public class StringBuilderAssessment{
	
	public static void main(String[] args){
		
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}
}