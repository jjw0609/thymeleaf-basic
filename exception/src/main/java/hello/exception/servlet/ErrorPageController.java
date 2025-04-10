package hello.exception.servlet;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Controller
public class ErrorPageController {

    @GetMapping("/error-ex")
    public void errorEx() {
        throw new RuntimeException("예외 발생!");
    }

    @RequestMapping("/error-page/404")
    public String eeorPage404(HttpServletRequest request, HttpServletResponse response) {

        log.info("errorPage 404");

        return "error-page/404";
    }

    @RequestMapping("/error-page/500")
    public String eeorPage500(HttpServletRequest request, HttpServletResponse response) {

        log.info("errorPage 500");

        return "error-page/500";
    }
}
