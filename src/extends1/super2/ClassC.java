package extends1.super2;

public class ClassC extends ClassB{
    public ClassC(){
        // ClassB의 기본생성자가 없기 때문에 super()를 생략할 수 없음. (ClassB에 직접 정의한 생성자가 있기 때문)
        super();
//        super(10); 생성자 호출을 정상적으로 할 경우 에러 X
        System.out.println("ClassC 생성자");
    }

}
