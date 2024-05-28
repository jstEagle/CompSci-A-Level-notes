## Introduction

- **Purpose**: BitTorrent is a peer-to-peer protocol used for sharing large files over the internet.
- **Key Components**: It consists of a tracker, seeders, and leechers.

## Tracker

- **Role**: Manages the connections between peers.
- **Function**: Tracks who has which parts of the file.
- **Communication**: Uses UDP or HTTP to communicate with peers.
- **Info Hash**: Unique identifier for each torrent file.

## Peers

### Seeders

- **Definition**: Users who have the complete file and upload (seed) it to others.
- **Contribution**: Help distribute the file and improve download speeds for leechers.

### Leechers

- **Definition**: Users who are downloading the file.
- **Contribution**: Receive data from seeders and also share what they have downloaded with other leechers.

## File Distribution

- **Piece Selection**: Peers download different parts (pieces) of the file simultaneously.
- **Rarest First**: Prioritizes downloading pieces that are rare among peers to ensure faster distribution.

## Protocol Flow

1. **Torrent Creation**: A torrent file is created with metadata including the tracker URL and info hash.
2. **Tracker Communication**: Peers connect to the tracker to get a list of other peers.
3. **Peer-to-Peer Communication**: Peers exchange data directly with each other, facilitated by the tracker.
4. **Piece Verification**: Data integrity is verified using piece hashes.
5. **Seeding and Leeching**: Peers continuously upload and download pieces until the file is complete.

## Advantages of BitTorrent

- **Efficient Distribution**: Reduces server load and bandwidth usage for file distribution.
- **Resilience**: Can handle high traffic and partial file availability.
- **Faster Downloads**: Utilizes peer upload capacities for faster downloads.

## Limitations

- **Initial Seed**: Requires at least one seeder to start distributing a file effectively.
- **Legal Concerns**: Can be associated with copyright infringement if used for unauthorized file sharing.