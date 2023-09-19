package com.neeraj.RailTicketBooking;


import java.util.Scanner;
//Created by Neeraj Kumar (07:30 AM batch)

public class RailTicketBooking {
	Scanner sc = new Scanner(System.in);
	int price, pAge, seatNo, count;
	String sourceAdd, desAdd, date, trainName, time, cls, username = " ", oldUser, password = " ", oldPassword,
			passwordNew, coach = "";
	String pName, pGender, nationality, berthPre, email;
	long phoneNo, pnrNo;

	void findTrains() {
		System.out.println("Enter source address : ");
		sourceAdd = sc.nextLine();
		System.out.println("Enter destination address : ");
		desAdd = sc.nextLine();
		System.out.println("Enter journey date (In complete date format,i.e DD/MM/YYYY) : ");
		date = sc.next();
		trainList();
	}

	void trainList() {
		System.out.println("\n\t\t _______________________________________\n");
		System.out.println("\t\t|\t        CHOOSE THE TRAIN        |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t1. Intercity Express   04:00 AM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t2. HateBazar Express   06:30 AM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t3. Sampurn Kranti      09:15 AM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t4. Amarpali Express    01:00 PM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t5. Gareebrath Express  04:30 PM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t6. Humsafar Express    06:45 PM |");
		System.out.println("\t\t|-------------------------------------- |");
		System.out.println("\t\t|\t7. EDIT JOURNEY DETAILS         |");
		System.out.println("\t\t _______________________________________\n");
		System.out.print("\nChoose the train : ");
		int trainChoose = sc.nextInt();
		sc.nextLine();
		switch (trainChoose) {
		case 1:
			getTrainDetails("INTERCITY EXPRESS", 1000, "04:00 AM");
			chooseClass();
			break;
		case 2:
			getTrainDetails("HATEBAZARE EXPRESS", 1200, "06:30 AM");
			chooseClass();
			break;
		case 3:
			getTrainDetails("SAMPURN KRANTI", 1500, "09:15 AM");
			chooseClass();
			break;
		case 4:
			getTrainDetails("AMARPALI EXPRESS", 1300, "01:00 PM");
			chooseClass();
			break;
		case 5:
			getTrainDetails("GAREEBRATH EXPRESS", 1800, "04:30 PM");
			chooseClass();
			break;
		case 6:
			getTrainDetails("HUMSAFAR EXPRESS", 2000, "06:45 PM");
			chooseClass();
			break;
		case 7:
			findTrains();
			break;
		default:
			System.out.println("Invalid option, please enter valid option!!!");
			trainList();
		}
	}

	void getTrainDetails(String tn, int p, String t) {
		trainName = tn;
		price = p;
		time = t;
	}
	void chooseClass() {
		System.out.println("\n\t\t ________________________________________\n");
		System.out.println("\t\t|\t    " + trainName + "\t\t  |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\t1. AC first class\t" + (price + 2000) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t2. AC second class\t" + (price + 1500) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t3. AC third class\t" + (price + 1000) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t4. Sleper class\t\t" + (price + 750) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t5. AC chair car\t\t" + (price + 500) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t6. Second sitting\t" + (price + 250) + " Rs.  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t7. CHOOSE ANOTHER TRAIN AND CLASS |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t8. EDIT ENTIRE DETAILS            |");
		System.out.println("\t\t _________________________________________");

		System.out.print("Choose your class : ");
		int classChoose = sc.nextInt();
		sc.nextLine();
		switch (classChoose) {
		case 1:
			getCoachDetails(2000, "AC First Class", "EC1");
			break;
		case 2:
			getCoachDetails(1500, "AC Second Class", "EC2");
			break;
		case 3:
			getCoachDetails(1000, "AC Third Class", "EC3");
			break;
		case 4:
			getCoachDetails(750, "Sleeper Class", "S1");
			break;
		case 5:
			getCoachDetails(500, "AC Chair Car", "CC1");
			break;
		case 6:
			getCoachDetails(250, "Second Sitting", "2S1");
			break;
		case 7:
			trainList();
			break;
		case 8:
			findTrains();
			break;
		default:
			System.out.println("Invalid option, please enter valid option!!!");
			chooseClass();
		}
		showTrainDetails();
		bookTicketOrNot();
	}

	void getCoachDetails(int p, String c1, String c2) {
		price += p;
		cls = c1;
		coach = c2;
	}
	void showTrainDetails() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        JOURNEY DETAILS           |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\tTrain Name : " + trainName + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tSource Address : " + sourceAdd + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tDest.. Address : " + desAdd + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tJourney Date : " + date + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tClass : " + cls + "\t\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tPrice : " + price + "\t\t\t  |");
		System.out.println("\t\t _________________________________________");
	}
	void bookTicketOrNot() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        CHOOSE THE OPTION         |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\t1. BOOK TICKET                    |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t2. CHOOSE ANOTHER CLASS           |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t3. CHOOSE ANOTHER TRAIN AND CLASS |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t4. EDIT ENTIRE DETAILS            |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t5. CANCEL                         |");
		System.out.println("\t\t _________________________________________");

