@echo off

@REM Create JRE

jlink --module-path %JAVA_HOME%\lib\modules --add-modules java.base,java.logging,java.xml --output jre-java-17

echo Created jre-java-17 directory
