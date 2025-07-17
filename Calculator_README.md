# Android Calculator App

A modern, sleek calculator app built for Android using Java and Material Design principles.

## Features

- **Basic Operations**: Addition (+), Subtraction (-), Multiplication (×), Division (÷)
- **Decimal Support**: Handle decimal numbers with precision
- **Clear Function**: Clear all calculations (C button)
- **Delete Function**: Delete last entered digit (⌫ button)
- **Error Handling**: Prevents division by zero with error display
- **Modern UI**: Dark theme with Material Design components
- **Responsive Layout**: Optimized for different screen sizes
- **Visual Feedback**: Button press animations and state changes

## Screenshots

The calculator features a clean, modern interface with:
- Large, easy-to-read display
- Color-coded buttons (numbers in gray, operators in orange, functions in light gray)
- Professional dark theme
- Rounded button corners for modern aesthetics

## Technical Specifications

- **Language**: Java
- **Minimum SDK**: Android 5.0 (API level 21)
- **Target SDK**: Android 14 (API level 34)
- **Architecture**: Single Activity with event-driven UI
- **UI Framework**: Material Design Components
- **Layout**: LinearLayout with nested structures for grid arrangement

## Project Structure

```
app/
├── src/main/
│   ├── java/com/example/calculator/
│   │   └── MainActivity.java          # Main activity with calculator logic
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml      # Main UI layout
│   │   ├── values/
│   │   │   ├── colors.xml             # Color definitions
│   │   │   ├── strings.xml            # String resources
│   │   │   └── themes.xml             # App themes and button styles
│   │   ├── drawable/                  # Button background drawables
│   │   ├── mipmap-*/                  # App icons for different densities
│   │   └── xml/                       # Data extraction and backup rules
│   └── AndroidManifest.xml            # App configuration
├── build.gradle                       # App-level build configuration
└── proguard-rules.pro                 # ProGuard rules for code obfuscation
```

## Setup Instructions

### Prerequisites

1. **Android Studio**: Download and install the latest version of Android Studio
2. **JDK**: Java Development Kit 8 or higher
3. **Android SDK**: API level 21 or higher

### Installation Steps

1. **Clone/Download the Project**
   ```bash
   # If using git
   git clone <repository-url>
   
   # Or download and extract the project files
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select "Open an existing project"
   - Navigate to the project folder and select it
   - Wait for Gradle sync to complete

3. **Build the Project**
   - Click on "Build" in the menu bar
   - Select "Make Project" or press Ctrl+F9 (Cmd+F9 on Mac)
   - Ensure there are no build errors

4. **Run the App**
   - Connect an Android device or start an Android emulator
   - Click the "Run" button or press Shift+F10
   - Select your target device
   - The app will install and launch automatically

### Alternative Installation (APK)

1. Build the APK:
   - In Android Studio, go to "Build" > "Build Bundle(s) / APK(s)" > "Build APK(s)"
   - The APK will be generated in `app/build/outputs/apk/debug/`

2. Install on device:
   - Enable "Unknown sources" in device settings
   - Transfer the APK to your device
   - Install the APK

## Usage

### Basic Operations

1. **Number Input**: Tap number buttons (0-9) to enter numbers
2. **Decimal Point**: Tap "." to add decimal places
3. **Operations**: Tap +, -, ×, or ÷ to perform calculations
4. **Equals**: Tap "=" to get the result
5. **Clear**: Tap "C" to clear all input and start over
6. **Delete**: Tap "⌫" to delete the last entered digit

### Example Calculations

- Simple addition: `5 + 3 = 8`
- Decimal operations: `3.14 × 2 = 6.28`
- Chain operations: `10 + 5 - 3 = 12`
- Division by zero: Shows "Error"

## Customization

### Changing Colors

Edit `app/src/main/res/values/colors.xml` to customize the app's color scheme:

```xml
<!-- Example: Change to blue theme -->
<color name="operator_button_background">#FF2196F3</color>
<color name="operator_button_pressed">#FF1976D2</color>
```

### Modifying Button Styles

Edit `app/src/main/res/values/themes.xml` to change button appearance:

```xml
<!-- Example: Increase button text size -->
<item name="android:textSize">28sp</item>
```

### Adding New Features

The calculator is designed to be easily extensible. To add new operations:

1. Add new button in `activity_main.xml`
2. Add click listener in `MainActivity.java`
3. Implement calculation logic in the `calculate()` method

## Troubleshooting

### Common Issues

1. **Gradle Sync Failed**
   - Check internet connection
   - Update Android Studio to latest version
   - Clear Gradle cache: File > Invalidate Caches and Restart

2. **App Crashes on Launch**
   - Check minimum SDK version compatibility
   - Verify all resource files are properly formatted
   - Check Logcat for detailed error messages

3. **Layout Issues**
   - Test on different screen sizes using emulator
   - Check layout weights and margins in XML files
   - Verify all referenced resources exist

### Build Errors

If you encounter build errors:

1. Clean and rebuild the project: Build > Clean Project, then Build > Rebuild Project
2. Check for missing dependencies in `build.gradle`
3. Ensure all resource IDs match between XML and Java files
4. Verify Android SDK and build tools are up to date

## Contributing

To contribute to this project:

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly on different devices
5. Submit a pull request with detailed description

## License

This project is open source and available under the MIT License.

## Support

For questions or issues:

1. Check the troubleshooting section above
2. Review Android Studio documentation
3. Check Stack Overflow for common Android development issues
4. Create an issue in the project repository

## Future Enhancements

Potential features for future versions:

- Scientific calculator functions (sin, cos, tan, etc.)
- History of calculations
- Landscape mode with extended functions
- Themes selection (light/dark mode toggle)
- Sound effects for button presses
- Gesture support for swipe-to-delete
- Memory functions (M+, M-, MR, MC)
- Percentage calculations
- Parentheses support for complex expressions

---

**Happy Calculating!** 🧮