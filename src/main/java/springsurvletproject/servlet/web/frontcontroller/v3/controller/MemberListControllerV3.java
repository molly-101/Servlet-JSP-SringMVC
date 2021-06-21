package springsurvletproject.servlet.web.frontcontroller.v3.controller;

import springsurvletproject.servlet.domain.member.Member;
import springsurvletproject.servlet.domain.member.MemberRepository;
import springsurvletproject.servlet.web.frontcontroller.ModelView;
import springsurvletproject.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paraMap) {

        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);

        return mv;
    }
}
