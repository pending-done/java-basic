package static1;

public class DataMain {
    public static void main(String[] args) {

        // 다른 인스턴스를 생성했지만 count의 값은 공유됨
        Data data1 = new Data("user1");
        System.out.println(Data.count);

        Data data2 = new Data("user2");
        System.out.println(Data.count);

        // static에 접근시 클래스로 직접 접근도 가능하고
        // 인스턴스로도 접근이 가능하다. (Data.count / data3.count) 둘다됨
        Data data3 = new Data("user3");
        System.out.println(data3.count);

    }
}
