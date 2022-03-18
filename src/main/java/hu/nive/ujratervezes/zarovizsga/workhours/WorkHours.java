package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class WorkHours {

    public String minWork(String file) {
        try {
            String minWorker = Files.readAllLines(Path.of(file)).stream().min(Comparator.comparing(line -> line.split(",")[1])).orElseThrow(()->new IllegalStateException("Worker not found!"));
            String[] parts = minWorker.split(",");
            return String.format("%s: %S", parts[0], parts[2]);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read File!");
        }
    }
}
