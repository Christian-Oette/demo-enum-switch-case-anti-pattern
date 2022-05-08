package com.christianoette.examples;

import com.christianoette.examples.MapExample;
import com.christianoette.status.StatusEnum;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MapExampleTest {

    @Test
    public void happyCaseTest() {
        // given
        MapExample example = new MapExample();

        // when
        example.useEnum(StatusEnum.ERROR);
        example.useEnum(StatusEnum.SUCCESS);

        // then -> no error expected
    }

    @Test
    public void makeSureAllStatusesAreHandled() {
        Set<StatusEnum> allMappedStatuses = new MapExample().strategies.keySet();
        assertThat(allMappedStatuses).containsAll(Arrays.asList(StatusEnum.values()));
    }
}
