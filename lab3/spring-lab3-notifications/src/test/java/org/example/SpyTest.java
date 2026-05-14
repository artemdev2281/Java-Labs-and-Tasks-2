package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

class SpyTest {

    @Test
    void shouldVerifyAddOnSpyList() {
        List<String> list = spy(new ArrayList<>());

        list.add("item");

        verify(list, times(1)).add("item");
    }
}
