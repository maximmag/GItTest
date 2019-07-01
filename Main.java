import org.junit.Assert;
import org.junit.Test;


public class Main {

    @Test
    public void test1(){
        InputString inputString = new InputString();
		InputString inputString2 = new InputString();
		InputString inputString4 = new InputString();
		InputString inputString3 = new InputString();
        String input = "Максим Магеррамов Человек кот кот мяукю.. Быаетт... ОДнако знайте, что Вологда лучшая, Вологда одна из лучшихФ!!";
        Assert.assertTrue(inputString.getString(input).equals("Магеррамов, Человек, Вологда, Вологда"));
    }

    @Test
    public void test2(){
        InputString inputString = new InputString();
        String input = "!!   ...!!    !!....??       ??? МАКСИМАМ !!!!";
        Assert.assertTrue(inputString.getString(input).equals(""));

    }
    @Test
    public void test3(){
        InputString inputString = new InputString();
        String input = "Макс";
        Assert.assertTrue(inputString.getString(input).equals(""));

    }

    @Test
    public void test4(){
        InputString inputString = new InputString();
        String input = "                            ";
        Assert.assertTrue(inputString.getString(input).equals(""));

    }



}
