package com.hello.core.discount;

import com.hello.core.member.Grade;
import com.hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discount = 10; // 10% 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discount / 100;
        } else {
            return 0;
        }
    }
}
