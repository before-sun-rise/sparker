package com.sparker.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;
import org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.sparker.web.controller"})
public class WebServiceConfig extends WebMvcConfigurerAdapter {

    @Bean
    public ViewResolver viewResolver() {
// Example: the 'info' view logical name is mapped to the file '/WEB-INF/jsp/info.jsp'
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/jsp/");
        bean.setSuffix(".jsp");
        return bean;
    }


    @Bean
    public AbstractHandlerMethodAdapter getAdapter() {
        RequestMappingHandlerAdapter jsonMappingAdapter = new RequestMappingHandlerAdapter();
        jsonMappingAdapter.setMessageConverters(new ArrayList<HttpMessageConverter<?>>() {{
            add(new MappingJackson2HttpMessageConverter());
        }});

        return jsonMappingAdapter;
    }
}
