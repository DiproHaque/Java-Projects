public class employee extends person{

  employeeRecords r=new employeeRecords();
  
  public employee(String n,double s,int y,String m){
  name=n;
  r.setAnnualSalary(s);
  r.setStartYear(y);
  r.setNis(m);
  }
  public void getAllRecords(){
  System.out.println(name);
  System.out.println(r.getAnnualSalary());
  System.out.println(r.getStartYear());
  System.out.println(r.getNis());
  }
  public boolean equals(Object o){
    employee s=(employee)o;
    if(r.getNis()==s.r.getNis()){
    return true;
    }
    else{
      return false;
    }
  }
} 