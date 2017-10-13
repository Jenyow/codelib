
Java调用net的webservice:
将 <s:element ref="s:schema" /><s:any /> 替换成 <s:any minOccurs="2" maxOccurs="2"/>

wsimport -encoding UTF-8 -keep E:\git\codelib\codelib-parent\codelib-webservice-samples\codelib-we
bservice-sample-cxf\codelib-webservice-sample-cxf-client\docs\wsdl\WeatherWS.wsdl

## 参考
* Java调用net的webservice故障排除实战分享：http://blog.sina.com.cn/s/blog_4c925dca01014y3r.html