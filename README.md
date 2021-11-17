Commands: 

 - /grole {user} {role} - Gives user the specified rank
- /drole {user} {role} - removes the specified rank from a user




Explanation:

This plugin has two commands, one to give a user a rank, and another to remove a users rank.




Other:

There were some problems compiling the code to the right java version, and it's being worked on currently.



For devs:

The current method being used for this, is to have a command listening for 2 arguments, one for the player,
and one for the rank. Then it runs a command to the console with luckperms to remove/add the rank.
