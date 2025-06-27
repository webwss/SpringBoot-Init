# Spring Boot后端通用模板

基于Spring Boot的后端项目模板，整合了常用的框架和主流业务实例代码

## 模板特点

### 主流框架

- Spring Boot 2.7.X
- Spring MVC
- MyBatis + MyBatisPlus
- Spring Boot 调试工具
- Spring AOP 切面编程

### 数据存储

- MySQL 数据库
- Redis 缓存
- 腾讯云 COS 对象存储

### 工具类

- Hutool 工具库
- Gson 解析库
- Apache Commons Lang3 工具库
- Lombok 注解

### 业务特性

- Spring Session Redis 分布式登录
- 全局请求响应拦截器（记录日志）
- 全局异常处理器
- 自定义错误码
- 封装通用响应类
- Swagger + Knife4j 接口文档
- 自定义权限注解 + 全局校验
- 全局跨域处理
- 长整型丢失精度解决
- 多环境配置

## 业务功能

- 用户：
  - 注册
  - 登录
  - 注销
  - 更新
  - 检索
  - 权限校验
- 支持分业务的文件上传

### 单元测试

- JUnit5 单元测试

## 快速上手

### MySQL 数据库

1）修改application.yml的数据库配置信息

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/springboot_db
    username: root
    password: 123456
```

2）执行sql/create_table.sql语句

3）启动项目，访问http://localhost:8080/api/doc.html即可打开接口文档

### Redis 分布式登录

1）修改application.yml中的Redis配置信息

```yml
spring:
  redis:
    database: 1
    host: localhost
    port: 6379
    timeout: 5000
    password: 123456
```

2）修改application.yml中的session存储方式

```yml
spring:
  session:
    store-type: redis
```

3）移除Main Application类开头@Spring Boot Application注解内的exclude参数

```java
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
```

## 参考

**该项目参考了鱼皮的Java后端万用项目模板项目**

- 程序员鱼皮：https://github.com/liyupi
