package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Arsh
 * @create 2019-10-13-11:48
 **/

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){

        return "index";
    }
}
