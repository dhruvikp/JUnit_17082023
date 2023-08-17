
public class Calculator {
	public ReportPublisher publisher;

	public Calculator(ReportPublisher reportPublisher) {
		this.publisher = reportPublisher;
	}

	public int calculate(int a, int b) {
		boolean value = this.publisher.publish();
		if(value == true) {
			return a+b;
		}else {
			return a*b;
		}
	}
}
