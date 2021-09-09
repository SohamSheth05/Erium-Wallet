package io.horizontalsystems.bankwallet.modules.send.submodules.fee;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u0082\u0001\u0002\u000b\f\u00a8\u0006\r"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "", "()V", "getConvertedValue", "", "value", "getLabel", "", "getUnits", "Gwei", "Satoshi", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit$Satoshi;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit$Gwei;", "app_debug"})
public abstract class CustomPriorityUnit {
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLabel() {
        return null;
    }
    
    public final long getConvertedValue(long value) {
        return 0L;
    }
    
    public final long getUnits(long value) {
        return 0L;
    }
    
    private CustomPriorityUnit() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit$Satoshi;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "()V", "app_debug"})
    public static final class Satoshi extends io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit.Satoshi INSTANCE = null;
        
        private Satoshi() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit$Gwei;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/fee/CustomPriorityUnit;", "()V", "app_debug"})
    public static final class Gwei extends io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.send.submodules.fee.CustomPriorityUnit.Gwei INSTANCE = null;
        
        private Gwei() {
            super();
        }
    }
}