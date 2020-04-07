package org.tonny.testing.config;

import org.apache.logging.log4j.LogManager;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
//        return new Class[0];
        return new Class<?>[] {AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {MvcConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/"};
    }
}
