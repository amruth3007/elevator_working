# elevator_working
This project describes the working of an elevator with 10 floors providing alarm and is implemented in Java.


This program that mimics the operations of the inside of an elevator. 
More specifically, the program simulates what happens when the user chooses to go to a particular floor, and it simulateswhat happens when the user pulls the elevator’s fire alarm. 
Assuming the elevator is in a high-rise building that has floors numbered 1 through 10.


Methods including in Elevator program using Java Implementation:

selectFloor ─           This method prompts the user for a floor selection and then performs inputvalidation for the floor selection. If the floor selection is inappropriate (less than 1, greater than 10), then the method prints an error message. If the floor selection is OK, the method
simulates going to that floor. Format of the simulation message is shown below:
Options: (s)elect a floor, (f)ire alarm, (q)uit
Enter s, f, or q ==> x
Invalid selection.
Options: (s)elect a floor, (f)ire alarm, (q)uit
Enter s, f, or q ==> F
Danger! You must exit the building now!
Options: (s)elect a floor, (f)ire alarm, (q)uit
Enter s, f, or q ==> s
Enter the floor that you'd like to go to ==> 8
Going up..2..3..4..5..6..7..8..Ding!
Options: (s)elect a floor, (f)ire alarm, (q)uit
Enter s, f, or q ==> s
Enter the floor that you'd like to go to ==> 5
Going down..8..7..6..5..Ding!

fireAlarm ─             This method prints a “danger” message and then simulates going to the first floor. Note that I’m assuming this is a high tech fire alarm that is programmed to force the elevator to go to the first floor! See the sample session below for the format of the “danger” message.

Quit-                  This method is to exit from the Elevator.
