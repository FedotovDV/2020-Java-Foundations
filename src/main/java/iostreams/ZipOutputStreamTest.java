package iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {

    public static void main(String... args) throws IOException {

        String source = "src/main/resources/test.txt";

        File sfile = new File(source);

        String dest = "src/main/resources/test.zip";

        File dfile = new File(dest);

        FileInputStream fis = new FileInputStream(sfile);

        FileOutputStream fos = new FileOutputStream(dfile);

        ZipOutputStream zos = new ZipOutputStream(fos);

        ZipEntry ze = new ZipEntry(source);

        //begins writing a new zip file and sets the position to the start of data
        zos.putNextEntry(ze);

        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) > 0) {
            zos.write(buf, 0, len);
        }
        System.out.println("File created:" + dest);
        fis.close();
        zos.close();
    }
}