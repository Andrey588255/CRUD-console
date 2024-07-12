package org.example.repository;

import org.example.repository.jdbc.LabelRepositoryJdbc;
import org.example.repository.jdbc.PostRepositoryJdbc;
import org.example.repository.jdbc.WriterRepositoryJdbc;

import java.nio.file.Files;
import java.nio.file.Paths;

public class RepositoryFactory {
    private static WriterRepository writerRepository;
    public static PostRepository postRepository;
    public static LabelRepository labelRepository;

   static {

        if (Files.exists(Paths.get("src/main/resources/jdbc.properties"))) {
            writerRepository = new WriterRepositoryJdbc();
            postRepository = new PostRepositoryJdbc();
            labelRepository = new LabelRepositoryJdbc();
        }
    }

    public static WriterRepository getWriterRepository(){
        return writerRepository;
    }

    public static PostRepository getPostRepository(){
        return postRepository;
    }

    public static LabelRepository getlabelRepository(){
        return labelRepository;
    }
}
