@echo off
SETLOCAL

:: Set application name
set APP_NAME=Gradle
set APP_BASE_NAME=%~nx0

:: Set default JVM options (can be overridden by JAVA_OPTS)
set DEFAULT_JVM_OPTS=-Xmx64m -Xms64m

:: Resolve Java command
if defined JAVA_HOME (
    set JAVACMD=%JAVA_HOME%\bin\java.exe
) else (
    set JAVACMD=java
)

:: Check if java exists
"%JAVACMD%" -version >nul 2>&1
if errorlevel 1 (
    echo ERROR: JAVA_HOME is not set and 'java' command could not be found.
    exit /b 1
)

:: Set Gradle home
set GRADLE_HOME=%~dp0\gradle\wrapper
set CLASSPATH=%GRADLE_HOME%\gradle-wrapper.jar

:: Execute Gradle Wrapper
"%JAVACMD%" %DEFAULT_JVM_OPTS% -classpath "%CLASSPATH%" org.gradle.wrapper.GradleWrapperMain %*

ENDLOCAL
