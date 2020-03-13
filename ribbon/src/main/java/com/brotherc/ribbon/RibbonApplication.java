package com.brotherc.ribbon;

import com.brotherc.ribbon.config.NewRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@RibbonClient(name = "provider", configuration = NewRuleConfig.class)
public class RibbonApplication {

  public static void main(String[] args) {
    SpringApplication.run(RibbonApplication.class, args);
  }

}
