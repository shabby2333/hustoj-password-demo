package cc.shabby.neauacmtrainbackstage.Util;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;

public class HustPasswordUtilTest {
    @Test
    public void pwCheck() {
            System.out.println(HustPasswordUtil.pwCheck("neaucs","hguJgbxsY9u0y8eqKiyUaY4gxBxiNjAw"));
            System.out.println(HustPasswordUtil.pwCheck("n36viLzh","xe8t56mUMuJJxNpnr7L14O3J0Y4wZTAx"));
            System.out.println(HustPasswordUtil.pwCheck("RI1NiSlw","tSwMn75tWJC/eCG7RxUo852/NkwyNjhh"));
            System.out.println(HustPasswordUtil.pwCheck("75PXqgjn","Xzg8X8k/x1FuKFv25qx8riWEtKpjNWM1"));
            System.out.println(HustPasswordUtil.pwCheck("777777","MjNkMWVkN2JjZDE4NTAxYjA3ZWEyMmQ4MWJiNTE2NjQyN2JhZjMzNWY0YTI="));

    }
}