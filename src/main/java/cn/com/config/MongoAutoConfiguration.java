package cn.com.config;

import com.mongodb.Mongo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.net.UnknownHostException;

/**
 * Created by xiaxuan on 16/4/13.
 */
@Configuration
@ConditionalOnClass(Mongo.class)
@EnableConfigurationProperties(MongoProperties.class)
public class MongoAutoConfiguration {

    @Inject
    private MongoProperties properties;

    private Mongo mongo;

    @PreDestroy
    public void close() {
        if (this.mongo != null) {
            this.mongo.close();
        }
    }

    @Bean
    @ConditionalOnMissingBean
    @Singleton
    public Mongo mongo() throws UnknownHostException {
        this.mongo = this.properties.createMongoClient(null);
        return this.mongo;
    }

}
