package projects.project1;

public class StudentMember extends Member {
    private int grade;

    public StudentMember(String name, int memberId, int grade) {
        super(name, memberId);
        this.grade = grade;
    }
}
