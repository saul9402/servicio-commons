package com.formacionbdi.springboot.app.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
/**
 * Se deshabilita la autoconfiguración del datasource esto para poder eliminar
 * la dependencia de H2, si se quita esto se deberá agregar la dependencia de H2
 * para evitar cosas raras.
 */
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class SpringbootServicioCommonsApplication {
}
