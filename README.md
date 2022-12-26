# Vehicle
<h1>  Classes and interfaces of this project:</h1>  
<p>a. class Person</p>
<p>b. class InvalidDriverException extends Exception</p>
<p>c. class Vehicle</p>
<p>d. interface Announcements</p>
<p>e. class Car extends Vehicle implements Comparable<Car>, Announcements</p>
<p>f. class Bus extends Car</p>
<p>g. class Bicycle extends Vehicle implements Comparable<Bicycle></p>


<h2> a)Created the following class Person </h2>

<p>class Person</p>
<p>- name: String</p>
<p>- hasDriverLicense: boolean</p>
<p>- age: int		//years</p>
<p>- height: int		//inches</p>

<P>- Person(String name, boolean hasDriverLicense, int age, int height)	</p>
<P>- getName(): String</p>
<P>- hasDriverLicense(): boolean</p>
<P>- getAge(): int</p>
<P>- getHeight(): int</p>
<P>- clone() : Person	//returns a copy of the Person with all the same values without revealing the original memory address</p>
<P>- equals(Object o) : boolean	//2 Person objects are equal if all their variables are equal</p>
<P>- toString(): String </p>
<P>//"Person [name= %10s | age= %02d | height= %02d | has license/no license]", name, age, height, hasDriverLicense</p>


 <h2>b) Created the following class  InvalidDriverException</h2> 
 
<p>class InvalidDriverException extends Exception</P>
<p>+ InvalidDriverException()</p>
<p>+ InvalidDriverException(String message)</P>



<h2>c) Created the following class  Vehicle </h2> 

<p># abstract class Vehicle</p> 
<p># personsOnBoard: Person [ ][ ]</p> 
<p># numberOfRows: int</p> 
<p>+ maxSeatsPerRow: int</p> 
<p>+ numSeatsPerRow: int [ ]</p> 
<p>+ Vehicle(int numRows, int numSeatsPerRow)				//SEE NOTE 1</p> 
<p>+ Vehicle(int [ ] numSeatsPerRow)						//SEE NOTE 2</p> 
<p>+ Vehicle(Person driver, int [ ] numSeatsPerRow)			 	//SEE NOTE 3</p> 
<p>+ abstract loadPassenger(Person p): boolean					//SEE NOTE 4</p> 
<p>+ abstract loadPassengers(Person [] peeps): int				//SEE NOTE 5</p> 
<p>+ setDriver(Person p): void throws InvalidDriverException		 	//SEE NOTE 6</p> 
<p>+ getDriver(): Person	</p> 
<p>+ hasDriver() : boolean</p> 
<p>+ getNumberOfAvailableSeats(): int						//SEE NOTE 7</p> 
<p>+ getNumberOfAvailableSeatsInRow(int row): int				//SEE NOTE 8</p> 
<p>+ getNumberOfPeopleOnBoard(): int   					//SEE NOTE 9</p> 
<p>+ getNumberOfPeopleInRow(int row): int   	</p> 
<p>+ getPersonInSeat(int row, int col): Person</p> 
<p>+ getLocationOfPersonInVehicle(Person p): int [ ]				//SEE NOTE 10</p> 
<p>+ getPeopleInRow(int row): Person[ ]						//SEE NOTE 11</p> 
<p>+ getPeopleOnBoard(): Person[ ][ ] 						//SEE NOTE 12</p> 
<p>+ isPersonInVehicle(Person p): boolean</p> 
<p>+ isPersonDriver(Person p): boolean</p> 


<center><h1> Notes for Class Vehicle:</h2></center>

<p>1. This constructor is used when all the rows have the exact same number of seats.</P> 
<p>2. This constructor is used when all the rows do not have the same configuration. The number of seats in each row is provided by the array numSeatsPerRow, the number of rows is derived from the size of the array.</P> 
<p>3. This constructor does everything specified by (2) above plus it sets the driver of the vehicle. Please note that the specified driver must have a driver’s license, otherwise they are not qualified to be assigned to the driver position which is personsOnBoard[0][0].</P> 
<p>4. This abstract method will be implemented by derived classes to load the specified person into the vehicle at the first available seat. Searching for an available seat must start in the first row, please note that a person below the age of 5 or has a height less than 36 is not allowed to sit in the first row. This method returns true if there is room for the specified person, otherwise the method returns false.</P> 
<p>5. This method attempts to load as many of the persons specified in the peeps array as possible. This method returns the number of people that were loaded into the Vehicle.</P> 
<p>6. This method sets the driver of the Vehicle if the specified person has a driver’s license. If the person does not have a driver’s license, this method will throw the InvalidDriverException.</P> 
<p>7. This method returns the number of available/empty seats in the Vehicle.</P> 
<p>8. This method returns the number of available/empty seats in the specified row. If the specified row is invalid, the method returns -1.</P> 
<p>9. This method counts the number of people currently assigned to seats in the vehicle, including the driver.</P> 
<p>10. This method returns the location of the specified person in the vehicle by returning an int array containing [ row, seatColumn ]. Please note that if the specified person is not seated in the vehicle, the method will return [ -1, -1 ].</P> 
<p>11. This method will return a Person array containing a clone of all the persons in the specified row. The populated Person array will not contain empty index locations. If the specified row has no one, or the specified row is invalid, this method returns a null.</P> 
<p>12. This method returns a full clone of the personsOnBoard array with clones of the Person objects contained within. Please note that personsOnBoard.clone() is not sufficient to clone a 2-dimensional array.</P> 



