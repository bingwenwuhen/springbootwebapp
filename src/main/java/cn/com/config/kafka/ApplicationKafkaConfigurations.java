package cn.com.config.kafka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/4/15.
 */
@Configuration
@EnableConfigurationProperties
public class ApplicationKafkaConfigurations {

    @Value("${kafka.topic}")
    private String topic;

    @Value("${kafka.messageKey}")
    private String messageKey;

    @Value("${kafka.broker.address}")
    private String brokerAddress;

    @Value("${kafka.zookeeper.connect}")
    private String zookeeperConnect;



}
