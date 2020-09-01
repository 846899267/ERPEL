//package com.erp.config;
//
//import com.erp.service.impl.userService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//   @Autowired
//   private userService userService;
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//       http.cors().and().authorizeRequests()
//               .antMatchers("admin/api/**").hasRole("ADMIN")
//               .antMatchers("user/api/**").hasRole("USER")
//               .antMatchers("user/api/**").hasRole("ADMIN")
//               .and().formLogin().permitAll();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userService);
//    }
//}
