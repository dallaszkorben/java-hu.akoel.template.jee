package hu.akoel.template.spring;

import org.springframework.context.annotation.*;

@Configuration
public class HelloWorldConfig {

   @Bean 
   public HelloWorld helloWorld(){
      return new HelloWorld();
   }
}