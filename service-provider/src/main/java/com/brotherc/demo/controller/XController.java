package com.brotherc.demo.controller;

import com.brotherc.demo.x.X;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>Title: XController</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月13日 14:23
 */
@RestController
@RequestMapping("/x")
public class XController {

  @GetMapping("/{id}")
  public X getById(@PathVariable String id) {
    return new X(id, new Date());
  }

}
