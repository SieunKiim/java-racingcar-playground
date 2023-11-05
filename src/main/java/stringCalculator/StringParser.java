package stringCalculator;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.RegularExpression;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringParser {
    private final Set<String> tools;

    public StringParser() {
        tools = new HashSet<>();
        tools.add(":");
        tools.add(",");
    }

    public Set<String> getParseTool() {
        return tools;
    }

    public void addParseTool(String newTool) {
        this.tools.add(newTool);
    }

    public List<Ingredient> doParse(String s) {
        addCustomParser(s);
        Pattern pattern = Pattern.compile("((//.+\\n)*)(.*)");
        Matcher matcher = pattern.matcher(s);
        String group = "";
        if (matcher.find()) {
            group = matcher.group(3);
        }
        String[] split = group.split(String.join("|", tools));
        return Arrays.stream(split).map(Ingredient::new).collect(Collectors.toList());
    }

    private void addCustomParser(String s) {
        if (!isValidLength(s) && isContainsParser(s)) {
            throw new RuntimeException("Incorrect parse format!");
        }
        Pattern pattern = Pattern.compile("(//)(.+)(\\n)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            tools.add(matcher.group(2));
        }
    }

    private boolean isValidLength(String s) {
        return s.length() >= 2;
    }

    private boolean isContainsParser(String s) {
        String regEx = "^//.+\n(.)*";
        return s.matches(regEx);
    }
}
