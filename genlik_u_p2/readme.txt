Java
Submission.java

We compile and run with java:

javac Submission.java
java Submission

The input file must be in the directory and the output file  will be created. The program takes three arguments from user and run the program according to given arguments. First argument is the input file name in directory second argument is name of the output and third argument is the chosen algorithm either pure greedy or improvised greedy.

Example command line argument would be:
badGreedyInput.txt badGreedyOutput1.txt 1

Since we have no conditions in project that tell us to use a specific sorting algorithm, program uses a bubble sort rather then a built in sorting algorithm, the biggest con of the bubble sort is it runs in O(n^2). 

When programs runs with 1 million input it will take O(10^12) to complete which is very slow.

If program uses input.txt as input and 0 as the mode it will produces following file and results. 
The output.txt for our machine is:

20 552.0 1
21 545.0 1
22 350.0 1
23 380.0 1
24 593.0 0
25 409.0 1
26 507.0 1
27 499.0 1
28 612.0 1
29 478.0 1


