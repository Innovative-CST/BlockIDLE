# Overview

A BlockIdle plugin is:

- A separate Android application module
- Compiled into an APK
- Loaded dynamically into the host app
  - Given safe access through:
    - PluginApplication
    - PluginActivity
- Plugin authors implement the AppPlugin interface.
---

# Creating Your First Plugin

1. Enable the BlockIdle plugin system

```groovy
plugins {
    id 'com.android.application'
    id 'com.blockidle.plugin'
}

blockidle {
    minSdk = 0
    targetSdk = 0
}
```

---
2. Android Configuration
```groovy
android {
    compileSdk 35
    namespace "com.test.testplugin"

    defaultConfig {
        minSdk 21
        targetSdk 28
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }

    compileOptions {
        sourceCompatibility JavaVersion.VERSION_17
        targetCompatibility JavaVersion.VERSION_17
    }
}
```

---

3. Dependencies

Use compileOnly because the host provides the runtime libraries:
```groovy
dependencies {
    compileOnly("com.google.android.material:material:$material_design_version")
}
```
Use implementation only if library is not in host application.

---

# Plugin API Reference

### AppPlugin

Your plugin must implement this interface.
```java
public interface AppPlugin {
    void onCreateApplication(PluginApplication pluginApplication);
    void onCreateActivity(PluginActivity pluginActivity);
}
```

### Callbacks

| Method                 | Called When                 | Purpose                                             |
|------------------------|-----------------------------|-----------------------------------------------------|
| onCreateApplication()  | Host Application is created | Global initialization, loading config, showing Toasts |
| onCreateActivity()     | Any Activity is created     | Showing dialogs, modifying UI, attaching listeners   |

---

### PluginApplication

Safe wrapper over Android's Application.

```java
public class PluginApplication {
    Application getAndroidApplication();
    void log(String msg);
}
```

---

### PluginActivity

Safe wrapper over AppCompatActivity.

```java
public class PluginActivity {
    AppCompatActivity getAppCompatActivity();
    String getTAG();
    void log(String msg);
}
```

---

# How It Works

`onCreateApplication()` - Triggered once when the host Application initializes.

Good for:

- reading plugin settings
- initializing environment
- storing shared state

---

`onCreateActivity()` - Triggered every time an Activity is created in the host.

---

# Best Practices

Use wrapper classes only

Use:

```java
pluginActivity.getAppCompatActivity()
pluginApplication.getAndroidApplication()
```

Do not store direct Activity or Context references.


---

Use compileOnly dependencies

This keeps plugin APK small and avoids conflicts.


---

Avoid heavy work on the main thread

Plugins run inside the host process; avoid blocking UI.


---

# Summary

- Your plugin: Implements AppPlugin
- Receives lifecycle callbacks
- Can show dialogs, Toasts, UI, etc.
- Runs inside the host app safely using wrapper classes

---
