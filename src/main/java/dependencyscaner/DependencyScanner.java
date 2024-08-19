package dependencyscaner;

import java.io.File;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DependencyScanner {

    final static int a = 1;

    void scan() {

    }

    public Set<String> listFilesUsingJavaIO(String dir) {
        return Stream.of(new File(dir).listFiles())
//            .filter(file -> !file.isDirectory())
            .map(File::getName)
            .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        DependencyScanner ds = new DependencyScanner();
        ds.scan();

        String dir = "./";

//        FilenameUtils.

//            File.listFiles();

//        listFiles();

//        String dir = "~/.m2";
//        System.out.println(ds.listFilesUsingJavaIO(dir));
    }
}
