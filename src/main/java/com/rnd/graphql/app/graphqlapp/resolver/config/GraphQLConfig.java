package com.rnd.graphql.app.graphqlapp.resolver.config;

import com.rnd.graphql.app.graphqlapp.domain.emplyee.Employee;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.Manager;
import com.rnd.graphql.app.graphqlapp.domain.emplyee.SE;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.Car;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.Van;
import com.rnd.graphql.app.graphqlapp.domain.vehicle.Vehicle;
import graphql.kickstart.tools.SchemaParserDictionary;
import graphql.language.StringValue;
import graphql.schema.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Configuration
public class GraphQLConfig {

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

    @Bean
    public SchemaParserDictionary getDictionary() {
        return new SchemaParserDictionary()
                .add(Car.class)
                .add(Van.class)
                .add(Vehicle.class)

                .add(Manager.class)
                .add(Employee.class)
                .add(SE.class)

                ;
    }
}