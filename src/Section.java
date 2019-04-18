public class Section {

    private String teacher;
    private Student[] students = new Student[50];
    private String subject;
    private int currentSize = 0;


    public Section (String n){
        this.subject = n;


    }
    //Getters


    public String getTeacher() {
        return teacher;
    }

    public String getName() {
        return subject;
    }

    public Student[] getStudents() {
        return students;
    }

    //Setters
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setName(String name) {
        this.subject = name;
    }

    //add student
    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize ++;
    }

    // To string
    public String toString(){

        return ("This " + subject + " class is taught by " + teacher + " and has " + currentSize + " students: " );
        // return something

    }


}