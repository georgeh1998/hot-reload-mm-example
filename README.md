# Hot Reload Kotlin Multiplatform Example

Demonstration project for hot reload functionality with Kotlin Multiplatform and Compose Multiplatform (Android & Desktop).

## Project Structure

```
hot-reload-mm-example/
├── androidApp/
│   ├── app/                             # Android app
│   └── shared-non-hotreloadable/        # Shared module
│
└── desktopApp/
    ├── composeApp/                      # Desktop app (hot reload enabled)
    └── shared-hotreloadable/            # Shared module
```

## Hot Reload Behavior

### `shared-hotreloadable` (desktopApp)
- ✅ **Hot reload works** - Changes apply instantly without rebuild

### `shared-non-hotreloadable` (androidApp)
- ❌ **Hot reload does NOT work** - Referenced from `composeApp`
- 🔄 **Workaround:** To apply changes during hot reload, you must also modify either `composeApp` or `shared-hotreloadable`
- ⚠️ **Known Issue:** Modules outside the desktopApp Gradle project don't support hot reload (exact reason unclear)

## Build & Run

### Desktop with Hot Reload
```bash
cd desktopApp
./gradlew :composeApp:hotRunJvm --auto
```

## Quick Reference

| Command | Description |
|---------|-------------|
| `./gradlew :composeApp:hotRunJvm --auto` | Run desktop app with hot reload |
| `./gradlew :composeApp:run` | Run desktop app (normal mode) |
| `./gradlew clean` | Clean build artifacts |
