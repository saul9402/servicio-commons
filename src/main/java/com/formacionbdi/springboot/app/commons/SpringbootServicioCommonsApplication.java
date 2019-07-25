package com.formacionbdi.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
/**
 * Se deshabilita la autoconfiguración del datasource
 */
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class SpringbootServicioCommonsApplication {
}
