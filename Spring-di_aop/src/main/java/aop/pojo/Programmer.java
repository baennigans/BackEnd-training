package aop.pojo;

public class Programmer implements Employee {
	
	@Override
	public void work() {
		Action.gotOffice();
		System.out.println("����Ʈ���� ������ �մϴ�.");
		Action.getoffOffice();
	}
}
