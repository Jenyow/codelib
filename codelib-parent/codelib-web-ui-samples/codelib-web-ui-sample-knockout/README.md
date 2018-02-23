# knockout
官网获取网址：http://knockoutjs.com/downloads/index.html

# bower
需要先安装notejs，配置好git
在 resources 下创建 .bowerrc 文件（可以在eclipse里新建，或者用cmd、powershell新建）
执行 bower init 初始化项目生成 bower.json 文件
安装插件命令，如jquery： bower install jquery#1.12.4 --save
--save 才会将依赖添加到 bower.json 文件中
可以在 bower.json 文件中添加依赖，直接执行 bower install 命令即可添加所有依赖库
bower info 插件名：查看插件的所有版本信息

## .bowerrc 配置属性
directory：应该保存已安装组件的路径。如果未指定，则默认为bower_components。


## 参考
Knockout v3.4.0 中文版教程：https://www.zybuluo.com/DHclly/note/530773
bower简单使用，安装位置及bowerrc文件：http://blog.csdn.net/shidaping/article/details/50199495
Bower configuration：https://github.com/bower/spec/blob/master/config.md