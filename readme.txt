
创建文件夹存放项目，在文件夹里面点击右键选择“git bash”
提交代码命令：
$ git add README   //更新README文件 
$ git commit -m "first commit"//提交更新，并注释信息“first commit”，注意是双引号，而非单引号 
$ git remote add origin git@github.com:defnngj/hello-world.git   //连接远程github项目  
$ git push -u origin master   //将本地项目更新到github项目上去 

更新代码命令：

$ git pull git@github.com:zhugz/chat.git