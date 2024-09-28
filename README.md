### What
一个简单的用于演示skywalking的spring cloud项目

### 运行
在idea中增加启动参数
```bash
-javaagent:/Users/wangtao/Developer/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=app-gateway
-javaagent:/Users/wangtao/Developer/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=app-consumer
-javaagent:/Users/wangtao/Developer/skywalking-agent/skywalking-agent.jar -Dskywalking.agent.service_name=app-provider
```

### 日志切换
目前保留了logback和log4j2的配置，可以在app-common的pom中注释logback而打开log4j2的依赖便是使用log4j2作为项目日志

### 一些问题
* skywalking agent不支持以debug模式启动
* gateway网关的日志会丢失traceId