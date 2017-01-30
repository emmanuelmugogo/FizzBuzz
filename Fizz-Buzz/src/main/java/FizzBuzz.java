
public class FizzBuzz {

	public String say(int i) {
		//this checks if its a multiple of both 3 and 5
		if(isFizz(i) && isBuzz(i)){
			return "Fizz Buzz";
		}
		
		//this checks if is multiple of 3
		if (isFizz(i)) { 
			return "Fizz";
		}
		
		//this checks if is multiple of 5
		if(isBuzz(i)) {
			return "Buzz";
		}
		return "" + i;
	}

	private boolean isBuzz(int i) {
		return i % 5 == 0;
	}

	private boolean isFizz(int i) {
		return i % 3 == 0;
	}

}
