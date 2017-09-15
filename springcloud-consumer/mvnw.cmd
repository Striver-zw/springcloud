@echo off
:begin
Rem echo springcloud-ribbon
cd G:\spring\project\springcloud\springcloud-consumer\target
java -jar demo-consumer-1.0.0.jar
pause
exit;
goto begin