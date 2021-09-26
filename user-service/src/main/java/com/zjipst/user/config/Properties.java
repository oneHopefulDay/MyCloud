package com.zjipst.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author songhao
 */
@Data
@ConfigurationProperties(prefix = "pattern")
@Component
public class Properties {
    private String dateformat;
    private String envSharedValue;
}
