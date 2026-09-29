# 🚌 BRTS Bus Management System — Android Application

[![Android](https://img.shields.io/badge/Platform-Android-3DDC84.svg)](https://developer.android.com)
[![Java](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com)
[![XML](https://img.shields.io/badge/UI-XML-blue.svg)](https://developer.android.com/develop/ui/views/layout/declaring-layout)
[![Android Studio](https://img.shields.io/badge/IDE-Android%20Studio-3DDC84.svg)](https://developer.android.com/studio)

> **Project Name:** BRTS Bus Management System  
> **Application Type:** Android Mobile Application  
> **Platform:** Android  
> **Purpose:** Bus Route Information and Route Finder

---

## 📱 Overview

**BRTS Bus Management System** is an Android-based mobile application developed to help users find predefined bus routes in Ahmedabad.

The application allows users to select a **source bus stop** and a **destination bus stop** and displays the corresponding bus route, route stops, and related route information.

The project is developed using **Java and XML in Android Studio**, with predefined Ahmedabad BRTS route information stored in the application.

### Key Features

- 🚌 **Bus Route Finder**: Select source and destination stops to find a route.
- 📍 **Ahmedabad Bus Routes**: Provides predefined routes covering different areas of Ahmedabad.
- 🔎 **Source & Destination Selection**: Users can choose their starting and destination stops.
- 🛣️ **Route Details**: Displays the sequence of stops for the selected route.
- ⚠️ **Input Validation**: Shows messages when source/destination are missing or both stops are the same.
- 📋 **Multiple Information Pages**: Includes route pages, contact information, and terms & conditions.
- 📱 **Android Interface**: User interface is created using XML layouts.

---

## 🏗️ Application Modules

The application contains the following Java activities:

- `MainActivity.java` — Main application screen.
- `button.java` — Button/navigation screen.
- `page1.java` — Route information page.
- `page2.java` — Route information page.
- `page3.java` — Route information page.
- `page4.java` — Route information page.
- `contact.java` — Contact information page.
- `termsandconditions.java` — Terms and conditions page.

---

## 📁 Repository Structure

```text
BRTS_Bus_Management_System/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com/example/bus_management_system/
│   │       │       ├── MainActivity.java
│   │       │       ├── button.java
│   │       │       ├── page1.java
│   │       │       ├── page2.java
│   │       │       ├── page3.java
│   │       │       ├── page4.java
│   │       │       ├── contact.java
│   │       │       └── termsandconditions.java
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   ├── drawable/
│   │       │   ├── mipmap/
│   │       │   └── values/
│   │       │       └── strings.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
├── build.gradle
├── settings.gradle
├── gradle.properties
├── .gitignore
└── README.md
```

---

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| **Java** | Application logic and route processing |
| **XML** | Android user interface layouts |
| **Android Studio** | Application development |
| **Android SDK** | Android application framework |
| **AndroidX** | Android application libraries |
| **Gradle** | Project build and dependency management |

---

## 🚌 Route Management

The application contains predefined Ahmedabad bus routes.

Examples of routes implemented in the application include:

- Maninagar ↔ Ghuma Gam
- S.P. Ring Road ↔ Bhadaj Circle
- Maninagar ↔ RTO Circle
- LD Engineering College ↔ DCIS Circle
- Hanspura Ring Road ↔ Vasna
- Naroda S.T. Workshop ↔ Narol
- DCIS Circle ↔ Narol
- Iskcon Cross Road ↔ Naroda Gam
- Gota Vasant Nagar Township ↔ Maninagar

The application displays the available stops and route information based on the selected source and destination.

---

## ⚡ How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/pushti25/BRTS_Bus_Management_System.git
```

### 2. Open in Android Studio

Open **Android Studio** and select:

```text
BRTS_Bus_Management_System
```

### 3. Wait for Gradle Sync

Allow Android Studio to complete the Gradle sync and download the required dependencies.

### 4. Connect an Android Device or Start an Emulator

Enable USB debugging on your Android device or start an Android Emulator.

### 5. Run the Application

Click the **Run ▶** button in Android Studio.

---

## 🎯 Project Objective

The main objective of this project is to provide a simple Android application for accessing predefined Ahmedabad BRTS bus route information.

It demonstrates Android application development using Java, XML layouts, activities, user input validation, and route-selection logic.

---

## 🔮 Future Enhancements

- 🗺️ Integrate Google Maps or another map service.
- 📍 Add GPS-based current location detection.
- 🚌 Add real-time BRTS bus tracking.
- ⏱️ Display live bus arrival and departure times.
- 🔎 Add a searchable list of all bus stops.
- ❤️ Add favorite routes and frequently used stops.
- ☁️ Store route information in a database or cloud service.
- 🔔 Add notifications for route and bus updates.

---

## 📸 Application Screenshots

Add your Android application screenshots here.

Example:

```markdown
![Home Screen](screenshots/home.png)
![Route Selection](screenshots/route-selection.png)
![Route Details](screenshots/route-details.png)
```

---

## 📚 Project Documentation

The project source code and Android XML resources are included in this repository.

The Java source files and application structure were prepared from the project's original report and can be opened and further developed in Android Studio.

---

## 🛡️ License

This project is developed as an academic Android application project.

All rights reserved.
