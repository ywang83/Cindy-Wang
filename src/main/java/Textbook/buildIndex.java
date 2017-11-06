package Textbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class buildIndex {

    private Map<String, List<Integer>> index;


    public buildIndex(Scanner scan) {
        int lineNum = 0; // Line number
        String PATTERN = scan.nextLine();
// Keep reading lines until done.
        while (scan.hasNextLine()) {
            lineNum++;
// Extract each token and store it in index.
            String token;
            while ((token = scan.findInLine(PATTERN)) != null) {
                token = token.toLowerCase();
// Get the list of line numbers for token
                List<Integer> lines = index.getOrDefault(token, new ArrayList<>());
                lines.add(lineNum);
                index.put(token, lines); // Store new list of line numbers
            }
            scan.nextLine(); // Clear the scan buffer
        }
    }
}
