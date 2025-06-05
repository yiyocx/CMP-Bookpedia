This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.

### Tech Stack
* Kotlin Multiplatform
* Jetpack Compose
* Room
* Koin
* Coroutines
* Coil
* Navigation

### Screenshots

<img src="https://github.com/user-attachments/assets/c8d7a7d3-bc27-4c80-83eb-cf5009d6eec9" width="30%"/>
<img src="https://github.com/user-attachments/assets/f97d8bc7-9953-49ab-90f6-043e82254719" width="30%"/>
<img src="https://github.com/user-attachments/assets/e0cf11c7-fe0e-4e9d-b7c3-9c4ca8104dc6" width="30%"/>
