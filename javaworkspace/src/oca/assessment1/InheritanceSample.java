package oca.assessment1;
/*
* 21-11-2017 : This class is part of assessment for OCA certification
* @author : Manasa Venkatesh
*/
/*
A. The code compiles without issue.
B. Remove the default method modifier and method implementation on line 1.
C. Remove the default method modifier and method implementation on line 2.
D. Remove the default method modifier and method implementation on lines 1 and 2.
E. Change the return value on line 1 from null to "Animal".
F. Override the getName() method with an abstract method in the Otter class.
G. Override the getName() method with a concrete method in the Otter class.
*/
/*
D, F, G. The code does not compile, since a class cannot inherit two interfaces that
both define default methods with the same signature, unless the class implementing
the interfaces overrides it with an abstract or concrete method. Therefore, option A is
incorrect and options F and G are correct. The alternate approach is to make the
getName() method abstract in the interfaces, because an interface may inherit two
abstract methods with the same signature. The change must be made to both interfaces,
though, so options B and C are incorrect if taken individually, and option D is
correct since the changes are taken together. For more information, see Chapter 5.
*/
interface Animal { public default String getName() { return null; }}
interface Mammal { public default String getName() { return null; }}
abstract class Otter implements Animal,Mammal
{
	public String getName(){
	System.out.println("Abstract class");
	return "";
}

}

public class InheritanceSample extends Otter {
	  public static void main (String[] args){
      InheritanceSample hello = new InheritanceSample();
      hello.getName();

}