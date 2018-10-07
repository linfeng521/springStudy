org.springframework.context-3.0.7.RELEASE--->Spring提供在基础IoC功能上的扩展服务，此外还提供许多企业级服务的支持，如邮件服务、任务调度、JNDI定位、EJB集成、远程访问、缓存以及各种视图层框架的封装等
org.springframework.aop-3.0.7.RELEASE--->Spring的面向切面编程,提供AOP(面向切面编程)实现
org.springframework.beans-3.0.7.RELEASE--->SpringIoC(依赖注入)的基础实现
org.springframework.core-3.0.7.RELEASE--->Spring3.0.7的核心工具包
org.springframework.expression-3.0.7.RELEASE--->Spring表达式语言
org.springframework.asm- 3.0.7.RELEASE--->Spring独立的asm程序,Spring2.5.6的时候需要asmJar包3.0.7开始提供他自己独立的asmJar
org.springframework.web-3.0.7.RELEASE--->SpringWeb下的工具包
org.springframework.aspects- 3.0.7.RELEASE--->Spring提供对AspectJ框架的整合
org.springframework.test-3.0.7.RELEASE--->对Junit等测试框架的简单封装
org.springframework.context.support-3.0.7.RELEASE--->Spring-context的扩展支持,用于MVC方面
org.springframework.instrument.tomcat-3.0.7.RELEASE--->Spring3.0.7对Tomcat的连接池的集成
org.springframework.instrument-3.0.7.RELEASE--->Spring3.0.7对服务器的代理接口
org.springframework.jdbc-3.0.7.RELEASE--->对JDBC的简单封装
org.springframework.jms-3.0.7.RELEASE--->为简化JMS API的使用而作的简单封装
org.springframework.orm-3.0.7.RELEASE--->整合第三方的ORM框架，如hibernate,ibatis,jdo，以及 spring的JPA实现
org.springframework.oxm-3.0.7.RELEASE--->Spring 对Object/XMl的映射支持,可以让Java与XML之间来回切换
org.springframework.transaction-3.0.7.RELEASE--->为JDBC、Hibernate、JDO、JPA等提供的一致的声明式和编程式事务管理
org.springframework.web.portlet-3.0.7.RELEASE--->基于protlet的MVC实现
org.springframework.web.servlet-3.0.7.RELEASE--->基于servlet的MVC实现
org.springframework.web.struts-3.0.7.RELEASE--->整合Struts的时候的支持

4.spring-context.jar
这个jar 文件为Spring 核心提供了大量扩展。可以找到使用Spring ApplicationContext特性时所需的全部类，JDNI 所需的全部类，instrumentation组件以及校验Validation 方面的相关类。
外部依赖spring-beans, (spring-aop)。

 5.spring-context-support
包含支持缓存Cache（ehcache）、JCA、JMX、 邮件服务（Java Mail、COS Mail）、任务计划Scheduling（Timer、Quartz）方面的类。
以前的版本中应该是这个：spring-support.jar这个jar 文件包含支持UI模版（Velocity，FreeMarker，JasperReports），邮件服务，脚本服务(JRuby)，缓存Cache（EHCache），任务计划Scheduling（uartz）方面的类。
外部依赖spring-context, (spring-jdbc, Velocity, FreeMarker, JasperReports, BSH, Groovy,JRuby, Quartz, EHCache)

 Eclispe有个插件叫ClassPath Helper可以帮你找找所依赖的类。
Spring包依赖说明:
1) spring-core.jar需commons-collections.jar，spring-core.jar是以下其它各个的基本。
2) spring-beans.jar需spring-core.jar，cglib-nodep-2.1_3.jar
3) spring-aop.jar需spring-core.jar，spring-beans.jar，cglib-nodep-2.1_3.jar，aopalliance.jar
4) spring-context.jar需spring-core.jar，spring-beans.jar，spring-aop.jar，commons-collections.jar，aopalliance.jar
5) spring-dao.jar需spring-core.jar，spring-beans.jar，spring-aop.jar，spring-context.jar
6) spring-jdbc.jar需spring-core.jar，spring-beans.jar，spring-dao.jar
7) spring-web.jar需spring-core.jar，spring-beans.jar，spring-context.jar
8) spring-webmvc.jar需spring-core.jar/spring-beans.jar/spring-context.jar/spring-web.jar
9) spring-hibernate.jar需spring-core.jar，spring- beans.jar，spring-aop.jar，spring-dao.jar，spring-jdbc.jar，spring- orm.jar，spring-web.jar，spring-webmvc.jar
10) spring-orm.jar需spring-core.jar，spring-beans.jar，spring-aop.jar，spring-dao.jar，spring-jdbc.jar，spring-web.jar，spring-webmvc.jar
11) spring-remoting.jar需spring-core.jar，spring-beans.jar，spring- aop.jar，spring-dao.jar，spring-context.jar，spring-web.jar，spring- webmvc.jar
12) spring-support.jar需spring-core.jar，spring-beans.jar，spring-aop.jar，spring-dao.jar，spring-context.jar，spring-jdbc.jar
13) spring-mock.jar需spring-core.jar，spring-beans.jar，spring-dao.jar，spring-context.jar，spring-jdbc.jar