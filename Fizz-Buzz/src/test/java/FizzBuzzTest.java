import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzTest {
	
	@Test
	public void shouldSayOne() {
		
		//***this class is not initialized yet hit CTRL + J to create one.
		FizzBuzz underTest = new FizzBuzz(); //Arrange	
		String response = underTest.say(1); //Act
		Assert.assertEquals("1", response); //Assert
	}
	
	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(2); //Act
		Assert.assertEquals("2", response); //Assert
		
	}
	
	@Test
	public void shouldSayFizzForThree() {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(3); //Act
		Assert.assertEquals("Fizz", response); //Assert
		
	}
	
	@Test 
	public void shouldSayBuzzForFive() {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(5); //Act
		Assert.assertEquals("Buzz", response); //Assert
	
	}
	
	@Test
	public void shouldSayFizzForSix () {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(6); //Act
		Assert.assertEquals("Fizz", response); //Assert
	}
	
	@Test 
	public void shouldSayBuzzForTen() {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(10); //Act
		Assert.assertEquals("Buzz", response); //Assert
	
	}
	
	@Test 
	public void shouldSayFizzBuzzForFifteen () {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(15); //Act
		Assert.assertEquals("Fizz Buzz", response); //Assert
	}
	
	@Test 
	public void shouldSayFizzBuzzForThirty () {
		FizzBuzz underTest = new FizzBuzz(); //Arrange
		String response = underTest.say(30); //Act
		Assert.assertEquals("Fizz Buzz", response); //Assert
	}

}
