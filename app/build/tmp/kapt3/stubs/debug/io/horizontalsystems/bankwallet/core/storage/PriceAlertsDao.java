package io.horizontalsystems.bankwallet.core.storage;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\'J\b\u0010\n\u001a\u00020\bH\'J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\'\u00a8\u0006\u000f"}, d2 = {"Lio/horizontalsystems/bankwallet/core/storage/PriceAlertsDao;", "", "all", "", "Lio/horizontalsystems/bankwallet/entities/PriceAlert;", "count", "", "delete", "", "it", "deleteAll", "priceAlert", "coinType", "Lio/horizontalsystems/coinkit2/models/CoinType;", "update", "app_debug"})
public abstract interface PriceAlertsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void update(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert priceAlert);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM PriceAlert")
    public abstract java.util.List<io.horizontalsystems.bankwallet.entities.PriceAlert> all();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM PriceAlert WHERE coinType = :coinType")
    public abstract io.horizontalsystems.bankwallet.entities.PriceAlert priceAlert(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.coinkit2.models.CoinType coinType);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM PriceAlert")
    public abstract int count();
    
    @androidx.room.Query(value = "DELETE FROM PriceAlert")
    public abstract void deleteAll();
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    io.horizontalsystems.bankwallet.entities.PriceAlert it);
}