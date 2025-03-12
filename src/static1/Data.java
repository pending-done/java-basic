package static1;

public class Data {
    public String name;
    public static int count;
    // 여러 인스턴스를 생성해도 공용으로 사용이 가능함 ex) 해당 인스턴스가 몇번 생성되었는지 확인하기 위한 static 변수
    // 힙 메모리가 아닌 메서드 영역에 생성된다.


    public Data(String name) {
        this.name = name;
        count++;
    }
}
