package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    //메인메소드 호출 뒤 로그를 비교해서 테스트 하는 것은 비효율적 TestCode를 활용하자!
    //TestCode는 given, when, then으로 명확하게 코딩
    @Test
    void join(){
        //given
        Member member = new Member(1L, "memberA", Grade.Vip);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
