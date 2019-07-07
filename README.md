# tdd-study
学习 tdd ,并将之应用到 springboot web 应用.

## 初始化数据库方式

- hibernate 方式
```yml
spring:
  jpa:
    hibernate:
      ddl-auto: create
```
自动搜索@Entity实体对象并创建对应的表,然后使用 import.sql 文件导入测试数据,
根据数据库是否是内嵌类型,选择一个默认值,内嵌:create-drop,非内嵌:none
启动时处于classpath根目录下的 import.sql 文件会被执行(前提是ddl-auto属性被设置为 create 或create-drop)

- jdbc 方式
Spring Boot可以自动创建DataSource的模式(DDL脚本)并初始化它(DML脚本),并从标准的位置 schema.sql 和 data.sql (位于classpath根目录)加载SQL,
脚本的位置可以通过设置 spring.datasource.schema 和 spring.datasource.data 来改变.如果想要在一个JPA应用中使用 schema.sql ,
那如果Hibernate试图创建相同的表, ddl-auto=create-drop 将导致错误产生.为了避免那些错误,可以将 ddl-auto 设置为""或 none .

