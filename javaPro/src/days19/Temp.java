package days19;

public class Temp extends Employee{
   
   private int days;      //근무일수
   private int payOfDays;   // 하루 일당
   
   public Temp() {
      System.out.println("Temp Default Constructor 호출");
   }


   public Temp(String name, String addr, String tel, String hiredate,int days,int payOfDays) {
      super(name, addr, tel, hiredate);
      this.days = days;
      this.payOfDays = payOfDays;
      System.out.println("Temp 6 parameter Constructor 호출");
   }




   @Override
   public int getPay() {
      return this.days*this.payOfDays;
   }


   @Override
   public void dispEmpInfo() {
      super.dispEmpInfo();
      System.out.printf("일한날:%d, 일당:%d",this.days,this.payOfDays);
   }
   
   

}