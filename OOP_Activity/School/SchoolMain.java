package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        
        school.addStudent("Abao");
        school.addStudent("Manabit");
        school.addTeacher("Ma'am : Valenzuela");
        school.addTeacher("Sir : Den");
        
        school.createClass(" Art Appreciation 101");
        school.createClass(" Human Computing ");
        
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
        
        school.removeStudent(" Beron ");
        school.removeTeacher("Mr. Fee");
        
        System.out.println("After removal - Students: " + school.getStudents());
        System.out.println("After removal - Teachers: " + school.getTeachers());
    }
}