		System.out.println("Choose  your option : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			signInOrUp();
			break;
		case 2:
			chooseClass();
			break;
		case 3:
			trainList();
			break;
		case 4:
			findTrains();
			break;
		case 5:
			System.out.println("Thanks for visiting INDIAN RAILWAY WEBSITE!!!\n PROGRAM TERMINATED...");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid option, please enter valid option!!!");
			bookTicketOrNot();
		}
	}

	void signInOrUp() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        SIGN IN / SIGN UP         |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\t  LOGIN/REGISTER TO BOOK TICKET   |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t1. LOGIN                          |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t2. CREATE AN ACCOUNT              |");
		System.out.println("\t\t _________________________________________");

		System.out.println("Choose  your option : ");
		int choic = sc.nextInt();
		sc.nextLine();
		switch (choic) {
		case 1:
			signIn();
			break;
		case 2:
			register();
			break;
		default:
			System.out.println("Invalid option, please enter valid option!!!");
			payOrCancel();
		}
	}

	void signIn() {
		System.out.println("Enter Username : ");
		oldUser = sc.nextLine();
		System.out.println("Enter Password : ");
		oldPassword = sc.nextLine();
		if (oldUser.equals(username) && oldPassword.equals(password)) {
			System.out.println("\n\t\tLogged in successfully!!!\n");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");
			getPassengerDetails();
		} else if (username.equals(" ") && password.equals(" ")) {
			System.out.println("\t\tYou don't have any account, please create a new account!!!");
			register();
		} else {
			System.out.println("\n\t\tUsername or password is incorrect, please try again!!!");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");
			signIn();
		}
	}

	void register() {
		if (username == " ") {
			System.out.println(
					"\n------------------------------------------------------------------------------------------");
			System.out.println("Set Username (Don't give the spaces) : ");
			username = sc.nextLine();
		}
		System.out.println("Set Password : ");
		password = sc.nextLine();
		System.out.println("Confirm Password : ");
		passwordNew = sc.nextLine();
		if (password.equals(passwordNew)) {
			System.out.println("\n\t\tAccount created successfully!!!");
			System.out.println("\n\t\tKindly login again to book your ticket!");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");
			signIn();
		} else {
			System.out.println("\n\t\tPassword doesn't matched, please enter the same password!");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");
			register();
		}
	}
	void getPassengerDetails() {
		System.out.println("\t\tKindly enter the passenger details correctly!");
		System.out.println(
				"------------------------------------------------------------------------------------------\n");
		System.out.println("Enter the passenger name : (FULL NAME)");
		pName = sc.nextLine();
		System.out.println("Enter the age : (2 DIGITS INTEGER ONLY)");
		pAge = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter gender : ");
		pGender = sc.nextLine();
		System.out.println("Enter nationality : ");
		nationality = sc.nextLine();
		System.out.println("Enter the berth preference");
		berthPre = sc.nextLine();
		System.out.println("Enter Phone Number : (10 DIGITS INTEGERS ONLY)");
		phoneNo = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter email ID : (COMPLETE EMAIL ID)");
		email = sc.next();
		showPassengerDetails();
		payOrCancel();
	}

	void showPassengerDetails() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        PASSENGER DETAILS         |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\tPassenger name : " + pName + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tAge            : " + pAge + "\t\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tNationality    : " + nationality + "\t\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tMobile number  : " + phoneNo + "\t  |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tEmail          : " + email + " |");
		if (pnrNo != 0 && seatNo != 0 && coach != "") {
			System.out.println("\t\t|-----------------------------------------|");
			System.out.println("\t\t|\tPNR No.        : " + pnrNo + "\t  |");
			System.out.println("\t\t|-----------------------------------------|");
			System.out.println("\t\t|\tCoach          : " + coach + "\t\t  |");
			System.out.println("\t\t|-----------------------------------------|");
			System.out.println("\t\t|\tBerth No.      : " + seatNo + "\t\t  |");
		}
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\tBerth type     : " + berthPre + "\t  |");
		System.out.println("\t\t _________________________________________");
	}

	void payOrCancel() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        EDIT OR PAY               |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\t1. Proceed to pay                 |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t2. Edit details                   |");
		System.out.println("\t\t _________________________________________");

		System.out.println("Choose  your option : ");
		int choice2 = sc.nextInt();
		sc.nextLine();
		switch (choice2) {
		case 1:
			paymentMode();
			System.out.println(
					"\n------------------------------------------------------------------------------------------");
			System.out.println("\t\tCongratulations ticket  has been booked!!!");
			System.out.println(
					"------------------------------------------------------------------------------------------");
			break;
		case 2:
			getPassengerDetails();
			break;
		default:
			System.out.println("Invalid option, please enter valid option!!!");
			payOrCancel();
		}
	}

	void paymentMode() {
		System.out.println("\n\t\t _________________________________________\n");
		System.out.println("\t\t|\t        MODE OF PAYMENT           |");
		System.out.println("\t\t|=========================================|");
		System.out.println("\t\t|\t1. GOOGLE PAY                     |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t2. PHONE PAY                      |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t3. PAYTM                          |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t4. DEBIT/CREDIT CARD              |");
		System.out.println("\t\t|-----------------------------------------|");
		System.out.println("\t\t|\t5. INTERNET BANKING               |");
		System.out.println("\t\t _________________________________________");

		System.out.println("Choose  your option : ");
		int choice3 = sc.nextInt();
		sc.nextLine();
		if (choice3 == 1 || choice3 == 2 || choice3 == 3 || choice3 == 4 || choice3 == 5) {
			pnrNo = (long) Math.ceil(Math.random() * 1999999999);
			seatNo = (int) Math.ceil(Math.random() * 99);
			System.out.println(
					"\n------------------------------------------------------------------------------------------");
			System.out.println("\t\tCONGRATULATION your ticket has been booked!!!");
			System.out.println(
					"------------------------------------------------------------------------------------------\n");
			System.out.println("\n\t\t _________________________________________\n");
			System.out.println("\t\t|\t     GET YOUR TICKET OR EXIT      |");
			System.out.println("\t\t|=========================================|");
			System.out.println("\t\t|\t1. Get ticket details             |");
			System.out.println("\t\t|-----------------------------------------|");
			System.out.println("\t\t|\t2. Exit                           |");
			System.out.println("\t\t _________________________________________");
			System.out.println("Choose  your option : ");
			int choice4 = sc.nextInt();
			sc.nextLine();
			if (choice4 == 1) {
				showTrainDetails();
				showPassengerDetails();
				System.out.println("\n\t\t _________________________________________\n");
				System.out.println("\t\t|\t        CONTINUE OR EXIT          |");
				System.out.println("\t\t|=========================================|");
				System.out.println("\t\t|\t1. Looking for another journey    |");
				System.out.println("\t\t|-----------------------------------------|");
				System.out.println("\t\t|\t2. Exit                           |");
				System.out.println("\t\t _________________________________________");
				System.out.println("Choose  your option : ");
				int choice5 = sc.nextInt();
				sc.nextLine();
				if (choice5 == 1)
					findTrains();
				else {
					System.out.println("Thanks for visiting INDIAN RAILWAY WEBSITE!!!\nPROGRAM TERMINATED...");
					System.exit(0);
				}
			} else {
				System.out.println("Thanks for visiting INDIAN RAILWAY WEBSITE!!!\nPROGRAM TERMINATED...");
				System.exit(0);
			}
		}
		else {
			System.out.println("Invalid option, please enter valid option!!!");
			paymentMode();
		}
	}
	public static void main(String[] args) {
		System.out.println(
				"\n\t|***********************************************************************************************************************|");
		System.out.println(
				"\t|                                                                                                                       |");
		System.out.println(
				"\t|\t\t\t\t\t\tWELCOME TO INDIAN RAILWAY\t\t\t\t\t\t|");
		System.out.println(
				"\t|                                                                                                                       |");
		System.out.println(
				"\t|***********************************************************************************************************************|\n\n");

		new RailTicketBooking().findTrains();
		System.out.println("Thanks for visiting INDIAN RAILWAY WEBSITE!!!\nPROGRAM TERMINATED...");

		System.out.println(
				"\n\t ################################################## END #################################################################");
	}
}