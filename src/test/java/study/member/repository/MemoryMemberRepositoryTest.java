package study.member.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import study.member.domain.Member;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void confirmSaveMember() {
        //given
        Member member = new Member();
        member.setName("Kim");

        //when
        Member result = repository.save(member);

        //then
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void confirmFindById() {
        //given
        Member member = new Member();
        member.setName("Kim");

        //when
        repository.save(member);
        Member result = repository.findById(member.getId()).get();

        //then
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void confirmFindByName() {
        //given
        Member member = new Member();
        member.setName("Kim");

        //when
        repository.save(member);
        Member result = repository.findByName(member.getName()).get();

        //then
        assertThat(result).isEqualTo(member);
    }

    @Test
    public void confirmFindAll() {
        //given
        Member member = new Member();
        member.setName("Kim");

        //when
        repository.save(member);
        List<Member> result = repository.findAll();

        //then
        assertThat(result.size()).isEqualTo(1);
    }
}