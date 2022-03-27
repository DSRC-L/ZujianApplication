# ZujianApplication
组件化开发简单框架

感谢参考  https://www.jianshu.com/p/7ae24e942788  
         https://www.bilibili.com/video/BV1oK4y1R7Hx?p=12&spm_id_from=pageDriver
         https://blog.csdn.net/wangyetongsss/article/details/84341489
         
         
主要给自己记录一下大概的框架，以后用得到

主要内容   分成三层   app壳  业务模块  基础功能组件



主要步骤  1、创建统一配置文件 config.gradle

         2、以application形式创建业务模块  以library形式创建基础功能组件  
         
         3、在各个模块的gradle配置文件完成管理 （分成组件环境和集成环境）
         
         4、配置manifest文件
         
         5、配置ARouter （模块间通信）
