# DNS Server (Ubuntu Linux)

A caching DNS server that parses a DNS request message, responds to queries for records that the server is responsible for, and recursively contacts another server to resolve queries outside of the local zone file.  

How to run:  
  In one terminal: sudo java dns.DNSServer testZone.zone  
  Testing in second terminal:  
    - dig @localhost test1.testZone.net  
    - dig @localhost www.google.com  
    - dig @localhost xkcd.com  
