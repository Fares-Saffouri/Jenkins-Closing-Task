# Task Requirements
1 - Reading the “Breaking News” from YNet new service: http://www.ynet.co.il/Integration/StoryRss2.xml.<br/>
the App parses and Presents the Breaking News XML in an HTML Table Format.<br/>
2 - Writing a Jenkins pipeline Job to Build and Deploy the application, The Job must send a Slack (Success/Failure)<br/>
# Steps
1 - Writing the code in Java with IntelliJ. (starting from https://start.spring.io/ with some dependencies)<br/>
2 - Push the project to my github repository<br/>
3 - Creating Slack account and channel, add Jenkins CI plugin with configuration.<br/>
4 - From Jenkins, Add Slack Notification plugin with configuration.<br/>
5 - Writing the Jenkins pipeline and run it.<br/>
![image](https://user-images.githubusercontent.com/70641137/177010455-ab54c1cd-9b22-4aa1-930f-3db674276ef5.png) <br/>
6 - Got message in Slack.<br/>
![image](https://user-images.githubusercontent.com/70641137/177010523-be103bed-8fa1-4a59-8c0b-e0f4c6f58bac.png) <br/>
# The APP
From cmd: <br/>
1 - git clone https://github.com/Fares-Saffouri/Jenkins-Closing-Task<br/>
2 - cd Jenkins-Closing-Task<br/>
3 - mvn clean package<br/>
<img src="https://user-images.githubusercontent.com/70641137/177011129-6b3902d1-d74b-4f02-bcdc-8158a7bc6415.png" width="500" height="300"><br/>
4 - java -jar ./target/demo-0.0.1-SNAPSHOT.jar<br/>
![image](https://user-images.githubusercontent.com/70641137/177011353-24666623-13ab-4066-bd77-aaa37100127d.png)<br/>
From the browser: localhost:8085<br/>
![image](https://user-images.githubusercontent.com/70641137/177011461-dcec366c-ddaf-4f87-9e9b-a0e7b8a62f03.png)


