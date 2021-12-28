package com.octavi.android.systemui;

import android.content.Context;

import com.octavi.android.systemui.dagger.DaggerGlobalRootComponentOctavi;
import com.octavi.android.systemui.dagger.GlobalRootComponentOctavi;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIOctaviFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentOctavi.builder()
                .context(context)
                .build();
    }
}
