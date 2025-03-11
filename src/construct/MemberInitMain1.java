package construct;

public class MemberInitMain1 {

    public static void main(String[] args) {

        MemberInit member1 = new MemberInit();
        member1.name = "user1";
        member1.age = 10;
        member1.grade = 20;

        MemberInit member2 = new MemberInit();
        member2.name = "user2";
        member2.age = 20;
        member2.grade = 30;

        MemberInit[] members = {member1, member2};

        for(MemberInit m : members){
            System.out.println("이름: " + m.name);
        }

    }
}
