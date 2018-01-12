Implementation:

1. Randomizer class contain generateRandom method which generates a RandomNumber which is then inserted in a queue of LinkedList of Integer type.
2. Prime class takes the Random Number as input and checks if the number is a prime number or not and then returns a boolean value. This boolean value and the Random Number are inserted in LinkedList. This LinkedList is of type PrimeNumber class which has the randomnumber, isPrime variables and its getter methods. 
3. The LinkedList values are then given as input to displayOutput() method within Randomizer class and prints the output as given number is a prime number if the boolean value is true and print as the given random number is not a prime number if the boolean value is falsse.

4. QueueImpl class has a main method and the objects are created for Prime and Random classes, the methods to generateRandomNUmber, generating a queue and displayOutput to display the output in Prime application are called.  

LinkedList is used as Queue to store or transfer the random number as the data storing and transfer is faster with linkedLists.

Sample Output:

generated random number is [1337106978, 951427654, 1302678691, 112283752, 1391735308, 2135427854, 1922644978, 198280763, 2000016548, 1726811249, 698421020, 490429260, 1680064253, 691938129, 1050412479, 813144602, 1507065699, 1752767649, 1127985961, 823172873, 1118946253, 2131722227, 738481942, 944664314, 1289311599, 1986910367, 1301987478, 93281671, 1453783915, 2006329229, 586824973, 1775410392, 1592530599, 173238176, 2098410837, 1724231973, 333506746, 1845538495, 1484471038, 1266377160, 966694911, 935138689, 1482778549, 109208061, 1356079820, 1846423413, 319164610, 2012973882, 1503794109, 1006992907, 1503850667, 36905765, 1748232489, 1117382690, 471927030, 1102989110, 904610231, 1689051182, 38510092, 1188378603, 1373634569, 1371767557, 1552142137, 1244978594, 1194964885, 527866183, 1399745744, 199065878, 714724501, 245433704, 818794092, 1328173432, 1049825557, 1845676124, 231967569, 1973219881, 824305962, 2030528221, 2027034352, 569502226, 442687553, 289479004, 863265673, 457600673, 310282645, 1217843330, 1000459499, 31827040, 789603770, 263829601, 2115415383, 744165171, 1984743255, 2027390012, 1990073987, 1833536558, 553324785, 1011444975, 1558153402, 1155649297]
given random number 1337106978 is not a prime number
given random number 951427654 is not a prime number
given random number 1302678691 is not a prime number
given random number 112283752 is not a prime number
given random number 1391735308 is not a prime number
given random number 2135427854 is not a prime number
given random number 1922644978 is not a prime number
given random number 198280763 is a prime number
given random number 2000016548 is not a prime number
given random number 1726811249 is not a prime number
given random number 698421020 is not a prime number
given random number 490429260 is not a prime number
given random number 1680064253 is not a prime number
given random number 691938129 is not a prime number
given random number 1050412479 is not a prime number
given random number 813144602 is not a prime number
given random number 1507065699 is not a prime number
given random number 1752767649 is not a prime number
given random number 1127985961 is a prime number
given random number 823172873 is not a prime number
given random number 1118946253 is not a prime number
given random number 2131722227 is not a prime number
given random number 738481942 is not a prime number
given random number 944664314 is not a prime number
given random number 1289311599 is not a prime number
given random number 1986910367 is not a prime number
given random number 1301987478 is not a prime number
given random number 93281671 is not a prime number
given random number 1453783915 is not a prime number
given random number 2006329229 is not a prime number
given random number 586824973 is not a prime number
given random number 1775410392 is not a prime number
given random number 1592530599 is not a prime number
given random number 173238176 is not a prime number
given random number 2098410837 is not a prime number
given random number 1724231973 is not a prime number
given random number 333506746 is not a prime number
given random number 1845538495 is not a prime number
given random number 1484471038 is not a prime number
given random number 1266377160 is not a prime number
given random number 966694911 is not a prime number
given random number 935138689 is not a prime number
given random number 1482778549 is not a prime number
given random number 109208061 is not a prime number
given random number 1356079820 is not a prime number
given random number 1846423413 is not a prime number
given random number 319164610 is not a prime number
given random number 2012973882 is not a prime number
given random number 1503794109 is not a prime number
given random number 1006992907 is not a prime number
given random number 1503850667 is not a prime number
given random number 36905765 is not a prime number
given random number 1748232489 is not a prime number
given random number 1117382690 is not a prime number
given random number 471927030 is not a prime number
given random number 1102989110 is not a prime number
given random number 904610231 is not a prime number
given random number 1689051182 is not a prime number
given random number 38510092 is not a prime number
given random number 1188378603 is not a prime number
given random number 1373634569 is a prime number
given random number 1371767557 is not a prime number
given random number 1552142137 is not a prime number
given random number 1244978594 is not a prime number
given random number 1194964885 is not a prime number
given random number 527866183 is not a prime number
given random number 1399745744 is not a prime number
given random number 199065878 is not a prime number
given random number 714724501 is not a prime number
given random number 245433704 is not a prime number
given random number 818794092 is not a prime number
given random number 1328173432 is not a prime number
given random number 1049825557 is not a prime number
given random number 1845676124 is not a prime number
given random number 231967569 is not a prime number
given random number 1973219881 is not a prime number
given random number 824305962 is not a prime number
given random number 2030528221 is a prime number
given random number 2027034352 is not a prime number
given random number 569502226 is not a prime number
given random number 442687553 is not a prime number
given random number 289479004 is not a prime number
given random number 863265673 is a prime number
given random number 457600673 is a prime number
given random number 310282645 is not a prime number
given random number 1217843330 is not a prime number
given random number 1000459499 is not a prime number
given random number 31827040 is not a prime number
given random number 789603770 is not a prime number
given random number 263829601 is not a prime number
given random number 2115415383 is not a prime number
given random number 744165171 is not a prime number
given random number 1984743255 is not a prime number
given random number 2027390012 is not a prime number
given random number 1990073987 is not a prime number
given random number 1833536558 is not a prime number
given random number 553324785 is not a prime number
given random number 1011444975 is not a prime number
given random number 1558153402 is not a prime number
given random number 1155649297 is not a prime number



Design:

Project has 3 classes.
1. Randomizer
2. Prime
3. PrimeNumber
3.QueueImpl

Randomizer class has two methods.
a. generateRandom(): this method generates random number.
b. displayOutput(): this methhod displays the output generated in Prime class.

Prime class:

This class has 2 methods.
1. checkPrime() which takes the integer as a input parameter and checks if the input is a prime number or not . This method returns boolean value of true if the random number is a prime number and returns false if the random number is not a prime number. 
2. generatePrimeQ() which takes random number of type Integer as input parameter and returns a LinkedList of Random Number, boolean value of true if the random number is true and false value if the random number is false.


PrimeNumber class:
This class has 2 variables. boolean variable named isPrime, random number of integer type, its getter methods and parameterized constructor with variables as rnum, isPrime. 

QueueImpl Class:

In this class, objects are created for the classes Prime, Randomizer and the methods to generateRandomNUmber, generating a queue and displayOutput to display the output in Prime application are called.



