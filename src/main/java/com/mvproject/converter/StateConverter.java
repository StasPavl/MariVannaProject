package com.mvproject.converter;

import com.mvproject.enums.State;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StateConverter implements Converter<String, State> {
    @Override
    public State convert(String source) {
        for (State state : State.values()) {
            if (state.name().equalsIgnoreCase(source)) {
                return state;
            }
        }
        throw new IllegalArgumentException("Invalid state value: " + source);
    }
}
