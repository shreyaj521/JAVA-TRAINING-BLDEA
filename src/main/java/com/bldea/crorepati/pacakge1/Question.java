package com.bldea.crorepati.pacakge1;

import java.util.Scanner;

public class Question {
	static String result;
	static String result2;
	static int count_life_line = 3;
	static int aud_phn = 1;
	static int cnt_50_50=1;
	static int skip_cnt=1;
	static Scanner sc = new Scanner(System.in);

	public static boolean fetchQuestion1(String name) throws Exception {
		System.out.println("1.Who is the founder of the java?");
		System.out.println("a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul gandhi\n" + "d) James Gosling\n"
				+ "e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(1000);
			return true;
		}
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(1000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(1000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(1000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) Dennis Ritchie\n" + "b) Charles Babbage\n" + "c) Rahul Gandhi\n" + "d) James Gosling\n");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(1000);
						return true;
					}
				}

			}
		 
				return false;
}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------

	public static boolean fetchQuestion2(String name) throws Exception {
		System.out.println("2. Which statement is true about Java?");
		System.out.println("a) Java is a sequence-dependent programming language\r\n"
				+ "b) Java is a code dependent programming language\r\n"
				+ "c) Java is a platform-dependent programming language\r\n"
				+ "d) Java is a platform-independent programming language\n"
				+ "e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(5000);
			return true;
		}
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) Java is a platform-dependent programming language\r\n"
											+ "d) Java is a platform-independent programming language\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(5000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");											
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(5000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) Java is a platform-dependent programming language\r\n"
									+ "d) Java is a platform-independent programming language\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(5000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(5000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(5000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");											
											
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) Java is a platform-dependent programming language\r\n"
											+ "d) Java is a platform-independent programming language\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(5000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Java is a sequence-dependent programming language\r\n"
													+ "b) Java is a code dependent programming language\r\n"
													+ "c) Java is a platform-dependent programming language\r\n"
													+ "d) Java is a platform-independent programming language\n"
													+ "e) Life Line");											
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(5000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Java is a sequence-dependent programming language\r\n"
							+ "b) Java is a code dependent programming language\r\n"
							+ "c) Java is a platform-dependent programming language\r\n"
							+ "d) Java is a platform-independent programming language\n"
							+ "e) Life Line");				
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(5000);
						return true;
					}
				}

			}		

		return false;
	}
	//-------------------------------------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion3(String name) throws Exception{
		System.out.println("3. Which component is used to compile, debug and execute the java programs?");
		System.out.println("a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("a")) {
			Candidate.setAmount(10000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) JDK\r\n" + "b) JIT\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(10000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(10000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) JDK\r\n" + "b) JIT\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) JDK\r\n" + "b) JIT\r\n");
							result = sc.next();
							if (result.equalsIgnoreCase("a")) {
								Candidate.setAmount(10000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 5%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(10000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(10000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 5%\n" + "option d = 0%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(10000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("a")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) JDK\r\n" + "b) JIT\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) JDK\r\n" + "b) JIT\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(10000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 90%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 0%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println(
													"a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("a")) {
												Candidate.setAmount(10000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println(
							"a) JDK\r\n" + "b) JIT\r\n" + "c) JRE\r\n" + "d) JVM "+"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("a")) {
						Candidate.setAmount(10000);
						return true;
					}
				}

			}		return false;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion4(String name)throws Exception {
		System.out.println("4. Which one of the following is not a Java feature?");
		System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			Candidate.setAmount(20000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 8%\n" + "option b = 85%\n" + "option c = 10%\n" + "option d = 30%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(20000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(20000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");
										result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(20000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 20%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(20000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(20000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 20%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(20000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 20%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(20000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 20%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(20000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Object-oriented\r\n" + "b) Use of pointers\r\n" + "c) Portable\r\n" + "d) Dynamic and Extensible "+"e) Life Line");

					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(20000);
						return true;
					}
				}

			}
		return false;
	}
//------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion5(String name)throws Exception {
		System.out.println("5. Which of these cannot be used for a variable name in Java?");
		System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned\n "+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(40000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) keyword\r\n" + "d) none of the mentioned ");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(40000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(40000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("c) keyword\r\n" + "d) none of the mentioned ");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("c) keyword\r\n" + "d) none of the mentioned ");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(40000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a =1 0%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(40000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(40000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 20%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(40000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 20%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("c) keyword\r\n" + "d) none of the mentioned ");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(40000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("c) keyword\r\n" + "d) none of the mentioned ");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(40000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 5%\n" + "option c = 88%\n" + "option d = 20%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(40000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) identifier & keyword\r\n" + "b) identifier\r\n" + "c) keyword\r\n" + "d) none of the mentioned "+"e) Life Line");

					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(40000);
						return true;
					}
				}

			}
		return false;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion6(String name)throws Exception {
		System.out.println("6. What is the extension of java code files?");
		System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(50000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "c) .class\r\n" + "d) .java\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(50000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;					}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(50000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println( "c) .class\r\n" + "d) .java\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
												}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "c) .class\r\n" + "d) .java\r\n");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(50000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(50000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(50000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(50000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println( "c) .class\r\n" + "d) .java\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "c) .class\r\n" + "d) .java\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(50000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(50000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) .js\r\n" + "b) .txt\r\n" + "c) .class\r\n" + "d) .java\r\n" +"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(50000);
						return true;
					}
				}

			}		return false;
	}
