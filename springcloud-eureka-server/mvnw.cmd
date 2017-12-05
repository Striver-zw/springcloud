@echo off
:begin
echo springcloud-ribbon
cd G:\spring\project\springcloud\springcloud-server\target
java -jar springcloud-server-0.0.1-SNAPSHOT.jar
pause
exit;
goto begin