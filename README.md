# blog-springboot
blog system
# Blog系统
项目管理采用**Gradle**
#### 使用到的框架：
- 前端
    - Bootstrap
    - Thymeleaf
    - jQuery
- 后端
    - Spring
    - Spring Boot
    - Spring MVC
    - Spring Data（ES/MongoDB）
    - Hibernate
#### 目前实现的功能
- user管理
- blog管理
- 评论
- 点赞
- 标签
- 分类
- 首页搜索
#### 如何运行
需要启动MySQL、ElasticSearch、Mongodb服务
并且运行[Mongodb文件服务器](https://github.com/SoYoung-zzy/MongoDB-file-server)
> 在resources/application.properties有具体配置
> 注意elasticsearch版本，建议5.4.1版本

> 数据库语句在import.sql中

运行jar包即可启用应用：
```bash
java —jar blog.jar
```
然后浏览器中输入localhost:8080即可访问。

联系我
