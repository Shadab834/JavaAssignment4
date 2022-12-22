import java.io.*;
import java.util.Arrays;
import java.util.Collections;
class CheckAnagram {

static boolean checkAnagram(char[] strana1, char[] strana2)
{

int len1 = strana1.length;
int len2 = strana2.length;

if (len1 != len2)
return false;

Arrays.sort(strana1);
Arrays.sort(strana2);

for (int i = 0; i < len1; i++)
if (strana1[i] != strana2[i])
return false;
return true;
}

public static void main (String args[])
{
char strana1[] = { 't', 'e', 's', 't' };
char strana2[] = { 't', 't', 'e', 'w' };
if (checkAnagram(strana1, strana2))
System.out.println("The strings to be checked are" + " anagram of each other");
else
System.out.println("The strings to be checked are not" + " anagram of each other");
}
}