package days19;

public class Regular extends Employee{
   
   private int pay;   // 기본급
   
   public Regular() {
      super();
      System.out.println("Regular Default Constructor 호출");
   }
   
   public Regular(String name, String addr, String tel, String hiredate,int pay) {
      
      super(name, addr, tel, hiredate);
      this.pay = pay*10;
      System.out.println("Regular 5 parameter Constructor 호출");
      
   }
   
   @Override
   public void dispEmpInfo() {
      super.dispEmpInfo();
      System.out.printf("급여 : %d\n",this.pay);
   }

   @Override
   public int getPay() {
      return this.pay;
   }

   
   
}
