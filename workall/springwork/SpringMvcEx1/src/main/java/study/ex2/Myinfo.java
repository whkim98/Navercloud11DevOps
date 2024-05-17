package study.ex2;

public class Myinfo {
   private String name;
   private int age;
   private String addr;
   
   public Myinfo(String name, int age, String addr) {
      super();
      this.name = name;
      this.age = age;
      this.addr = addr;
   }

   @Override
   public String toString() {
      return "Myinfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
   }
   
   
}