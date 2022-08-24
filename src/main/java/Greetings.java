import java.awt.*;
import java.sql.Array;

public class Greetings
{

    public String sayHello()
    {
        return  "Hello";
    }

    public String greet(Object obj)
    {
        if(obj == null)
        {
            return  "Hello my friend.";
        }

        if(obj instanceof String )
        {


            if( ((String) obj).toUpperCase().equals(obj))
            {
                return "HELLO "+obj+"!";
            }

            return "Hello "+obj+".";
        }

        if(obj instanceof String[])
        {

            String greeting = "";
            String upperCaseGreeting = ". AND HELLO ";

            String[] nameArray = new String[0];

            for(int j = 0; j < ((String[]) obj).length; j++)
            {
                if(((String[]) obj)[j].contains(","))
                {
                    for(int k = 0; k < ((String[]) obj)[j].length(); k++)
                    {
                        if(((String[]) obj)[j].charAt(k) == ',')
                        {

                        }
                    }
                }
            }

            for(int i = 0; i < ((String[]) obj).length; i++)
            {
                if(i == 0)
                {
                    if(((String[]) obj)[i].toUpperCase().equals(((String[]) obj)[i]))
                    {
                        upperCaseGreeting += ((String[]) obj)[i];
                    }
                    else{
                        greeting += "Hello " + ((String[]) obj)[i];
                    }
                }
                else if(i == ((String[]) obj).length -1)
                {
                    if(((String[]) obj)[i].toUpperCase().equals(((String[]) obj)[i]))
                    {

                        if (upperCaseGreeting.length() > 12)
                        {
                            upperCaseGreeting +=", "+ ((String[]) obj)[i];
                        }

                        else
                        {
                            upperCaseGreeting += ((String[]) obj)[i];
                        }
                    }
                    else
                    {
                        greeting +=" and "+ ((String[]) obj)[i];
                    }
                }

                else
                {
                    if(((String[]) obj)[i].toUpperCase().equals(((String[]) obj)[i]))
                    {
                        if (upperCaseGreeting.length() > 12)
                        {
                            upperCaseGreeting +=", "+ ((String[]) obj)[i];
                        }

                        else
                        {
                            upperCaseGreeting += ((String[]) obj)[i];
                        }
                    }
                    else
                    {

                        greeting += ", "+ ((String[]) obj)[i];
                    }
                }
            }

            if(upperCaseGreeting.length() > 12)
            {
                return greeting + upperCaseGreeting;
            }

            return greeting;
        }

        return "This shouldnt happen";

    }
}
