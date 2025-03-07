package com.passwordvalidator;

import java.util.regex.*;
import java.util.*;

public class PasswordValidator {
	
//----------------------------------------------------------------------------------------
	public static boolean isValidPassword(String password)
	{
		// Regex Pattern to check the is Valid or not.
		String regex =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*#])[A-Za-z0-9@$*#]{6,12}$";
		Pattern ptn = Pattern.compile(regex);
		Matcher mtch = ptn.matcher(password);
		
		return mtch.matches();
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//                 F U N C T I O N S
//------------------------------------------------------------------------------------------
	public static boolean isLowerCase(char ch)
	{
		if(ch>='a' && ch<='z')
		{
			return true;
		}
		
		return false;
	}
	
//-----------------------------------------------------------------------------------------------
	public static boolean isUpperCase(char ch)
	{
		if(ch>='A' && ch<='Z')
		{
			return true;
		}
		
		return false;
	}
	
//-----------------------------------------------------------------------------------------------
	public static boolean isDigit(char ch)
	{
		if(ch>='0' && ch<='9')
		{
			return true;
		}
		
		return false;
	}
	
//-------------------------------------------------------------------------------------------------	
	public static boolean isSpecialChar(char ch)
	{
		if(ch== '@' || ch== '#' || ch== '$' || ch== '%' || ch== '^' || ch== '&' || ch== '*' )
		{
			return true;
		}
		
		return false;
	}
//----------------------------------------------------------------------------------------------------
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	//        START MAIN METHOD
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int loweCaseCount = 0;
		int upperCaseCount = 0;
		int specialCharCount = 0;
		int digitCount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Generate your Password :");
		String password = sc.nextLine();
		
	
		//   CALLING THE FUNCTIONS  //
		if(isValidPassword(password)) {

			for(char ch : password.toCharArray())
			{
				if(isLowerCase(ch))
				{
					loweCaseCount++;
				}
				else if(isUpperCase(ch))
				{
					upperCaseCount++;
				}
				else if(isDigit(ch))
				{
					digitCount++;
				}
				else if(isSpecialChar(ch))
				{
					specialCharCount++;
				}
					
			}
			System.out.println("The generated Password: " + password + " - is Valid password " + loweCaseCount + "-Lowercase Alphabet " + upperCaseCount + "-Uppercase Alphabet " + specialCharCount + "-Special Character " + digitCount + "-Digit ");
			 
		} else 
		{
			System.out.println(password + " is an invalid Your Password");
		}
		
	}

}
