The programs are split up between WordCountBasic and WordCountMapReduce.

## WordCountBasic  
  Basic program to read from text files.

  Output is in output.txt.  
  Execution Time is in ExecutionTimeOutput.png  
  To run this:  
    - Compile the src/main/WordCount.java program  
    - Navigate to the src directory  
    - Run:  
    `java main/WordCount ../ex1.txt ../ex2.txt ../ex3.txt >> ../output.txt`

## WordCountMapReduce
  MapReduce implementation for WordCount.  

  Output is in collectedResults  
  Execution time is in each .png file. Three files to account for cluster variability.  

  The basic implementation was much faster than the map reduce implementation. In order for the map reduce implementation to be faster, we need a much larger data set.  

  To run this:  
    - Make a jar of the WordCount.java program  
    - Copy this jar and the example text files to the cluster  
    - Place the example files in a folder and put them in HDFS  
    - Run:  
    `hadoop jar WordCount.jar main.WordCount testData output`  
    This is in a package, so you need main.WordCount, not just WordCount
  
