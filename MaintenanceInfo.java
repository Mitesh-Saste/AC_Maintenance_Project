import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;

public class MaintenanceInfo {
	private Map<String, String> maintenanceMap = new TreeMap<>();
	
	public Map<String, String> getMaintenanceMap() {
		return maintenanceMap;
	}

	public void setMaintenanceMap(Map<String, String> maintenanceMap) {
		this.maintenanceMap=maintenanceMap;
	}

	public void addAcMaintenanceDetails(String serviceCode, String acType) {
		maintenanceMap.put(serviceCode, acType);
	} 

	public int findTheNumberOfRecordsBasedOnTheACType(String acType) {
		int count = 0;
		for(String value : maintenanceMap.values()) {
			if(value.equals(acType)) {
				count++;
			} 	
		} 
		return count; 
	}  

	public Set<String> findServiceCodesBasedOnACType(String acType) {
		Set<String> serviceCodes = new HashSet<>();
		for(Map.Entry<String, String> entry : maintenanceMap.entrySet()) {
			if(entry.getValue().equals(acType)) {
				serviceCodes.add(entry.getKey());	
			} 
		} 
		return serviceCodes; 
	} 
}
