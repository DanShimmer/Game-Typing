# Speed Typing Game

## Introduction

The Speed Typing Game is an interactive software application designed to improve users' typing speed and accuracy through engaging challenges and exercises. Players are presented with various tasks, such as typing words, sentences, or paragraphs accurately within a specified time limit. The game features multiple levels of difficulty, customization options, and real-time feedback to help users enhance their typing proficiency in a fun and motivating environment.

## Features

- **Levels and Challenges**: Progressively increasing difficulty levels to test and improve typing skills.
- **Real-Time Feedback**: Immediate feedback on typing accuracy and speed.
- **Customization**: Options to customize game settings, including difficulty levels and text content.
- **Educational Value**: Enhances typing proficiency, crucial for efficient communication and productivity.

## Requirements

- Java Development Kit (JDK) 8 or higher
- JavaFX library

## Getting Started

### Clone the Repository

To get a local copy of the repository, run the following command:

Step 1: git clone https://github.com/DanShimmer/git-check.git

Step 2: Compile and Run the Game
Navigate to the project directory:

cd speed-typing-game

Step 3: Compile the source code:

Ensure you have the JavaFX library path set up correctly. If you haven't already, download JavaFX from the official website and set the PATH_TO_FX variable to the location of your JavaFX library.

javac --module-path $PATH_TO_FX --add-modules javafx.controls src/**/*.java

Step 4: Run the application:

java --module-path $PATH_TO_FX --add-modules javafx.controls src/**/*
