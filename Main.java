import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.net.URL;
import java.net.URLConnection;
import java.lang.Runtime;

class Main {
  public static void main(String[] args) throws IOException, MalformedURLException {
    System.out.println(Runtime.version().toString());
    Path file = Paths.get("index.js");
    System.out.println(Files.probeContentType(file));
    URL url = file.toUri().toURL();
    URLConnection urlConnection = url.openConnection();
    System.out.println(urlConnection.getContentType());
  }
}
