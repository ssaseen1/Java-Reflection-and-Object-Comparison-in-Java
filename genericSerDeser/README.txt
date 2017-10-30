Assignment - 5
Shali Saseendran

Assuming you are in the directory containing this README:

## To clean:
ant -buildfile src/build.xml clean

-----------------------------------------------------------------------
## To compile: 
ant -buildfile src/build.xml all

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## We will use this to run your code

ant -buildfile src/build.xml run -Darg0=firstarg -Darg1=SECOND -Darg2=THIRD 

ant -buildfile src/build.xml run -Darg0=input.txt -Darg1output.txt -Darg20 
-----------------------------------------------------------------------

## To create tarball for submission
tar -czvf shali_saseendran_assign_5.tar.gz shali_saseendran_assign_5

## To create untarball for submission

tar -xvzf shali_saseendran_assign_5.tar.gz shali_saseendran_assign_5

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.ù

[Date:05-08-2017]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

ArrayList is used to store the objects (First and Second)
Time Complexity: add O(1), lookup O(n), get O(n)
Space Complexity: O(n), n is the total number of Objects

-----------------------------------------------------------------------
Logger.java: 
The debug value used for the following output.

DEBUG_VALUE=4 CONSTRUCTOR [Print to stdout every time a constructor is called]
DEBUG_VALUE=3 DATASTRUCTURE [Print to stdout the size of the data structure of Objects]
DEBUG_VALUE=2 SERIALIZE [Print to stdout the number of times the serialisation is done]
DEBUG_VALUE=1 DESERIALIZE [Print to stdout the number of times the deserialisation is done]
DEBUG_VALUE=0 OUTPUT [No output]

-----------------------------------------------------------------------
Provide list of citations (urls, etc.) from where you have taken code
(if any).

