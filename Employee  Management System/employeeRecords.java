public class employeeRecords extends person{
  
  private double annualSalary;
  private int startYear;
  private String nIs;
  
  public void setAnnualSalary(double s){
    annualSalary=s;
  }
  public void setStartYear(int y){
    startYear=y;
  }
  public void setNis(String n){
    nIs=n;
  }
  public double getAnnualSalary(){
    return annualSalary;
  }
  public int getStartYear(){
    return startYear;
  }
  public String getNis(){
    return nIs;
  }
}