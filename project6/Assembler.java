import java.io.*;
import java.util.Scanner;

public class Assembler {
        private final int DATA_STARTING_ADDRESS =16;
        private File source;
        private File target;
    private Code code ;
    private SymbolTable st ;

    public Assembler(File source, File target)
    {
        this.source=source;
        this.target=target;
        code=new Code();
        st = new SymbolTable();
    }

    /**
     * run throw the "first pass" algorithm description.
     * go over the lines and saves only L_commands to the Symbol table
     */

    public void firstPass() throws IOException
    {
        Parser p1 = new Parser(new Scanner(source));
        int lineIndex = 0;
        while(p1.hasMoreLines())
        {
            p1.advance();
            if(p1.instractionType()==InstractionType.L_command)
            {
                st.addEntry(p1.symbol(), lineIndex);
            }
            else
                lineIndex++;
        }
    }


    /**
     * run throw the "second pass" algorithm description.
     * go over the lines, in each line creates a 16dig binary string according to the command_type
     */
    public void secondPass () throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.target));//writer to write into the output hack file
        Scanner sourceScanner = new Scanner(source); //scanner to read the source file
        Parser p2 = new Parser(sourceScanner); // parser to go throw the file using parser class
        int freeSymbolIndex = DATA_STARTING_ADDRESS ;
        StringBuilder currLine = new StringBuilder(); //gets the current line binary string
        while(p2.hasMoreLines())
        {
            p2.advance();
            if(p2.instractionType()==InstractionType.A_command) //handling A_command
            {
                int xxx;
                String symbol = p2.symbol();
                if(symbol.matches("\\d+"))//A_command with number not a symbol
                {
                   xxx = Integer.parseInt(symbol);

                } else if (st.contains(symbol)) { //A_command with a symbol that already exist
                    xxx = st.getAddress(symbol);

                }
                else { //A_command with a new symbol
                    st.addEntry(symbol, freeSymbolIndex); // adds the new symbol with the next available index
                    freeSymbolIndex++;
                    xxx = st.getAddress(symbol);
                }
                currLine.append(intToBinary(xxx));
            }

            else if (p2.instractionType()==InstractionType.C_command) { //handling C_commands
                String comp = code.comp(p2.comp());
                String dest = code.dest(p2.dest());
                String jump = code.jump(p2.jump());
                currLine.append("111"+ comp+ dest+ jump);
            }
            if(!currLine.isEmpty()) {
                writer.write(currLine.toString()); // writes the current 16bit finalize line to the jack file
                writer.newLine();
                currLine.delete(0, currLine.length());
            }

        }

        sourceScanner.close();
        writer.close();

    }

    /**
     * @return 16 digit binary number of the int received as a string.
     */
    public static String intToBinary(int num) {

        return String.format("%16s", Integer.toBinaryString(num)).replace(' ', '0');
    }


}
