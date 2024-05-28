### Formats of IP addresses
- <mark class="hltr-green">IPv4</mark> - e.g. 192.168.1.178
- <mark class="hltr-blue">IPv6</mark> - e.g. fe80::2ce7:3b0c:5e20:98be

### IPv4 address format
- 4 denary <u>integers</u> separated by dots // 32bit
- Each integer is a value in the range 0 - 255
- Left-most 1-3 integers represent the network ID (__netID__)
- Right-most 1-3 integer represent a device on the network (__hostID__)

##### Classes of IPv4 addresses
![[Pasted image 20230912100548.png]]

### IPv4 address exhaustion
- IPv4 = $2^{32}$ = approx. 4.2 billion unique addresses
- approx. 8 billion people of the planet, half of whom have reliable access to the internet. At most half of those are internet capable

___________
#### Subnet mask
- Tells the router how many bytes are for the __netID__ and how many for the __hostID__
- e.g. 255.255.255.0
- 255 indicated the netID, 0 indicated the __hostID__
______

### Visibility of IP addresses
- Public - broadcast to the internet

> A LAN's router broadcasts a single public IP address to the internet on behalf of all its LAN's devices

