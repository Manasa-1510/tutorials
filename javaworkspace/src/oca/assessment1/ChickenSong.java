package oca.assessment1;
/*
* 21-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. The code will not compile because of line 6.
B. The code will not compile because of lines 7–8.
C. The application will compile but not produce any output.
D. The application will output Cluck exactly once.
E. The application will output Cluck more than once.
F. The application will compile but produce an exception at runtime.
*/
/*
D, E, F. The code compiles without issue, so options A and B are incorrect. If house
.getChickens() returns an array of one element, the code will output Cluck once, so
option D is correct. If house.getChickens() returns an array of multiple elements, the
code will output Cluck once for each element in the array, so option E is correct. Alternatively,
if house.getChickens() returns an array of zero elements, then the code will throw an IndexOutOfBoundsException on the call to house.getChickens().get(0);
therefore, option C is not possible and option F is correct. The code will also throw an
exception if the array returned by house.getChickens() is null, so option F is possible
under multiple circumstances. For more information, see Chapter 2.
*/

class Chicken{ }
interface HenHouse { public java.util.List<Chicken> getChickens();}
class Hen implements HenHouse{
	
	public java.util.List<Chicken> getChickens(){
		Chicken chicken = new Chicken();
		java.util.List chickenList = new java.util.ArrayList<Chicken>();
		chickenList.add(chicken);
		return chickenList;
	}
}
public class ChickenSong{
	public static void main(String[] args){
		HenHouse house = new Hen();
		Chicken chicken = house.getChickens().get(0);
		for(int i=0; i< house.getChickens().size();
			chicken = house.getChickens().get(i++)){
			System.out.println("Cluck");
		}
	}
}

