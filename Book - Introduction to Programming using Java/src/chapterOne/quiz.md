### Question 1
#### One of the components of the computer is its CPU. What is a CPU and what role does it play in a computer?
The CPU stands for central processing unit. It's the central unit of the computer and does all the processing of tasks that it's told to do.


### Question 2
#### Explain what is meant by an "asynchronous event". Give some examples
An asynchronous event is something the CPU normally would have to wait for, but instead it goes ahead and processes other tasks
until either an interrupt appears or the CPU polls occasionally for events.

For example, the CPU can request data from the hard-disk, but instead of waiting for the data, it'll continue doing other things until
the hard-disk interrupts the CPU and tells it the data is ready.

Another example would be that the CPU occasionally polls the keyboard to see if keys have been pressed recently.


### Question 3
#### What is the difference between a "compiler" and an "interpreter"?
The compiler transforms the code into something the CPU can understand, or in Java's case, into Javabyte code.

An interpreter will take the Javabyte code and "translate" it in real time so the CPU can run it.


### Question 4:
#### Explain the different between high-level languages and machine language.
A high-level language is something for humans to understand so that we can write program in an easier manner.
Machine language is generally not readable or writeable by humans, and is only ran by the CPU. 

High-level languages always tend be compiled down to machine language.


### Question 5:
#### If you have the source code for a Java program, and you want to run that program, you will need both a compiler and an interpreter. What does the Java compiler do. and what does the Java interpreter do?
First you'd need to use the Java compiler to turn Java code into Javabyte code.
The Java interpreter takes this Javabyte code and turns it into machine language in real time. So as the CPU needs the next command
the interpreter will give he next command just in time (JIT)


### Question 6:
#### What is a subroutine?
A subroutine could be a separate piece of code that can handle and solve a certain problem. You can then at any later moment
in your code run this subroutine without having to rewrite the logic multiple times.

### Question 7:
#### Java is an object-oriented programming language. What is an Object?
An object could be anything you can think of, if you're developing software for an autonomous car you'd have an object for the wheel
and one for the doors. But also one for the whole car, which then include the sub-objects "wheel" (x4) & "door" (x2/x4)

### Question 8:
#### What is a variable?
A variable is a value stored as a key/value. The key is the name of the variable, and the value is then what the name represents.
The variable can have different types such as String, int, float. But could also be a class. 

### Question 9:
#### Java is a "platform-independent language" What does this mean?
Theoretically, programs written in Java could run on any hardware, anywhere. As long as there is a Java Interpreter available.

### Question 10:
#### What is the "Internet"? Give some examples of how it is used.
The internet is a collection of millions of computers who are all capable of communicating with each other via different protocols.
Most widely known is the world wide web. Which is used to view different web pages, which connect to other web pages. Web pages can be used to find stuff and learn new things.
Also commonly used are SMTP for mailing, and various chat protocols to talk to other people.