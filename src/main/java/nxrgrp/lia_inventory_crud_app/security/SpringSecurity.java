package nxrgrp.lia_inventory_crud_app.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// The SpringSecurity.java class is used to skip the log-in-functionality during testing.

    @Configuration
    public class SpringSecurity extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity httpSecurity) throws Exception {
            httpSecurity.authorizeRequests().antMatchers("/").permitAll().and()
                    .authorizeRequests().antMatchers("/console/**").permitAll();
            httpSecurity.csrf().disable();
            httpSecurity.headers().frameOptions().disable();
        }
}

