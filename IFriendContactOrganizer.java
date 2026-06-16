
import java.time.LocalDate;
import java.util.*;
class IFriendContactOrganizer {
    static int option;
    static int lastContactID=0;
    static String updateAnother;

    static String name;
    static String phoneNumber;
    static String bDay;
    static String companyName;
    static int salary;

    static int[] contactIdArray=new int[1];
    static String[] phoneNumberArray=new String[1];
    static String[] nameArray=new String[1];
    static String[] companyNameArray=new String[1];
    static int[] salaryArray=new int[1];
    static String[] dateOfBirthDayArray=new String[1];

    public static boolean isValidBirthDay(String bDay){
        LocalDate localdate = LocalDate.parse(bDay);
		int birthyear = localdate.getYear();
		int birthmonth = localdate.getMonthValue();
		int birthdate = localdate.getDayOfMonth();

		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		
		if(birthyear > 1926 && birthyear < currentYear && 12> birthmonth && birthmonth > 0 && birthdate >0 &&  birthdate <=30){
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
        if(phoneNumber.length()!=10 || phoneNumber.charAt(0)!='0'){
            return false;
        }else{
            return true;
        }
    }
    public static void generateContactID(int lastContactID){
        System.out.printf("S%04d\n",lastContactID+1);
        System.out.println("=======");
    }

    private static void incrementArray(){
         int[] temContactIdArray=new int[nameArray.length+1];
         String[] temphoneNumberArray=new String[nameArray.length+1];
         String[] tempnameArray=new String[nameArray.length+1];
         String[] tempcompanyNameArray=new String[nameArray.length+1];
         int[] tempsalaryArray=new int[nameArray.length+1];
         String[] tempdateOfBirthDayArray=new String[nameArray.length+1];

         nameArray=tempnameArray;
         phoneNumberArray=temphoneNumberArray;
         companyNameArray=tempcompanyNameArray;
         contactIdArray=temContactIdArray;
         salaryArray=tempsalaryArray;
         dateOfBirthDayArray=tempdateOfBirthDayArray;
    }

    public static void addContacts(){
        Scanner input=new Scanner(System.in);

        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                     Add Contacts to the List                        |");
        System.out.println("+---------------------------------------------------------------------+\n\n");

        generateContactID(lastContactID);
        System.out.printf("Name%15s",":");
        name=input.nextLine();

        L1:while (true) { 
            System.out.printf("Phone Number%7s",":");
            phoneNumber=input.nextLine();
            if((isValidatePhoneNumber(phoneNumber))==false){
                System.out.println("\tInvalid Phone Number...");
                continue L1;
            }
            System.out.printf("Company Name%7s",":");
            companyName=input.nextLine();

            System.out.printf("Salary%13s",":");
            salary=input.nextInt();
            input.nextLine();

            if(!isValidSalary(salary)){
                System.out.println("Salary sholud be positive");
            }
            L2: while (true) { 
                System.out.printf("B'Day(YYYY-MM-DD)%2s",":");
                bDay=input.nextLine();
                if(!isValidBirthDay(bDay)){
                    System.out.println("Invalid Birthday...");
                    continue L2;
                }
                break;
            }
            break;
        }
        lastContactID++;
        System.out.println("\n\n\t\tYour contact has been added successfully...");

        //add to arrays
        incrementArray();
        contactIdArray[nameArray.length-1]=lastContactID;
        nameArray[nameArray.length-1]=name;
        phoneNumberArray[nameArray.length-1]=phoneNumber;
        companyNameArray[nameArray.length-1]=companyName;
        salaryArray[nameArray.length-1]=salary;
        dateOfBirthDayArray[nameArray.length-1]=bDay;

        System.out.print("\nDo you want to add another contact(Y/N): ");
        updateAnother=input.nextLine();

        if(updateAnother.charAt(0)=='Y' ||updateAnother.charAt(0)=='y'){
            addContacts();
        }else{
            homePage();
        }

    }

    public static void updateShowContacts(String update){
       for(int i=0;i<nameArray.length;i++){
        if(update.equals(nameArray[i]) || update.equals(phoneNumberArray[i])){
            System.out.printf("Contact ID%15sS%04d\n",": ",contactIdArray[i]);
            System.out.printf("Name%15s%s\n",": ",nameArray[i]);
            System.out.printf("Company Name%15s:%s\n",": ",companyNameArray[i]);
            System.out.printf("Salary%15s:%d\n",": ",salaryArray[i]);
            System.out.printf("B'Day(YYYY-MM-DD)%15s:%s\n",": ",dateOfBirthDayArray[i]);
        }else{
            System.out.println("The name or phone number does not exit.");
        }
       }
    }
    public static void updateAnother(){
        Scanner input=new Scanner(System.in);
        System.out.println("Do you want to update another contact (Y/N): ");
        updateAnother=input.nextLine();

        if(updateAnother.charAt(0)=='Y'|| updateAnother.charAt(0)=='y'){
            updateContacts();
        }else{
            homePage();
        }
    }
    
    public static void updateName(String update){
        Scanner input=new Scanner(System.in);

        System.out.println("Update Name");
        System.out.println("==============");

        System.out.print("input new name - ");
        String newName=input.nextLine();
        System.out.println("\n\tContact has been added successfully...");

        for (int i = 0; i <nameArray.length; i++) {
            if(update.equals(nameArray[i])){
                nameArray[i]=newName;
            }
        }
        updateAnother();
    }
    public static void updatePhoneNumber(String update){
        Scanner input=new Scanner(System.in);

        System.out.println("Update Phone Number");
        System.out.println("======================");

        System.out.print("input new phone number - ");
        String newPhoneNumber=input.nextLine();
        System.out.println("\n\tContact has been added successfully...");

        for (int i = 0; i <phoneNumberArray.length; i++) {
            if(update.equals(phoneNumberArray[i])){
                phoneNumberArray[i]=newPhoneNumber;
            }
        }
        updateAnother();
    }
    public static void updateCompanyName(String update){
        Scanner input=new Scanner(System.in);
        System.out.println("Update Company Name");
        System.out.println("======================");

        System.out.print("Input new Company Name - ");
        String newCompanyName=input.nextLine();
        System.out.println("\n\tContact has been added successfully...");

        for (int i = 0; i <phoneNumberArray.length; i++) {
           if(update.equals(nameArray[i]) || update.equals(phoneNumberArray[i])){
            companyNameArray[i]=newCompanyName;
           }
        }
        updateAnother();
    }
    public static void updateSalary(String update){
        Scanner input=new Scanner(System.in);
        System.out.println("Update Salary");
        System.out.println("===============");

        System.out.print("Input new Salary - ");
        int newSalary=input.nextInt();
        System.out.println("\n\tContact has been added successfully...");

        for (int i = 0; i <phoneNumberArray.length; i++) {
           if(update.equals(nameArray[i]) || update.equals(phoneNumberArray[i])){
            salaryArray[i]=newSalary;
           }
        }
        updateAnother();
    }
    public static void updateContacts(){
        Scanner input=new Scanner(System.in);

        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                     UPDATE CONTACT                                  |");
        System.out.println("+---------------------------------------------------------------------+\n\n");
        System.out.print("Search contact by Name or Phone Number - ");
        String update=input.nextLine();

        updateShowContacts(update);
        System.out.println("\n\nWhat do you want to update...\n");
        System.out.println("\t[01] Name");
        System.out.println("\t[02] Phone Number");
        System.out.println("\t[03] Company Name");
        System.out.println("\t[04] Salary");

        System.out.print("\nEnter an option to continue -> ");
        option=input.nextInt();

        switch (option) {
            case 1 :
                updateName(update);
                break;
            case 2:
                updatePhoneNumber(update);
                break;
            case 3:
                updateCompanyName(update);
                break;
            case 4:
                updateSalary(update);
                break;
            default:
                System.out.println("Enter an valid option...");
        }
    }

    public static void deleteContacts(){}

    public static void searchContacts(){}

    public static void listContacts(){}
    public static void homePage(){
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
                System.out.println("Good Bye......");
                return;
            default:
                System.out.println("Enter a valid option...");

        }

    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        homePage();
        
    }
}
