// This file is part of www.nand2tetris.org
// and the book "The Elements of Computing Systems"
// by Nisan and Schocken, MIT Press.
// File name: projects/04/Fill.asm

// Runs an infinite loop that listens to the keyboard input.
// When a key is pressed (any key), the program blackens the screen
// by writing 'black' in every pixel;
// the screen should remain fully black as long as the key is pressed. 
// When no key is pressed, the program clears the screen by writing
// 'white' in every pixel;
// the screen should remain fully clear as long as no key is pressed.


//i=0
//if(no keabord)
//LOOP1
//if(i+screen<1867)
//make this row black
//i++
//loop1

//if(keabord is pressed)
//i=0
//loop2
//if(i+screen<1867)
//make this row white
//i++
//loop2


@i
M=0
(LOOP)
@8191
D=A
@i
D=D-M
@ENDSCREEN
D;JEQ
@24576 // if keabord is preesed
D=M // if keabord is preesed
@LOOP2 // if keabord is preesed
D;JNE//keborad is preesed
@16384
D=A
@i
A=D+M
M=0
@i
M=M+1
@LOOP
0;JMP
(LOOP2)
@16384
D=A
@i
A=D+M
M=-1
@i
M=M+1
@LOOP
0;JMP
(ENDSCREEN)
@i
M=0
@LOOP
0;JMP






