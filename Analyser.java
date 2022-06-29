package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyser {
public static void main(String[] args) {
		
		System.out.println("Welcome to User Registration");
		
		{
			 Scanner scannerObject = new Scanner(System.in);

		        System.out.println("Enter Your First Name");
		        String firstName = scannerObject.next();
		        checkValidFirstName(firstName);
		        
		        System.out.println("Enter Your Last Name");
		        String lastName = scannerObject.next();
		        checkValidLastName(lastName);
		        
		        System.out.println("Enter Your Email Address");
		        String email = scannerObject.next();
		        checkValidEmail(email);
		        
		        System.out.println("Enter Your Mobile Number");
		        String mobileNumber = scannerObject.next();
		        checkMobileNumber(mobileNumber);

		        System.out.println("Enter the Password");
		        String password = scannerObject.next();
		        checkPassword(password);
		        
		        System.out.println("******* Valid Emails  ********");
				 
		        email = "abc@yahoo.com";
		        checkValidEmail(email);

		        email = "abc-100@yahoo.com";
		        checkValidEmail(email);

		        email = "abc.100@yahoo.com";
		        checkValidEmail(email);

		        email = "abc111@abc.com";
		        checkValidEmail(email);

		        email = "abc-100@abc.net";
		        checkValidEmail(email);

		        email = "abc.100@abc.com.au";
		        checkValidEmail(email);

		        email = "abc@1.com";
		        checkValidEmail(email);

		        email = "abc@gmail.com.com";
		        checkValidEmail(email);

		        email = "abc+100@gmail.com";
		        checkValidEmail(email);

		        System.out.println("*****************************************");

		        System.out.println("******** Invalid Emails *********");


		        email = "abc";
		        checkValidEmail(email);

		        email = "abc@.com.my";
		        checkValidEmail(email);

		        email = "abc123@gmail.a";
		        checkValidEmail(email);

		        email = "abc123@.com";
		        checkValidEmail(email);

		        email = "abc123@.com.com";
		        checkValidEmail(email);

		        email = ".abc@abc.com";
		        checkValidEmail(email);

		        email = "abc()*@gmail.com";
		        checkValidEmail(email);

		        email = "abc@%*.com";
		        checkValidEmail(email);

		        email = "abc..2002@gmail.com";
		        checkValidEmail(email);

		        email = "abc.@gmail.com";
		        checkValidEmail(email);

		        email = "abc@abc@gmail.com";
		        checkValidEmail(email);

		        email = "abc@gmail.com.1a";
		        checkValidEmail(email);

		        email = "abc@gmail.com.aa.au";
		        checkValidEmail(email);

		        System.out.println("***************************************");

		    }
		 }
	    
	
		
		    public static void checkValidFirstName(String firstName) {

		        boolean isFirstName;
		        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
		        Pattern patternObject = Pattern.compile(firstNameRegex);
		        
		        if (firstName == null) {
		            isFirstName = false;
		        }
		        Matcher matcherObject = patternObject.matcher(firstName);
		        isFirstName =  matcherObject.matches();

		        if(isFirstName)
		            System.out.println(firstName+  " Valid First Name");
		        else
		            System.out.println(firstName+  " Invalid First Name");
		    }    
	
			public static void checkValidLastName(String lastName) {
		
		    boolean isLastName;
		    String lastNameRegex = "[A-Z]{1}[a-z]{2,}";
		    Pattern patternObject = Pattern.compile(lastNameRegex);
		    if (lastName == null) {
		        isLastName = false;
		    }
		    Matcher matcherObject = patternObject.matcher(lastName);
		    isLastName = matcherObject.matches();
		
		    if (isLastName)
		        System.out.println(lastName + " Valid Last Name");
		    else
		        System.out.println(lastName + "  Invalid Last Name");
		}
			
			 public static void checkValidEmail(String email){

			        boolean isEmail;
			        String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			        Pattern patternObject = Pattern.compile(emailRegex);
			        if (email == null) {
			            isEmail = false;
			        }
			        Matcher matcherObject = patternObject.matcher(email);
			        isEmail =  matcherObject.matches();

			        if(isEmail)
			            System.out.println(email+"  Valid Email\n");
			        else
			            System.out.println(email+"  Invalid Email ");
			    }

			 public static void checkMobileNumber(String mobileNumber){

			        boolean isMobileNumber;
			        String mobileNumberRegex = "(91)?[7-9][0-9]{9}";
			        Pattern patternObject = Pattern.compile(mobileNumberRegex);
			        if (mobileNumber == null) {
			            isMobileNumber = false;
			        }
			        Matcher matcherObject = patternObject.matcher(mobileNumber);
			        isMobileNumber =  matcherObject.matches();

			        if(isMobileNumber)
			            System.out.println(mobileNumber+ "  Valid  Mobile Number\n");
			        else
			            System.out.println(mobileNumber+ "   Invalid Mobile Number");
			    }
			 public static void checkPassword(String password){

			        boolean isPassword;
			        String passwordRegex = "^([a-zA-Z0-9]*[\\-\\!\\@\\#\\$\\%\\^\\&\\*\\(\\)\\_\\+]*){8}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is  Valid\n");
			        else
			            System.out.println(password+"   Password is Invalid");
			    }
			 public static void checkUppercase(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is  Valid\n");
			        else
			            System.out.println(password+"  Password is Invalid");
			    }
			 public static void checkNumeric(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])([a-zA-Z0-9]*([@#$%^&-+=()])*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"   Password is Valid \n");
			        else
			            System.out.println(password+"   Password is Invalid");
			    }
			 
			 public static void checkSpecialchar(String password){

			        boolean isPassword;
			        String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
			        Pattern patternObject = Pattern.compile(passwordRegex);
			        if (password == null) {
			            isPassword = false;
			        }
			        Matcher matcherObject = patternObject.matcher(password);
			        isPassword =  matcherObject.matches();

			        if(isPassword)
			            System.out.println(password+"  Password is Valid\n");
			        else
			            System.out.println(password+"  Password is InValid");
			    }

				private String message;
				
				public void MoodAnalyser(String message) {
					this.message =  message;
				}
				
				
				public String analyserMood() throws MoodAnalyserException {
					try {
						if(message.contains("Sad"))
							return "Sad";
						else
							return "Happy";
					} catch (NullPointerException e) {
						throw new  MoodAnalyserException("Invalid Mood");
						
					}
				}


				public String MoodAnalyserException() {
					return null;
				}
			}
			