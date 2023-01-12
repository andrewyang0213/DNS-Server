# DNS Server (Ubuntu Linux)

A caching DNS server that parses a DNS request message, responds to queries for records that the server is responsible for, and recursively contacts another server to resolve queries outside of the local zone file.  

How to run:  
  In one terminal: sudo java dns.DNSServer testZone.zone  
  Testing in second terminal:  
    - dig @localhost test1.csci3363.net  
    - dig @localhost www.google.com  
    - dig @localhost xkcd.com  

Pictures:  
dig @localhost test1.csci3363.net:  
![image](https://user-images.githubusercontent.com/65783403/212160281-c9b4d9dc-9b98-4cbe-88e6-ff6c600164ee.png)
