import java.util.Random;


public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Random random = new Random(8415);
	    if (args.length < 3){
	    	System.err.println("Invalid number of number of arguments!");
	    	System.exit(-1);
	    }
	    try{
			for(String arg: args){
				int N = Integer.parseInt(arg);
				new Assignment(N, random);
			}
		}
	    catch(NumberFormatException e){
	    	System.err.println("Invalid input: expected integer values");
	    	System.exit(-1);
	    }
	}

}
