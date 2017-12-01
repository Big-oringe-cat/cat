public class Person{
     public String name;
     public int age;
     public int sex;
     public void study(){
         System.out.println("studying!!!");
     }
     public void showAge(){
         System.out.println("age is "+age);
     }
     public void addAge(int i){
    	 age+=i;
     }
     public static void main(String[] args){
        Person jake=new Person();
        jake.name="Jake";
        jake.age=18;
        jake.sex=1;
        jake.showAge();
        jake.addAge(5);
        jake.showAge();
    }

}