<h2> d) Created the following interface Announcements</h2> 

<p>interface Announcements</p>
<p>+ departure(): String								//SEE NOTE 1</P>
<p>+ arrival(): String								//SEE NOTE 2</p>
<p>+ doNotDisturbTheDriver(): String 						//SEE NOTE 3</p>

<center> <h2>Notes for Interface Announcements:</h2> </center> 

<p>1. The departure() method of a Car should return a line stating “All Aboard\n”, while a Bus should return a String containing 2 lines “All Aboard\nThe Bus\n”. The Bus implementation should make use of super.departure().</p>
<p>2. The arrival() method of Car should return a line stating “Everyone Out\n”, while a Bus should return a String containing 2 lines “Everyone Out\nOf The Bus\n”. The Bus implementation should make use of super.arrival().</p>
<p>3. The doNotDisturbTheDriver() method of Car should return a line stating “No Backseat Driving\n”, while a Bus should return a String containing 2 lines “No Backseat Driving\nOn The Bus\n”. The Bus implementation should make use of super.doNotDisturbTheDriver().</P> 

<h2> e ) Created the following class  Car</h2>

<P>class Car extends Vehicle implements Comparable<Car>, Announcements</P>
 <P>- numDoors: int </P>
 <P>- numWindows: int</P>
 <P>+ Car(int numDoors, int numWindows)	//SEE NOTE 1</P>
<P> + Car(int numDoors, int numWindows, int numSeatsPerRow )	//SEE NOTE 2</P>
<P> + Car(int numDoors, int numWindows, int [ ] numSeatsPerRow )	//SEE NOTE 3</P>
 <P>+ Car(int numDoors, int numWindows, Person driver, int [ ] numSeatsPerRow)	//SEE NOTE 4</P>
 <P>+ canOpenDoor(Person p): boolean	//SEE NOTE 5</P>
<P> + canOpenWindow(Person p): boolean	//SEE NOTE 6</P>
 <P>+ getNumDoors(): int</P>
 <P>+ getNumWindows(): int</P>
 <P>+ equals(Object o): boolean 	//SEE NOTE 7</P>
<P> + toString(): String 	//SEE NOTE 8</P>
<P> + compareTo(Car c): int	//SEE NOTE 9</P>


<center> <h2>Notes for Class Car: </h2> </center> 
<p> 1. This constructor calls the parent class’s constructor, passing in 2 for the numRows and 2 for the numSeatsPerRow, before assigning the numDoors and numWindows values.</P>
<p> 2. This constructor calls the parent class’s constructor passing in 2 for the numRows and the numSeatsPerRow argument, before assigning the numDoors and numWindows values.</P>
<p> 3. This constructor calls the parent class’s constructor passing in the numSeatsPerRow[] array as an argument, before assigning the numDoors and numWindows values.</P>
<p> 4. This constructor calls the parent class’s constructor passing in the driver and the numSeatsPerRow[] array, before assigning values to numDoors and numWindows.</P>
<p> 5. This method returns true if the Person is seated in either of the exterior seats of a row that has a door (column index 0 or last index of that row) and is over age 5. It returns false otherwise.</P>
<p> 6. If the number of doors is less than 2 * numberOfRows, the row/s past numDoors / 2 has/have no doors.</P>
<p> 7. This method returns true if the Person is seated in either of the exterior seats of a row that has a window (column index 0 or last index of that row) and is over age 2. It returns false otherwise. If the number of windows is less than 2 * numberOfRows, the row/s  past numWindows / 2 has/have no windows.</P>
<p> 8. Two Car objects are considered equal if they have the same numDoors, same numWindows, same numberOfRows, same maxSeatsPerRow, and the same seat configuration (numSeatsPerRow[row]) at every row.</P>
<p> 9. Return a string containing the Car’s details formatted as follows:</P>
<p> 10. “Car: number of doors= %02d | number of windows = %02d | number of rows= %02d | seats per row= %s | names of people on board= %s\n”</P>
<p> 11. The seats per row will be from the array of numSeatsPerRow as [val1,val2,val3, valn]</P>
<p> 12. The names of people on board will be separated by commas with no trailing comma.</P>
<p> 13. This method returns -1 if the calling object’s total number of seats is less than the passed in object’s total number of seats, 1  if the calling object’s total number of seats is greater than the passed in object’s total number of seats, 0 if they have the same total number of seats.</P>
<p> 14. Be sure to implement the loadPassenger, and loadPassengers methods in the Car class.</P> 


<h2> f) Created the following class  Bus</h2> 

