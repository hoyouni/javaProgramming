package days19;

public final class SalesMan extends Regular{

   private int sales;
   private int comm;
   
   public SalesMan() {
      System.out.println("SalesMan Default Constructor 호출");

   }

   public SalesMan(String name, String addr, String tel, String hiredate, int pay,int sales,int comm) {
      super(name, addr, tel, hiredate, pay);
      this.sales = sales;
      this.comm = comm;
      System.out.println("SalesMan 7 parameter Constructor 호출");
   }

   @Override
   public void dispEmpInfo() {
      super.dispEmpInfo();
      System.out.printf("판매량:%d, 커미션:%d\n",this.sales,this.comm);
   }

   @Override
   public int getPay() {
      return super.getPay()+this.comm*this.sales;
   }
   
   
   

   
}
