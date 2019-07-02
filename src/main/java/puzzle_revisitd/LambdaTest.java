package puzzle_revisitd;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringLengthLambda stringLengthLambda =  (String s1)-> s1.length();
System.out.println(stringLengthLambda.getLength("Anirban "));
	}

	interface StringLengthLambda
	{

		int getLength(String s);
	}

}
