## Internet Protocol (IP)

- **Purpose**: Provides addressing and routing for data packets across networks.
- **Versions**: IPv4 (32-bit addresses) and IPv6 (128-bit addresses).
- **Addressing**:
    - **IPv4**: Uses dotted decimal notation (e.g., 192.168.1.1).
    - **IPv6**: Uses hexadecimal notation (e.g., 2001:0db8:85a3:0000:0000:8a2e:0370:7334).
- **Packet Structure**:
    - **Header**: Contains source and destination IP addresses, protocol version, TTL (Time to Live), etc.
    - **Payload**: Actual data being transmitted.

## Transmission Control Protocol (TCP)

- **Purpose**: Provides reliable, connection-oriented communication between devices.
- **Features**:
    - **Connection Establishment**: Uses a three-way handshake (SYN, SYN-ACK, ACK) to establish a connection.
    - **Reliability**: Ensures data delivery and sequencing through acknowledgments and retransmissions.
    - **Flow Control**: Manages data flow to prevent congestion using window size and acknowledgments.
- **Packet Structure**:
    - **Header**: Contains source and destination port numbers, sequence numbers, acknowledgment numbers, etc.
    - **Payload**: Data from the upper layers (e.g., HTTP, FTP).

## IP vs. TCP Comparison

|Protocol|Purpose|Key Features|Addressing Format|
|---|---|---|---|
|IP|Routing data packets across networks|Addressing, packet forwarding|IPv4 (32-bit), IPv6 (128-bit)|
|TCP|Reliable, connection-oriented data transfer|Connection establishment, reliability, flow control|Uses port numbers|

## Protocol Stack

- **TCP/IP Stack**: Combines IP and TCP along with other protocols like UDP, ICMP, and ARP.
    - **Application Layer**: Includes protocols like HTTP, FTP, SMTP, etc.
    - **Transport Layer**: Handles end-to-end communication (TCP and UDP).
    - **Internet Layer**: Provides addressing and routing (IP).
    - **Link Layer**: Deals with physical network connections.

## Advantages and Usage

- **IP Advantages**: Scalability, flexibility, and compatibility across different networks.
- **TCP Advantages**: Reliable data delivery, error checking, and flow control.
- **Usage**: Fundamental protocols in the Internet Protocol Suite (TCP/IP) used for internet communication.


| Layer          | Purpose                                                             | Notes                                                                                                                                   |
|----------------|----------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------|
| Application    | Provides protocols that application software uses to communicate     | - Provides the user interface needed for end-users to transmit data and requests over a network                                          |
|                | over a network                                                      | - Handles DNS and other protocols like HTTP/S, SMTP, POP3, FTP                                                                          |
|                |                                                                      | - Interprets compressed or encrypted data                                                                                               |
|                |                                                                      | - Uses specific ports for different protocols:                                                                                          |
|                |                                                                      |   - HTTP: port 80                                                                                                                       |
|                |                                                                      |   - HTTPS: port 443                                                                                                                     |
|                |                                                                      |   - SMTP (unencrypted): port 25                                                                                                         |
|                |                                                                      |   - SMTP (encrypted): port 587                                                                                                           |
|                |                                                                      |   - POP3 (unencrypted): port 110                                                                                                         |
|                |                                                                      |   - POP3 (encrypted): port 995                                                                                                           |
|                |                                                                      |   - FTP (connection): port 21                                                                                                            |
|                |                                                                      |   - FTP (data transfer): port 20                                                                                                         |
|                | Protocols: HTTP, HTTPS, SMTP, POP3, FTP                               |                                                                                                                                         |
|                | Software: Web browsers, Email clients, File transfer clients          |                                                                                                                                         |
|                | DNS Servers: Resolves URLs into IP addresses                          |                                                                                                                                         |
| Transport      | Responsible for end-to-end communication between devices              | - Ensures safe delivery of data                                                                                                         |
|                |                                                                      | - Splits data from the application layer into packets                                                                                   |
|                |                                                                      | - Adds packet numbers and error checking (e.g., checksum)                                                                               |
|                |                                                                      | - Adds port numbers to packets (e.g., TCP port numbers)                                                                                 |
|                | Protocols: TCP                                                          |                                                                                                                                         |
|                | Hardware: Operating systems                                           |                                                                                                                                         |
| Internet       | Responsible for routing packets across networks                       | - Determines pathway for data packets to reach destination                                                                               |
|                |                                                                      | - Adds sender's and receiver's IP addresses to packet headers                                                                            |
|                | Protocols: IP                                                           |                                                                                                                                         |
|                | Hardware: Routers                                                      |                                                                                                                                         |
| Data Link      | Responsible for physical transmission of data                          | - Maps IP addresses to physical hardware addresses                                                                                       |
|                |                                                                      | - Synchronizes devices for data packet flow management                                                                                   |
|                |                                                                      | - Identifies network topology                                                                                                           |
|                | Protocols: WiFi (802.11), Ethernet, CSMA/CD                           |                                                                                                                                         |
|                | Hardware: NICs, switches (MAC address table), access points, modems   |                                                                                                                                         |
