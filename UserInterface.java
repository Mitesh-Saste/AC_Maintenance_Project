import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaintenanceInfo info = new MaintenanceInfo();
		
		System.out.println("Enter number of records to be added");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the records (Service code: AC Type)");
		for(int i = 0; i < n; i++) {
			String record = sc.nextLine().toLowerCase();
			String[] arr = record.split(":");
			info.addAcMaintenanceDetails(arr[0], arr[1]); 
		} 
		
		System.out.println("Enter the AC type to be searched"); 
		String searchType = sc.nextLine().toLowerCase();
		int recordCount = info.findTheNumberOfRecordsBasedOnTheACType(searchType);
		if(recordCount == 0) {
			System.out.println("No records were found for " + searchType);  
		} else {
			System.out.println("The records based on " + searchType + " are " + recordCount); 
		}  

		System.out.println("Enter the AC type to identify the Service codes");
		String serviceCodeType = sc.nextLine().toLowerCase();
		Set<String> serviceCodes = info.findServiceCodesBasedOnACType(serviceCodeType);
		if (serviceCodes.isEmpty()) {
			System.out.println("No service codes were found for the type " + serviceCodeType); 
		} else {
			System.out.println("Records based on the " + serviceCodeType + " are " );
			for(String code : serviceCodes) {
				System.out.println(code);
			} 
		}  
	} 
} 
