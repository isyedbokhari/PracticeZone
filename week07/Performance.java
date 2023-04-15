package week07;

public class Performance {
	
	String responseTime;
	int errorRate;
	int numberOfReleases;
	
	public Performance() {
		
	}
	
	public Performance(String responseTime, int errorRate, int numberOfReleases) {
		this.responseTime = responseTime;
		this.errorRate = errorRate;
		this.numberOfReleases = numberOfReleases;
	}
	
	public void showPlan() {
		System.out.println("Out response time is gonna be " + responseTime + 
				" with " + errorRate + " error rate and " + 
				numberOfReleases + " releases per sprint.");
	}
}
