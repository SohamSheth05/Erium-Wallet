package io.horizontalsystems.bankwallet.modules.send.submodules.amount;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "", "()V", "Entered", "Max", "NotEntered", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$Max;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$Entered;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$NotEntered;", "app_debug"})
public abstract class SendAmountInfo {
    
    private SendAmountInfo() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$Max;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "()V", "app_debug"})
    public static final class Max extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo.Max INSTANCE = null;
        
        private Max() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$Entered;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "amount", "Ljava/math/BigDecimal;", "(Ljava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "app_debug"})
    public static final class Entered extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.math.BigDecimal amount = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.math.BigDecimal getAmount() {
            return null;
        }
        
        public Entered(@org.jetbrains.annotations.NotNull()
        java.math.BigDecimal amount) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo$NotEntered;", "Lio/horizontalsystems/bankwallet/modules/send/submodules/amount/SendAmountInfo;", "()V", "app_debug"})
    public static final class NotEntered extends io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo {
        @org.jetbrains.annotations.NotNull()
        public static final io.horizontalsystems.bankwallet.modules.send.submodules.amount.SendAmountInfo.NotEntered INSTANCE = null;
        
        private NotEntered() {
            super();
        }
    }
}