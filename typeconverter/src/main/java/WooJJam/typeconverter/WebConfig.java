package WooJJam.typeconverter;

import WooJJam.typeconverter.converter.IntegerToStringConverter;
import WooJJam.typeconverter.converter.IpPortToStringConverter;
import WooJJam.typeconverter.converter.StringToIntegerConverter;
import WooJJam.typeconverter.converter.StringToIpPortConverter;
import WooJJam.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
//        registry.addConverter(new StringToIntegerConverter());
//        registry.addConverter(new IntegerToStringConverter());
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new IpPortToStringConverter());

        registry.addFormatter(new MyNumberFormatter());
    }
}