//-------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion7(String name)throws Exception {
		System.out.println("7. Which environment variable is used to set the java path?");
		System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("d")) {
			Candidate.setAmount(100000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) JavaPATH\r\n"  + "d) JAVA_HOME");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(100000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) JavaPATH\r\n"  + "d) JAVA_HOME");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) JavaPATH\r\n"  + "d) JAVA_HOME");
							result = sc.next();
							if (result.equalsIgnoreCase("d")) {
								Candidate.setAmount(100000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(100000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(100000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) JavaPATH\r\n"  + "d) JAVA_HOME");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Dennis Ritchie\n" + "d) James Gosling\n");
									result = sc.next();
									if (result.equalsIgnoreCase("d")) {
										Candidate.setAmount(100000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 8%\n" + "option d = 87%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("d")) {
												Candidate.setAmount(100000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) MAVEN_Path\r\n" + "b) JavaPATH\r\n" + "c) JAVA\r\n" + "d) JAVA_HOME"+"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("d")) {
						Candidate.setAmount(100000);
						return true;
					}
				}

			}
		return false;
	}
//-------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion8(String name) throws Exception{
		System.out.println("8. Which of the following is not an OOPS concept in Java?");
		System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(200000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 95%\n" + "option d = 0%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(200000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Polymorphism\r\n" + "c) Compilation\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(200000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(200000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(200000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Polymorphism\r\n" + "c) Compilation\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("a) Polymorphism\r\n" + "c) Compilation\r\n");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(200000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 95%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(200000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(200000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(200000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 95%\n" + "option d = 0%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(200000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 95%\n" + "option d = 0%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(200000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("a) Polymorphism\r\n" + "c) Compilation\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("a) Polymorphism\r\n" + "c) Compilation\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(200000);
										return true;									
										} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 0%\n" + "option b = 5%\n" + "option c = 95%\n" + "option d = 0%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(200000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Polymorphism\r\n" + "b) Inheritance\r\n" + "c) Compilation\r\n" + "d) Encapsulation"+"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(200000);
						return true;
					}
				}

			}

		return false;
	}
	
	//---------------------------------------------------------------------------------------------

	public static boolean fetchQuestion9(String name) throws Exception{
		System.out.println("9. Which of the following is a type of polymorphism in Java Programming?");
		System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"	
		+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("b")) {
			Candidate.setAmount(500000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 17%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(500000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) Compile time polymorphism\r\n"	+ "c) Multilevel polymorphism\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(500000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(500000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(500000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println( "b) Compile time polymorphism\r\n"	+ "c) Multilevel polymorphism\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println( "b) Compile time polymorphism\r\n"	+ "c) Multilevel polymorphism\r\n");
							result = sc.next();
							if (result.equalsIgnoreCase("b")) {
								Candidate.setAmount(500000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 17%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(500000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(500000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(500000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 17%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(500000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 17%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(500000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println( "b) Compile time polymorphism\r\n"	+ "c) Multilevel polymorphism\r\n");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println( "b) Compile time polymorphism\r\n"	+ "c) Multilevel polymorphism\r\n");
									result = sc.next();
									if (result.equalsIgnoreCase("b")) {
										Candidate.setAmount(500000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 10%\n" + "option b = 85%\n" + "option c = 8%\n" + "option d = 17%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
													+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("b")) {
												Candidate.setAmount(500000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) Multiple polymorphism\r\n" + "b) Compile time polymorphism\r\n"
							+ "c) Multilevel polymorphism\r\n" + "d) Execution time polymorphism"+"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("b")) {
						Candidate.setAmount(500000);
						return true;
					}
				}

			}
		return false;
	}
//-------------------------------------------------------------------------------------------------------
	public static boolean fetchQuestion10(String name)throws Exception {
		System.out.println(" 20. What is the extension of compiled java classes?");
		System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
		result = sc.next();
		if (result.equalsIgnoreCase("c")) {
			Candidate.setAmount(1000000);
			return true;
		}
		
		 else if (result.equalsIgnoreCase("e")) {
				if (count_life_line > 0) {
					count_life_line--;
					System.out.println("Available Life lines:\n" + "a. Audiance Phone\n" + "b. 50-50\n" + "c. skip");
					System.out.println("Select the life line:");
					String result2 = sc.next();
					if (result2.equalsIgnoreCase("a")) {
						if (aud_phn != 0) {
							aud_phn = 0;
							Thread.sleep(10000);
							System.out.println("option a = 5%\n" + "option b = 15%\n" + "option c = 88%\n" + "option d = 7%");
							System.out.println("Select the option");
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
									+ "b. 50-50\n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) .js\r\n" + "c) .class\r\n" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(100000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available)\n"
											+ "b. 50-50 \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) .js\r\n" + "c) .class\r\n" );
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
					else if (result2.equalsIgnoreCase("b")) {
						if (cnt_50_50 != 0) {
							cnt_50_50 = 0;
							System.out.println("Select the options");
							System.out.println("b) .js\r\n" + "c) .class\r\n" );
							result = sc.next();
							if (result.equalsIgnoreCase("c")) {
								Candidate.setAmount(1000000);
								return true;
							} else {
								return false;
							}

						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50 -- (not available) \n" + "c. skip");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 5%\n" + "option b = 15%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50 -- (not available) \n" + "c. skip");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("c")) {
										if(skip_cnt!=0) {
											Candidate.setAmount(1000000);
											return true;
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("c")) {
								if (skip_cnt != 0) {
									skip_cnt = 0;
									Candidate.setAmount(1000000);
									return true;
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 5%\n" + "option b = 15%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}

					else if (result2.equalsIgnoreCase("c")) {
						if (skip_cnt != 0) {
							skip_cnt = 0;
							Candidate.setAmount(1000000);
							return true;
						} else {
							//
							System.out.println("Available Life lines:\n" + "a. Audiance Phone  \n"
									+ "b. 50-50  \n" + "c. skip -- (not available)");
							System.out.println("Select the life line:");
							String result3 = sc.next();
							if (result3.equalsIgnoreCase("a")) {
								if (aud_phn != 0) {
									aud_phn = 0;
									Thread.sleep(10000);
									System.out.println("option a = 5%\n" + "option b = 15%\n" + "option c = 88%\n" + "option d = 7%");
									System.out.println("Select the option");
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									System.out.println("Available Life lines:\n" + "a. Audiance Phone -- (not available) \n"
											+ "b. 50-50  \n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if(result4.equalsIgnoreCase("b")) {
										if (cnt_50_50 != 0) {
											cnt_50_50 = 0;
											System.out.println("Select the options");
											System.out.println("b) .js\r\n" + "c) .class\r\n" );
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
									//--- need code intervention
								}
							} else if (result2.equalsIgnoreCase("b")) {
								if (cnt_50_50 != 0) {
									cnt_50_50 = 0;
									System.out.println("Select the options");
									System.out.println("b) .js\r\n" + "c) .class\r\n" );
									result = sc.next();
									if (result.equalsIgnoreCase("c")) {
										Candidate.setAmount(1000000);
										return true;
									} else {
										return false;
									}
								}
								else {
									//
									System.out.println("Available Life lines:\n" + "a. Audiance Phone \n"
											+ "b. 50-50  -- (not available)\n" + "c. skip -- (not available)");
									System.out.println("Select the life line:");
									String result4 = sc.next();
									if (result3.equalsIgnoreCase("b")) {
										if (aud_phn != 0) {
											aud_phn = 0;
											Thread.sleep(10000);
											System.out.println("option a = 5%\n" + "option b = 15%\n" + "option c = 88%\n" + "option d = 7%");
											System.out.println("Select the option");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											} else {
												return false;
											}
										}
										else {
											System.out.println("You have no life line left. Please select an option:");
											System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
											result = sc.next();
											if (result.equalsIgnoreCase("c")) {
												Candidate.setAmount(1000000);
												return true;
											}
											else
												return false;
										}
									}
								}
							}
						}
					}
				}
				//changes in line 122
				else {
					System.out.println("You have no life line left. Please select an option:");
					System.out.println("a) .txt\r\n" + "b) .js\r\n" + "c) .class\r\n" + "d) .java\r\n"+"e) Life Line");
					result = sc.next();
					if (result.equalsIgnoreCase("c")) {
						Candidate.setAmount(1000000);
						return true;
					}
				}

			}		return false;
	}

}
