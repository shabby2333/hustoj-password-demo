package cc.shabby.neauacmtrainbackstage.config;

import org.junit.Test;

import static org.junit.Assert.*;

public class HustPasswordEncoderTest {
    HustPasswordEncoder encoder = new HustPasswordEncoder();

    @Test
    public void matches() {
        System.out.println(encoder.matches("neaucs","hguJgbxsY9u0y8eqKiyUaY4gxBxiNjAw"));
        System.out.println(encoder.matches("n36viLzh","xe8t56mUMuJJxNpnr7L14O3J0Y4wZTAx"));
        System.out.println(encoder.matches("RI1NiSlw","tSwMn75tWJC/eCG7RxUo852/NkwyNjhh"));
        System.out.println(encoder.matches("75PXqgjn","Xzg8X8k/x1FuKFv25qx8riWEtKpjNWM1"));
        System.out.println(encoder.matches("777777","MjNkMWVkN2JjZDE4NTAxYjA3ZWEyMmQ4MWJiNTE2NjQyN2JhZjMzNWY0YTI="));
    }
}