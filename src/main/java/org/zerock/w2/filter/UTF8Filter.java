package org.zerock.w2.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = {"/*"})
public class UTF8Filter implements Filter {

    private static final Logger log = LoggerFactory.getLogger(UTF8Filter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        log.info("UTF8 Filter");

        HttpServletRequest req = (HttpServletRequest)request;

        req.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);
    }
}
