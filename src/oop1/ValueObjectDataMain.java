package oop1;

// 객체 지향 프로그래밍
// ValueObjectData 클래스에 add라는 메서드를 정의하고
// 해당 클래스의 필드를 직접 해당 클래스의 메서드가 수정하는 방식

// 따라서 ValueObjectData의 인스턴스들은 코드의 변경에 영향을 받지 않음
public class ValueObjectDataMain {

    public static void main(String[] args) {
        ValueObjectData data = new ValueObjectData();

        data.add();
        data.add();
        data.add();
    }

}
