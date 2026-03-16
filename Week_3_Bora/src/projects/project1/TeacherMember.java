package projects.project1;

public class TeacherMember extends Member {
    private String subject;

    public TeacherMember(String name, int memberId, String subject) {
        super(name, memberId);
        this.subject = subject;
    }
}
