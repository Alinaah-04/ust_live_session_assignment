package com;

public class VowelsAndConsonent {
	public static void main(String[] args)
	{
		String s = "AlinaAnnJoseph";
		int vowel =0;
		int con = 0;
		for(int i = 0;i<s.length();i++ )
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'A')
			{
				vowel++;
			}
			
			else if(ch == 'e' || ch == 'E')
			{
				vowel++;
			}
			
			else if(ch == 'i' || ch == 'I')
			{
				vowel++;
			}
			
				else if(ch == 'o' || ch == 'O')
				{
					vowel++;
				}
				
					else if(ch == 'u' || ch == 'U')
					{
						vowel++;
					}
					else
					{
						con++;
					}
					
				}
		System.out.println("vowel :" +vowel);
		System.out.println("consonent :" +con);
		
			}
			
			
			
		
		
		
				
	}


