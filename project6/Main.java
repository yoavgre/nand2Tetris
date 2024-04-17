
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
          if (args.length == 0) {
            System.err.println("No source file");
            System.exit(1);
        }
        File sourceFile = new File (args[0]);
        if(sourceFile.isDirectory()) //source is a directory go assemble all files in directory
        {
            File [] files = sourceFile.listFiles();
            for(File file : files)
                assembleFile(file);
        }
        else
            assembleFile(sourceFile);
    }

    public static void assembleFile (File sourceFile)
    {
        if (!sourceFile.exists()) {
            System.err.println("file could not be found.");
            System.exit(2);
        }

        //handling the pathes and name of the new .hack file
        String fileName = sourceFile.getName();
        String fileNameNoAsm = fileName.substring(0, fileName.indexOf("asm"));
        String filePath = sourceFile.getAbsolutePath();
        String outDirPath = filePath.substring(0, filePath.indexOf(fileName));
        String outputPath = outDirPath + fileNameNoAsm + "hack";
        File output = new File(outputPath);
        try {
            output.createNewFile();
            Assembler assembler = new Assembler(sourceFile, output);
            assembler.firstPass();
            assembler.secondPass();
        }
        catch (IOException e)
        {
            System.out.println("can not make the output file");
        }

    }

}

