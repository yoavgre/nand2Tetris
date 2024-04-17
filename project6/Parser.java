import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Parser {

    Scanner in;
    String currInst;

    public Parser(Scanner in)
    {
        this.in = in;
        currInst ="";
    }

    public boolean hasMoreLines(){
        return in.hasNextLine();
    }


    /**
     * reads the next line, skips empty lines, comment lines
     */
    public void advance()  {
            this.currInst = in.nextLine();
            while(currInst.indexOf('/')!=-1||currInst.trim().isEmpty()) //skips line with a comment
                if(in.hasNextLine())
                    currInst=in.nextLine();
            currInst= currInst.trim(); //skips white spaces
    }

    /**
     * returns the Instruction type
     */
    public InstractionType instractionType(){
        if(currInst.indexOf("@")!=-1)
            return InstractionType.A_command;
        if(currInst.indexOf("(")!=-1)
            return InstractionType.L_command;
        else
            return InstractionType.C_command;
    }


    /**
     * returns symbols without symbols charts
     */
    public String symbol(){
        String s = new String(currInst);
        s= s.replace("(", "");
        s= s.replace(")", "");
        s = s.replace("@", "");
        return s;
    }

    /**
     * returns dest part
     */
    public String dest(){
        if(currInst.indexOf("=")!=-1)
            return currInst.substring(0, currInst.indexOf("="));
        return null;

    }

    /**
     * returns comp part
     */
    public String comp(){
        String s = currInst.trim();
        int eqIndex = s.indexOf("=");
        int jumpIndex = s.indexOf(";");
        if(eqIndex!=-1)
            s=s.substring(eqIndex+1);
        if(jumpIndex!=-1)
            s=s.substring(0,jumpIndex);
        return s;
    }


    /**
     * returns jump part
     */
    public String jump(){
        String s= currInst.trim();
        if(s.indexOf(";")!=-1)
            return s.substring(s.indexOf(";")+1);
        return null;
    }




}
