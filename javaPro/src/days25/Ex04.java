package days25;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// p 678  와일드 카드  :  <? extends T>
		//                             <? super T>
		//                             <?>
		EmpBox<Employee> box1 = new EmpBox<>();
		box1.setEmp(new Employee());
		box1.setEmp(new Regular());   // 
		
		EmpBox<Regular> box2 = new EmpBox<>();
		box2.setEmp(new Regular());
		// box2.setEmp(new EmpBox());
		
		
		//EmpBox<Employee> box3 = new EmpBox<Regular>();
		
		// EmpBox<? super Regular> box3 = new EmpBox<Employee>();
		
		//EmpBox<Employee> box4 = new EmpBox<Employee>();
		
		//EmpBox<? extends Employee> box3 = new EmpBox<Regular>();
		//EmpBox<? super Regular> box3 = box4;
		
		// ArrayList<Employee> list = new ArrayList<Employee>(c) 
		

	}

}
//
class Employee{}
class Regular extends Employee{}
class EmpBox<T>{
	T emp;
	public T getEmp() {
		return emp;
	}
	public void setEmp(T emp) {
		this.emp = emp;
	}
}









//