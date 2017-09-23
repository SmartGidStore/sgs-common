package com.sgs.common.utils;

import com.sgs.common.model.base.model.BaseResponse;
import org.junit.jupiter.api.Test;

import static com.sgs.common.utils.SgsCommonUtils.isEmpty;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SgsCommonUtilsTest {

    @Test
    public void testIsEmpty(){
        assertEquals(false, isEmpty(new BaseResponse("Not empty")));
        assertEquals(true, isEmpty(new BaseResponse()));
        assertEquals(true, isEmpty(null));
    }

}
