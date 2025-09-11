public class Main{

    public static void main(String[] args){

        Student student1 = new Student();

        student1.changeName();
        System.out.println(student1.getname());
        System.out.println(student1.getGPA());
        System.out.println(student1.getSSN());
        
        Student student2 = new Student();
        student2.changeName();
        System.out.println(student2.getname());
        System.out.println(student2.getGPA());
        System.out.println(student2.getSSN());
        
    }
}
