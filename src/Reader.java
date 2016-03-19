import java.io.*;
import java.util.Scanner;

public class Reader 
{
public static void main(String[]args) throws IOException {
word text[] = new word[17];
Scanner f = null;
Scanner input = new Scanner(System.in);
System.out.println("Input file path.");
String fName = input.next();
f = new Scanner(new File(fName));
for (int i=0; i<17;i++)
{
text[i]= new word();
}
for (int j=0; j<16;j++)
{
	if(f.hasNext())
	{
	for(int i=1; i<17;i++)
	{
		text[i-1]=text[i];
	}
	text[16]= new word(f.next());
	}
}
HaikuChecker check = new HaikuChecker();
while(f.hasNext())
{
	for(int i=1; i<17;i++)
	{
		text[i-1]=text[i];
	}
	text[16]= new word(f.next());
	check.checkHaiku(text);
	
}
System.out.println("No haiku found.");
f.close();
input.close();
}
}

