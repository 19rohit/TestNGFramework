set projectLocation=D:\Rohit\EclipsJunoWorkSpace\TestNGFrameWork
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause