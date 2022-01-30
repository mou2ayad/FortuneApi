package org.printing.fortuneApi.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.printing.fortuneApi.contract.IEpigramProvider;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Service;

import java.util.Random;

//@Service
@Scope("singleton")
public class FileEpigramProvider implements IEpigramProvider {

    private final ArrayList<String> epigrams;

    public FileEpigramProvider() throws IOException {
        epigrams = new ArrayList<>();
        loadEpigramFromFile();
    }
    private void loadEpigramFromFile() throws IOException {
        File file = new ClassPathResource("files/Epigrams.txt").getFile();
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                epigrams.add(line);
            }
        }
	}

    @Override
    public String GetRandomEpigram(){
        Random random = new Random();
        int randomWithNextInt = random.nextInt(epigrams.size());
        return epigrams.get(randomWithNextInt);
    } 

}
