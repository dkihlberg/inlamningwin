package inlamningwin;

public class GuesserGame {

	public static void main(String[] args) {
		
		Guesser gissare = new Guesser(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		
		gissare.start();
	}

}
