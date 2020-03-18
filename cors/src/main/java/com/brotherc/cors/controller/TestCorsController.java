package com.brotherc.cors.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: TestCorsController</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月18日 10:34
 */
@RestController
@RequestMapping("/testCors")
public class TestCorsController {

  @GetMapping("1")
  public String testCors() {
    return "跨域访问";
  }

  @GetMapping("2")
  @CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
  public String testCors2() {
    return "跨域访问";
  }
}
