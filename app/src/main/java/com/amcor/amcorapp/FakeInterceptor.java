package com.amcor.amcorapp;

import java.io.IOException;
import java.net.URI;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Created by johel on 4/08/2017.
 * te acuerdas en que parte invocas al api
 */

public class FakeInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {

        Response response = null;

            String responseString = "{\n" +
                    "  \"usuario\": {\n" +
                    "    \"cliente\": {\n" +
                    "      \"codCliente\": \"1\",\n" +
                    "      \"correo\": \"luis.huapaya1389@gmail.com\",\n" +
                    "      \"nombreCliente\": \"LUIS  HUAPAYA\"\n" +
                    "    },\n" +
                    "    \"codUsuario\": \"LHUAPAYA\",\n" +
                    "    \"modulos\": [\n" +
                    "      {\n" +
                    "        \"codModulo\": \"APRPED\",\n" +
                    "        \"nombreModulo\": \"Aprobaci\\u00f3n Pedido\",\n" +
                    "        \"opciones\": [\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"SPR\",\n" +
                    "            \"codPerfil\": \"CL\",\n" +
                    "            \"estadoOpcion\": \"orderRequest\",\n" +
                    "            \"nombreOpcion\": \"Solicitar Pedido Repetido\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"CTP\",\n" +
                    "            \"codPerfil\": \"CL\",\n" +
                    "            \"estadoOpcion\": \"queryTracking\",\n" +
                    "            \"nombreOpcion\": \"Consultar Tracking de Pedido\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"BV\",\n" +
                    "            \"codPerfil\": \"VP\",\n" +
                    "            \"estadoOpcion\": \"valuePlussTray\",\n" +
                    "            \"nombreOpcion\": \"Bandeja Value Plus\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"MMP\",\n" +
                    "            \"codPerfil\": \"VP\",\n" +
                    "            \"estadoOpcion\": \"matrixMaintenance\",\n" +
                    "            \"nombreOpcion\": \"Mantenimiento Matriz Precio\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"BC\",\n" +
                    "            \"codPerfil\": \"GC\",\n" +
                    "            \"estadoOpcion\": \"commercialTray\",\n" +
                    "            \"nombreOpcion\": \"Bandeja Comercial\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"RPR\",\n" +
                    "            \"codPerfil\": \"EC\",\n" +
                    "            \"estadoOpcion\": \"createOrder\",\n" +
                    "            \"nombreOpcion\": \"Registrar Pedidos Repetidos\"\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"codModulo\": \"SEGPROD\",\n" +
                    "        \"nombreModulo\": \"Seguimiento Producto\",\n" +
                    "        \"opciones\": [\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"CHP\",\n" +
                    "            \"codPerfil\": \"CL\",\n" +
                    "            \"estadoOpcion\": \"historicaQuery\",\n" +
                    "            \"nombreOpcion\": \"Consultar Historico de Pedido\"\n" +
                    "          },\n" +
                    "          {\n" +
                    "            \"codOpcion\": \"CPR\",\n" +
                    "            \"codPerfil\": \"EC\",\n" +
                    "            \"estadoOpcion\": \"queryOrder\",\n" +
                    "            \"nombreOpcion\": \"Consultar Pedidos Repetidos\"\n" +
                    "          }\n" +
                    "        ]\n" +
                    "      }\n" +
                    "    ],\n" +
                    "    \"nombresUsuario\": \"Luis Huapaya\",\n" +
                    "    \"productos\": [\n" +
                    "      {\n" +
                    "        \"codProducto\": \"1\",\n" +
                    "        \"nombreProducto\": \"PRODUCTO 1\",\n" +
                    "        \"unidad\": \"KG\",\n" +
                    "        \"version\": \"v01\"\n" +
                    "      },\n" +
                    "      {\n" +
                    "        \"codProducto\": \"2\",\n" +
                    "        \"nombreProducto\": \"producto 2\",\n" +
                    "        \"unidad\": \"kg\",\n" +
                    "        \"version\": \"v02\"\n" +
                    "      }\n" +
                    "    ]\n" +
                    "  },\n" +
                    "  \"token\": \"12345543\"\n" +
                    "}";
            // Get Request URI.


            response = new Response.Builder()
                    .code(200)
                    .message(responseString)
                    .request(chain.request())
                    .protocol(Protocol.HTTP_1_0)
                    .body(ResponseBody.create(MediaType.parse("application/json"), responseString.getBytes()))
                    .addHeader("content-type", "application/json")
                    .build();


        return response;

    }
}
