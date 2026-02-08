@echo off
echo Building APK with alternative method...
set GRADLE_OPTS=-Dfile.encoding=UTF-8 -Duser.country=US -Duser.language=en

echo Cleaning project...
gradlew.bat clean

echo Attempting to build with reduced features...
gradlew.bat assembleDebug --no-daemon --no-build-cache --no-parallel

echo Build complete! Check app\build\outputs\apk\debug\ for APK file.
pause
