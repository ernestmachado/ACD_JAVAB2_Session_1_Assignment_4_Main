package ASSIGNMENTS;

public class Assignment1_4 {
//Write a program to print the characters corresponding to ASCII codes from 65 to 90.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num=65;num<=90;num++)
		{
			char letter=(char)num;  /// This will convert the numeric ASCII value of num to the corrosponding char
			System.out.println(num+"-"+letter);
		}
	}

}
