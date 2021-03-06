package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;

public class WorkHours {

    public String minWork(String file) {
        try {
            List<String> lines = Files.readAllLines(Path.of(file));
            return getMinWorker(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read File!");
        }
    }

    private String getMinWorker(List<String> lines) {
        String minWorker = lines.stream()
                .min(Comparator.comparing(line -> Integer.parseInt(line.split(",")[1])))
                .orElseThrow(()->new IllegalStateException("Worker not found!"));
        String[] parts = minWorker.split(",");
        return String.format("%s: %S", parts[0], parts[2]);
    }
}
