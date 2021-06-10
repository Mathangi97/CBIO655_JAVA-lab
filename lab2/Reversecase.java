import java.util.Scanner;
public class Reversecase
{
	public static void main(String[] args) 
	{
		String input = "MAThangi";
        String caseChanged = reverseCase(input);
		System.out.println("The original string : "+input);
        System.out.println("The Case changed string : "+caseChanged);
	}
	static String reverseCase(String input)
	{
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++)
		{
            char c = chars[i];
            if (Character.isUpperCase(c))
			{
                chars[i] = Character.toLowerCase(c);
            }
			else if (Character.isLowerCase(c))
			{
                chars[i] = Character.toUpperCase(c);
            }
        }
    return new String(chars);
    }
}

