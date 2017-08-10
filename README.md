# Train

### Assignment, class and language
This is my solution to the assignment **Train** of class **software developement 1,** written in Java.

### Requirements
This program consists of three classes: enum **Type**, class **Wagon** and class **Train**. A whole **Train** consists of an engine(the head of the whole train), several first class wagons, a dining wagon and several second class wagons. The dining wagon seperates the wagons of the first class from the ones of second class. The first class wagons start right after the engine. Every part of the train has its own wagon number. It starts with the engine which has the number 1. If the train is rearranged or its composition is changed (more or less wagons of any class), than the numeration has to be adjusted. This task should be done using a singly-linked list.

#### Enum Type
This class is used to determine, of which type an object of class **Wagon** is. There are four different types declared: `ENGINE, BISTRO, FIRST`and `SECOND`. According to its type, each wagon has a fixed amount of allowed passangers (**capacity**) and a String representation of its type:

Type | capacity | name
---- | -------- | ----
ENGINE | 1 | engine
BISTRO | 30 | bistro
FIRST | 20 | first class
SECOND | 50 | second class

#### Class Wagon
Objects of this class represent any kind of wagon of a train. It could be an engine, a wagon from first or second class or it could be the dining wagon. A wagon has a number (if the wagon has been already created, but not yet assigned to a train, its number is -1), an enum **type** which represents its type and a reference to its next wagon (here comes the singly-linked list into play). It should be possible to get the type of a wagon, to get its descendant, to get its number, to set the descendant of this wagon and to print a String representation of this wagon on the screen.

#### Class Train
The smallest possible train which could be created consists of an engine and a dining wagon. To simplify rearranging a train, objects of this class have two variables, one to store a reference to its engine and one to store a reference to its dining wagon. It should be possible to create a train with just an engine and a dining wagon and to create a train with an exact amount of first and second class wagons. It should also be possible to extend the train by any amount of first and second class wagons, to remove any amount of first and second class wagons, to add any number of wagons of a determined type between two determined wagons, to remove any number of wagons between two determined wagons, to renumber the whole train after any modifications and to print a String representation of the whole train to screen.
