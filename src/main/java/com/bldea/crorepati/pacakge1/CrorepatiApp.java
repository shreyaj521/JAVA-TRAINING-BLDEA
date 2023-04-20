package com.bldea.crorepati.pacakge1;

import java.util.Scanner;

public class CrorepatiApp {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Welcome to Crorepathi Game");
		System.out.println("Lets Welcome Our First Candidate");
		Scanner sc= new Scanner (System.in);

		System.out.println("What is Your Name?");
		String name= sc.next();

		System.out.println("What is Your Age?");
		int age= sc.nextInt();

		System.out.println("What is Your City?");
		String city= sc.next();

		System.out.println("What is Your State?");
		String state= sc.next();

		Candidate c1= new Candidate(name,age,city,state);

		System.out.println("Congratulations for making it till here Mr/Ms. "+c1.getName());

		System.out.println("The Rules of the game");
		System.out.println("1. There will be 10 question which rewards a specific amount in "+ "in"+ "incremental order" );
		System.out.println("2. The game will contain 2 life lines"+ "(audiance booth, 50-50 and call friend)");
		System.out.println("3.You can quite the game at any moment");

		System.out.println("Please type 1 if you wish to see the reward per question");
		int type_1= sc.nextInt();
		if(type_1==1) {

			System.out.println("Question-1 : 1000\n"
						+"Question-2 : 5000\n"
						+"Question-3 : 10000\n"
						+"Question-4 : 20000\n"
						+"Question-5 : 40000\n"
						+"Question-6 : 50000\n"
						+"Question-7 : 100000\n"
						+"Question-8 : 200000\n"
						+"Question-9 : 500000\n"
						+"Question-10 :1000000\n");
			
			System.out.println("Do you wish to continue (type: YES/NO)");
		}
		else
		{
			System.out.println("Do you wish to continue (type: YES/NO)");


		}
		String type_2= sc.next();

		if (type_2.equalsIgnoreCase("yes")==true) {

			System.out.println("Lets begin the GAME");
			System.out.println("Here is the first question");
			boolean res1= Question.fetchQuestion1(c1.getName());
			if(res1==true) {
				System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());

				System.out.println("Here is your next question.");
				System.out.println(" ");
				
				boolean res2= Question.fetchQuestion2(c1.getName());
				if(res2==true) {
					System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
					System.out.println("Here is your next question.");
					System.out.println(" ");

					boolean res3= Question.fetchQuestion3(c1.getName());
					if(res3==true) {
						System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
						System.out.println("Here is your next question.");
						System.out.println(" ");
						
						boolean res4= Question.fetchQuestion4(c1.getName());
						if(res4==true) {
							System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
							System.out.println("Here is your next question.");
							System.out.println(" ");

							boolean res5= Question.fetchQuestion5(c1.getName());
							if(res5==true) {
								System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
								System.out.println("Here is your next question.");
								System.out.println(" ");

								boolean res6= Question.fetchQuestion6(c1.getName());
								if(res6==true) {
									System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
									System.out.println("Here is your next question.");
									System.out.println(" ");

									boolean res7= Question.fetchQuestion7(c1.getName());
									if(res7==true) {
										System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
										System.out.println("Here is your next question.");
										System.out.println(" ");

										boolean res8= Question.fetchQuestion8(c1.getName());
										if(res8==true) {
											System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
											System.out.println("Here is your next question.");
											System.out.println(" ");

											boolean res9= Question.fetchQuestion9(c1.getName());
											if(res9==true) {
												System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
												System.out.println("Here is your next question.");
												System.out.println(" ");

												boolean res10= Question.fetchQuestion10(c1.getName());
												if(res10==true) {
													System.out.println("Congratulations!!! YOUR ANSWER IS CORRECT \n"+ "YOU HAVE WON Rs." +c1.getAmount());
													System.out.println("HUUURRRYYYYY!!!!");
													System.out.println(c1.getName()+"  YOU ARE GENIUS");
													System.out.println("***********************");
												}
												else {
													System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
												}
											}


											else {
												System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
											}
										}


										else {
											System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
										}
									}


									else {
										System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
									}
								}


								else {
									System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
								}
							}


							else {
								System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
							}
						}


						else {
							System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
						}
					}


					else {
						System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
					}
				}


				else {
					System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
				}
			}

			else {
				System.out.println("We are sorry!! your answer is incorrect.\n"+"You have won Rs."+c1.getAmount());
			}	




		}
		else {
			System.out.println("Thank you for coming. All the best!!");
		}
	}


}


