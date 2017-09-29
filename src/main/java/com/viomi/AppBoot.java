package com.viomi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
@EnableAsync
public class AppBoot
{
  @Bean
  public RestTemplate restTemplate(){
      return new RestTemplate();
       
  }

  public static void main( String[] args )
  {
      SpringApplication.run(AppBoot.class, args);
  }
  
  private CorsConfiguration buildConfig() {  
      CorsConfiguration corsConfiguration = new CorsConfiguration();  
      corsConfiguration.addAllowedOrigin("*");  
      corsConfiguration.addAllowedHeader("*");  
      corsConfiguration.addAllowedMethod("*");  
      return corsConfiguration;  
  }  
    
  /** 
   * 跨域过滤器 
   * @return 
   */  
  @Bean  
  public CorsFilter corsFilter() {  
      UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();  
      source.registerCorsConfiguration("/**", buildConfig()); // 4  
      return new CorsFilter(source);  
  }  
}
