# NAND to Tetris Project

Welcome to my **NAND to Tetris** project! This repository documents my journey through the NAND to Tetris curriculum, where I designed a computer from the ground up. Starting with basic hardware components, I gradually built a functional CPU and later developed a compiler in Java.

---

## Overview
This project is part of my exploration into computer science fundamentals, aiming to understand how computers work at every level. The journey involved creating a computer from simple NAND gates and implementing the software stack required to run high-level programs.

---

## Project Structure

### 1. **Hardware**
- **Description:** The hardware layer was built using a Hardware Description Language (HDL) provided by the NAND to Tetris course. I started with elementary components (like AND, OR, and NOT gates) and progressed to more complex elements like ALUs and registers.
- **Key Components:**
  - Basic Logic Gates (AND, OR, NOT, XOR)
  - Multiplexers and Demultiplexers
  - Arithmetic Logic Unit (ALU)
  - Registers and Memory Units
  - Full CPU Implementation

### 2. **CPU Design**
- **Description:** The CPU integrates the ALU, control logic, and registers to execute instructions. It was designed to run a custom assembly language defined in the course.
- **Key Features:**
  - Instruction Set Architecture (ISA)
  - Program Counter (PC)
  - Control Logic for handling branching and arithmetic operations

### 3. **Compiler**
- **Description:** Moving into the software layer, I developed a compiler in Java. The compiler translates a high-level language into assembly code compatible with the hardware I built.
- **Key Features:**
  - Lexical Analysis
  - Parsing
  - Code Generation
  - Error Handling

---

## Key Achievements
- **End-to-End System:** Built a fully functional computer from NAND gates to a compiler.
- **Understanding:** Gained a deep understanding of how hardware and software interact to form the foundation of modern computing.
- **Java Implementation:** Designed and implemented a compiler in Java, reinforcing my programming and problem-solving skills.

---

## How to Use

### Prerequisites
- Install the NAND to Tetris software suite (available [here](https://www.nand2tetris.org/software)).
- Ensure Java is installed on your system.

### Running the Hardware Simulations
1. Open the Hardware Simulator provided by NAND to Tetris.
2. Load the HDL files from the `hardware` folder.
3. Test each component using the included test scripts.

### Using the Compiler
1. Compile the Java code in the `compiler` directory using:
   ```bash
   javac Compiler.java
   ```
2. Run the compiler with:
   ```bash
   java Compiler <source_file>
   ```
3. The output will be an assembly file compatible with the CPU.

---

## Lessons Learned
This project has been an incredible learning experience. Building a computer from the ground up has given me:
- A profound appreciation for the layers of abstraction in modern computing.
- Insights into the challenges and trade-offs involved in hardware and software design.
- Practical experience with HDL and Java programming.

---

## Future Work
- Enhance the compiler to support additional features and optimizations.
- Build a virtual machine to bridge the gap between the high-level language and assembly.
- Explore integrating the project with modern tools or expanding its functionality.

---

## Resources
- [NAND to Tetris Course Website](https://www.nand2tetris.org/)
- [NAND to Tetris Book](https://www.nand2tetris.org/book)

---

## Acknowledgments
Special thanks to the creators of NAND to Tetris for providing such an engaging and educational curriculum. Their work has inspired countless learners to delve deeper into computer science.

---

## Contact
Feel free to reach out if you have questions or suggestions! You can open an issue or contact me directly through GitHub.

