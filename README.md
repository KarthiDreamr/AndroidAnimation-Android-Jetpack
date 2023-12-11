# AndroidAnimation-Android-Jetpack

This project demonstrates how to use animations in Android Jetpack Compose. Jetpack Compose is a modern toolkit for building native Android UIs using declarative Kotlin code. Animations are an important part of creating engaging and delightful user interfaces. This project contains examples of common animation use cases, such as animating visibility, background color, size, and position of composables. It also shows how to customize animations with different parameters and easing functions.

## Animation APIs

This project uses the following animation APIs from Jetpack Compose:

- `AnimatedVisibility` to hide or show a composable with enter and exit transitions.
- `animateFloatAsState` to animate the alpha of a composable over time.
- `animateColorAsState` to animate the background color of a composable over time.
- `Modifier.size` and `Modifier.offset` to animate the size and position of a composable.
- `spring`, `tween`, `keyframes`, `repeatable`, and `infiniteRepeatable` to create different types of `AnimationSpec` for animation customization.

You can learn more about these animation APIs from the official documentation[^1^][1] [^2^][2] [^3^][3].

## Installation

To run this project, you need to have Android Studio Arctic Fox or later installed on your machine. You also need to have a device or emulator that runs Android API level 21 or higher.

- Clone this repository to your local machine using `git clone https://github.com/KarthiDreamr/AndroidAnimation-Android-Jetpack.git`.
- Open the project in Android Studio and wait for the Gradle sync to finish.
- Run the app on your device or emulator using the Run button or the `./gradlew installDebug` command.

## Usage

The app consists of a list of animation examples that you can select to see the animation in action. You can also modify some of the animation parameters using the sliders and buttons on the screen. For example, you can change the duration, damping ratio, stiffness, initial velocity, delay, and repeat mode of the spring animation.

## Contribution

This project is open for contributions. If you want to add more animation examples or improve the existing ones, feel free to submit a pull request. Please follow the code style and formatting conventions of the project. You can also report any issues or suggestions using the GitHub issue tracker.

## License

This project is licensed under the MIT License. See the [LICENSE] file for more details.
