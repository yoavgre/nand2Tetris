import java.util.Hashtable;

public class Code {

    private final Hashtable<String,String> destTable = new Hashtable<>();
    private final Hashtable<String,String> compTable = new Hashtable<>();
    private final Hashtable<String,String> jumpTable = new Hashtable<>();
    /**
     * initialize the 3 tables according to the tables of converting
     */

    public Code()
    {
        this.jumpTable.put("NULL", "000");
        this.jumpTable.put("JGT", "001");
        this.jumpTable.put("JEQ", "010");
        this.jumpTable.put("JGE", "011");
        this.jumpTable.put("JLT", "100");
        this.jumpTable.put("JNE", "101");
        this.jumpTable.put("JLE", "110");
        this.jumpTable.put("JMP", "111");
        this.compTable.put("0", "0101010");
        this.compTable.put("1", "0111111");
        this.compTable.put("-1", "0111010");
        this.compTable.put("D", "0001100");
        this.compTable.put("A", "0110000");
        this.compTable.put("M", "1110000");
        this.compTable.put("!D", "0001101");
        this.compTable.put("!A", "0110001");
        this.compTable.put("!M", "1110001");
        this.compTable.put("-D", "0001111");
        this.compTable.put("-A", "0110011");
        this.compTable.put("-M", "1110011");
        this.compTable.put("D+1", "0011111");
        this.compTable.put("A+1", "0110111");
        this.compTable.put("M+1", "1110111");
        this.compTable.put("D-1", "0001110");
        this.compTable.put("A-1", "0110010");
        this.compTable.put("M-1", "1110010");
        this.compTable.put("D+A", "0000010");
        this.compTable.put("D+M", "1000010");
        this.compTable.put("D-A", "0010011");
        this.compTable.put("D-M", "1010011");
        this.compTable.put("A-D", "0000111");
        this.compTable.put("M-D", "1000111");
        this.compTable.put("D&A", "0000000");
        this.compTable.put("D&M", "1000000");
        this.compTable.put("D|A", "0010101");
        this.compTable.put("D|M", "1010101");
        this.destTable.put("NULL", "000");
        this.destTable.put("M", "001");
        this.destTable.put("D", "010");
        this.destTable.put("MD", "011");
        this.destTable.put("DM", "011");
        this.destTable.put("A", "100");
        this.destTable.put("AM", "101");
        this.destTable.put("AD", "110");
        this.destTable.put("AMD", "111");
        this.destTable.put("ADM", "111");

    }

    public String dest(String s){
        if(s==null)
            return "000";
        return destTable.get(s);
    }

    public String comp(String s)
    {
        if(s==null)
            return "0000000";
        return compTable.get(s);
    }

    public String jump(String s)
    {
        if(s==null)
            return "000";
        return jumpTable.get(s);
    }
}
