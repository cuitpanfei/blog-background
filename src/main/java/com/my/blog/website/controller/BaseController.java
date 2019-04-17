package com.my.blog.website.controller;

import com.my.blog.website.modal.Vo.UserVo;
import com.my.blog.website.service.IOptionService;
import com.my.blog.website.utils.TaleUtils;
import com.my.blog.website.utils.MapCache;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.stream.Collectors;

public abstract class BaseController {

    public static String THEME = "themes/default";

    protected MapCache cache = MapCache.single();

    @Resource
    private IOptionService optionService;

    /**
     * 主页的页面主题
     *
     * @param viewName
     * @return
     */
    public String render(String viewName) {
        String themeName = optionService.getOptions().stream()
                .filter(optionVo -> optionVo.getName().equalsIgnoreCase("site_theme"))
                .collect(Collectors.toList()).get(0).getValue();
        return "themes" + "/" + themeName + "/" + viewName;
    }

    public BaseController title(HttpServletRequest request, String title) {
        request.setAttribute("title", title);
        return this;
    }

    public BaseController keywords(HttpServletRequest request, String keywords) {
        request.setAttribute("keywords", keywords);
        return this;
    }

    /**
     * 获取请求绑定的登录对象
     *
     * @param request
     * @return
     */
    public UserVo user(HttpServletRequest request) {
        return TaleUtils.getLoginUser(request);
    }

    public Integer getUid(HttpServletRequest request) {
        return this.user(request).getUid();
    }

    public String render_404() {
        return "comm/error_404";
    }

}
