package com.brotherc.demo.controller;

import com.brotherc.demo.service.XService;
import com.brotherc.demo.x.X;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Title: TestHystrixController</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月18日 11:57
 */
@RestController
@RequestMapping("/x")
public class XController {

  @Autowired
  private XService xService;

  @GetMapping("/{id}")
  public X getById(@PathVariable String id) {
    return xService.getById(id);
  }

}
