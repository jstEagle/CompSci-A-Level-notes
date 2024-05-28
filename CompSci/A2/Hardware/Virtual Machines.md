The emulation of computer system hardware using software
![[Pasted image 20240403094454.png]]

##### Terms:
- Guest OS
- Host OS
- Hypervisor
- Virtual Machine

The host OS is the operating system which the whole virtual machine runs on. The hypervisor is a program on the host OS that essentially creates an environment for the VM to run in, <mark class="hltr-green">it communicates instructions from the host OS to the VM</mark>. The Hypervisor is also called the VM implementation software. On top of the Hypervisor runs the actual virtual machine on which the guest OS runs.

$$ Application$$
$$\downarrow$$
$$Guest\ OS$$
$$\downarrow$$
$$Virtual\ Machine$$
$$\downarrow$$
$$Hypervisor$$
$$\downarrow$$
$$Host\ OS$$
$$\downarrow$$
$$Host\ hardware$$
____
### Benefits
- Can run more than one operating system
- Security - can be used to test programs without affecting the host OS or other applications.
- Server distribution from central machine

### Drawbacks
- Computer system needs very good resources (CPU and RAM)
- Time and effort is taken to set up the VM
- Not all hardware can be emulated

