package aop.pojo;

public class Designer implements Employee {
	
	@Override
	public void work() {
		Action.gotOffice();
		System.out.println("������ �þ� �� �����մϴ�.");
		Action.getoffOffice();
	}
}
