
public class word {
private String name;
private int sCount =0;
public int getSCount()
{
	return sCount;
}
public String getName()
{
	return name;
}
public word()
{
sCount = 0;
name = "";
}
public word(String text)
{
	boolean wasVowel = false;
	boolean isVowel = false;
	name = text;
	name.replaceAll("[^a-zA-Z]","");
	name = name.replaceAll("\\.", "");
	name = name.replaceAll("\\-", "");
	name = name.replaceAll("−", "");
	name = name.replaceAll("﻿", "");
	name.toLowerCase();
	for (int i = 0;i<name.length();i++)
	{
		char c = name.charAt(i);
		wasVowel = isVowel;
		isVowel = vowelCheck(c);
		if (!wasVowel&isVowel)
		{
			sCount++;
		}
	}
	if ((name.charAt(name.length()-1)=='e')||(name.charAt(name.length()-1)=='E'))
	{
		sCount--;
	}
	if(sCount==0)
	{
		sCount++;
	}
}
public boolean vowelCheck(char c)
{
	if ((c == 'A')||(c =='E')||(c =='U')||(c =='O')||(c =='Y')||(c =='I')||(c =='a')||(c =='e')||(c =='u')||(c =='o')||(c =='y')||(c =='i'))
	{
		return true;
	}
	else {return false;}
			
}
}
