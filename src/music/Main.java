package music;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: fix me (it should use a relative path to the json file)
        InputStream rawAlbum = new FileInputStream("/Users/irynavaskiv/IdeaProjects/JavaTeam(1)/songs.json");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        TypeFactory typeFactory = TypeFactory.defaultInstance();
        List<Record> album = objectMapper.readValue(rawAlbum, typeFactory.constructCollectionType(ArrayList.class, Record.class));

        album.sort(Comparator.comparing(Record::getSong));

        for (Record c : album) {
            System.out.println(c);
        }
    }
}
