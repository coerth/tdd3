import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest
{

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown()
    {

    }

    @Test
    public void greetingsTest()
    {
        System.out.println("First test of method");
        String actual = new Greetings().sayHello();
        String expected = "Hello";

        assertEquals(expected, actual);
    }

    @Test
    void greetTest()
    {
        String actual = new Greetings().greet("bob");
        String expected = "Hello bob.";

        assertEquals(expected, actual);
    }

    @Test
    void greetNullInputTest()
    {
        String actual = new Greetings().greet(null);
        String expected = "Hello my friend.";

        assertEquals(expected, actual);
    }

    @Test
    void greetUpperCaseTest()
    {
        String actual = new Greetings().greet("BOB");
        String expected = "HELLO BOB!";

        assertEquals(expected, actual);
    }

    @Test
    void greetStringArray()
    {
        String[] strings = {"Bob", "Anne",  "Bjarne"};

        String actual = new Greetings().greet(strings);
        String expected = "Hello Bob, Anne and Bjarne";

        assertEquals(expected, actual);

    }

    @Test
    void greetStringArrayUpperCase()
    {
        String[] strings = {"Bob", "Anne",  "BJARNE"};

        String actual = new Greetings().greet(strings);
        String expected = "Hello Bob, Anne. AND HELLO BJARNE";

        assertEquals(expected, actual);
    }

}