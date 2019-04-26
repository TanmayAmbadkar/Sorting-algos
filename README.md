# Introduction

This repository contains the following sorting techniques
1) Insertion Sort
2) Quick Sort
3) Heap Sort
4) Merge Sort
5) Bubble Sort

Each sorting takes input from 2 folders, Random and Sorted. The Random Folder 10 input files 
containing random entries with input size = 1000. The sorted folder contains the sorted entries
of the random folder.
The Driver class executes all 5 sorting techniques, and displays the time taken by the 
methods to sort random entries and then sorted entries. 

To create a new sorting technique, create a method sort(int arr[]) which calls the internal sort
method (if exists), and then takes input from the folders. Check the main methods of any of the 
given sorting techniques to understand how to create the main method.

# Execution
To execute the sorting methods to compare time taken to sort same entries, compile and run
the driver program. On any system (Windows/linux/Mac os) :
```console
>javac Driver.java
>java Driver
```
Remember to create the folders Random and Sorted in the same folder as the Driver.
```console
>mkdir random
>mkdir sorted
```
