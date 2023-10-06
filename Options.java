package net.javacode;
import java.util.Scanner;


public class Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner number= new Scanner(System.in);
		
		System.out.println("\tSend Instructions");
		System.out.println("1:Sh20(30mins, 3hrs)");
		System.out.println("2:Sh10(15mins, 1hr)");
		System.out.println("3:Sh20(15mins, midnight)");
		System.out.println("4:Okoa 50");
		System.out.println("5:Okoa 20");
		System.out.println("6:Okoa 10");
		System.out.println("7:Okoa 5");
		System.out.println("8:Okoa 20(900MB, 1hr)");
		System.out.println("9:Okoa internet");
		System.out.println("0:More");
		
		
		
		int choice= number.nextInt();
		
		
		switch(choice) {
		
			// 0 selection
			case 1:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
				
					int num1 =number.nextInt();
					switch(num1) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				
				break;
			
			/* end of 0 selection
				1 selection
				*/
			case 2:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 10");
				System.out.println("TOTAL DEBT will be: 10");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
				
					int num2 =number.nextInt();
					switch(num2) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				
				break;
			
			/* end of 1 selection
				2 selection
				*/
			case 3:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num3 =number.nextInt();
					switch(num3) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				
				break;
				
				/* end of 2 selection
					3 selection
				*/
				
			case 4:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 50");
				System.out.println("TOTAL DEBT will be: 50");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num4 =number.nextInt();
					switch(num4) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				break;
				
				
				/* end of 3 selection
					4 selection
				*/
			case 5:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num5 =number.nextInt();
					switch(num5) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				break;	
				
				/* end of 4 selection
				 	5 selection
				*/
				
			case 6:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 10");
				System.out.println("TOTAL DEBT will be: 10");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num6 =number.nextInt();
					switch(num6) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				break;
				
				/* end of 5 selection
					6  selection
				*/
				
				
			case 7:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 5");
				System.out.println("TOTAL DEBT will be: 5");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num7 =number.nextInt();
					switch(num7) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				break;
				
				/* end of 6 selection
					7 selection
				 */
				
			case 8:
				System.out.println("Existing Unpaid Okoa: 0");
				System.out.println("New Okoa request: 20");
				System.out.println("TOTAL DEBT will be: 20");
				System.out.println("1:Accept");
				System.out.println("2:Decline");
				System.out.println("0:BACK 00:HOME");
					int num8 =number.nextInt();
					switch(num8) {
					case 1:
						System.out.println("Kindly wait as we process your payment");
						break;
					case 2:
						System.out.println("Thank you for using Safaricom");
						break;
					default:
						System.out.println("Invalid choice");
						break;
					}
				break;
				
				/* end of 7 selection
				 	 8 selection
				 */
				
				
			case 9:
				
				System.out.println("Okoa bundles");
				System.out.println("1:Sh20(900MB, 1hr)");
				System.out.println("2:Sh20(90MB, 24hrs)");
				System.out.println("3:Sh10(30MB, 24hrs)");
				System.out.println("4:Sh5(10MB, 24hrs)");
				System.out.println("0:BACK");
				
					int num9 =number.nextInt();
					switch(num9) {
					case 0:
						System.out.println("okoa 900MB @Sh20 for 1hr");
						break;
					case 1:
						System.out.println("okoa 900MB @Sh20 for 1hr");
						System.out.println("1:Accept");
						System.out.println("2:Decline");
						System.out.println("0:BACK 00:HOME");
						
						int num91 =number.nextInt();
						switch(num91) {
						case 1:
							System.out.println("Kindly wait as we process your payment");
							break;
						case 2:
							System.out.println("Thank you for using Safaricom");
							break;
						default:
							System.out.println("Invalid choice");
							break;
						}
						break;
					case 2:
						System.out.println("okoa 90MB @Sh20 for 24hrs");
						System.out.println("1:Accept");
						System.out.println("2:Decline");
						System.out.println("0:BACK 00:HOME");
						int num92 =number.nextInt();
						switch(num92) {
						case 1:
							System.out.println("Kindly wait as we process your payment");
							break;
						case 2:
							System.out.println("Thank you for using Safaricom");
							break;
						default:
							System.out.println("Invalid choice");
							break;
						}
						break;
					case 3:
						System.out.println("okoa 30MB @Sh10 for 24hrs");
						System.out.println("1:Accept");
						System.out.println("2:Decline");
						System.out.println("0:BACK 00:HOME");
						int num93 =number.nextInt();
						switch(num93) {
						case 1:
							System.out.println("Kindly wait as we process your payment");
							break;
						case 2:
							System.out.println("Thank you for using Safaricom");
							break;
						default:
							System.out.println("Invalid choice");
							break;
						}
						break;
					case 4:
						System.out.println("okoa 10MB @Sh5 for 24hrs");
						System.out.println("1:Accept");
						System.out.println("2:Decline");
						System.out.println("0:BACK 00:HOME");
						int num94 =number.nextInt();
						switch(num94) {
						case 1:
							System.out.println("Kindly wait as we process your payment");
							break;
						case 2:
							System.out.println("Thank you for using Safaricom");
							break;
						default:
							System.out.println("Invalid choice");
							break;
						}
						break;
					default:
						System.out.println("Invalid choice");
						break;
				}
				break;
				
				/* end of 8 selection
			 	 98 selection
			 */
			case 0:
				System.out.println("10:Okoa Minutes");
				System.out.println("11:okoa SMS");
				System.out.println("12:Lipa okoa");
				System.out.println("0:BACK");
				
				int num01 = number.nextInt();
				switch(num01) {
					
					/* 
				 	 9 selection
				 */
				case 10:
					System.out.println("All bundles come with FREE SMS");
					System.out.println("1:Sh50(40 Mins,24hrs)");
					System.out.println("2:Sh20(15 Mins,Midnight)");
					System.out.println("3:Sh10(5 Mins,Midnight)");
					System.out.println("0:BACK 00:HOME");
					
						int num101 = number.nextInt();
						switch(num101) {
						case 1:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 50");
							System.out.println("TOTAL DEBT will be: 20");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							int num1011 =number.nextInt();
							switch(num1011) {
							case 1:
								System.out.println("Kindly wait as we process your payment");
								break;
							case 2:
								System.out.println("Thank you for using Safaricom");
								break;
							default:
								System.out.println("Invalid choice");
								break;
							}
							break;
						case 2:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 20");
							System.out.println("TOTAL DEBT will be: 20");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							int num1012 =number.nextInt();
							switch(num1012) {
							case 1:
								System.out.println("Kindly wait as we process your payment");
								break;
							case 2:
								System.out.println("Thank you for using Safaricom");
								break;
							default:
								System.out.println("Invalid choice");
								break;
							}
							break;
						case 3:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 10");
							System.out.println("TOTAL DEBT will be: 10");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							int num1013 =number.nextInt();
							switch(num1013) {
							case 1:
								System.out.println("Kindly wait as we process your payment");
								break;
							case 2:
								System.out.println("Thank you for using Safaricom");
								break;
							default:
								System.out.println("Invalid choice");
								break;
							}
							break;
						default:
							System.out.println("Invalid choice. Try again");
							break;
						}
					break;
				
					
					/* 
				 	 end of 9 selection
				 	 10 selection
				 */
				case 11:
					System.out.println("Okoa SMS Bundles");
					System.out.println("1:Weekly 1000 SMS @ Ksh30");
					System.out.println("2:Daily Unlimited SMS @ Ksh20");
					System.out.println("3:Daily 200SMS @ Ksh 10");
					System.out.println("3:Daily 20SMS @ Ksh 5");
					System.out.println("0:BACK 00:HOME");
					
						int num111 = number.nextInt();
						switch(num111) {
						case 1:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 30");
							System.out.println("TOTAL DEBT will be: 30");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							break;
						case 2:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 20");
							System.out.println("TOTAL DEBT will be: 20");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							break;
						case 3:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 10");
							System.out.println("TOTAL DEBT will be: 10");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							break;
						case 4:
							System.out.println("Existing Unpaid Okoa: 0");
							System.out.println("New Okoa request: 5");
							System.out.println("TOTAL DEBT will be: 5");
							System.out.println("1:Accept");
							System.out.println("2:Decline");
							System.out.println("0:BACK 00:HOME");
							break;
						default:
							System.out.println("Invalid choice. Try again");
							break;
					}
				break;
				
				/* 
			 	 end of 10 selection
			 	 11 selection
			 */
				case 12:
					System.out.println("You have no okoa debt");
				break;
				
				
				case 0:
					System.out.println("okoa 900MB @Sh20 for 1hr");
					break;
				
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
	
		}

	}


