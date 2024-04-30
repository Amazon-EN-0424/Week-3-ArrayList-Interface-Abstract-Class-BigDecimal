# 📚 Week 3



## 📝 ArrayList

### Creating an ArrayList
- **Declare and Instantiate an ArrayList:**
  ```java
  ArrayList<String> kombuchaFlavors = new ArrayList<>();
  ```

### Basic Operations
- **Add Elements:**
  ```java
  kombuchaFlavors.add("Ginger-Lemon");
  kombuchaFlavors.add("Blueberry-Basil");
  kombuchaFlavors.add("Raspberry-Lime");
  ```
  
- **Access Elements:**
  ```java
  String favoriteFlavor = kombuchaFlavors.get(0); // Accesses the first element, "Ginger-Lemon"
  System.out.println("Favorite flavor: " + favoriteFlavor);
  ```
  
- **Modify Elements:**
  ```java
  kombuchaFlavors.set(0, "Mango-Ginger"); // Updates "Ginger-Lemon" to "Mango-Ginger"
  ```
  
- **Remove Elements:**
  ```java
  kombuchaFlavors.remove("Blueberry-Basil"); // Removes "Blueberry-Basil" from the list
  ```

- **Iterate Over ArrayList:**
  ```java
  System.out.println("Available Flavors:");
  for (String flavor : kombuchaFlavors) {
      System.out.println(flavor);
  }
  ```

### 🎮 Practical Exercise: Videogame Shop Inventory
- **Task:** Use `ArrayList` to manage a videogame shop's inventory.
- **Instructions:**
  - Write a Java class, `VideogameShop`, and implement functionalities to:
    - Add new videogame titles to the inventory.
    - Remove titles no longer available.
    - Update titles.
    - Retrieve and display all available titles.
  - **Bonus:** Implement a search feature to find a videogame by name.

### 💡 Discussion
- Reflect on the ease of using `ArrayList` compared to traditional arrays for managing changing data.

## 🔧 Interfaces

### Understanding Interfaces
- **Define and Declare an Interface:**
  ```java
  public interface Vehicle {
      int MAX_SPEED = 120; // Static variable
      void start();
      void stop();
      default void displayType() {
          System.out.println("This is a vehicle.");
      }
  }
  ```

### Basic Operations
- **Implement an Interface:**
  ```java
  public class Car implements Vehicle {
      @Override
      public void start() {
          System.out.println("Car starts with a key.");
      }

      @Override
      public void stop() {
          System.out.println("Car stops when brakes are applied.");
      }
  }
  ```

- **Access Interface Methods and Static Variables:**
  ```java
  Vehicle myCar = new Car();
  myCar.start(); // Calls the start method defined in Car
  myCar.stop(); // Calls the stop method defined in Car
  System.out.println("Maximum speed: " + Vehicle.MAX_SPEED); // Accessing the static variable
  ```

- **Extend Interface Functionality:**
  ```java
  public interface ElectricVehicle extends Vehicle {
      void chargeBattery();
      default void displayBatteryStatus() {
          System.out.println("Battery status: Good");
      }
  }
  ```

- **Implement Extended Interface:**
  ```java
  public class ElectricCar implements ElectricVehicle {
      @Override
      public void start() {
          System.out.println("Electric car starts silently.");
      }

      @Override
      public void stop() {
          System.out.println("Electric car uses regenerative braking to stop.");
      }

      @Override
      public void chargeBattery() {
          System.out.println("Charging the battery.");
      }
  }
  ```

### 🎵 Practical Exercise: Music Streaming Service
- **Task:** Use interfaces to develop components for a music streaming service.
- **Instructions:**
  - Write Java classes to simulate a music streaming service:
    - Define interfaces: `Playable` for media playback functions and `PlaylistManager` for managing playlists.
    - Implement the interfaces in classes like `Song`, `Album`, and `UserPlaylist`.
    - Instantiate these classes in a main program to simulate interacting with the streaming platform.
    - Use default methods for common functionalities and static variables for settings.
  - **Challenge:** Enhance the `Playable` interface with a `default` method to increase or decrease volume.

