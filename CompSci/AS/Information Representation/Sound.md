## Calculating Sound File Size

To calculate the file size of a sound file, you'll need to know three key pieces of information:

- **Sampling Rate (in Hz):** This represents how many samples (or data points) are recorded per second. Common values include 44100 Hz (CD quality), 48000 Hz (DVD quality), and 96000 Hz (high-resolution audio).
    
- **Bit Resolution (in bits per sample):** This indicates the precision of each sample. Common values include 8 bits (low-quality), 16 bits (CD quality), and 24 bits (high-resolution audio).
    
- **Duration (in seconds):** This is the length of the sound file in seconds.
    

### Formula

The formula to calculate the file size of a sound file is as follows:

`File Size (in bytes) = (Sampling Rate) * (Bit Resolution / 8) * (Duration)`

Let's break it down step by step:

1. Convert the bit resolution to bytes by dividing it by 8 because there are 8 bits in 1 byte.
    
2. Multiply the sampling rate by the bit resolution in bytes.
    
3. Multiply the result from step 2 by the duration of the sound file in seconds.
    

The result will give you the file size in bytes. If you want the file size in kilobytes (KB), megabytes (MB), or gigabytes (GB), you can convert the bytes to the desired unit accordingly:

- 1 kilobyte (KB) = 1024 bytes
- 1 megabyte (MB) = 1024 KB
- 1 gigabyte (GB) = 1024 MB

### Example Calculation

For example:

- Sampling Rate: 44100 Hz
- Bit Resolution: 16 bits (2 bytes)
- Duration: 180 seconds

File Size = (44100) * (2 / 8) * (180) = 13,365,000 bytes

To convert this to megabytes, you can divide by 1024:

File Size (MB) = 13,365,000 bytes / 1024 = 13,059.57 MB

So, the file size of a sound file with a 44100 Hz sampling rate, 16-bit resolution, and a duration of 180 seconds is approximately 13.06 megabytes.