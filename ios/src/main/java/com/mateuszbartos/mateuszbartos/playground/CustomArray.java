package com.mateuszbartos.mateuszbartos.playground;

import org.moe.natj.general.Pointer;

import apple.foundation.NSArray;
import apple.uikit.UIViewController;

public class CustomArray extends NSArray<UIViewController>
{
    public CustomArray(Pointer peer) {
        super(peer);
    }
}