<P>class Bus extends Car </P>
<p>+ Bus(int[] numSeatsPerRow)							//SEE NOTE 1</P>
<P>+ Bus(Person driver, int[] numSeatsPerRow)					//SEE NOTE 2</P>
<P>+ canOpenDoor(Person p): boolean						//SEE NOTE 3</P>
<P>+ canOpenWindow(Person p): boolean					//SEE NOTE 4</P>
<P>+ toString(): String								//SEE NOTE 5</P>


<center> <h2>Notes for Bus class:</h2></center> 
<p>1. This constructor calls the parent class’s constructor, passing in 2 for the numDoors, numWindows equal to ( ( 2 * length of numSeatsPerRow array ) -1) since the first row only has 1 window, and as the last argument, numSeatsPerRow[] where the first row (index 0) always has 1 seat, while the rest of the array has numSeatsPerRow in each index. </p>
<p>2. This constructor does everything specified by (1) above, plus passes in the Person.</p>
<p>3. This method returns true if the Person is the driver, or seated in the last populated row. The Person must also be above the age of 5, and taller than 40 inches. It returns false otherwise.</p>
<p>4. This method returns true if its parent class’s canOpenWindow method returns true, and the Person is above the age of 5.</p>
<p>5. This method prepends “Bus is an extension of “ to the string returned from the Car class’s toString() method before returning the entire string.</p>
<p>6. Be sure to implement the loadPassenger, and loadPassengers methods in the Bus class.</p>

<h2>  g) Created the following class  Bicycle</h2> 

<p>class Bicycle extends Vehicle implements Comparable<Bicycle> 
<p>- weight: double
<p>+ Bicycle()									//SEE NOTE 1
<p>+ Bicycle(Person driver)								//SEE NOTE 2
<p>+ Bicycle(Person driver, double weight)					//SEE NOTE 3
<p>+ equals(Object o): boolean	//same weight. ACCURACY_RANGE = 0.5  //SEE NOTE 4
<p>+ getWeight(): double
<p>+ setWeight(double w): void
<p>+ setDriver(Person p): void throws InvalidDriverException			//SEE NOTE 5
<p>+ toString(): String			 //"Bicycle [ rider= " + getDriver().getName() + " | weight= " + weight + " ]"
<p>+ compareTo(Bicycle b)		//ACCURACY_RANGE = 0.5			//SEE NOTE 6


<center> <h2> Notes for Bicycle class:</h2> </center> 
<p>1. This constructor calls the parent class’s constructor, passing in 1 for the numRows and 1 for the numSeatsPerRow before initializing weight to 0.</p>
<p>2. This constructor calls the parent class’s constructor, passing in the specified driver and an array specifying that there is only one row with one seat,before initializing weight to 0.</p>
<p>3. This constructor calls the parent class’s constructor, passing in the specified driver and an array specifying that there is only one row with one seat, before setting the weight. (Negative weight not permitted, set to 0 if that occurs).</p>
<p>4. Two bicycle objects are considered equal if their weights are within 0.5 of each other regardless of who the driver is.</p>
<p>5. verride the inherited setDriver method so that any Person age 3 or older can be the driver of the Bicycle.  If the driver is younger than 3, throw an InvalidDriverException.</p>
<p>6. If the calling object’s weight is less than the passed in object’s weight by more than the ACCURACY_RANGE return -1. If the calling object’s weight is greater than the passed in object’s weight by more than the ACCURACY_RANGE return 1. Otherwise return 0;</p>
<p>7. Be sure to implement the loadPassenger, and loadPassengers methods in the Bicycle class. Hint: A Bicycle cannot have any passengers. (A driver is not a passenger)</p>


<h2>Q2 ) Created a class named RecursionQuestion</h2>


<p> In this class I used the Car class defined above, and I have performed a binary search on an array of Car objects. </p>

<p>This class have a method with the following signature.</P> 

<p>public static int binarySearch(Car[] cars, Car c)</p>

<p>This method call a recursive helper method to perform the binary search for the specified Car c.</P>

<p>In the examples below, s is the start index, e is the end index, and mid is the mid index at each phase of the recursive method calls.</P>

<p>When the car being searched for is found, my code will produce output similar to the following:</P>

<p>Looking for Car: number of doors = 02 | number of windows = 04 | number of rows = 03 | seats per row = [2,3,3] | names of people on board = []</P>

<p>s=0, e=9, mid=4</P>
<p>go left</P>
<p>s=0, e=3, mid=1</P>
<p>go right</P>
<p>s=2, e=3, mid=2</P>
<p>go right</P>
<p>s=3, e=3, mid=3</P>
<p>FOUND at 3</P>

<p>When the car being searched for is not found,my code will produce output similar to the following:</P>

<p>Looking for Car: number of doors = 02 | number of windows = 04 | number of rows = 02 | seats per row = [1,3] | names of people on board = []</P>

<p>s=0, e=9, mid=4</P>
<p>go left</P>
<p>s=0, e=3, mid=1</P>
<p>go left</P>
<p>s=0, e=0, mid=0</P>
<p>go right</P>
<p>s=1, e=0</P>
<p>Not Found</P>














