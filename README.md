# DNS Server (Ubuntu Linux)

A caching DNS server that parses a DNS request message, responds to queries for records that the server is responsible for, and recursively contacts another server to resolve queries outside of the local zone file.  

How to run:  
  In one terminal: sudo java dns.DNSServer testZone.zone  
  Testing in second terminal:  
    - dig @localhost test1.csci3363.net  
    - dig @localhost www.google.com  
    - dig @localhost xkcd.com  

Example screenshots:  
  * dig @localhost www.google.com:  
![image](https://user-images.githubusercontent.com/65783403/212160734-8e99d1c5-e437-43f3-a7e8-6fb277260e5e.png)  
![image](https://user-images.githubusercontent.com/65783403/212160855-99265bba-8cc0-4f21-949f-2825db76f131.png)
