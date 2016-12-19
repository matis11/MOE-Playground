package com.mateuszbartos.mateuszbartos.playground.ui;

import com.mateuszbartos.mateuszbartos.playground.CustomArray;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.RegisterOnStartup;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;

import apple.foundation.NSArray;
import apple.foundation.NSMutableArray;
import apple.uikit.UIViewController;

@org.moe.natj.general.ann.Runtime(ObjCRuntime.class)
@ObjCClassName("FirstViewController")
@RegisterOnStartup
public class FirstViewController extends UIViewController {

    private final Pointer pointer;

    protected FirstViewController(Pointer peer) {
        super(peer);
        pointer = peer;
    }

    @Override
    public void viewDidLoad() {
        super.viewDidLoad();

        CustomArray customArray = new CustomArray(pointer);

//        customArray.add(new SecondViewController(null));
//        customArray.add(new SecondViewController(pointer));
//        customArray.add(new SecondViewController(pointer));

        this.tabBarController().setViewControllers(customArray);
    }

    @Owned
    @Selector("alloc")
    public static native FirstViewController alloc();

    @Selector("init")
    public native FirstViewController init();
}
