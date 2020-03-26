# ai-springboot-zookeeper
Demo of using springboot with zookeeper


## Start a zookeeper server in docker

```
docker run --rm -d --name zookeeper \
-p 2181:2181 \
zookeeper
```


## Service Discovery


Check

```
zkCli.sh

[zk: localhost:2181(CONNECTED) 4] ls /services
[zk-server]
[zk: localhost:2181(CONNECTED) 6] ls /services/zk-server
[865250bd-e685-441e-81ec-84820074bbd8]
```



## Config
```
[zk: localhost:2181(CONNECTED) 1] ls /
[zookeeper]
[zk: localhost:2181(CONNECTED) 2] create /config
Created /config
[zk: localhost:2181(CONNECTED) 3] create /config/apps
Created /config/apps
[zk: localhost:2181(CONNECTED) 4] create /config/apps/name 'Tom'
Created /config/apps/name
[zk: localhost:2181(CONNECTED) 5] create /config/apps::dev
Created /config/apps::dev
[zk: localhost:2181(CONNECTED) 6] create /config/apps::dev/name 'John'
Created /config/apps::dev/name
```
