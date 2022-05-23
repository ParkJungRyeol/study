package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        //ENUM은 == 으로 비교
        if(member.getGrade() == Grade.Vip) {
            return 1000;
        }
        else{
            return 0;
        }
    }
}
