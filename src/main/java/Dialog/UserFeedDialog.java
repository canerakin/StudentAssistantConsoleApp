package Dialog;

import data.Data;
import data.User;

import java.util.Scanner;


public class
UserFeedDialog {



	public void startDialog(User user, Data data) {

		Scanner scanner = new Scanner(System.in);
		LoginDialog loginDialog = new LoginDialog();
		int choice = -1;
		while (choice != 0) {

			System.out.println("1- show rooms");
			System.out.println("2- show notifications");
			System.out.println("3- show assignments");
			System.out.println("4- calculate average");
			System.out.println("5- create room");
			System.out.println("6 - join room");
			System.out.println("0- Exit");
			choice = scanner.nextInt();
			switch (choice) {
				case 1:
					System.out.println(user.roomList());

					break;
				case 2:
					System.out.println(user.getRoomString());

					break;
				case 3:
					new CalendarDialog().startDialog(user,data);

				case 4:
					new AverageDialog().startDialog();
					break;
				case 0:
					System.out.println("Going Back!");
					break;
				default:
					System.out.println("Invalid input : " + choice);

			}

		}

	}


	private boolean createRoom(User user, Data data) {
		System.out.println("please enter the room");
		return false;
	}

}
