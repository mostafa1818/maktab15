public class Parsint {
public static int convert(String input)
    {
        int output=0;

            try{output=Integer.parseInt(input);}catch (Exception e){throw new IllegalArgumentException(e + "problrm in number");}
            if(output>23767||output< -32768){ throw new IllegalArgumentException("bid warning");}

        return output;
    }
}
