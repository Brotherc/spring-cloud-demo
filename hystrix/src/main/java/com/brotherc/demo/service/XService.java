package com.brotherc.demo.service;

import com.brotherc.demo.config.GenericRest;
import com.brotherc.demo.x.X;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * <p>Title: TestHystrixService</p>
 * <p>Description：</p>
 *
 * @author abel
 * @date 2020年03月18日 11:59
 */
@Service
@DefaultProperties(groupKey="xService",
    commandProperties={@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="2000")},
    threadPoolProperties={@HystrixProperty(name="coreSize",value="10")
        ,@HystrixProperty(name="maxQueueSize",value="1000")},
    threadPoolKey="xService"
)
public class XService {

  @Autowired
  private GenericRest genericRest;

  @HystrixCommand(fallbackMethod="getByIdFb"
//      , ignoreExceptions = RuntimeException.class
  )
  public X getById(String id) {
    String url = "http://provider/x/" + id;
    ResponseEntity<X> response = genericRest.get(url, new ParameterizedTypeReference<X>() {});
    return response.getBody();
  }

  public X getByIdFb(String id){
    return new X();
  }

}
