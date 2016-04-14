package cn.com.config.kafka;

import kafka.admin.AdminUtils;
import kafka.utils.ZKStringSerializer$;
import org.I0Itec.zkclient.ZkClient;
import org.springframework.context.SmartLifecycle;

import java.util.Properties;

/**
 * Created by Administrator on 2016/4/15.
 */
public class TopicCreator implements SmartLifecycle {

    private final String topic;

    private final String zkConnect;

    private volatile boolean running;

    public TopicCreator(String topic, String zkConnect) {
        this.topic = topic;
        this.zkConnect = zkConnect;
    }

    @Override
    public boolean isAutoStartup() {
        return true;
    }

    @Override
    public void stop(Runnable runnable) {
        runnable.run();
    }

    @Override
    public void start() {
        ZkClient client = new ZkClient(this.zkConnect, 10000, 10000, ZKStringSerializer$.MODULE$);
        try {
            AdminUtils.createTopic(client, this.topic, 1, 1, new Properties());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.running = true;
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public int getPhase() {
        return Integer.MIN_VALUE;
    }
}
