package hello.itemservice.validation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.validation.DefaultMessageCodesResolver;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.ObjectError;

import static org.assertj.core.api.Assertions.*;

public class MessageCodeResolverTest {

    MessageCodesResolver messageCodesResolver = new DefaultMessageCodesResolver();
    
    @Test
    void messageCodeResolverObject() {
        String[] messageCodes = messageCodesResolver.resolveMessageCodes("required", "item");
        assertThat(messageCodes).containsExactly("required.item", "required");
    }
    
    @Test
    public void messageCodesResolverField() throws Exception {
        String[] messageCodes = messageCodesResolver.resolveMessageCodes("required", "item", "itemName", String.class);
       assertThat(messageCodes).containsExactly(
               "required.item.itemName",
               "required.itemName",
               "required.java.lang.String",
               "required");
    }
}
