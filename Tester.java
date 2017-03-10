import java.util.Random;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Random random = new Random(8415);
		for(String arg: args){
			int N = Integer.parseInt(arg);
			new Assignment(N, random);
		}
	}

}
