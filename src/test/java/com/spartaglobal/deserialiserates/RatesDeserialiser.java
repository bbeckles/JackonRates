package com.spartaglobal.deserialiserates;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RatesDeserialiser
{
    public  RatesDTO ratesMapped;

    public RatesDeserialiser (String filelocation){
        ObjectMapper objectMapper = new ObjectMapper();
        try {


            ratesMapped = objectMapper.readValue(new FileReader(filelocation), RatesDTO.class);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
