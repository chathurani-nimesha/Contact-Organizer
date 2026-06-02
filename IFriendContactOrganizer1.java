import java.util.*;

class IFriendContactOrganizer1{

	static int contactID=1;
	static int lastContactID=1;
	static String name;
	static String phoneNumber;
	static String companyName;
	static int salary;
	static String DOB;
	
	static String searchInput;
	
	static int[] ContactIDArr = new int[100];
	static String[] nameArr = new String[100];
	static String[] phoneNumberArr=new String[100];
	static String[] companyNameArr=new String[100];
	static int[] salaryArr=new int[100];
	static String[] DOBArr=new String[100];

	public static void generateContactID(int lastContactID){
		System.out.printf("C%04d\n",lastContactID);
	}

    public static void addContacts(){
        Scanner input=new Scanner(System.in);

        System.out.println("+-----------------------------------------------------+");
		System.out.printf("%50s","Add Contact to the list                        \n");
		System.out.println("+-----------------------------------------------------+\n\n");

		generateContactID(lastContactID);



    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.printf("%79s"," /$$ /$$$$$$$$  /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$\n");
		System.out.printf("%80s","|__/| $$_______/| $$____$$|_  $$_/| $$_____/| $$$ | $$| $$__  $$\n");
		System.out.printf("%80s"," /$$| $$        | $$    \\   | $$  | $$      | $$$$| $$| $$  \\ $$\n");
		System.out.printf("%80s","| $$| $$$$$     | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$\n");
		System.out.printf("%80s","| $$| $$__/     | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$\n");
		System.out.printf("%80s","| $$| $$        | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$\n");
		System.out.printf("%80s","| $$| $$        | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/\n");
		System.out.printf("%79s","|__/|__/        |__/  |__/|______/|________/|__/  \\__/|_______/\n");
		
		System.out.println("\n\n  _____             _            _          ____                        _");
		System.out.println(" / ____|           | |          | |        / __ \\                      (_)");
		System.out.println("| |      ___  _ __ | |_ __ _  __| |_ __   | |  | |_ __ __ _  __ _ _ __  _ _______ _ __");
		System.out.println("| |     / _ \\| '_ \\| __/ _' |/ _| __/ __| | |  | | '__/ _` |/ _` | '_ \\| |_  / _ \\ '__|");
		System.out.println("| |____| (_) | | | | || |_| | |_| |_\\__ \\ | |__| | | | |_| | |_| | | | | |/ /  __/ |");
		System.out.println(" \\______\\___/|_| |_|\\__\\__'_|\\__|\\__|___/  \\____/|_|  \\__, |\\__,_|_| |_|_/___\\___|_|");
		System.out.println("                                                       __/ |");
		System.out.println("                                                      |___/");
		
		System.out.println("\n\n===================================================================================");
		
		System.out.println("\n\t[01] ADD Contacts\n");
		System.out.println("\t[02] UPDATE Contacts\n");
		System.out.println("\t[03] DELETE Contacts\n");
		System.out.println("\t[04] SEARCH Contacts\n");
		System.out.println("\t[05] LIST Contacts\n");
		System.out.println("\t[06] Exit\n");
		
		System.out.print("Enter an option to continue -> ");
		int option = input.nextInt();

        switch(option){
            case 1:
				addContacts();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("Enter an valide option - between 1-6.");                

        }
    }
}

