package git.snippet.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EurekaClientConfigBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by caibosi on 2018-06-20.
 */
@RestController
@RequestMapping("/query")
public class QueryController {

    final EurekaClientConfigBean config;

    public QueryController(EurekaClientConfigBean config) {
        this.config = config;
    }

    @GetMapping("/eureka-server")
    public Object getEurekaServerUrl() {
        return config.getServiceUrl();
    }
}