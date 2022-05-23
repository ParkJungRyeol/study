package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {
    //F2 누르면 문제있는 곳으로 이동

    /**
     *
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);
}
