import java.time.LocalDate;
import java.util.*;
class IFriendContactOrganizer {
    static int option;
    static int lastContactID=0;

    static String name;
    static String phoneNumber;
    static String bDay;
    static String companyName;
    static int salary;

    static int[] contactIdArray=new int[lastContactID];
    static String[] phoneNumberArray=new String[lastContactID];
    static String[] nameArray=new String[lastContactID];
    static String[] companyNameArray=new String[lastContactID];
    static int[] salaryArray=new int[lastContactID];
    static String[] dateOfBirthDayArray=new String[lastContactID];

    public static boolean isValidBirthDay(String bDay){
        LocalDate localdate = LocalDate.parse(bDay);
		int birthyear = localdate.getYear();
		int birthmonth = localdate.getMonthValue();
		int birthdate = localdate.getDayOfMonth();

		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		
		if(birthyear > 1926 && birthyear < currentYear && 12> birthmonth && birthmonth > 0 && birthdate >0 &&  birthdate <30){
			return true;
		}else{
			return false;
		}
    }
    public static boolean isValidSalary(int salary){
        if(salary>0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isValidatePhoneNumber(String phoneNumber){
        if(phoneNumber.length()==10 && phoneNumber.charAt(0)=='0'){
            return true;
        }else{
            return false;
        }
    }
    public static void generateContactID(int lastContactID){
        lastContactID++;
        System.out.printf("S%04d\n",lastContactID);
        System.out.println("=======");
    }
    public static void addContacts(){
        Scanner input=new Scanner(System.in);

        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                     Add Contacts to the List                        |");
        System.out.println("+---------------------------------------------------------------------+\n\n");

        generateContactID(lastContactID);
        System.out.printf("Name%15s",":");
        name=input.nextLine();
        input.next();

        L1:while (true) { 
            System.out.printf("Phone Number%7s",":");
            phoneNumber=input.nextLine();
            input.next();
            if((isValidatePhoneNumber(phoneNumber))!=true){
                System.out.println("\tInvalid Phone Number...");
                continue L1;
            }
            System.out.printf("Company Name%7s",":");
            companyName=input.nextLine();
            input.next();

            System.out.printf("Salary%13s",":");
            salary=input.nextInt();
            if(!isValidSalary(salary)){
                System.out.println("Salary sholud be positive");
            }
            L2: while (true) { 
                System.out.printf("B'Day(YYYY-MM-DD)%2s",":");
                bDay=input.nextLine();
                input.next();  
                if(!isValidBirthDay(bDay)){
                    System.out.println("Invalid Birthday...");
                    continue L2;
                }
            }
        }
    }

    public static void updateContacts(){

    }

    public static void deleteContacts(){}

    public static void searchContacts(){}

    public static void listContacts(){}
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        System.out.printf("%79s", " /$$ /$$$$$$$$  /$$$$$$$  /$$$$$$ /$$$$$$$$ /$$   /$$ /$$$$$$$\n");
        System.out.printf("%80s", "|__/| $$_______/| $$____$$|_  $$_/| $$_____/| $$$ | $$| $$__  $$\n");
        System.out.printf("%80s", " /$$| $$        | $$    \\   | $$  | $$      | $$$$| $$| $$  \\ $$\n");
        System.out.printf("%80s", "| $$| $$$$$     | $$$$$$$/  | $$  | $$$$$   | $$ $$ $$| $$  | $$\n");
        System.out.printf("%80s", "| $$| $$__/     | $$__  $$  | $$  | $$__/   | $$  $$$$| $$  | $$\n");
        System.out.printf("%80s", "| $$| $$        | $$  \\ $$  | $$  | $$      | $$\\  $$$| $$  | $$\n");
        System.out.printf("%80s", "| $$| $$        | $$  | $$ /$$$$$$| $$$$$$$$| $$ \\  $$| $$$$$$$/\n");
        System.out.printf("%79s", "|__/|__/        |__/  |__/|______/|________/|__/  \\__/|_______/\n");
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
        option=input.nextInt();
        
        switch(option){
            case 1:
                addContacts();
                break;

            case 2:
                updateContacts();
                break;
            case 3: 
                deleteContacts();
                break;
            case 4:
                searchContacts();
                break;
            case 5:
                listContacts();
                break;
            case 6:
                //exit();
                //break;
            default:
                System.out.println("Enter a valid option...");

        }
    }
}
