# DNS Server (Ubuntu Linux)

A caching DNS server that parses a DNS request message, responds to queries for records that the server is responsible for, and recursively contacts another server to resolve queries outside of the local zone file.  

How to run:  
  In one terminal: sudo java dns.DNSServer testZone.zone  
  Testing in second terminal:  
    - dig @localhost test1.testZone.net  
    - dig @localhost www.google.com  
    - dig @localhost xkcd.com  

Example screenshots: dig @localhost www.google.com  
  * Terminal 1:  
![image](https://user-images.githubusercontent.com/65783403/212161447-9d9a3b0f-b3cd-4b00-9636-1a1e1c478896.png)  
  * Terminal 2:  
![image](https://user-images.githubusercontent.com/65783403/212161679-2fc6ba3e-9638-4aa2-9152-7d44450492bc.png)
