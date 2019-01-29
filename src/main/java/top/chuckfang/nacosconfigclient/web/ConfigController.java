package top.chuckfang.nacosconfigclient.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: www.chuckfang.top
 * @Date: 2019/1/27 10:49
 */
@RestController
@RequestMapping("/config")
@RefreshScope
@Slf4j
public class ConfigController {
    @Value("${age}")
    private Integer age;

    @GetMapping("/get")
    public Integer get(){
        return age;
    }

    @GetMapping("/log")
    public void log(){
        log.error("这是一条error");
        log.warn("这是一条warn");
        log.info("这是一条info");
        log.debug("这是一条debug");
    }

}
