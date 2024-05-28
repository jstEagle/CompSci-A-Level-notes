#### Interrupt:
- Electronic signal
- From hardware or software
- requests the CPU's attention

Fetch $\rightarrow$ Decode $\rightarrow$ Execute $\rightarrow$ <mark class="hltr-blue">Interrupt?</mark> $\rightarrow$ Fetch ….

#### <u>Interrupt Queue</u>
- Keyboard: Key strokes
- Mouse: new co-ordinates
- Monitor: Display Update
- HDD/SSD: Read / Write operation complete
- Laptop Battery: Low charge

Software crash: 
- Divide by zero
- Accessing reserved memory (RAM)
- Blue screen : Kernel
- Acknowledgement of completed operation: Like applying a filter in photoshop

#### Common question
Describe how interrupts are serviced.
_How are the interrupts handled. What happens when an interrupt arrives._

Answer: 
1) <mark class="hltr-red">The CPU Continues on its current fetch-execute cycle</mark>
2) <mark class="hltr-green">The CPU checks interrupt queue at end of cycle</mark>
3) <mark class="hltr-green">If interrupt.... CPU Compares priority of interrupt with priority of current task</mark>
4) <mark class="hltr-green">If interrupt has a higher priority... Data in registers is moved to the 'Stack'</mark>
5) <mark class="hltr-green">The OS loads the correct 'interrupt service routine' (ISR) into CPU - Instructions on how to deal </mark><mark class="hltr-green">with the interrupt.</mark>
6) <mark class="hltr-green">ISR Complete... Data in the stack is returned to CPU register -> execution of 'current task'/interrupt is resumed</mark>

<mark class="hltr-green">Answers question</mark>
<mark class="hltr-red">Describe what happens when an interrupt occurs</mark>


