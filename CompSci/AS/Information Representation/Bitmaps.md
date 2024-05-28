##### Bit Depth
- The number of bits used to store each pixel
- Defines the color depth

##### Color depth
- The total number of colors that could be used to color a single pixel

##### Monochrome image
_Black and white_
- Bit depth: 1
- Color depth $2^1 = 2$

##### 8 bit image / GIF
- 1 byte per pixel
- Color depth: 256 possible colors

______
**QUESTION**
An image has width 2048 and height 512 pixels. It is saved as a 256-color image.

Calculate the file size.
______
##### 24-bit image / JPG
- 1 byte red -> 256 possible shades of red
- 1 byte green
- 1 byte blue
- Color depth: $2^{24} = ~16.8\ million\ possible\ colors$


##### 32-bit image / PNG
- 1 byte red -> 256 possible shades of red
- 1 byte green
- 1 byte blue
- 1 byte alpha channel -> Transparency
- Color depth: $2^{32} = ~4.3\ billion\ possible\ colors$


### How colors are represented in a computer system

##### Hexadecimal
```
#FF0000 = red
#00FF00 = green
#0000FF = blue
#FFFFFF = white
#000000 = black
```
How much red, green and blue are mixed to produce a color.