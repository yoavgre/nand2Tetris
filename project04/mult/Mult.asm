// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Mult.asm

// Multiplies R0 and R1 and stores the result in R2.
// Assumes that R0 >= 0, R1 >= 0, and R0 * R1 < 32768.
// (R0, R1, R2 refer to RAM[0], RAM[1], and RAM[2], respectively.)
 
//sum=0
//R2=0
//i=Ram[0];
//LOOP
//  if(i>0) go to stop 
//     R2=R2+R1
//     i=i-1
//     go to loop
//     END
//  

 
@R2
M=0//initialize R2 to 0
@R0
D=M
@i
M=D //initialize i to R0
@sum
M=0
(LOOP)
    @i
    D=M
    @STOP
    D;JEQ
    @sum
    D=M
    @R1
    D=D+M
    @sum
    M=D
    @i
    M=M-1
    @LOOP
    0;JMP
(STOP)
@sum
D=M
@R2
M=D
(END)
    @END
    0;JMP




