package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 생성자 이름은 클래스명과 동일하게
    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + " age=" + age + " grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩 1
//    MemberConstruct(String name, int age){
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }

    /**
     * 생성자 오버로딩 2
     *
     * 위 생성자1 코드(18 ~ 22) 는 중복된 코드가 존재함 (grade만 다름)
     * 이럴땐 다음과 같이 변경 가능
     */
    MemberConstruct(String name, int age){
        this(name, age, 50);
    }


}
