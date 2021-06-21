package springsurvletproject.servlet.web.frontcontroller.v3.controller;

import springsurvletproject.servlet.domain.member.Member;
import springsurvletproject.servlet.domain.member.MemberRepository;
import springsurvletproject.servlet.web.frontcontroller.ModelView;
import springsurvletproject.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paraMap) {
        String username = paraMap.get("username");
        int age = Integer.parseInt(paraMap.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member", member);
        return mv;
    }
}
