Works like a queue in real life.

### FIFO 
First in first out.

### How it works
A queue uses 2 pointers, one for the <mark class="hltr-yellow">head</mark> of the queue and one for the <mark class="hltr-cyan">tail</mark>.

There are two operations that can be performed on a queue.
- Enqueue - <mark class="hltr-green">add</mark> <mark class="hltr-cyan">(tail)</mark>
- Dequeue - <mark class="hltr-red">remove</mark> <mark class="hltr-yellow">(head)</mark>

**2 types**
1) Linear queue
2) Circular queue

##### Linear queue
- Fixed size (array)
- items in the queue are copied up the queue when each head of the queue is processed.

| 0    | 1     | 2     | 3     | 4        |
| ---- | ----- | ----- | ----- | -------- |
| <mark class="hltr-yellow">Job2</mark> | Job 3 | Job 4 | <mark class="hltr-cyan">Job 5</mark> | ~~Job5~~ | 

The head (job 2) is still in memory but not accessible


##### Circular queue

| 0     | 1     | 2     | 3     | 4     |
| ----- | ----- | ----- | ----- | ----- |
| <mark class="hltr-cyan">Job 6</mark> | <mark class="hltr-yellow">Job 2 </mark>| Job 3 | Job 4 | Job 5 | 

The queue wraps around the array. 

