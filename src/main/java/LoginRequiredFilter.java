import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest=(HttpServletRequest) request;
        if(httpServletRequest.getSession().getAttribute("username") !=null){
            chain.doFilter(request,response);
        }else{
            httpServletRequest.getRequestDispatcher("/login.do").forward(request,response);
        }
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
