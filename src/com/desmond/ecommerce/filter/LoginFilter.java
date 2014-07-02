package com.desmond.ecommerce.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.desmond.ec.user.intf.User;
import com.desmond.ecommerce.util.cst.DMConstant;

@WebFilter(filterName="loginFilter", 
			urlPatterns={"/jsp/user/query.jsp",
						"/jsp/user/update.jsp"
						})
public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		User user = (User)req.getSession().getAttribute(DMConstant.USER);
		if(user == null) {
			((HttpServletResponse) response).sendRedirect(req.getContextPath());
		} else {
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
