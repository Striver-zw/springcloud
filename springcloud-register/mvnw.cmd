@echo off
:begin
echo springcloud-ribbon
cd G:\spring\project\springcloud\springcloud-register\target
java -jar springcloud-register.jar --server.port=8082
pause
exit;
goto begin