### 💡 Discussion
- Reflect on the practical use of interfaces in building modular and scalable applications.
- Discuss how interfaces facilitate the development of flexible and extensible software architecture.

## 🔍 Abstract Classes

### Understanding Abstract Classes
- **Define and Declare an Abstract Class:**
  ```java
  public abstract class Person {
      protected String name;
      protected int age;

      public Person(String name, int age) {
          this.name = name;
          this.age = age;
      }

      // Abstract method that subclasses must implement.
      public abstract void introduce();

      // Concrete method with implementation.
      public void displayInfo() {
          System.out.println("Name: " + name + ", Age: " + age);
      }
  }
  ```

### Basic Operations
- **Extend an Abstract Class:**
  ```java
  public class Student extends Person {
      private String studentID;

      public Student(String name, int age, String studentID) {
          super(name, age);
          this.studentID = studentID;
      }

      @Override
      public void introduce() {
          System.out.println("Hi, I am student " + name + ", and my ID is " + studentID);
      }
  }

  public class Instructor extends Person {
      private String employeeID;

      public Instructor(String name, int age, String employeeID) {
          super(name, age);
          this.employeeID = employeeID;
      }

      @Override
      public void introduce() {
          System.out.println("Hello, I am instructor " + name + ", and my employee ID is " + employeeID);
      }
  }
  ```

### 👨‍🍳 Practical Exercise: Culinary School Management System
- **Task:** Use abstract classes to design and simulate a culinary school management system.
- **Instructions:**
  - Write Java classes that extend the abstract classes `Person` and `Course`, representing different roles and courses in the culinary school.
    - Define another abstract class: `Course` with a method template for course activities.
    - Implement the abstract classes in specific courses like `Baking` and `CulinaryBasics`.
    - Instantiate these classes to demonstrate the management and operations of the culinary school.

### 💡 Discussion
- Reflect on the benefits of using abstract classes to establish a common structure while allowing flexibility for specific implementations.
- Discuss how abstract classes provide a solid foundation for building scalable and adaptable systems in educational environments.

## 💰 BigDecimal

### Understanding BigDecimal
- **Define and Declare BigDecimal:**
  - `BigDecimal` allows for high-precision arithmetic in Java, crucial for applications requiring exact calculations, such as financial contexts.
  ```java
  import java.math.BigDecimal;
  ```

### Basic Operations
- **Create BigDecimal Instances:**
  - Instantiate `BigDecimal` objects from strings to avoid precision loss.
  ```java
  BigDecimal balance = new BigDecimal("12345.67");
  BigDecimal interestRate = new BigDecimal("0.05");
  ```

- **Perform Arithmetic Operations:**
  - Use `BigDecimal` for precise arithmetic operations necessary in financial applications.
  ```java
  BigDecimal interest = balance.multiply(interestRate);
  System.out.println("Interest: " + interest);
  ```

- **Scaling and Rounding:**
  - Handle scaling and rounding with `BigDecimal` to ensure results meet financial standards.
  ```java
  BigDecimal roundedInterest = interest.setScale(2, BigDecimal.ROUND_HALF_UP);
  System.out.println("Rounded Interest: " + roundedInterest);
  ```

### 🏦 Practical Exercise: Simple Banking Application
- **Task:** Use `BigDecimal` to simulate a simple banking application that handles deposits, withdrawals, and interest calculations.
- **Instructions:**
  - Write Java classes that utilize `BigDecimal` to ensure precise handling of financial transactions.
    - Define a `BankAccount` class to represent a bank account where each operation on the account balance must be done using `BigDecimal`.
    - Instantiate `BankAccount` and simulate various transactions to demonstrate how `BigDecimal` handles financial data precisely.

### 💡 Discussion
- Reflect on the importance of using `BigDecimal` in applications requiring high precision to prevent common floating-point errors.
- Discuss the critical role of `BigDecimal` in financial systems where the accuracy of calculations can impact financial stability and compliance with legal standards.

