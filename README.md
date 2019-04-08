Step 1

mvn clean package





Step 2

AGENT_PATH  *pinpoint-agent*  directory

WORK_DIR  pinpoint-demo directory

nohup java -jar -javaagent:$AGENT_PATH/pinpoint-bootstrap-1.9.0-SNAPSHOT.jar -Dpinpoint.agentId=pinpoint-provider -Dpinpoint.applicationName=pinpoint-provider $WORK_DIR/provider/target/provider-1.0.jar  &

nohup java -jar -javaagent:$AGENT_PATH/pinpoint-bootstrap-1.9.0-SNAPSHOT.jar -Dpinpoint.agentId=pinpoint-consumer-Dpinpoint.applicationName=pinpoint-consumer $WORK_DIR/consumer/target/consumer-1.0.jar  &



Step 3

http://localhost:8001/add?a=22&b=333



Step 4

show /httx/logs/consumer.log

show /httx/logs/provider.log