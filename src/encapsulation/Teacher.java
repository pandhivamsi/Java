package encapsulation;

public class Teacher {
    public static void main(String[] args){
        Student s = new Student();
        s.setAge(7);
        s.setName("Vamsi");
        s.setAttended(true);
        System.out.println(s.getAge()+" " + s.getName()+" "+ s.isAttended());
    }
}
