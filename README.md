# Apple-NFC Payment App

Android NFC 支付应用程序，支持虚拟卡模拟功能。

## 功能特性

- 🏦 支持多种银行卡类型（Visa、MasterCard、American Express、Discover）
- 📱 NFC 卡模拟服务
- 🔒 WebSocket 实时通信
- 💳 卡片加载与管理

## 本地构建（有 Windows AAPT2 路径 bug）

```powershell
# 使用 WSL 构建
wsl bash -c "cd /mnt/d/PAY1 && ./build_wsl.sh"

# 或使用 Gradle
./gradlew assembleDebug
```

## GitHub Actions 自动构建 ✅

### 触发构建

1. **推送代码到 GitHub:**
   ```bash
   git push origin main
   ```

2. **手动触发:**
   - 访问 GitHub 仓库 → Actions 标签
   - 选择 "Build Android APK" workflow
   - 点击 "Run workflow"

### 下载 APK

1. 进入 GitHub 仓库的 Actions 页面
2. 选择最新的成功构建
3. 在页面底部 "Artifacts" 区域下载：
   - `app-debug.apk` - Debug 版本
   - `app-release.apk` - Release 版本（如果配置了签名）

APK 文件保存 30 天。

## 技术栈

- **语言:** Java
- **构建工具:** Gradle 8.2
- **Android Gradle Plugin:** 8.1.4
- **最低 SDK:** API 21
- **目标 SDK:** API 33
- **JDK:** 17

## 项目结构

```
PAY1/
├── app/
│   ├── src/main/
│   │   ├── java/          # Java 源代码
│   │   ├── res/           # 资源文件
│   │   └── AndroidManifest.xml
│   └── build.gradle       # App 构建配置
├── .github/
│   └── workflows/
│       └── build.yml      # GitHub Actions 配置
├── build.gradle           # 项目构建配置
└── gradlew               # Gradle Wrapper

```

## CI/CD 配置

GitHub Actions 自动执行以下操作：

- ✅ 配置 Ubuntu 环境
- ✅ 安装 JDK 17
- ✅ 配置 Android SDK
- ✅ 执行 Gradle 构建
- ✅ 上传 APK 产物

## 许可证

请遵守相关金融支付法规和 NFC 使用规范。

## 注意事项

⚠️ **安全警告:** 本应用涉及支付功能，请确保：
- 仅用于合法授权的测试环境
- 保护好签名密钥和敏感信息
- 遵守 PCI DSS 等支付行业标准
