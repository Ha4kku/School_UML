public class Runner {

    public void main(String[] args){
        School BHS = new School("Berkeley High School");

        Section math = new Section("Math");
        Section science = new Section("Computer Science");
        Section bio = new Section("Biology");

        Teacher matt = new Teacher("Mr. Albion", 2009877);
        Teacher dan = new Teacher("Mr. Plon", 2300987);
        Teacher mull = new Teacher("Ms. Mulll", 345267);

        Student JB = new Student("Jo Bob", 2349876, 9);
        Student Joe = new Student("Joe Billy", 1239045, 11);
        Student Billy = new Student("Billy Bob Joe", 1234567, 12);
        Student Dave = new Student("Dave the octopus", 4567890, 23);
        Student Yup = new Student("Ysepticurus Profit", 5968705, 12);
        Student ASB = new Student("Alcott Sil Brooks", 4892048, 11);

        System.out.println(toString());
    }


}
