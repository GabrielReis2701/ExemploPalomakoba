package com.example.primeiroprograma.service;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void,Void,Dolar> {
    Date hoje = new Date();
    @Override
    protected Dolar doInBackground(Void... voids) {
        StringBuilder resposta = new StringBuilder();

        try {
         URL url = new URL("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao="+hoje+ "$top=100&$format=json&$select=cotacaoCompra,cotacaoVenda,dataHoraCotacao");
         HttpURLConnection connection = (HttpURLConnection) url.openConnection();
         connection.setRequestMethod("GET");
         connection.setRequestProperty("Accept","application/json");
         connection.setConnectTimeout(5000);
         connection.connect();

         Scanner scanner = new Scanner(url.openStream());
         while (scanner.hasNext()){
             resposta.append(scanner.next());
         }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Gson().fromJson(resposta.toString(),Dolar.class);
    }
}
