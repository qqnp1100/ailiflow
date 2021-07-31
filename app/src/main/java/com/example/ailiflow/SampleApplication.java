package com.example.ailiflow;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author xiezhiying
 * @Data 2021-07-31
 * @description
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, SampleApplicationLike.class.getCanonicalName(),
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}