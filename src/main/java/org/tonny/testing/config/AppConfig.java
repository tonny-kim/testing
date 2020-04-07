package org.tonny.testing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DataSourceConfig.class})
@ComponentScan(basePackages = "org.tonny.testing", excludeFilters = {@ComponentScan.Filter()})
public class AppConfig {

}
