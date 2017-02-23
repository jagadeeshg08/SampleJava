import ChildJava.inherit;

/**
 * 
 */

/**
 * @author Narni
 *
 */
public class SampleJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi welcome to java");
		displayData();
		displayOfficeName();
		System.out.println("Addition of 10+10 is: "+(10+10));
		int c= addNum(6,7);
		System.out.println("Addition of 6+7 is: "+c);
		
	}
	public static void displayData(){
		System.out.println("Welcome to Akshar");
	}
	public static void displayOfficeName(){
		System.out.println("Welcome To Akshar School Solutions");
	}

	   static int addNum(int x, int y){
		return x+y;
	}
	


}
