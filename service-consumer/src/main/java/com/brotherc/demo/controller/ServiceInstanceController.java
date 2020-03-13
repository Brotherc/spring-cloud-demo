package com.brotherc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>Title: XController</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月13日 14:23
 */
@RestController
@RequestMapping("/service")
public class ServiceInstanceController {

  @Autowired
  private DiscoveryClient discoveryClient;

  @GetMapping("/{instance}")
  public List<ServiceInstance> getById(@PathVariable String instance) {
    return discoveryClient.getInstances(instance);
  }

}
