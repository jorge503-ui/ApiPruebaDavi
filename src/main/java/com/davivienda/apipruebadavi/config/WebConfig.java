package com.davivienda.apipruebadavi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletResponse;*/

@Configuration
public class WebConfig implements WebMvcConfigurer/*,Filter*/ {

	/*@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}*/

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("http://localhost:4200","http://localhost", "http://localhost:80")
				.allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
	}

	/*@Override
	public void doFilter(ServletRequest request, ServletResponse response2, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) request;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
		response.setHeader("Access-Control-Max-Age", "3600");
		response.setHeader("Access-Control-Allow-Headers",
				"X-Requested-With, Content-Type, Authorization, Origin, Accept, Access-Control-Request-Method, Access-Control-Request-Headers");

		chain.doFilter(request, response2);
	}

	@Override
	public void destroy() {
	}*/
}
