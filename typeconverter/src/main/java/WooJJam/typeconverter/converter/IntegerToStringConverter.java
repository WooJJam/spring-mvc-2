package WooJJam.typeconverter.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

/**
 * Source Type : Integer
 * Target Type : String
 * Source -> Type
 */
@Slf4j
public class IntegerToStringConverter implements Converter<Integer, String> {
    @Override
    public String convert(Integer source) {
        log.info("convert source = {}", source);
        return String.valueOf(source);
    }
}
