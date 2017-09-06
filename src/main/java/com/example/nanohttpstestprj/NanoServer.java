package com.example.nanohttpstestprj;

import java.io.IOException;
import java.util.Map;

import fi.iki.elonen.NanoHTTPD;

// import org.nanohttpd.NanoHTTPD;
// NOTE: If you're using NanoHTTPD < 3.0.0 the namespace is different,
//       instead of the above import use the following:
// import fi.iki.elonen.NanoHTTPD;

public class NanoServer extends NanoHTTPD {

    public NanoServer() throws IOException {
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nRunning! Point your browsers to http://localhost:8080/ \n");
    }


    @Override
    public Response serve(IHTTPSession session) {
        String msg = "{\"status\": \"OK\"}";
        return  newFixedLengthResponse(Response.Status.OK, "application/json", msg);
    }
}