import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

// Sample webserver end point on /hello
public class HelloWorld {

    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(new InetSocketAddress(24000), 0);
        server.createContext("/hello", new MyHandler());
        server.setExecutor(null); 
        server.start();
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "hello world from java!!!!";
            t.sendResponseHeaders(200, response.length());
            t.getResponseHeaders().set("Content-Type","text/html");
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

}
