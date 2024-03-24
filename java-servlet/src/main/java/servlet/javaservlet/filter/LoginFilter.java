package servlet.javaservlet.filter;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/*")
public class LoginFilter extends HttpFilter {
  private static final Logger LOGGER = LoggerFactory.getLogger(LogFilter.class);

  @Override
  protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    LOGGER.info("Receive request for URL : " + request.getRequestURI());
    chain.doFilter(request, response);
  }
}
