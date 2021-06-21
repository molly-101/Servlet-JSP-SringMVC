package springsurvletproject.servlet.web.frontcontroller.v3;

import springsurvletproject.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paraMap);
}
