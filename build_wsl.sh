#!/bin/bash
set -e
export ANDROID_HOME=/mnt/c/Android
pkill -f gradle 2>/dev/null || true
rm -rf ~/.gradle/daemon
./gradlew clean assembleDebug --no-daemon --console=plain 2>&1 | tee build.log
