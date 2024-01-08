package study.member.repository;

import java.util.List;
import java.util.Optional;
import study.member.domain.Member;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
