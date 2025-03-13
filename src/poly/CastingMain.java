package poly;

public class CastingMain {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅
        Parent parent2 = child; //업캐스팅은 생략 가능
    }

}
