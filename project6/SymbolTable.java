import java.util.Hashtable;

public class SymbolTable {

    private Hashtable<String,Integer> symbolHash;
    private int freeAddress = 16;

    public SymbolTable()
    {
        this.symbolHash = new Hashtable<>();
        this.symbolHash.put("SP", Integer.valueOf(0));
        this.symbolHash.put("LCL", Integer.valueOf(1));
        this.symbolHash.put("ARG", Integer.valueOf(2));
        this.symbolHash.put("THIS", Integer.valueOf(3));
        this.symbolHash.put("THAT", Integer.valueOf(4));
        this.symbolHash.put("R0", Integer.valueOf(0));
        this.symbolHash.put("R1", Integer.valueOf(1));
        this.symbolHash.put("R2", Integer.valueOf(2));
        this.symbolHash.put("R3", Integer.valueOf(3));
        this.symbolHash.put("R4", Integer.valueOf(4));
        this.symbolHash.put("R5", Integer.valueOf(5));
        this.symbolHash.put("R6", Integer.valueOf(6));
        this.symbolHash.put("R7", Integer.valueOf(7));
        this.symbolHash.put("R8", Integer.valueOf(8));
        this.symbolHash.put("R9", Integer.valueOf(9));
        this.symbolHash.put("R10", Integer.valueOf(10));
        this.symbolHash.put("R11", Integer.valueOf(11));
        this.symbolHash.put("R12", Integer.valueOf(12));
        this.symbolHash.put("R13", Integer.valueOf(13));
        this.symbolHash.put("R14", Integer.valueOf(14));
        this.symbolHash.put("R15", Integer.valueOf(15));
        this.symbolHash.put("SCREEN", Integer.valueOf(16384));
        this.symbolHash.put("KBD", Integer.valueOf(24576));
    }


    public void addEntry(String symbol, int address){
        symbolHash.put(symbol, address);

    }

    public boolean contains(String s)
    {
        return symbolHash.containsKey(s);
    }

    public int getAddress (String s)
    {
        return symbolHash.get(s);
    }






}
