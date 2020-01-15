package io.kdkr.booklibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class BookLibraryApiApp {
    public static void main(String[] args){
        SpringApplication.run(BookLibraryApiApp.class, args);
    }

    @Scheduled(fixedDelay = 10000)
    public void run()   {
        System.out.println("XXXXXXXXXXXXXXXXX");
    }
}