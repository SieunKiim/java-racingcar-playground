package stringCalculator;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringParserTest {
    StringParser stringParser;
    @BeforeEach
    void initTest(){
        stringParser = new StringParser();
    }

    @Test
    void 기본_구분자_포함_생성(){
        Set<String> tools = stringParser.getParseTool();
        assertThat(tools.contains(":")).isTrue();
        assertThat(tools.contains(",")).isTrue();
    }

    @Test
    void 커스텀_구분자_추가(){
        stringParser.addParseTool("/");
        Set<String> parseTool = stringParser.getParseTool();
        assertThat(parseTool).contains("/");
    }

    @Test
    void 문자열_파싱_기본_구분자_1(){
        List<Ingredient> parsed = stringParser.doParse("3,25,3,4,1");
        assertThat(parsed.size()).isEqualTo(5);
    }

    @Test
    void 문자열_파싱_기본_구분자_2(){
        List<Ingredient> parsed = stringParser.doParse("3,25:3:4,1");
        assertThat(parsed.size()).isEqualTo(5);
    }

    @Test
    void 문자열_파싱_기본_커스텀_구분자_1(){
        List<Ingredient> parsed = stringParser.doParse("//;\n3;25;3;4;1");
        assertThat(parsed.size()).isEqualTo(5);
    }

    @Test
    void 문자열_파싱_기본_커스텀_구분자_2(){
        List<Ingredient> parsed = stringParser.doParse("//;\n//|\n3,25,3,4,1");
        assertThat(parsed.size()).isEqualTo(5);
    }
}