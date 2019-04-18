public class Teacher extends Person {

    private Section[] sections = new Section[10];
    private String subject;
    private int sectionCount = 0;


    public Teacher (String name, int id){
        super(name, id);
        sectionCount ++;
    }
    // Getters

    public Section[] getSections() {
        return sections;
    }

    public String getSubject() {
        return subject;
    }

    // Setters

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    // addSections () void something

    public void addSection(Section s){
        sections[sectionCount] = s;
        sectionCount ++;

    }
}