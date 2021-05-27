# DSAssignment
Distributed Systems Assignment
Here I have built 2 services,
The first service is the one where you pass the values and store it named dsassignment, using the url
http://localhost:8000/setvalue/val1/{val1}/val2/{val2}
eg.- http://localhost:8000/setvalue/val1/10/val2/20
Then you may check the value set at- http://localhost:8000/getvalue
This is the end of first service that runs on port 8000
(You may check the code in dsassignment)

Then, we pass these values to 2nd service named- dsassignment-service
So this service runs on port 8100 and communicates with the first service using feign,
The connection is established using feign, in ProxyServer.java class
The basic calculator functiions can be checked here on the urls as follows-
Addition-http://localhost:8100/add
Difference-http://localhost:8100/diff
Multiplication-http://localhost:8100/mul
Division-http://localhost:8100/div
Modulus-http://localhost:8100/mod

This is just a basic implimentation of distributed system using Java SpringBoot!

The docker images can be accessed from https://hub.docker.com/u/hardik55
Or just do "docker pull hardik55/dsc-dsassignment-service:0.0.1-SNAPSHOT"
and "docker pull hardik55/dsc-dsassignment:0.0.1-SNAPSHOT"
And then you may run the images downloaded locally.

