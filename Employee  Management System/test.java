public class test {
  public static void main (String [] args){
  employee e1=new employee("John",2500,2010,"1");
  employee e2=new employee("stark",5500,2004,"1");
  e1.getAllRecords();
  System.out.println("-------------------------");
  e2.getAllRecords();
  System.out.println("-------------------------");
  System.out.println(e1.equals(e2));
}
}