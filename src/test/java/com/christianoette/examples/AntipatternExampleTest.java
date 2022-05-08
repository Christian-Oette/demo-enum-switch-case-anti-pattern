package com.christianoette.examples;

import com.christianoette.examples.AntipatternExample;
import com.christianoette.status.StatusEnumNotRefactoringSafe;
import org.junit.jupiter.api.Test;

// This test is going to succeed even when you add new enum values
public class AntipatternExampleTest {

    @Test
    public void happyCaseTest() {
        // given
        AntipatternExample example = new AntipatternExample();

        // when
        example.useEnum(StatusEnumNotRefactoringSafe.ERROR);
        example.useEnum(StatusEnumNotRefactoringSafe.SUCCESS);

        // then -> no error expected
    }
}
