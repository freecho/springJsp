## 介绍
SpringJsp是一个基于spring boot配置的jsp项目脚手架

面向初学者学习jsp使用，非常方便快捷

能够快速启动运行jsp项目，无需关注于项目的配置（依赖、路由等等）

对于新的需求，直接在`src/main/webapp/WEB-INF/jsp`目录下创建jsp文件

使用：`http://localhost:{port}/{fileName}`进行访问，例如默认的欢迎页面为：`http://localhost:5555/hello`

默认的port为5555，在`src/main/resources/application.yml`中修改

## 使用
本项目需要java 17

`clone` 代码后使用`maven`加载依赖

编辑代码后，启动项目运行即可

spring boot 内嵌tomcat所以可以直接在没有tomcat的机器上运行

如果需要打包为war则运行maven构建，jar则修改之然后构建