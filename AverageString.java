class AverageString
{
  public static void main(String[] args) 
  {
    String str[] = {"Himanshi","Amarpreet","Fatema","Kajol","Pranjul","aditi"};
    float sum = 0;
    float avg;
    for(int i=0;i<6;i++){
      sum += str[i].length();
    }
   avg = sum/str.length;
   System.out.println("Average is:" + avg);
  }
}