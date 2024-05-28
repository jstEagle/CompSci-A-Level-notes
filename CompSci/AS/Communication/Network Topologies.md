Topology - physical and/or logical (flow of data) organization of a network

#### Bus - Central cable, terminators, CSMA/CD
#### Star - central device (switch or hub)
#### Mesh - all devices (nodes) are connected to all other nodes
#### Hybrid - when two or more topologies are present the network becomes a hybrid network

![[Pasted image 20230908091316.png]]
# Network Topologies in Computer Networking

Network topologies play a crucial role in computer networking, defining the physical and logical layout of interconnected devices. Understanding different network topologies is fundamental for designing, configuring, and maintaining efficient computer networks. This page of notes provides an overview of network topologies, their types, characteristics, and applications in the field of computer networking.

## Table of Contents
- [Introduction](#introduction)
- [Types of Network Topologies](#types-of-network-topologies)
  - [Bus Topology](#bus-topology)
  - [Star Topology](#star-topology)
  - [Ring Topology](#ring-topology)
  - [Mesh Topology](#mesh-topology)
  - [Hybrid Topology](#hybrid-topology)
- [Characteristics of Network Topologies](#characteristics-of-network-topologies)
  - [Reliability](#reliability)
  - [Scalability](#scalability)
  - [Performance](#performance)
  - [Fault Tolerance](#fault-tolerance)
- [Applications in Computer Networking](#applications-in-computer-networking)
  - [Local Area Networks (LANs)](#local-area-networks-lans)
  - [Wide Area Networks (WANs)](#wide-area-networks-wans)
  - [Data Centers](#data-centers)
  - [Internet Service Providers (ISPs)](#internet-service-providers-isps)
- [Conclusion](#conclusion)

## Introduction

Network topologies define the physical and logical arrangement of devices, links, and nodes within a computer network. These topologies determine how data flows between devices and influence factors like performance, reliability, and fault tolerance.

## Types of Network Topologies

### Bus Topology

- **Bus Topology**:
  - All devices share a single communication line or "bus."
  - Simple and cost-effective.
  - Prone to collisions and limited scalability.

### Star Topology

- **Star Topology**:
  - All devices connect to a central hub or switch.
  - Centralized and easy to manage.
  - Failure of the central hub can disrupt the entire network.

### Ring Topology

- **Ring Topology**:
  - Devices are connected in a closed loop.
  - Data travels in one direction around the ring.
  - Resilient but can be affected by a single point of failure.

### Mesh Topology

- **Mesh Topology**:
  - Every device is connected to every other device.
  - High redundancy and fault tolerance.
  - Complex and costly to implement.

### Hybrid Topology

- **Hybrid Topology**:
  - Combines two or more different topologies.
  - Offers flexibility and customization.
  - Requires careful planning and management.

## Characteristics of Network Topologies

### Reliability

- **Reliability**:
  - The topology's ability to maintain network connectivity even in the presence of faults or failures.
  - Mesh and ring topologies tend to be more reliable due to redundancy.

### Scalability

- **Scalability**:
  - The network's ability to expand and accommodate additional devices or nodes.
  - Star topologies are often more scalable than bus topologies.

### Performance

- **Performance**:
  - The topology's impact on data transfer speed and latency.
  - Mesh topologies can offer high performance but may be overkill for smaller networks.

### Fault Tolerance

- **Fault Tolerance**:
  - The network's ability to continue functioning in the presence of hardware or connection failures.
  - Mesh and ring topologies tend to be more fault-tolerant.

## Applications in Computer Networking

### Local Area Networks (LANs)

- **Local Area Networks (LANs)**:
  - Commonly use star or bus topologies for small to medium-sized networks within an organization.

### Wide Area Networks (WANs)

- **Wide Area Networks (WANs)**:
  - Often employ hybrid topologies to connect geographically dispersed locations.

### Data Centers

- **Data Centers**:
  - Use mesh topologies to ensure high availability and performance for critical services.

### Internet Service Providers (ISPs)

- **Internet Service Providers (ISPs)**:
  - Employ complex hybrid and mesh topologies to provide connectivity to a large number of customers.

## Conclusion

Network topologies are the foundation of computer networking, influencing how data is transmitted, shared, and managed across devices and networks. Understanding the characteristics and applications of different topologies is crucial for network administrators, designers, and engineers in optimizing network performance, reliability, and scalability. The choice of topology depends on specific requirements, such as the size and purpose of the network, budget constraints, and fault tolerance needs.