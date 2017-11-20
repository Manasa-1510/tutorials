package oca.assessment1;
/*
* 20-11-2017 : This class is part of assessment for OCA certification SE8 Programmer 1 by Boyarsky Jeanne, Selikoff Scott
* @author : Manasa Venkatesh
*/
/*
A. [8]
B. [9]
C. Something like [Ljava.lang.String;@160bc7c0
D. An exception is thrown.
E. The code does not compile.
*/
/*
B. The array is allowed to use an anonymous initializer because it is in the same line as
the declaration. The ArrayList uses the diamond operator allowed since Java 7. This
specifies the type matches the one on the left without having to re-type it. After adding
the two elements, list contains [6, 8]. We then replace the element at index 1 with 9,
resulting in [6, 9]. Finally, we remove the element at index 0, leaving [9]. Option C
is incorrect because arrays output something like that rather than an ArrayList. For
more information, see Chapter 3.
*/
import java.util.*;
public class ArrayListSample{
	
	int[] array = {6,8,9};
	List<Integer> list = new ArrayList<Integer>();

	System.out.println(array[0]);
	/*list.add(array[0]);
	list.add(array[2]);
	list.set(1,array[1]);
	list.remove(0);
	System.out.println(list);*/
}