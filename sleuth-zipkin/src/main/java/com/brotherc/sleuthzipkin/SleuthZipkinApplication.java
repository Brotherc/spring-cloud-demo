package com.brotherc.sleuthzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SleuthZipkinApplication {

  public static void main(String[] args) {
    SpringApplication.run(SleuthZipkinApplication.class, args);
  }

}
