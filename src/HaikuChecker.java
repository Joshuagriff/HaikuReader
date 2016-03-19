import java.util.Scanner;
public class HaikuChecker 
{
Scanner input = new Scanner(System.in);
private word[] words = new word[17];
public void checkHaiku(word[] text)
{
words = text;
int lineOne =0;
int lineTwo =0;
int lineThree =0;
lineOne = checkLine(0,5);
if( lineOne == -1){return;}
lineTwo = checkLine(lineOne,7);
if( lineTwo == -1){return;}
lineThree = checkLine(lineTwo, 5);
if( lineThree == -1){return;}
displayHaiku(lineOne,lineTwo,lineThree);
}
private int checkLine( int start, int goal)
{
int count=0;
while(count<goal)
{
count+= words[start].getSCount();
if (start ==16){break;}
start++;
}
if (count == goal)
{
return start;
}
else
{
return -1;	
}
}
private void displayHaiku(int one, int two, int three)
{
for(int i =0;i<one-1;i++)
{
	if(words[i].getName()!= "")
	{
	System.out.print(words[i].getName()+" ");
	}
}
System.out.println(words[one-1].getName()+".");
for(int i =one;i<two-1;i++)
{
	System.out.print(words[i].getName()+" ");
}
System.out.println(words[two-1].getName()+".");

for(int i =two;i<three-1;i++)
{
	System.out.print(words[i].getName()+" ");
}
System.out.println(words[three-1].getName()+".");
System.out.println("Enter y to continue");
String stop = input.next();
if( (stop !="y")&(stop!="Y")){return;}
}
}
