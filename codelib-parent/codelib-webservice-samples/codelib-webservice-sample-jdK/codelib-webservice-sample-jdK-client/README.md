# WebService客户端
## WebService 客户端代码生成
### 方法一
1. 借助 jdk 的 wsimport.exe 工具生成客户端代码：<br>
   命令：
   wsimport -encoding UTF-8 -keep 请求url
> 到客户端src目录下生成代码
2. 借助生成的代码编写请求代码
### 方法二
1、将服务器端的 WSDL 文件保存到客户端本地
2. 借助 jdk 的 wsimport.exe 工具生成客户端代码：<br>
   命令：
   wsimport -encoding UTF-8 -keep WSDL文件本地路径
> 到客户端src目录下生成代码
3. 借助生成的代码编写请求代码