package study.member;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.member.repository.MemberRepository;
import study.member.repository.MemoryMemberRepository;
import study.member.service.MemberService;

/**
 * 자바 코드로 직접 스프링 빈 등록하는 방법
 */

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
