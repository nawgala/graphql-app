package com.rnd.graphql.app.graphqlapp.resolver.scalar;

import graphql.language.StringValue;
import graphql.schema.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class Scalars {

    private static final DateTimeFormatter FORMATER = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); //Thread safe

    @Bean
    public GraphQLScalarType getScalar() {
        return new GraphQLScalarType("DateTime", "DataTime scalar", new Coercing() {
            @Override // convert to scalar type
            public Object serialize(Object input) throws CoercingSerializeException {
                return ((LocalDateTime) input).format(FORMATER);
            }

            @Override // convert to scalar type
            public Object parseValue(Object input) throws CoercingParseValueException {
                return serialize(input);
            }

            @Override // parse to analogous object type
            public Object parseLiteral(Object input) throws CoercingParseLiteralException {
                if (input instanceof StringValue) {

                    return LocalDateTime.parse(((StringValue) input).getValue(), FORMATER);
                } else {
                    return null;
                }
            }
        });

    }
}