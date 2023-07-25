package aop.pojo;

public class Programmer implements Employee {
	
	@Override
	public void work() {
		Action.gotOffice();
		System.out.println("소프트웨어 개발을 합니다.");
		Action.getoffOffice();
	}
}
