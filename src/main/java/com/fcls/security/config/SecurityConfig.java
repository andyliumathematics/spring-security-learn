package com.fcls.security.config;

import com.fcls.security.filter.TestWebFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.function.Function;

//@EnableWebSecurity
//@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.addFilter(new TestWebFilter());
        return http.build();
    }
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails adminUser = User.withUsername("zhangsan")
                .roles("admin","user")
                .password(new BCryptPasswordEncoder().encode("zhangsan1"))
                .build();
//        UserDetails normalUser = User.withUserDetails(adminUser).build();
        return new InMemoryUserDetailsManager(adminUser);

    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
