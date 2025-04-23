package com.rnmaps.fabric;

import com.facebook.react.bridge.ReactApplicationContext;

/**
 * This class is a wrapper around NativeAirMapsModule that ensures the module
 * is registered with the correct name for TurboModule resolution.
 * 
 * In React Native 0.79, the TurboModule system became more strict about module naming.
 * The JavaScript code expects a module named 'RNMapsAirModule', but the native module
 * was registered with a different name.
 */
public class RNMapsAirModule extends NativeAirMapsModule {
    public static final String NAME = "RNMapsAirModule";

    public RNMapsAirModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
