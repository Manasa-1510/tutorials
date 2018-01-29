package oca.mockTest;
	
	interface TestA { String toString(); }
	
	public class HelloWorldAnonymous{
		static String name = "manasa";
		public static void main(String[] args){
			System.out.println(
			new TestA() {
				public String toString() { 
				System.out.println(name);
				 return "test";
				}
			}
			);
		}

	}
