public class Arrayresize{
  public static void main(String [] jlskd){
    
    int lox[]={1,-2,5,-6,7,8,-1,9};
    Arrayresize var= new Arrayresize();
    var.arraynei(lox,8);
  }
  
  
  public static void arraynei(int box [],int size){
    
    int negnum=0;
    for(int i=0;i<size;i++){
      if(box[i]<0) 
        negnum++;
    }
    for(int j=0;j<size;j++){
      if(box[j]<0){
        for(int k=j;k<size-1;k++){
         box[k]=box[k+1]; 
        }
      }
    }
      
    int box2[]=new int[size-negnum];
    for(int i=0;i<box2.length;i++){
       box2[i]=box[i]; 
    }
    
    System.out.println("the size is: "+(size-negnum));
    
    for(int i=0;i<box2.length;i++){
      System.out.printf("%d ",box2[i]);
    }
    
  }
}