# QuickStart Android Studio sample

A small Java Android Studio project demonstrating splash screen, login, registration, forgot/reset password, profile, and a grid dashboard.

## Open and build
1. Extract `QuickStart-Android-Studio.zip`.
2. In Android Studio choose **Open** and select the `QuickStart` folder (the folder containing `settings.gradle`).
3. Let Gradle sync. Use JDK 17 and install Android SDK Platform 35 if prompted.
4. Run on a phone with USB debugging enabled, or choose **Build > Build APK(s)**.
5. The debug APK is normally created at `app/build/outputs/apk/debug/app-debug.apk`.

## Demo account
- Email: `demo@quickstart.com`
- Password: `123456`

You can also create an account from the Register screen. Accounts are stored locally using SharedPreferences for demonstration only. The password reset is a local demo flow and does not send a real email or verify identity. Do not use this as production authentication.

## Concepts covered
- Splash screen: `MainActivity` + `activity_splash.xml` (ConstraintLayout)
- Login: `LoginActivity` + `activity_login.xml` (RelativeLayout and LinearLayout)
- Register / forgot / reset / profile: separate Java activities and Intent navigation
- Landing dashboard: `HomeActivity` uses `GridLayout` with card-style module tiles
- Common controls: EditText, Button, TextView, input types, click listeners, Toast validation
- Resources: `values/strings.xml`, `values/styles.xml`, `values-night/colors.xml`
- Minimum Android version: Android 6.0 (API 23); target SDK 35

## Notes
The project uses a small AndroidX ConstraintLayout dependency. Gradle needs internet access the first time to download Gradle plugins/dependencies. The app is designed responsively with dp/sp sizing, scrollable forms, and a two-column grid for phone screens.
