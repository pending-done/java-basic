package poly.ex1;

public class AnimalSoundMain {

    // 다형성을 사용하지 않는 예시코드
    // 중복된 코드가 많아보임
    // 개선하기도 쉽지 않음
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        caw.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    // 중복제거 하려고 메서드를 만들어봐도 결국 해당 타입에 대한 것만 처리 가능
    public static void soundCat(Cat cat){
        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
