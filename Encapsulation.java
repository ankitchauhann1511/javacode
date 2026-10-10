public class Encapsulation {
    public static void main(String args[]) {
        Stu N = new Stu();
        N.setName("Ankit");
        N.setAge(23);
        N.setNumber(783248312);
        N.setWieght(45.50);
        
        System.out.println(N.getName());
        System.out.println(N.getAge());
        System.out.println(N.getNumber());
        System.out.println(N.getWieght());
    }
}

class Stu{
   private String name;
   private int age;
   private int number;
   private double wieght;


   //Setter
   public void setName(String name) {
    this.name=name;
   }
   public void setAge(int age ) {
     if(age > 0) {   
            this.age = age;
        }
   }
   public void setNumber(int number) {
    this.number=number;
   }
   public void setWieght(double wieght) {
    this.wieght=wieght;
   } 

   
   //Getter
   public String getName() {
    return name;
   }
   public int getAge() {
    return age;
   }
   public int getNumber() {
    return number;
   }
   public double getWieght() {
    return wieght;
   }
}
