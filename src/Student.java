public class Student {
    private String name;
    private String nim;
    private String faculty;
    private String programStudy;

    public Student(String name, String nim, String faculty, String programStudy) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.programStudy = programStudy;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProgramStudy() {
        return programStudy;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nFaculty: " + faculty + "\nNIM: " + nim + "\nProgram: " + programStudy;
    }
}
