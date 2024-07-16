package student;

public class Students {
    private int id;
    private String name;
    private int age;
    private static String shool = "Tieng Anh" ;
    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
   public void setId(int id) {
        this.id = id ;
   }
   public String getName() {
        return name;
   }
   public void setName(String name) {
        this.name = name;
   }
   public int getAge() {
        return age;
   }
   public void setAge(int age) {
        this.age = age;
   }
   static void chaneShool() {
        shool = "CodeGym" ;
   }
   public String getShool() {
        return shool;
   }
   public void setShool(String shool) {
        this.shool = shool;
   }

    public static void main(String[] args) {
        Students.chaneShool();
        Students students = new Students(1,"Ky",24) ;
        Students students1 = new Students(2,"Kiet",22) ;
        System.out.println(students.getShool());
        System.out.println(students1.getShool());
        students.setShool("Toan");
        System.out.println(students.getShool());
        System.out.println(students1.getShool());
    }
}
