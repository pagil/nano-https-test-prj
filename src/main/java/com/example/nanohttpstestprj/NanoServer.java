package com.example.nanohttpstestprj;

import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;

public class NanoServer extends NanoHTTPD {

    public NanoServer() throws IOException {
        super(8080);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nRunning! Point your browsers to http://localhost:8080/ \n");
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "{\"status\": \"OK\"}";
        return newFixedLengthResponse(Response.Status.OK, "application/json", msg);
    }
}