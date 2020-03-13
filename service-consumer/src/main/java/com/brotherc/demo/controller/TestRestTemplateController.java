package com.brotherc.demo.controller;

import com.brotherc.demo.config.GenericRest;
import com.brotherc.demo.x.X;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: TestRestTemplateController</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月13日 15:41
 */
@RestController
@RequestMapping("/testRestTemplate")
public class TestRestTemplateController {

  @Autowired
  private GenericRest genericRest;

  @GetMapping("lbRest")
  public X testLoadBalanced() {
    String url = "http://provider/x/1";
    ResponseEntity<X> response = genericRest.get(url, new ParameterizedTypeReference<X>() {});
    return response.getBody();
  }

  @GetMapping("directRest")
  public X testDirectRest() {
    String url = "direct://http://127.0.0.1:8083/x/1";
    ResponseEntity<X> response = genericRest.get(url, new ParameterizedTypeReference<X>() {});
    return response.getBody();
  }

}
