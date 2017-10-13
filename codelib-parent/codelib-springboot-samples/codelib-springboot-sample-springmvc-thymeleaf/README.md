
## 文件上传
在 spring boot 中默认限制了上传文件的大小，需要在 application.yml 中根据需要配置如下：
Spring Boot 1.3.x或者之前：

```yml 
multipart: 
  maxFileSize: 10Mb  
  maxRequestSize: 100Mb  
```

Spring Boot 1.4.x或者之后：

```yml
spring: 
  http: 
    multipart: 
      maxFileSize: 10Mb  
      maxRequestSize: 100Mb  
```

## 参考
- Spring Boot 文件上传：http://blog.csdn.net/catoop/article/details/61415169
- Spring Boot:The field file exceeds its maximum permitted size of 1048576 bytes.：http://blog.csdn.net/u010429286/article/details/54381705
- Spring Boot修改最大上传文件限制:The field file exceeds its maximum permitted size of 1048576 bytes.：http://www.cnblogs.com/parasis/p/6422480.html
