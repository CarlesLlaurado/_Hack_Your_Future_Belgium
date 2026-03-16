package projects.project3;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void introduce() {
        System.out.printf("Hello I am a Teacher and my subject is %s", subject);
    }

}
