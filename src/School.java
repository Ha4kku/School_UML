public class School {
    private String name;
    private Section[] sections = new Section[200];
    private int sectionCount = 0;

    // constructor

    public School (String n){
        this.name = n;
    }
    // Getters
    public String getName() {
        return name;
    }

    public Section[] getSections() {
        return sections;
    }

    // Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setSections(Section[] sections) {
        this.sections = sections;
    }

    // add section

    public void addSection(Section s){

        sections[sectionCount] = s;
        sectionCount ++;

    }
}
