package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    // 생성자에 Autowired를 붙여주면 ComponentScan 을 할 때, 의존관계를 자동으로 등록해준다.
    @Autowired // ac.getBean(MemberRepository.class) 와 비슷한 역할
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // Test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
