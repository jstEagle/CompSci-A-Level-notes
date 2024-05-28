## SMTP (Simple Mail Transfer Protocol)

- **Purpose**: Responsible for sending emails between servers.
- **Port**: Usually uses port 25 or 587 for submission.
- **Communication**: Uses a client-server model.
    - Client (Mail User Agent) sends email to the server (Mail Transfer Agent).
- **Process**:
    1. Establishes a TCP connection.
    2. Sends the email using commands like EHLO, MAIL FROM, RCPT TO, DATA, etc.
    3. Closes the connection after the email is sent.

## POP3 (Post Office Protocol version 3)

- **Purpose**: Retrieves emails from a server to a client's device.
- **Port**: Typically uses port 110.
- **Communication**: Based on a client-server model.
    - Client (email client) downloads emails from the server to the local device.
- **Process**:
    1. Client connects to the server and logs in using username and password.
    2. Downloads emails from the server to the client's device.
    3. Optionally deletes emails from the server based on client settings.

## IMAP (Internet Message Access Protocol)

- **Purpose**: Allows users to access and manage emails stored on a server.
- **Port**: Commonly uses port 143 or 993 for SSL/TLS encryption.
- **Communication**: Client-server model with more features than POP3.
    - Supports syncing emails across multiple devices.
- **Process**:
    1. Client connects to the server and authenticates.
    2. Accesses and manages emails directly on the server without downloading.
    3. Supports creating, deleting, moving, and organizing emails on the server.

## Comparison Table

|Protocol|Purpose|Port(s)|Communication Model|Key Features|
|---|---|---|---|---|
|SMTP|Sending emails between servers|25, 587|Client-server|Message delivery, server-to-server communication|
|POP3|Retrieving emails to local devices|110|Client-server|Download emails, limited server interaction|
|IMAP|Accessing and managing server emails|143, 993|Client-server|Syncing, server-side operations, multiple devices|
