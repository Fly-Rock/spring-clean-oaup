package com.oaup.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lichuanjie on 2018/5/3.
 */

@Controller
@RequestMapping(value="/backend/love/")
public class LoveController {

    @RequestMapping(value = "first")
    public ModelAndView videoList(ModelMap modelMap) {
        return new ModelAndView("love/loveFirst");
    }
}
