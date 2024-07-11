package Compiler;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class FunFactsManager {
    private LinkedHashMap<String, Boolean> funFacts;
    private Random random;
    private int funCounter = 0;

    public FunFactsManager() {
        funFacts = new LinkedHashMap<>();
        random = new Random();
        initializeFunFacts();
    }

    private void initializeFunFacts() {
        funFacts.put("A lexical analyzer, also known as a lexer, is the first phase of a compiler.", false);
        funFacts.put("Lexical analyzers break down source code into tokens.", false);
        funFacts.put("Tokens are the smallest units of meaning in source code.", false);
        funFacts.put("Lexical analyzers use finite automata to recognize tokens.", false);
        funFacts.put("Regular expressions are often used to specify token patterns.", false);
        funFacts.put("A lexer discards whitespace and comments.", false);
        funFacts.put("Lexers help simplify the syntax analysis phase.", false);
        funFacts.put("Errors detected by the lexer are usually related to invalid tokens.", false);
        funFacts.put("Lexical analysis can improve overall compiler performance.", false);
        funFacts.put("Most modern compilers include a lexer generator tool.", false);
    }

    public String getRandomFunFact() {
        List<Map.Entry<String, Boolean>> unprintedFacts = funFacts.entrySet().stream()
                .filter(entry -> !entry.getValue())
                .collect(Collectors.toList());

        if (unprintedFacts.isEmpty()) {
            return null; // All facts have been printed
        }

        int index = random.nextInt(unprintedFacts.size());
        Map.Entry<String, Boolean> selectedFact = unprintedFacts.get(index);
        funFacts.put(selectedFact.getKey(), true); // Mark fact as printed
        return ++funCounter + ") " + selectedFact.getKey();
    }

    public void resetFunFacts() {
        funFacts.replaceAll((key, value) -> false);
    }
}
