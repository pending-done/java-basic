# 클래스가 필요한 이유

## 문제: 학생 정보 출력 프로그램 예시
만약 여러명의 학생 정보를 출력하는 프로그램을 작성해야한다. (이름, 나이, 성적)

변수를 사용해서 위의 요구사항대로 코드를 작성하면 다음과 같다.

**Class_1 변수 사용**  
```java
package class1;

public class Class_1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + "나이: " + student1Age + "성적: " + student1Grade);
        System.out.println("이름: " + student2Name + "나이: " + student2Age + "성적: " + student2Grade);
    }
}
```

- 학생 2명을 다뤄야 하기 때문에 각각 다른 변수를 사용했다. 
- 학생이 늘어날 때마다 변수를 추가로 선언해야 한다.
- 출력하는 코드도 추가해야한다. 
- 동적인 프로그래밍이 불가능하다. 

**Class_2 배열 사용**  
```java
public class Class_2 {
    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for(int i=0; i<studentNames.length; i++){
            System.out.println("이름: " + studentNames[i] + "나이: " + studentAges[i] + "성적: " + studentGrades[i]);
        }
    }
}
```
- 배열을 사용했기 때문에 학생이 추가되어도 학생의 `데이터`만 추가하면 된다.
- 변수와 출력 코드를 더 추가하지 않아도 된다.

**배열의 한계**  
- 한 학생의 데이터가 이름, 나이, 성적으로 3개의 배열에 나누어져 있다.
- 이럴 경우 데이터의 변경(추가,삭제)시 조심해야 한다. 
- 학생의 데이터가 3개의 배열에 나누어져 있기 때문에 3개의 배열을 각각 변경해야 한다. 
- 이런 코드는 개발자가 신경써야하는 것이 늘어나고 실수를 유발하기 때문에 지양해야 한다.

정리하자면 이름, 나이, 성적을 따로 나누어 관리하는 것은 사람이 관리하기 쉽지 않다. 
사람의 입장에서 좋은 코드는 학생이라는 개념을 하나로 묶어 관리하는 것이다.


## 클래스 도입

**Student클래스 정의**  
```java
public class Student {
    String name;
    int age;
    int grade;
}
```

`Student` 클래스를 생성한다. 내부에 이름(name), 나이(age), 성적(grade) 변수를 가진다. 이렇게 클래스에 정의한 변수를 멤버변수 또는 필드라고 부른다.

**Student클래스 사용**  
```java
public class StudentStart {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name);
        System.out.println("이름: " + student2.name);

    }
}
```
**클래스와 사용자 정의 타입**  
- 타입은 데이터의 종류나 형태를 나타낸다.
- `int`는 숫자, `String` 은 문자 타입이다.
- 클래스를 사용하면 `int`, `String` 처럼 타입을 직접 만들 수 있다. (`Student` 타입)
- 클래스를 사용해서 **실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
- `Student` 는 `Student` 타입의 객체를 받을 수 있다.

즉, 위 코드에서 학생(Student) 클래스를 기반으로 학생1(student1), 학생2(student2) 인스턴스를 생성한 것이다.

