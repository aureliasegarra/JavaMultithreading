[![Front](https://img.shields.io/badge/Language-Java-red?style=flat)](https://)
[![Front](https://img.shields.io/badge/Domain-Multithreading-green?style=flat)](https://)



<br/>
<div align="center">
    <img src="./logo.jpg" alt="Logo" width="70%">
    <br/>
    <br/>
    <h1 align="center">Java MultiThreading</h1>
</div>
  <p align="center">
    Demo and understanding
    <br />
    <br />
  </p>


<br/>
<br/>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>

  <ol>
    <li><a href="#illustration">Illustration</a></li>
    <li><a href="#description">Description</a></li>
    <li><a href="#languages">Languages & tools</a></li>
    <li><a href="#objectives">Objectives</a></li>
    <li><a href="#setup">SetUp</a></li>
    <li><a href="#status">Status</a></li>
    <li><a href="#context">Context</a></li>
  </ol>
</details>

<br>
<br>



## ✨ Illustration <a id="illustration"></a>
![illustration](./screenshot.png)


## 🗒 Description <a id="description"></a>
Small project to understand how multithreading works in Java by creating 2 threads.
Multithreading :
* Process of executing multiple threads simultaneously 
* Helps maximum utilization of CPU
* Threads are independent, don't affect the execution of other threads
* Exception in one thread doesn't interrupt other threads
* Useful for serving multiple clients, multiplayer games ...

## 🛠 Languages/tools <a id="languages"></a>
- Java


## 🎯 Objectives <a id="objectives"></a>
- **Understand mechanism of threads**
- **Understand the two ways of creating threads**
  - extends Thread class
  - implements Runnable interface
- **Understand the difference between start() and run() methods**
  - start() method starts multiple threads
  - run() method only executes one thread
- **Which one is better ?**
  - _major advantage_ of using **implements Runnable interface**
    - More FLEXIBILITY
    - Java doesn't support multiple inheritance 
    - => using **implements** make **extends** usable

## 🎯 SetUp <a id="setup"></a>
- How to launch React Sudoku
    - `git clone`
    - `cd java-multithreading`
    - `mvn clean install`
    - `mvn exec:java -Dexec.mainClass="com.multithreading.Main"`

## 📈 Status <a id="status"></a>

Project finished


## 🗓 Context <a id="context"> </a>
I realized this practical work during my bachelor of computer science in the Institute of technology of Vannes




