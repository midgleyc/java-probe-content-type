import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

class Main {
  public static void main(String[] args) throws IOException {
    Path file = Paths.get("index.js");
    System.out.println(Files.probeContentType(file));
  }
}
