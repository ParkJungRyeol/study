package hello.core.member;

public class Member {

    //Shift + Command + Enter를 사용하면 세미콜론까지 완성된다.
    private long id;
    private String name;
    private Grade grade;

    //Command + N을 사용하면 생성자, Getter, Setter 만드는 단축키
    public Member(long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
