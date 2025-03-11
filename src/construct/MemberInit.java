package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade){
        // 멤버변수와 매개변수의 이름이 같을 시 동일 스코프가 우선순위가 높음
        // 따라서 멤버변수(인스턴스 자신)를 구별할때 this 키워드 사용
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
