package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RatediscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    void rateDiscount() {
        //given
        Member member = new Member(1L,"memberA", Grade.Vip);
        //when
        int dicount = discountPolicy.discount(member, 10000);
        //then
        assertThat(dicount).isEqualTo(1000);
    }
    //Option + Enter 하여 static method 사용가능.

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    void NoDiscount() {
        //given
        Member member = new Member(2L,"memberB", Grade.Basic);
        //when
        int dicount = discountPolicy.discount(member, 10000);
        //then
        assertThat(dicount).isEqualTo(0);
    }
}